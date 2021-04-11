import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.jsonSchema.JsonSchema
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator
import com.fasterxml.jackson.module.jsonSchema.types.ObjectSchema
import iof.v2.*
import iof.v3.IofV3
import org.xml.sax.InputSource
import java.io.File
import java.io.StringReader
import java.lang.Class
import javax.xml.bind.JAXBContext
import javax.xml.parsers.SAXParserFactory
import javax.xml.transform.sax.SAXSource


fun main() {
    //var jsonSchema = toJsonSchema(classesV2)
    var jsonSchema = toJsonSchema(listOf(IofV2::class.java))
    writeToFile(jsonSchema, "iof_v2_schema.json")
    jsonSchema = toJsonSchema(listOf(IofV3::class.java))
    writeToFile(jsonSchema, "iof_v3_schema.json")

    val file = File("ResultList_example_iofv2.xml").readText()
    val obj = unmarshalGenericIofV2(file)
    println(ObjectMapper().writeValueAsString(obj))
}

fun writeToFile(content: String, filename: String) {
    File(filename).printWriter().use { out ->
        out.println(content)
    }

}

fun getMainElementName(xml: String) =
    "<([A-Z][a-zA-Z]+)"
        .toRegex()
        .find(xml)
        ?.groups
        ?.get(1)
        ?.value

fun unmarshalGenericIofV3(xml: String): Any {
    val className = getMainElementName(xml) ?: ""
    val actualClass = Class.forName("iof.v3.$className")
    val jaxbContext = JAXBContext.newInstance(actualClass)
    val unmarshall = jaxbContext.createUnmarshaller()
    val reader = StringReader(xml)
    return unmarshall.unmarshal(reader)
}

fun unmarshalGenericIofV2(xml: String): Any {
    val className = getMainElementName(xml) ?: ""
    val actualClass = Class.forName("iof.v2.$className")

    val jaxbContext = JAXBContext.newInstance(actualClass)

    val turnOfDtdValidation = true
    val unmarshall = jaxbContext.createUnmarshaller()

    return if (turnOfDtdValidation) {
        // Credit: https://stackoverflow.com/a/64931583/5550386
        val spf = SAXParserFactory.newInstance()
        // Do not validate DTD
        spf.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        val xmlSource = SAXSource(
            spf.newSAXParser().xmlReader,
            InputSource(StringReader(xml))
        )
        unmarshall.unmarshal(xmlSource)
    } else {
        val reader = StringReader(xml)
        unmarshall.unmarshal(reader)
    }
}

val classesV2 = listOf(
    PersonList::class.java,
    CompetitorList::class.java,
    RankList::class.java,
    ClubList::class.java,
    EventList::class.java,
    ServiceRequestList::class.java,
    EntryList::class.java,
    StartList::class.java,
    ResultList::class.java,
    ClassData::class.java,
    CourseData::class.java,
)

fun toJsonSchema(classes: List<java.lang.Class<*>>): String {
    val mapper = ObjectMapper()
    val schemaGen = JsonSchemaGenerator(mapper)

    try {
        val sb = StringBuilder()
        classes.forEachIndexed { index, clazz ->
            val schema: JsonSchema = schemaGen.generateSchema(clazz)
            schema.asObjectSchema().rejectAdditionalProperties()
            sb.append(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema))
            if (index != classes.size -1) {
                sb.appendLine(",")
            }
        }

        return sb.toString()

    } catch (e: JsonMappingException) {
        e.printStackTrace()
    } catch (e: JsonProcessingException) {
        e.printStackTrace()
    }

    return "[]"
}

fun generateSchema(generator: JsonSchemaGenerator, type: Class<*>): ObjectSchema {
    val schema = generator.generateSchema(type).asObjectSchema()

    for (field in type.declaredFields) {
        println(field.name)
        if (!field.type.isEnum && !field.type.name.startsWith("java") && !field.type.isPrimitive) {
            val fieldSchema = generateSchema(generator, field.type)
            fieldSchema.rejectAdditionalProperties()
            schema.putProperty(field.name, fieldSchema)
        }
    }
    return schema
}
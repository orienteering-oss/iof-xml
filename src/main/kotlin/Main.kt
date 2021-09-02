package iofXml

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.JsonMappingException
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.jsonSchema.JsonSchema
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator
import com.fasterxml.jackson.module.jsonSchema.types.ObjectSchema
import iofXml.v2.*
import iofXml.v3.IofV3
import org.xml.sax.InputSource
import java.io.File
import java.io.StringReader
import java.lang.Class
import javax.xml.bind.JAXBContext
import javax.xml.parsers.SAXParserFactory
import javax.xml.transform.sax.SAXSource


fun main() {
    val file = File("ResultList_example_iofv2.xml").readText()
    val (obj, name, theClass) = unmarshalGenericIofV2(file)
    println(ObjectMapper().writeValueAsString(obj))
    println("name: $name")
    println("class: $theClass")
}

private fun getMainElementName(xml: String) =
    "<([A-Z][a-zA-Z]+)"
        .toRegex()
        .find(xml)
        ?.groups
        ?.get(1)
        ?.value

fun unmarshalGenericIofV3(xml: String): Triple<Any, String, Class<*>> {
    val className = getMainElementName(xml) ?: ""
    val actualClass = Class.forName("iofXml.v3.$className")
    val jaxbContext = JAXBContext.newInstance(actualClass)
    val unmarshall = jaxbContext.createUnmarshaller()
    val reader = StringReader(xml)
    return Triple(unmarshall.unmarshal(reader), className, actualClass)
}

fun unmarshalGenericIofV2(xml: String): Triple<Any, String, Class<*>> {
    val className = getMainElementName(xml) ?: ""
    val actualClass = Class.forName("iofXml.v2.$className")

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
        Triple(unmarshall.unmarshal(xmlSource), className, actualClass)
    } else {
        val reader = StringReader(xml)
        Triple(unmarshall.unmarshal(reader), className, actualClass)
    }
}

val classesV3 = listOf(
    iofXml.v3.CompetitorList::class.java,
    iofXml.v3.OrganisationList::class.java,
    iofXml.v3.EventList::class.java,
    iofXml.v3.ClassList::class.java,
    iofXml.v3.EntryList::class.java,
    iofXml.v3.CourseData::class.java,
    iofXml.v3.StartList::class.java,
    iofXml.v3.ResultList::class.java,
    iofXml.v3.ServiceRequestList::class.java,
    iofXml.v3.ControlCardList::class.java
)

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

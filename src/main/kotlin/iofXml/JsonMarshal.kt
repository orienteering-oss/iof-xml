package iofXml

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import java.util.Locale

/** Convert an IOF V3 XML to JSON */
fun iofV3XmlToJson(xml: String): String {
    val (obj) = unmarshalGenericIofV3(xml)
    return marshalIofObjectToJson(obj)
}

/** Convert an IOF V2 XML to JSON */
fun iofV2XmlToJson(xml: String): String {
    val (obj) = unmarshalGenericIofV2(xml)
    return marshalIofObjectToJson(obj)
}

/** Convert an IOF V3 JSON to XML. NB does not support 'Extensions' */
fun iofV3JsonToXml(json: String) = iofJsonToXml(json, "v3")

/** Convert an IOF V2 JSON to XML. NB. unstable, failing in some conditions */
fun iofV2JsonToXml(json: String) = iofJsonToXml(json, "v2")

internal fun iofJsonToXml(json: String, iofVersion: String = "v3"): String {
    val mapper = ObjectMapper()
    //mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    val tempJsonMap = mapper.readValue(json, HashMap::class.java)

    val mainKeys = tempJsonMap.keys

    if (mainKeys.size != 1) {
        throw Exception(
            "IOF JSON must have a single top level key saying which type " +
                    "class/type the object is for. Available types\n" +
                    "iofV3: ${classesV3.joinToString { nameFromJavaClass(it.javaClass) }}" +
                    "iofV2: ${classesV2.joinToString { nameFromJavaClass(it.javaClass) }}"
        )
    }

    val classType = mainKeys.toList().first()
    if (classType is String) {
        val tempJsonBytes = mapper.writeValueAsBytes(tempJsonMap[classType])
        val classTypeCapitalize = classType.replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(
                Locale.getDefault()
            ) else it.toString()
        }
        val actualClass = Class.forName("iofXml.$iofVersion.$classTypeCapitalize")

        val objOfJson = mapper.readValue(tempJsonBytes, actualClass)
        return marshallIofObject(objOfJson)
    } else {
        throw Exception("IOF JSON root type must be a string, found: ${classType.javaClass}")
    }

}

/**
 * Serialize an IOF object (v3 or v2) to a JSON string
 */
fun marshalIofObjectToJson(obj: Any, prettyPrint: Boolean = true): String {
    val mapper = ObjectMapper()
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL) // Else all fields not set will be 'null'
    if (prettyPrint) {
        mapper.enable(SerializationFeature.INDENT_OUTPUT)
    }

    //mapper.enable(SerializationFeature.WRAP_ROOT_VALUE) // Problem: root will be UpperCamelCase (need lowerCamelCase)
    val className = nameFromJavaClass(obj.javaClass)
    val objectWithRoot = mapOf(className to obj)

    return mapper.writeValueAsString(objectWithRoot)
}

/**
 * Names are of type `iofXml.v3.ThisIsWhatIWant`, we just want the last part.
 */
internal fun nameFromJavaClass(javaClass: Class<*>) =
    javaClass.toString()
        .split(".")
        .last()
        .replaceFirstChar { it.lowercase(Locale.getDefault()) }

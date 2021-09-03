package iofXml

import java.io.File
import java.io.StringReader
import java.io.StringWriter
import java.lang.Class
import javax.xml.XMLConstants
import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller
import javax.xml.validation.SchemaFactory


fun marshallIofV3(obj: Any, prettyPrint: Boolean = true): String {
    val jaxbContext: JAXBContext = JAXBContext.newInstance(obj.javaClass)
    val jaxbMarshaller = jaxbContext.createMarshaller()
    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, prettyPrint)
    val writer = StringWriter()
    jaxbMarshaller.marshal(obj, writer)
    return writer.toString()
}

fun unmarshalGenericIofV3(dirtyXml: String, validateXml: Boolean = true): Triple<Any, String, Class<*>> {
    val className = getMainElementName(dirtyXml) ?: ""
    val xml = removeUTF8BOM(dirtyXml, className)
    val actualClass = Class.forName("iofXml.v3.$className")
    val jaxbContext = JAXBContext.newInstance(actualClass)
    val unmarshall = jaxbContext.createUnmarshaller()
    if (validateXml) {
        val sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
        val v3Schema = sf.newSchema(File("src/main/resources/iof_v3.xsd"))
        unmarshall.setSchema(v3Schema)
    }
    val reader = StringReader(xml)
    return Triple(unmarshall.unmarshal(reader), className, actualClass)
}

/**
 * Utility function used by specialized unmarshallers
 * @param className Which Java class to unmarshall xml to
 * @param xml IOF v3 XML string of type `className`
 * @return class of type `className`, you need to cast to this class yourself
 */
private fun unmarshalV3Xml(className: String, dirtyXml: String, validateXml: Boolean = true): Any {
    val mainElementName = getMainElementName(dirtyXml) ?: ""
    val xml = removeUTF8BOM(dirtyXml, mainElementName)
    if (mainElementName != className) {
        println("ERROR V3: mainElementName=$mainElementName is not equal to className=$className")
    }

    val actualClass = Class.forName("iofXml.v3.$className")
    val jaxbContext = JAXBContext.newInstance(actualClass)
    val unmarshall = jaxbContext.createUnmarshaller()

    // Validation
    if (validateXml) {
        val sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
        val v3Schema = sf.newSchema(File("src/main/resources/iof_v3.xsd"))
        unmarshall.setSchema(v3Schema)
    }

    val reader = StringReader(xml)
    return unmarshall.unmarshal(reader)
}

fun unmarshalIofV3CompetitorList(xml: String): iofXml.v3.CompetitorList =
    unmarshalV3Xml("CompetitorList", xml) as iofXml.v3.CompetitorList

fun unmarshalIofV3OrganisationList(xml: String): iofXml.v3.OrganisationList =
    unmarshalV3Xml("OrganisationList", xml) as iofXml.v3.OrganisationList

fun unmarshalIofV3EventList(xml: String): iofXml.v3.EventList =
    unmarshalV3Xml("EventList", xml) as iofXml.v3.EventList

fun unmarshalIofV3ClassList(xml: String): iofXml.v3.ClassList =
    unmarshalV3Xml("ClassList", xml) as iofXml.v3.ClassList

fun unmarshalIofV3EntryList(xml: String): iofXml.v3.EntryList =
    unmarshalV3Xml("EntryList", xml) as iofXml.v3.EntryList

fun unmarshalIofV3CourseData(xml: String): iofXml.v3.CourseData =
    unmarshalV3Xml("CourseData", xml) as iofXml.v3.CourseData

fun unmarshalIofV3StartList(xml: String): iofXml.v3.StartList =
    unmarshalV3Xml("StartList", xml) as iofXml.v3.StartList

fun unmarshalIofV3ResultList(xml: String): iofXml.v3.ResultList =
    unmarshalV3Xml("ResultList", xml) as iofXml.v3.ResultList

fun unmarshalIofV3ServiceRequestList(xml: String): iofXml.v3.ServiceRequestList =
    unmarshalV3Xml("ServiceRequestList", xml) as iofXml.v3.ServiceRequestList

fun unmarshalIofV3ControlCardList(xml: String): iofXml.v3.ControlCardList =
    unmarshalV3Xml("ControlCardList", xml) as iofXml.v3.ControlCardList

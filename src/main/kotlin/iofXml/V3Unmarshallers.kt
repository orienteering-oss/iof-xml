package iofXml

import java.io.File
import java.io.StringReader
import java.lang.Class
import javax.xml.XMLConstants
import javax.xml.bind.JAXBContext
import javax.xml.validation.SchemaFactory

/**
 * Convert an XML file to an object of IOF V3 type. This function could be great for
 * testing, but in production you may want to use one of the specialized converters,
 * e.g. `unmarshalIofV3CompetitorList`.
 * @param xml XML string to be deserialized
 * @param validateXml if the XML string should be validated against IOF V3 XSD
 */
fun unmarshalGenericIofV3(xml: String, validateXml: Boolean = true): Triple<Any, String, Class<*>> {
    val className = getMainElementName(xml) ?: ""
    val xmlClean = removeUTF8BOM(xml, className)
    val actualClass = Class.forName("iofXml.v3.$className")
    val jaxbContext = JAXBContext.newInstance(actualClass)
    val unmarshall = jaxbContext.createUnmarshaller()
    if (validateXml) {
        val sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
        val v3Schema = sf.newSchema(File("src/main/resources/iof_v3.xsd"))
        unmarshall.setSchema(v3Schema)
    }
    val reader = StringReader(xmlClean)
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

/** Deserialize CompetitorList XML to an object of type CompetitorList */
fun unmarshalIofV3CompetitorList(xml: String): iofXml.v3.CompetitorList =
    unmarshalV3Xml("CompetitorList", xml) as iofXml.v3.CompetitorList

/** Deserialize OrganisationList XML to an object of type OrganisationList */
fun unmarshalIofV3OrganisationList(xml: String): iofXml.v3.OrganisationList =
    unmarshalV3Xml("OrganisationList", xml) as iofXml.v3.OrganisationList

/** Deserialize EventList XML to an object of type EventList */
fun unmarshalIofV3EventList(xml: String): iofXml.v3.EventList =
    unmarshalV3Xml("EventList", xml) as iofXml.v3.EventList

/** Deserialize ClassList XML to an object of type ClassList */
fun unmarshalIofV3ClassList(xml: String): iofXml.v3.ClassList =
    unmarshalV3Xml("ClassList", xml) as iofXml.v3.ClassList

/** Deserialize EntryList XML to an object of type EntryList */
fun unmarshalIofV3EntryList(xml: String): iofXml.v3.EntryList =
    unmarshalV3Xml("EntryList", xml) as iofXml.v3.EntryList

/** Deserialize CourseData XML to an object of type CourseData */
fun unmarshalIofV3CourseData(xml: String): iofXml.v3.CourseData =
    unmarshalV3Xml("CourseData", xml) as iofXml.v3.CourseData

/** Deserialize StartList XML to an object of type StartList */
fun unmarshalIofV3StartList(xml: String): iofXml.v3.StartList =
    unmarshalV3Xml("StartList", xml) as iofXml.v3.StartList

/** Deserialize ResultList XML to an object of type ResultList */
fun unmarshalIofV3ResultList(xml: String): iofXml.v3.ResultList =
    unmarshalV3Xml("ResultList", xml) as iofXml.v3.ResultList

/** Deserialize ServiceRequestList XML to an object of type ServiceRequestList */
fun unmarshalIofV3ServiceRequestList(xml: String): iofXml.v3.ServiceRequestList =
    unmarshalV3Xml("ServiceRequestList", xml) as iofXml.v3.ServiceRequestList

/** Deserialize ControlCardList XML to an object of type ControlCardList */
fun unmarshalIofV3ControlCardList(xml: String): iofXml.v3.ControlCardList =
    unmarshalV3Xml("ControlCardList", xml) as iofXml.v3.ControlCardList

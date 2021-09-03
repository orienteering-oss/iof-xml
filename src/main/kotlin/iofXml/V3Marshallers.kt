package iofXml

import java.io.StringReader
import java.lang.Class
import javax.xml.bind.JAXBContext

fun unmarshalGenericIofV3(xml: String): Triple<Any, String, Class<*>> {
    val className = getMainElementName(xml) ?: ""
    val actualClass = Class.forName("iofXml.v3.$className")
    val jaxbContext = JAXBContext.newInstance(actualClass)
    val unmarshall = jaxbContext.createUnmarshaller()
    val reader = StringReader(xml)
    return Triple(unmarshall.unmarshal(reader), className, actualClass)
}

/**
 * Utility function used by specialized unmarshallers
 * @param className Which Java class to unmarshall xml to
 * @param xml IOF v3 XML string of type `className`
 * @return class of type `className`, you need to cast to this class yourself
 */
private fun unmarshalV3Xml(className: String, xml: String): Any {
    val mainElementName = getMainElementName(xml) ?: ""
    if (mainElementName != className) {
        println("ERROR V3: mainElementName=$mainElementName is not equal to className=$className")
    }

    val actualClass = Class.forName("iofXml.v3.$className")
    val jaxbContext = JAXBContext.newInstance(actualClass)
    val unmarshall = jaxbContext.createUnmarshaller()
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

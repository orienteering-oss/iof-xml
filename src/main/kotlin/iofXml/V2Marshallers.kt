package iofXml

import org.xml.sax.InputSource
import java.io.StringReader
import java.lang.Class
import javax.xml.bind.JAXBContext
import javax.xml.parsers.SAXParserFactory
import javax.xml.transform.sax.SAXSource

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

/**
 * Utility function used by specialized unmarshallers
 * @param className Which Java class to unmarshall xml to
 * @param xml IOF v2 XML string of type `className`
 * @return class of type `className`, you need to cast to this class yourself
 */
private fun unmarshalV2Xml(className: String, xml: String): Any {
    val mainElementName = getMainElementName(xml) ?: ""

    if (mainElementName != className) {
        println("ERROR V2: mainElementName=$mainElementName is not equal to className=$className")
    }

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
        unmarshall.unmarshal(xmlSource)
    } else {
        val reader = StringReader(xml)
        unmarshall.unmarshal(reader)
    }
}

fun unmarshalIofV2PersonList(xml: String): iofXml.v2.PersonList =
    unmarshalV2Xml("PersonList", xml) as iofXml.v2.PersonList

fun unmarshalIofV2CompetitorList(xml: String): iofXml.v2.CompetitorList =
    unmarshalV2Xml("CompetitorList", xml) as iofXml.v2.CompetitorList

fun unmarshalIofV2RankList(xml: String): iofXml.v2.RankList =
    unmarshalV2Xml("RankList", xml) as iofXml.v2.RankList

fun unmarshalIofV2ClubList(xml: String): iofXml.v2.ClubList =
    unmarshalV2Xml("ClubList", xml) as iofXml.v2.ClubList

fun unmarshalIofV2EventList(xml: String): iofXml.v2.EventList =
    unmarshalV2Xml("EventList", xml) as iofXml.v2.EventList

fun unmarshalIofV2ServiceRequestList(xml: String): iofXml.v2.ServiceRequestList =
    unmarshalV2Xml("ServiceRequestList", xml) as iofXml.v2.ServiceRequestList

fun unmarshalIofV2EntryList(xml: String): iofXml.v2.EntryList =
    unmarshalV2Xml("EntryList", xml) as iofXml.v2.EntryList

fun unmarshalIofV2StartList(xml: String): iofXml.v2.StartList =
    unmarshalV2Xml("StartList", xml) as iofXml.v2.StartList

fun unmarshalIofV2ResultList(xml: String): iofXml.v2.ResultList =
    unmarshalV2Xml("ResultList", xml) as iofXml.v2.ResultList

fun unmarshalIofV2ClassData(xml: String): iofXml.v2.ClassData =
    unmarshalV2Xml("ClassData", xml) as iofXml.v2.ClassData

fun unmarshalIofV2CourseData(xml: String): iofXml.v2.CourseData =
    unmarshalV2Xml("CourseData", xml) as iofXml.v2.CourseData

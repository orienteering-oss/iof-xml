package iofXml

import java.io.StringReader
import java.lang.Class
import javax.xml.bind.JAXBContext
import javax.xml.parsers.SAXParserFactory
import javax.xml.transform.sax.SAXSource
import org.xml.sax.InputSource

/**
 * Convert an XML file to an object of IOF V2 type. This function could be great for
 * testing, but in production you may want to use one of the specialized converters,
 * e.g. `unmarshalIofV2PersonList`.
 *
 * @param xml XML string to be deserialized
 * @sample iofXml.V2UnmarshallersKtTest.unmarshalGenericIofV2
 */
fun unmarshalGenericIofV2(xml: String): Triple<Any, String, Class<*>> {
    val className = getMainElementName(xml) ?: ""
    val xmlClean = removeUTF8BOM(xml, className)
    val actualClass = Class.forName("iofXml.v2.$className")

    val jaxbContext = JAXBContext.newInstance(actualClass)

    val unmarshall = jaxbContext.createUnmarshaller()

    val validateXml = false
    return if (validateXml) {
        /*
            This does not work, because it tries to load ethe IOFdata.dtd file, which I can't make work.
         */
        val reader = StringReader(xmlClean)
        Triple(unmarshall.unmarshal(reader), className, actualClass)
    } else {
        // Credit: https://stackoverflow.com/a/64931583/5550386
        val spf = SAXParserFactory.newInstance()
        // Do not validate DTD
        spf.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        val xmlSource = SAXSource(
            spf.newSAXParser().xmlReader,
            InputSource(StringReader(xmlClean))
        )
        Triple(unmarshall.unmarshal(xmlSource), className, actualClass)
    }
}

/**
 * Utility function used by specialized unmarshallers
 * @param className Which Java class to unmarshall xml to
 * @param xml IOF v2 XML string of type `className`
 * @return class of type `className`, you need to cast to this class yourself
 */
private fun unmarshalV2Xml(className: String, dirtyXml: String): Any {
    val mainElementName = getMainElementName(dirtyXml) ?: ""
    val xml = removeUTF8BOM(dirtyXml, mainElementName)

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

/** IOF V2: Deserialize PersonList XML to an object of type PersonList */
fun unmarshalIofV2PersonList(xml: String): iofXml.v2.PersonList =
    unmarshalV2Xml("PersonList", xml) as iofXml.v2.PersonList

/** IOF V2: Deserialize CompetitorList XML to an object of type CompetitorList */
fun unmarshalIofV2CompetitorList(xml: String): iofXml.v2.CompetitorList =
    unmarshalV2Xml("CompetitorList", xml) as iofXml.v2.CompetitorList

/** IOF V2: Deserialize RankList XML to an object of type RankList */
fun unmarshalIofV2RankList(xml: String): iofXml.v2.RankList =
    unmarshalV2Xml("RankList", xml) as iofXml.v2.RankList

/** IOF V2: Deserialize ClubList XML to an object of type ClubList */
fun unmarshalIofV2ClubList(xml: String): iofXml.v2.ClubList =
    unmarshalV2Xml("ClubList", xml) as iofXml.v2.ClubList

/** IOF V2: Deserialize EventList XML to an object of type EventList */
fun unmarshalIofV2EventList(xml: String): iofXml.v2.EventList =
    unmarshalV2Xml("EventList", xml) as iofXml.v2.EventList

/** IOF V2: Deserialize ServiceRequestList XML to an object of type ServiceRequestList */
fun unmarshalIofV2ServiceRequestList(xml: String): iofXml.v2.ServiceRequestList =
    unmarshalV2Xml("ServiceRequestList", xml) as iofXml.v2.ServiceRequestList

/** IOF V2: Deserialize EntryList XML to an object of type EntryList */
fun unmarshalIofV2EntryList(xml: String): iofXml.v2.EntryList =
    unmarshalV2Xml("EntryList", xml) as iofXml.v2.EntryList

/** IOF V2: Deserialize StartList XML to an object of type StartList */
fun unmarshalIofV2StartList(xml: String): iofXml.v2.StartList =
    unmarshalV2Xml("StartList", xml) as iofXml.v2.StartList

/** IOF V2: Deserialize ResultList XML to an object of type ResultList */
fun unmarshalIofV2ResultList(xml: String): iofXml.v2.ResultList =
    unmarshalV2Xml("ResultList", xml) as iofXml.v2.ResultList

/** IOF V2: Deserialize ClassData XML to an object of type ClassData */
fun unmarshalIofV2ClassData(xml: String): iofXml.v2.ClassData =
    unmarshalV2Xml("ClassData", xml) as iofXml.v2.ClassData

/** IOF V2: Deserialize CourseData XML to an object of type CourseData */
fun unmarshalIofV2CourseData(xml: String): iofXml.v2.CourseData =
    unmarshalV2Xml("CourseData", xml) as iofXml.v2.CourseData

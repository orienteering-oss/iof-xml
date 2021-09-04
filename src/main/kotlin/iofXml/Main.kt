package iofXml

import com.fasterxml.jackson.databind.ObjectMapper
import java.io.File
import java.io.StringWriter
import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller

private fun main() {
    val file = File("ResultList_example_iofv2.xml").readText()
    val (obj, name, theClass) = unmarshalGenericIofV2(file)
    println(ObjectMapper().writeValueAsString(obj))
    println("name: $name")
    println("class: $theClass")
    println("Specific: ${unmarshalIofV2ResultList(file).iofVersion.version}")
}

/**
 * Convert an object of IOF V3 or V2 type to XML string
 */
fun marshallIofObject(obj: Any, prettyPrint: Boolean = true): String {
    val jaxbContext: JAXBContext = JAXBContext.newInstance(obj.javaClass)
    val jaxbMarshaller = jaxbContext.createMarshaller()
    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, prettyPrint)
    val writer = StringWriter()
    jaxbMarshaller.marshal(obj, writer)
    return writer.toString()
}


internal fun getMainElementName(xml: String) =
    "<([A-Z][a-zA-Z]+)"
        .toRegex()
        .find(xml)
        ?.groups
        ?.get(1)
        ?.value

private val UTF8_BOM = "\uFEFF"
internal fun removeUTF8BOM(s: String, mainElement: String) =
    if (s.startsWith(UTF8_BOM)) {
        println("WARNING: removing BOM from XML of type $mainElement")
        s.substring(1)
    } else {
        s
    }

/**
 * List of all main types / classes of IOF V3 XSD specification. Only these
 * classes can be top level XML elements.
 *
 * @see <a href="https://github.com/international-orienteering-federation/datastandard-v3">datastandard-v3</a>
 */
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

/**
 * List of all main types / classes of IOF V2 XSD specification. Only these
 * classes can be top level XML elements.
 *
 * @see <a href="https://github.com/international-orienteering-federation/datastandard-v2">datastandard-v2</a>
 */
val classesV2 = listOf(
    iofXml.v2.PersonList::class.java,
    iofXml.v2.CompetitorList::class.java,
    iofXml.v2.RankList::class.java,
    iofXml.v2.ClubList::class.java,
    iofXml.v2.EventList::class.java,
    iofXml.v2.ServiceRequestList::class.java,
    iofXml.v2.EntryList::class.java,
    iofXml.v2.StartList::class.java,
    iofXml.v2.ResultList::class.java,
    iofXml.v2.ClassData::class.java,
    iofXml.v2.CourseData::class.java,
)

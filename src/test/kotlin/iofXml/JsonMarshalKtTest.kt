package iofXml

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

internal class JsonMarshalKtTest {

    @Test
    fun iofV3XmlToJson() {
        val xml = getV3ResourceAsText("ResultList4.xml")
        val json = iofV3XmlToJson(xml)

        assert(json.contains("\"resultList\""))
        assert(json.contains("\"OC Back and Forth\""))
    }

    @Test
    fun iofV2XmlToJson() {
        val xml = getV2ResourceAsText("CompetitorList_example.xml")
        val json = iofV2XmlToJson(xml)

        assert(json.contains("\"competitorList\""))
        assert(json.contains("\"Plattner\""))
    }

    @Test
    fun iofV3JsonToXml() {
        val originalXml = getV3ResourceAsText("ResultList3.xml")
        val json = iofV3XmlToJson(originalXml)
        val newXml = iofV3JsonToXml(json)

        assert(newXml.contains("<ResultList status=\"Complete\""))
        assert(newXml.contains("Men Elite"))
        assert(newXml.contains("<Date>2011-07-30"))
        assert(newXml.contains("<FinishTime>2011-07-30T"))
    }

    @Test
    fun iofV2JsonToXml() {
        /*
          This is not stable, failing examples are (at least):
          CourseData_example1.xml
          CourseData_example2.xml
          EntryList_example4.xml
        */
        val originalXml = getV2ResourceAsText("EntryList_example.xml")
        val json = iofV2XmlToJson(originalXml)
        val newXml = iofV2JsonToXml(json)

        assert(newXml.contains("<EntryList>"))
        assert(newXml.contains("<ClubId>3390</ClubId>"))
    }

    @Test
    fun marshalIofObjectToJson() {
        val xml = getV3ResourceAsText("ResultList3.xml")
        val (obj) = unmarshalGenericIofV3(xml)

        assertDoesNotThrow { iofXml.marshalIofObjectToJson(obj) }
    }
}

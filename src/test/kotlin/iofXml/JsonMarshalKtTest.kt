package iofXml

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import tools.jackson.databind.json.JsonMapper
import tools.jackson.databind.node.ObjectNode
import javax.xml.datatype.DatatypeFactory

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

    @Test
    fun calendarStringsPreserveXmlValuesThroughJsonRoundTrip() {
        val factory = DatatypeFactory.newInstance()
        val mapper = JsonMapper.builder().build()
        val values = listOf(
            Triple("2026-09-26", "10:00:00", "2026-09-26T10:00:00"),
            Triple("2026-09-26Z", "10:00:00Z", "2026-09-26T10:00:00Z"),
            Triple("2026-09-26+14:00", "23:59:59.123456+14:00", "2026-09-26T23:59:59.123456+14:00"),
            Triple("2026-09-26-11:00", "00:00:00-11:00", "2026-09-26T00:00:00-11:00")
        )

        values.forEach { (date, time, dateTime) ->
            val startList = unmarshalIofV3StartList(getV3ResourceAsText("StartList1.xml"))
            startList.createTime = factory.newXMLGregorianCalendar(dateTime)
            startList.event.startTime.date = factory.newXMLGregorianCalendar(date)
            startList.event.startTime.time = factory.newXMLGregorianCalendar(time)

            val json = marshalIofObjectToJson(startList)
            val serialized = mapper.readTree(json).path("startList")
            assertEquals(dateTime, serialized.path("createTime").asString())
            assertEquals(date, serialized.path("event").path("startTime").path("date").asString())
            assertEquals(time, serialized.path("event").path("startTime").path("time").asString())

            val restored = unmarshalIofV3StartList(iofV3JsonToXml(json))
            assertEquals(dateTime, restored.createTime.toXMLFormat())
            assertEquals(date, restored.event.startTime.date.toXMLFormat())
            assertEquals(time, restored.event.startTime.time.toXMLFormat())
        }
    }

    @Test
    fun legacyNumericTimestampsCanStillBeRead() {
        val mapper = JsonMapper.builder().build()
        val startList = unmarshalIofV3StartList(getV3ResourceAsText("StartList1.xml"))
        val serialized = mapper.readTree(marshalIofObjectToJson(startList))
        val timestamp = startList.createTime.toGregorianCalendar().timeInMillis
        (serialized.path("startList") as ObjectNode)
            .put("createTime", timestamp)

        val restored = unmarshalIofV3StartList(iofV3JsonToXml(serialized.toString()))
        assertEquals(timestamp, restored.createTime.toGregorianCalendar().timeInMillis)
    }
}

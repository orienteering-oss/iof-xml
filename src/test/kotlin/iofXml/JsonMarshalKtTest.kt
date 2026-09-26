package iofXml

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import tools.jackson.databind.json.JsonMapper
import tools.jackson.databind.node.ObjectNode
import java.util.TimeZone

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
    fun calendarValuesUseNumericTimestamps() {
        val mapper = JsonMapper.builder().build()
        val originalTimeZone = TimeZone.getDefault()
        try {
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"))
            val startList = unmarshalIofV3StartList(getV3ResourceAsText("StartList1.xml"))
            val serialized = mapper.readTree(marshalIofObjectToJson(startList)).path("startList")
            val dateTime = serialized.path("createTime")
            val date = serialized.path("event").path("startTime").path("date")
            val time = serialized.path("event").path("startTime").path("time")

            assertTrue(dateTime.isIntegralNumber)
            assertTrue(date.isIntegralNumber)
            assertTrue(time.isIntegralNumber)
            assertEquals(1311156991000L, dateTime.asLong())
            assertEquals(1311984000000L, date.asLong())
            assertEquals(32400000L, time.asLong())
        } finally {
            TimeZone.setDefault(originalTimeZone)
        }
    }

    @Test
    fun numericTimestampsCanBeRead() {
        val mapper = JsonMapper.builder().build()
        val startList = unmarshalIofV3StartList(getV3ResourceAsText("StartList1.xml"))
        val serialized = mapper.readTree(marshalIofObjectToJson(startList))
        val timestamp = startList.createTime.toGregorianCalendar().timeInMillis
        (serialized.path("startList") as ObjectNode)
            .put("createTime", timestamp)

        val restored = unmarshalIofV3StartList(iofV3JsonToXml(serialized.toString()))
        assertEquals(timestamp, restored.createTime.toGregorianCalendar().timeInMillis)
    }

    @Test
    fun acronymPropertiesRetainJackson2Names() {
        val json = iofV2XmlToJson(getV2ResourceAsText("EntryList_example.xml"))
        val entryList = JsonMapper.builder().build().readTree(json).path("entryList")
        val entry = entryList.path("clubEntry").path(0).path("entry").path(0)

        assertTrue(entryList.has("iofversion"))
        assertFalse(entryList.has("IOFVersion"))
        assertTrue(entry.has("ccard"))
        assertFalse(entry.has("CCard"))
        assertEquals("287130", entry.path("ccard").path(0).path("ccardId").asString())
        assertTrue(iofV2JsonToXml(json).contains("<CCardId>287130</CCardId>"))
    }
}

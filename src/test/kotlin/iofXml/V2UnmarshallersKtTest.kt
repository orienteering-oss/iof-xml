package iofXml

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

fun getV2ResourceAsText(file: String): String {
    return object {}.javaClass.getResource("/v2-examples/$file").readText()
}
internal class V2UnmarshallersKtTest {
    @Test
    fun marshallIofV2() {
        val file = getV2ResourceAsText("EntryList_example.xml")
        val (obj) = unmarshalGenericIofV2(file)
        val xmlString = marshallIofObject(obj)

        assert(xmlString.length > 0)
        assert(xmlString.contains("<PersonName>"))
        assert(xmlString.contains("Ejsing"))
    }

    @Test
    fun unmarshalGenericIofV2() {
        val file = getV2ResourceAsText("ClubList_example.xml")
        val (obj, name, classs) = unmarshalGenericIofV2(file)

        assertEquals("ClubList", name)
        assert(obj is iofXml.v2.ClubList)
        assertNotNull(classs)
    }

    @Test
    fun unmarshalIofV2PersonList() {
        val file = getV2ResourceAsText("PersonList_example.xml")
        val obj = iofXml.unmarshalIofV2PersonList(file)

        assertEquals(2, obj.person.size)
        assertEquals("Andersen", obj.person.first().personName.family)
        assertEquals("Nielsen", obj.person.last().personName.family)
    }

    @Test
    fun unmarshalIofV2CompetitorList() {
        val file = getV2ResourceAsText("CompetitorList_example.xml")
        val obj = iofXml.unmarshalIofV2CompetitorList(file)

        assertTrue(obj.competitor.isNotEmpty())
        assertEquals("Plattner", obj.competitor.first().person.personName.family)
    }

    @Test
    fun unmarshalIofV2RankList() {
        val file = getV2ResourceAsText("RankList_example.xml")
        val obj = iofXml.unmarshalIofV2RankList(file)

        assertEquals("World Cup", obj.name.content)
        assertTrue(obj.competitor.size >= 4)
        assertEquals("Plattner", obj.competitor.find { it.person.personName.family == "Plattner" }?.person?.personName?.family)
    }

    @Test
    fun unmarshalIofV2ClubList() {
        val file = getV2ResourceAsText("ClubList_example.xml")
        val obj = iofXml.unmarshalIofV2ClubList(file)

        assertTrue(obj.club.isNotEmpty())
        assertEquals("OK Pan", obj.club.first().shortName.content)
    }

    @Test
    fun unmarshalIofV2EventList() {
        val file = getV2ResourceAsText("EventList_example.xml")
        val obj = iofXml.unmarshalIofV2EventList(file)

        assertTrue(obj.event.isNotEmpty())
        assertEquals("Dansk mesterskab", obj.eventClassification.first().name.content)
    }

    @Test
    fun unmarshalIofV2ServiceRequestList() {
        val file = getV2ResourceAsText("ServiceRequestList_example.xml")
        val obj = iofXml.unmarshalIofV2ServiceRequestList(file)

        assertTrue(obj.clubServiceRequest.isNotEmpty())
        val person = obj.clubServiceRequest.first().personServiceRequest.first().person
        assertEquals("Olsen", person.personName.family)
    }

    @Test
    fun unmarshalIofV2EntryList() {
        val file = getV2ResourceAsText("EntryList_example.xml")
        val obj = iofXml.unmarshalIofV2EntryList(file)

        assertTrue(obj.clubEntry.isNotEmpty())
        val entries = obj.clubEntry.first().entry
        assertTrue(entries.isNotEmpty())
        assertNotNull(entries.find { it.person?.personName?.family == "Arildsen" })
    }

    @Test
    fun unmarshalIofV2StartList() {
        val file = getV2ResourceAsText("StartList_example.xml")
        val obj = iofXml.unmarshalIofV2StartList(file)

        assertTrue(obj.classStart.isNotEmpty())
        assertEquals("Men", obj.classStart.first().classShortName.content)
    }

    @Test
    fun unmarshalIofV2ResultList() {
        val file = getV2ResourceAsText("ResultList_example.xml")
        val obj = iofXml.unmarshalIofV2ResultList(file)

        assertTrue(obj.classResult.isNotEmpty())
        assertEquals("Men", obj.classResult.first().classShortName.content)
    }

    @Test
    fun unmarshalIofV2ClassData() {
        val file = getV2ResourceAsText("ClassData_example.xml")
        val obj = iofXml.unmarshalIofV2ClassData(file)

        assertEquals(2, obj.clazz.size)
        assertEquals("H21", obj.clazz.first().classShortName.content)
    }

    @Test
    fun unmarshalIofV2CourseData() {
        val file = getV2ResourceAsText("CourseData_example1.xml")
        val obj = iofXml.unmarshalIofV2CourseData(file)

        assertTrue(obj.startPoint.isNotEmpty())
        assertEquals(" s1 ", obj.startPoint.first().startPointCode)
        assertTrue(obj.control.isNotEmpty())
        assertEquals(" 31 ", obj.control.first().controlCode)
        assertTrue(obj.course.isNotEmpty())
        assertEquals(" Bane 01 ", obj.course.first().courseName)
    }
}


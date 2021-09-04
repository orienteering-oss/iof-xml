package iofXml

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

fun getV3ResourceAsText(file: String): String {
    return object {}.javaClass.getResource("/v3-examples/$file").readText()
}

internal class V3UnmarshallersKtTest {
    @Test
    fun marshallIofV3() {
        val file = getV3ResourceAsText("CourseData_Relay_Step2.xml")
        val (obj) = unmarshalGenericIofV3(file)
        val xml = iofXml.marshallIofObject(obj)
        assert(xml.contains("RaceCourseData"))
    }

    @Test
    fun unmarshalGenericIofV3() {
        val file = getV3ResourceAsText("ClassList.xml")
        val (obj, name, classs) = unmarshalGenericIofV3(file)

        assertEquals("ClassList", name)
        assert(obj is iofXml.v3.ClassList)
        assertNotNull(classs)
    }

    @Test
    fun unmarshalIofV3CompetitorList() {
        val file = getV3ResourceAsText("CompetitorList.xml")
        val obj = iofXml.unmarshalIofV3CompetitorList(file)
        assertEquals("West", obj.competitor.first().person.name.family)
    }

    @Test
    fun unmarshalIofV3OrganisationList() {
        val file = getV3ResourceAsText("OrganisationList.xml")
        val obj = iofXml.unmarshalIofV3OrganisationList(file)
        assertEquals("Bushmen OC", obj.organisation.find { it.id.value == "2"  }?.name)
    }

    @Test
    fun unmarshalIofV3EventList() {
        val file = getV3ResourceAsText("Event_name_and_start_time.xml")
        val obj = iofXml.unmarshalIofV3EventList(file)
        assertEquals("Example event", obj.event.first().name)
    }

    @Test
    fun unmarshalIofV3ClassList() {
        val file = getV3ResourceAsText("ClassList_Relay_Step1.xml")
        val obj = iofXml.unmarshalIofV3ClassList(file)
        assertEquals(java.math.BigInteger("35"), obj.clazz.find { it.name == "Men Open"  }?.numberOfCompetitors)
    }

    @Test
    fun unmarshalIofV3EntryList() {
        val file = getV3ResourceAsText("EntryList1.xml")
        val obj = iofXml.unmarshalIofV3EntryList(file)
        assertEquals("Example event", obj.event.name)
        assertEquals("Wood", obj.personEntry.first().person.name.family)
    }

    @Test
    fun unmarshalIofV3CourseData() {
        val file = getV3ResourceAsText("CourseData_Individual_Step4.xml")
        val obj = iofXml.unmarshalIofV3CourseData(file)
        assertEquals("Example event", obj.event.name)
        assertEquals("S", obj.raceCourseData.first().control.first().id.value)
        assertEquals(2960.0, obj.raceCourseData.first().course.find{ it.name == "A"}?.length)
    }

    @Test
    fun unmarshalIofV3StartList() {
        val file = getV3ResourceAsText("StartList1.xml")
        val obj = iofXml.unmarshalIofV3StartList(file)
        assertEquals("Example event", obj.event.name)
        assertEquals("Men Elite", obj.classStart.first().clazz.name)
        assertEquals("1234", obj.classStart.first().personStart.first().entryId.value)
    }

    @Test
    fun unmarshalIofV3ResultList() {
        val file = getV3ResourceAsText("ResultList1.xml")
        val obj = iofXml.unmarshalIofV3ResultList(file)
        assertEquals("Example event", obj.event.name)
        assertEquals("Men Elite", obj.classResult.first().clazz.name)
    }

    @Test
    fun unmarshalIofV3ServiceRequestList() {
        val file = getV3ResourceAsText("_ServiceRequestList.xml")
        val obj = iofXml.unmarshalIofV3ServiceRequestList(file)
        assertEquals("Example event", obj.event.name)
        assertEquals("Full massage", obj.personServiceRequest.first().serviceRequest.first().service.name.first().value)
    }

    @Test
    fun unmarshalIofV3ControlCardList() {
        val file = getV3ResourceAsText("_ControlCardList.xml")
        val obj = iofXml.unmarshalIofV3ControlCardList(file)
        assertEquals("Best Runner in Grefsen", obj.owner)
        assertEquals("SI", obj.controlCard.first().punchingSystem)
    }
}

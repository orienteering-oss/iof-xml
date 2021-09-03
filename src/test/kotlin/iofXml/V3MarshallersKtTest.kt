package iofXml

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class V3MarshallersKtTest {
    fun getResourceAsText(file: String): String {
        return object {}.javaClass.getResource("/v3-examples/$file").readText()
    }

    @Test
    fun unmarshalGenericIofV3() {
        val file = getResourceAsText("ClassList.xml")
        val (obj, name, classs) = unmarshalGenericIofV3(file)

        assertEquals("ClassList", name)
        assert(obj is iofXml.v3.ClassList)
        assertNotNull(classs)
    }

    @Test
    fun unmarshalIofV3CompetitorList() {
    }

    @Test
    fun unmarshalIofV3OrganisationList() {
    }

    @Test
    fun unmarshalIofV3EventList() {
    }

    @Test
    fun unmarshalIofV3ClassList() {
    }

    @Test
    fun unmarshalIofV3EntryList() {
    }

    @Test
    fun unmarshalIofV3CourseData() {
    }

    @Test
    fun unmarshalIofV3StartList() {
    }

    @Test
    fun unmarshalIofV3ResultList() {
    }

    @Test
    fun unmarshalIofV3ServiceRequestList() {
    }

    @Test
    fun unmarshalIofV3ControlCardList() {
    }
}
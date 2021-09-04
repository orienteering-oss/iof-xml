package iofXml

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class V2MarshallersKtTest {
    fun getResourceAsText(file: String): String {
        return object {}.javaClass.getResource("/v2-examples/$file").readText()
    }

    @Test
    fun unmarshalGenericIofV2() {
        val file = getResourceAsText("ClubList_example.xml")
        val (obj, name, classs) = unmarshalGenericIofV2(file, true)

        assertEquals("ClubList", name)
        assert(obj is iofXml.v2.ClubList)
        assertNotNull(classs)
    }

    @Test
    fun unmarshalIofV2PersonList() {
    }

    @Test
    fun unmarshalIofV2CompetitorList() {
    }

    @Test
    fun unmarshalIofV2RankList() {
    }

    @Test
    fun unmarshalIofV2ClubList() {
    }

    @Test
    fun unmarshalIofV2EventList() {
    }

    @Test
    fun unmarshalIofV2ServiceRequestList() {
    }

    @Test
    fun unmarshalIofV2EntryList() {
    }

    @Test
    fun unmarshalIofV2StartList() {
    }

    @Test
    fun unmarshalIofV2ResultList() {
    }

    @Test
    fun unmarshalIofV2ClassData() {
    }

    @Test
    fun unmarshalIofV2CourseData() {
    }
}
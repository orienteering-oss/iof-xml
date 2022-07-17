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

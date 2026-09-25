package iofXml

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

internal class CodeQualityRegressionTest {
    @Test
    fun topLevelClassNamesMatchXmlTypes() {
        assertEquals("startList", classNamesV3[classesV3.indexOf(iofXml.v3.StartList::class.java)])
        assertEquals("personList", classNamesV2[classesV2.indexOf(iofXml.v2.PersonList::class.java)])
    }

    @Test
    fun mismatchedXmlTypeIsRejected() {
        assertThrows(IllegalArgumentException::class.java) {
            unmarshalIofV3StartList(getV3ResourceAsText("ClassList.xml"))
        }
        assertThrows(IllegalArgumentException::class.java) {
            unmarshalIofV2PersonList(getV2ResourceAsText("ClubList_example.xml"))
        }
    }

    @Test
    fun nullFieldsAreOmittedFromJson() {
        val json = marshalIofObjectToJson(iofXml.v2.PersonList(), prettyPrint = false)
        assertFalse(json.contains(":null"))
    }
}

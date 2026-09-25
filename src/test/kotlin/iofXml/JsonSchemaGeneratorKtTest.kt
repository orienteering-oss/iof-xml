package iofXml

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.victools.jsonschema.generator.SchemaVersion
import iofXml.v3.Route
import iofXml.v3.StartList
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class JsonSchemaGeneratorKtTest {

    @Test
    fun generateSchemaForStartList() {
        val schema = generateJsonSchemaForClass(StartList::class.java)
        assertTrue(schema.contains("\"type\""))
        assertTrue(schema.contains("\"properties\""))
    }

    @Test
    fun generatedPropertiesCoverSerializedStartList() {
        val mapper = ObjectMapper()
        val schema = mapper.readTree(generateJsonSchemaForClass(StartList::class.java))
        val schemaProperties = schema.path("properties")
        val startList = unmarshalIofV3StartList(getV3ResourceAsText("StartList1.xml"))
        val serialized = mapper.readTree(marshalIofObjectToJson(startList)).path("startList")

        assertTrue(serialized.has("event"))
        assertTrue(serialized.path("createTime").isIntegralNumber)
        assertEquals("integer", schemaProperties.path("createTime").path("type").asText())
        serialized.fieldNames().forEachRemaining { property ->
            assertTrue(schemaProperties.has(property), "Missing schema property: $property")
        }
    }

    @Test
    fun generatedSchemaMatchesBase64EncodedRoute() {
        val mapper = ObjectMapper()
        val route = Route().apply { value = byteArrayOf(1, 2, 3) }
        val serialized = mapper.readTree(marshalIofObjectToJson(route)).path("route").path("value")
        val schema = mapper.readTree(generateJsonSchemaForClass(Route::class.java))

        assertEquals("AQID", serialized.asText())
        assertEquals("string", schema.path("properties").path("value").path("type").asText())
    }

    @Test
    fun generateSchemaUsesDraft201909ByDefault() {
        val schema = generateJsonSchemaForClass(StartList::class.java)
        assertTrue(schema.contains("https://json-schema.org/draft/2019-09/schema"))
    }

    @Test
    fun generateSchemaWithDraft7() {
        val schema = generateJsonSchemaForClass(StartList::class.java, SchemaVersion.DRAFT_7)
        assertTrue(schema.contains("http://json-schema.org/draft-07/schema"))
    }

    @Test
    fun generateSchemasForAllIofV3Classes() {
        val schemas = generateJsonSchemasForIofV3()
        assertEquals(classesV3.size, schemas.size)
        assertTrue(schemas.containsKey("startList"))
        assertTrue(schemas.containsKey("classList"))
        schemas.values.forEach { schema ->
            assertTrue(schema.contains("\"type\""))
        }
    }

    @Test
    fun generateSchemasForAllIofV2Classes() {
        val schemas = generateJsonSchemasForIofV2()
        assertEquals(classesV2.size, schemas.size)
        assertTrue(schemas.containsKey("personList"))
        schemas.values.forEach { schema ->
            assertTrue(schema.contains("\"type\""))
        }
    }
}

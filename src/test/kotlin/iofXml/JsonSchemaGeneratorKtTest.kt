package iofXml

import com.github.victools.jsonschema.generator.SchemaVersion
import iofXml.v3.DateAndOptionalTime
import iofXml.v3.Route
import iofXml.v3.StartList
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import tools.jackson.databind.json.JsonMapper

class JsonSchemaGeneratorKtTest {

    @Test
    fun generateSchemaForStartList() {
        val schema = generateJsonSchemaForClass(StartList::class.java)
        assertTrue(schema.contains("\"type\""))
        assertTrue(schema.contains("\"properties\""))
    }

    @Test
    fun generatedPropertiesCoverSerializedStartList() {
        val mapper = JsonMapper.builder().build()
        val schema = mapper.readTree(generateJsonSchemaForClass(StartList::class.java))
        val schemaProperties = schema.path("properties")
        val startList = unmarshalIofV3StartList(getV3ResourceAsText("StartList1.xml"))
        val serialized = mapper.readTree(marshalIofObjectToJson(startList)).path("startList")

        assertTrue(serialized.has("event"))
        assertTrue(serialized.path("createTime").isString)
        assertEquals("string", schemaProperties.path("createTime").path("type").asString())
        serialized.propertyNames().forEach { property ->
            assertTrue(schemaProperties.has(property), "Missing schema property: $property")
        }
    }

    @Test
    fun generatedSchemaMatchesBase64EncodedRoute() {
        val mapper = JsonMapper.builder().build()
        val route = Route().apply { value = byteArrayOf(1, 2, 3) }
        val serialized = mapper.readTree(marshalIofObjectToJson(route)).path("route").path("value")
        val schema = mapper.readTree(generateJsonSchemaForClass(Route::class.java))

        assertEquals("AQID", serialized.asString())
        assertEquals("string", schema.path("properties").path("value").path("type").asString())
    }

    @Test
    fun generatedSchemaDescribesDateAndTimeAsStrings() {
        val mapper = JsonMapper.builder().build()
        val properties = mapper.readTree(generateJsonSchemaForClass(DateAndOptionalTime::class.java))
            .path("properties")

        assertEquals("string", properties.path("date").path("type").asString())
        assertEquals("string", properties.path("time").path("type").asString())
    }

    @Test
    fun generatedSchemaMatchesSerializedV2Card() {
        val card = iofXml.v2.CCard().apply { cCardId = "287130" }
        val mapper = JsonMapper.builder().build()
        val serialized = mapper.readTree(marshalIofObjectToJson(card)).path("cCard")
        val properties = mapper.readTree(generateJsonSchemaForClass(card.javaClass)).path("properties")

        assertEquals("287130", serialized.path("ccardId").asString())
        assertTrue(properties.has("ccardId"), "Missing ccardId in $properties")
        assertEquals("string", properties.path("ccardId").path("type").asString())
        assertFalse(properties.has("cCardId"))
        serialized.propertyNames().forEach { property ->
            assertTrue(properties.has(property), "Missing schema property: $property")
        }
    }

    @Test
    fun generatedSchemaMatchesNestedV2Cards() {
        val entry = iofXml.v2.Entry().apply {
            cCard.add(iofXml.v2.CCard().apply { cCardId = "287130" })
        }
        val mapper = JsonMapper.builder().build()
        val serialized = mapper.readTree(marshalIofObjectToJson(entry)).path("entry")
        val schema = mapper.readTree(generateJsonSchemaForClass(entry.javaClass))
        val properties = schema.path("properties")

        assertEquals("287130", serialized.path("ccard").path(0).path("ccardId").asString())
        assertTrue(properties.has("ccard"), "Missing ccard in $properties")
        assertFalse(properties.has("cCard"))
        val itemSchema = properties.path("ccard").path("items")
        val cardSchema = if (itemSchema.has("\$ref")) {
            schema.at(itemSchema.path("\$ref").asString().removePrefix("#"))
        } else {
            itemSchema
        }
        assertEquals("string", cardSchema.path("properties").path("ccardId").path("type").asString())
    }

    @Test
    fun explicitJsonPropertyNamesTakePrecedenceOverGetterNames() {
        val mapper = JsonMapper.builder().build()
        val properties = mapper.readTree(generateJsonSchemaForClass(AnnotatedCard::class.java))
            .path("properties")

        assertTrue(properties.has("card_id"))
        assertFalse(properties.has("ccardId"))
    }

    private class AnnotatedCard {
        @get:com.fasterxml.jackson.annotation.JsonProperty("card_id")
        var cCardId: String = "287130"
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

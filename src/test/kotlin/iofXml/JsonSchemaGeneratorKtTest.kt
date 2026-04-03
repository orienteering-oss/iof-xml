package iofXml

import com.github.victools.jsonschema.generator.SchemaVersion
import iofXml.v3.StartList
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
        assertTrue(schemas.isNotEmpty())
        assertTrue(schemas.containsKey("startList"))
        assertTrue(schemas.containsKey("classList"))
        schemas.values.forEach { schema ->
            assertTrue(schema.contains("\"type\""))
        }
    }

    @Test
    fun generateSchemasForAllIofV2Classes() {
        val schemas = generateJsonSchemasForIofV2()
        assertTrue(schemas.isNotEmpty())
        schemas.values.forEach { schema ->
            assertTrue(schema.contains("\"type\""))
        }
    }
}

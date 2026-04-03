package iofXml

import com.github.victools.jsonschema.generator.OptionPreset
import com.github.victools.jsonschema.generator.SchemaGenerator
import com.github.victools.jsonschema.generator.SchemaGeneratorConfigBuilder
import com.github.victools.jsonschema.generator.SchemaVersion
import com.github.victools.jsonschema.module.jackson.JacksonModule

private fun buildSchemaGenerator(schemaVersion: SchemaVersion): SchemaGenerator {
    val jacksonModule = JacksonModule()
    val configBuilder = SchemaGeneratorConfigBuilder(schemaVersion, OptionPreset.PLAIN_JSON)
        .with(jacksonModule)
    return SchemaGenerator(configBuilder.build())
}

/**
 * Generate a JSON Schema (Draft 2019-09) for an IOF V3 top-level class.
 *
 * @param clazz the IOF V3 class to generate schema for, e.g. `iofXml.v3.StartList::class.java`
 * @param schemaVersion the JSON Schema draft version to generate (default: 2019-09)
 * @return JSON Schema as a string
 * @sample iofXml.JsonSchemaGeneratorKtTest.generateSchemaForStartList
 */
fun generateJsonSchemaForClass(
    clazz: Class<*>,
    schemaVersion: SchemaVersion = SchemaVersion.DRAFT_2019_09
): String = buildSchemaGenerator(schemaVersion).generateSchema(clazz).toPrettyString()

/**
 * Generate JSON Schemas (Draft 2019-09) for all supported IOF V3 top-level classes.
 *
 * @param schemaVersion the JSON Schema draft version to generate (default: 2019-09)
 * @return map of class name to JSON Schema string
 */
fun generateJsonSchemasForIofV3(
    schemaVersion: SchemaVersion = SchemaVersion.DRAFT_2019_09
): Map<String, String> {
    val generator = buildSchemaGenerator(schemaVersion)
    return classesV3.associate { clazz ->
        nameFromJavaClass(clazz) to generator.generateSchema(clazz).toPrettyString()
    }
}

/**
 * Generate JSON Schemas (Draft 2019-09) for all supported IOF V2 top-level classes.
 *
 * @param schemaVersion the JSON Schema draft version to generate (default: 2019-09)
 * @return map of class name to JSON Schema string
 */
fun generateJsonSchemasForIofV2(
    schemaVersion: SchemaVersion = SchemaVersion.DRAFT_2019_09
): Map<String, String> {
    val generator = buildSchemaGenerator(schemaVersion)
    return classesV2.associate { clazz ->
        nameFromJavaClass(clazz) to generator.generateSchema(clazz).toPrettyString()
    }
}

package iofXml

import tools.jackson.core.JsonGenerator
import tools.jackson.core.JsonParser
import tools.jackson.core.JsonToken
import tools.jackson.databind.DeserializationContext
import tools.jackson.databind.SerializationContext
import tools.jackson.databind.ValueSerializer
import tools.jackson.databind.deser.std.FromStringDeserializer
import tools.jackson.databind.module.SimpleModule
import java.util.GregorianCalendar
import javax.xml.datatype.DatatypeFactory
import javax.xml.datatype.XMLGregorianCalendar

private val datatypeFactory = DatatypeFactory.newInstance()

// Preserve XML date/time precision and offsets instead of converting through java.util.Calendar.
internal class XmlCalendarModule : SimpleModule("IOF XML calendars") {
    init {
        addSerializer(XMLGregorianCalendar::class.java, object : ValueSerializer<XMLGregorianCalendar>() {
            override fun serialize(
                value: XMLGregorianCalendar,
                generator: JsonGenerator,
                context: SerializationContext
            ) {
                generator.writeString(value.toXMLFormat())
            }
        })
        addDeserializer(XMLGregorianCalendar::class.java, XmlCalendarDeserializer())
    }
}

private class XmlCalendarDeserializer : FromStringDeserializer<XMLGregorianCalendar>(XMLGregorianCalendar::class.java) {
    override fun deserialize(parser: JsonParser, context: DeserializationContext): XMLGregorianCalendar? =
        if (parser.hasToken(JsonToken.VALUE_NUMBER_INT)) {
            // Continue accepting JSON produced before the migration to string dates.
            datatypeFactory.newXMLGregorianCalendar(context.readValue(parser, GregorianCalendar::class.java))
        } else {
            super.deserialize(parser, context)
        }

    override fun _deserialize(value: String, context: DeserializationContext): XMLGregorianCalendar {
        _validateTimestampLength(context, value)
        return datatypeFactory.newXMLGregorianCalendar(value)
    }
}

//[iofXml](../../index.md)/[iofXml](index.md)/[unmarshalGenericIofV3](unmarshal-generic-iof-v3.md)

# unmarshalGenericIofV3

[jvm]\
fun [unmarshalGenericIofV3](unmarshal-generic-iof-v3.md)(xml: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), validateXml: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true): [Triple](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-triple/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)<*>>

Convert an XML file to an object of IOF V3 type. This function could be great for testing, but in production you may want to use one of the specialized converters, e.g. unmarshalIofV3CompetitorList.

## Parameters

jvm

| | |
|---|---|
| xml | XML string to be deserialized |
| validateXml | if the XML string should be validated against IOF V3 XSD |

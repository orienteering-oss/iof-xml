//[iofXml](../../index.md)/[iofXml](index.md)/[unmarshalGenericIofV2](unmarshal-generic-iof-v2.md)

# unmarshalGenericIofV2

[jvm]\
fun [unmarshalGenericIofV2](unmarshal-generic-iof-v2.md)(xml: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Triple](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-triple/index.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html), [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)<*>>

Convert an XML file to an object of IOF V2 type. This function could be great for testing, but in production you may want to use one of the specialized converters, e.g. unmarshalIofV2PersonList.

## Parameters

jvm

| | |
|---|---|
| xml | XML string to be deserialized |

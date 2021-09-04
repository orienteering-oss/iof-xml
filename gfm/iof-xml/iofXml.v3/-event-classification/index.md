//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[EventClassification](index.md)

# EventClassification

[jvm]\
enum [EventClassification](index.md)

<p>Java class for EventClassification. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;simpleType name="EventClassification"&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="International"/&gt; &lt;enumeration value="National"/&gt; &lt;enumeration value="Regional"/&gt; &lt;enumeration value="Local"/&gt; &lt;enumeration value="Club"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; </pre>

## Entries

| | |
|---|---|
| [CLUB](-c-l-u-b/index.md) | [jvm]<br>[CLUB](-c-l-u-b/index.md) |
| [LOCAL](-l-o-c-a-l/index.md) | [jvm]<br>[LOCAL](-l-o-c-a-l/index.md) |
| [REGIONAL](-r-e-g-i-o-n-a-l/index.md) | [jvm]<br>[REGIONAL](-r-e-g-i-o-n-a-l/index.md) |
| [NATIONAL](-n-a-t-i-o-n-a-l/index.md) | [jvm]<br>[NATIONAL](-n-a-t-i-o-n-a-l/index.md) |
| [INTERNATIONAL](-i-n-t-e-r-n-a-t-i-o-n-a-l/index.md) | [jvm]<br>[INTERNATIONAL](-i-n-t-e-r-n-a-t-i-o-n-a-l/index.md) |

## Functions

| Name | Summary |
|---|---|
| [fromValue](from-value.md) | [jvm]<br>open fun [fromValue](from-value.md)(v: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [EventClassification](index.md) |
| [value](value.md) | [jvm]<br>open fun [value](value.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [valueOf](value-of.md) | [jvm]<br>open fun [valueOf](value-of.md)(name: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [EventClassification](index.md) |
| [values](values.md) | [jvm]<br>open fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[EventClassification](index.md)> |

//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[EventForm](index.md)

# EventForm

[jvm]\
enum [EventForm](index.md)

<p>Java class for EventForm. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;simpleType name="EventForm"&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="Individual"/&gt; &lt;enumeration value="Team"/&gt; &lt;enumeration value="Relay"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; </pre>

## Entries

| | |
|---|---|
| [RELAY](-r-e-l-a-y/index.md) | [jvm]<br>[RELAY](-r-e-l-a-y/index.md) |
| [TEAM](-t-e-a-m/index.md) | [jvm]<br>[TEAM](-t-e-a-m/index.md) |
| [INDIVIDUAL](-i-n-d-i-v-i-d-u-a-l/index.md) | [jvm]<br>[INDIVIDUAL](-i-n-d-i-v-i-d-u-a-l/index.md) |

## Functions

| Name | Summary |
|---|---|
| [fromValue](from-value.md) | [jvm]<br>open fun [fromValue](from-value.md)(v: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [EventForm](index.md) |
| [value](value.md) | [jvm]<br>open fun [value](value.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [valueOf](value-of.md) | [jvm]<br>open fun [valueOf](value-of.md)(name: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [EventForm](index.md) |
| [values](values.md) | [jvm]<br>open fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[EventForm](index.md)> |

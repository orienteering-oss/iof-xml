//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[EventClassStatus](index.md)

# EventClassStatus

[jvm]\
enum [EventClassStatus](index.md)

<p>Java class for EventClassStatus. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;simpleType name="EventClassStatus"&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="Normal"/&gt; &lt;enumeration value="Divided"/&gt; &lt;enumeration value="Joined"/&gt; &lt;enumeration value="Invalidated"/&gt; &lt;enumeration value="InvalidatedNoFee"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; </pre>

## Entries

| | |
|---|---|
| [INVALIDATED_NO_FEE](-i-n-v-a-l-i-d-a-t-e-d_-n-o_-f-e-e/index.md) | [jvm]<br>[INVALIDATED_NO_FEE](-i-n-v-a-l-i-d-a-t-e-d_-n-o_-f-e-e/index.md)<br>The results are considered invalid due to technical issues such as misplaced controls. |
| [INVALIDATED](-i-n-v-a-l-i-d-a-t-e-d/index.md) | [jvm]<br>[INVALIDATED](-i-n-v-a-l-i-d-a-t-e-d/index.md)<br>The results are considered invalid due to technical issues such as misplaced controls. |
| [JOINED](-j-o-i-n-e-d/index.md) | [jvm]<br>[JOINED](-j-o-i-n-e-d/index.md)<br>The class has been joined with another class due to a small number of entries. |
| [DIVIDED](-d-i-v-i-d-e-d/index.md) | [jvm]<br>[DIVIDED](-d-i-v-i-d-e-d/index.md)<br>The class has been divided in two or more classes due to a large number of entries. |
| [NORMAL](-n-o-r-m-a-l/index.md) | [jvm]<br>[NORMAL](-n-o-r-m-a-l/index.md)<br>The default status. |

## Functions

| Name | Summary |
|---|---|
| [fromValue](from-value.md) | [jvm]<br>open fun [fromValue](from-value.md)(v: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [EventClassStatus](index.md) |
| [value](value.md) | [jvm]<br>open fun [value](value.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [valueOf](value-of.md) | [jvm]<br>open fun [valueOf](value-of.md)(name: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [EventClassStatus](index.md) |
| [values](values.md) | [jvm]<br>open fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[EventClassStatus](index.md)> |

//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[ControlType](index.md)

# ControlType

[jvm]\
enum [ControlType](index.md)

<p>Java class for ControlType. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;simpleType name="ControlType"&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="Control"/&gt; &lt;enumeration value="Start"/&gt; &lt;enumeration value="Finish"/&gt; &lt;enumeration value="CrossingPoint"/&gt; &lt;enumeration value="EndOfMarkedRoute"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; </pre>

## Entries

| | |
|---|---|
| [END_OF_MARKED_ROUTE](-e-n-d_-o-f_-m-a-r-k-e-d_-r-o-u-t-e/index.md) | [jvm]<br>[END_OF_MARKED_ROUTE](-e-n-d_-o-f_-m-a-r-k-e-d_-r-o-u-t-e/index.md) |
| [CROSSING_POINT](-c-r-o-s-s-i-n-g_-p-o-i-n-t/index.md) | [jvm]<br>[CROSSING_POINT](-c-r-o-s-s-i-n-g_-p-o-i-n-t/index.md) |
| [FINISH](-f-i-n-i-s-h/index.md) | [jvm]<br>[FINISH](-f-i-n-i-s-h/index.md) |
| [START](-s-t-a-r-t/index.md) | [jvm]<br>[START](-s-t-a-r-t/index.md) |
| [CONTROL](-c-o-n-t-r-o-l/index.md) | [jvm]<br>[CONTROL](-c-o-n-t-r-o-l/index.md) |

## Functions

| Name | Summary |
|---|---|
| [fromValue](from-value.md) | [jvm]<br>open fun [fromValue](from-value.md)(v: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [ControlType](index.md) |
| [value](value.md) | [jvm]<br>open fun [value](value.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [valueOf](value-of.md) | [jvm]<br>open fun [valueOf](value-of.md)(name: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [ControlType](index.md) |
| [values](values.md) | [jvm]<br>open fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[ControlType](index.md)> |

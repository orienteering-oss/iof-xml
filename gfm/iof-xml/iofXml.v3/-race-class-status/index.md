//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[RaceClassStatus](index.md)

# RaceClassStatus

[jvm]\
enum [RaceClassStatus](index.md)

<p>Java class for RaceClassStatus. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;simpleType name="RaceClassStatus"&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="StartTimesNotAllocated"/&gt; &lt;enumeration value="StartTimesAllocated"/&gt; &lt;enumeration value="NotUsed"/&gt; &lt;enumeration value="Completed"/&gt; &lt;enumeration value="Invalidated"/&gt; &lt;enumeration value="InvalidatedNoFee"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; </pre>

## Entries

| | |
|---|---|
| [INVALIDATED_NO_FEE](-i-n-v-a-l-i-d-a-t-e-d_-n-o_-f-e-e/index.md) | [jvm]<br>[INVALIDATED_NO_FEE](-i-n-v-a-l-i-d-a-t-e-d_-n-o_-f-e-e/index.md)<br>The results are considered invalid due to technical issues such as misplaced controls. |
| [INVALIDATED](-i-n-v-a-l-i-d-a-t-e-d/index.md) | [jvm]<br>[INVALIDATED](-i-n-v-a-l-i-d-a-t-e-d/index.md)<br>The results are considered invalid due to technical issues such as misplaced controls. |
| [COMPLETED](-c-o-m-p-l-e-t-e-d/index.md) | [jvm]<br>[COMPLETED](-c-o-m-p-l-e-t-e-d/index.md)<br>The result list is complete for this class in this race. |
| [NOT_USED](-n-o-t_-u-s-e-d/index.md) | [jvm]<br>[NOT_USED](-n-o-t_-u-s-e-d/index.md)<br>The class is not organised in this race, e.g. |
| [START_TIMES_ALLOCATED](-s-t-a-r-t_-t-i-m-e-s_-a-l-l-o-c-a-t-e-d/index.md) | [jvm]<br>[START_TIMES_ALLOCATED](-s-t-a-r-t_-t-i-m-e-s_-a-l-l-o-c-a-t-e-d/index.md)<br>The start list draw has been made for this class in this race. |
| [START_TIMES_NOT_ALLOCATED](-s-t-a-r-t_-t-i-m-e-s_-n-o-t_-a-l-l-o-c-a-t-e-d/index.md) | [jvm]<br>[START_TIMES_NOT_ALLOCATED](-s-t-a-r-t_-t-i-m-e-s_-n-o-t_-a-l-l-o-c-a-t-e-d/index.md)<br>The start list draw has not been made for this class in this race. |

## Functions

| Name | Summary |
|---|---|
| [fromValue](from-value.md) | [jvm]<br>open fun [fromValue](from-value.md)(v: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [RaceClassStatus](index.md) |
| [value](value.md) | [jvm]<br>open fun [value](value.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [valueOf](value-of.md) | [jvm]<br>open fun [valueOf](value-of.md)(name: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [RaceClassStatus](index.md) |
| [values](values.md) | [jvm]<br>open fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[RaceClassStatus](index.md)> |

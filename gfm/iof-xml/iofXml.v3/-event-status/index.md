//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[EventStatus](index.md)

# EventStatus

[jvm]\
enum [EventStatus](index.md)

<p>Java class for EventStatus. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;simpleType name="EventStatus"&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="Planned"/&gt; &lt;enumeration value="Applied"/&gt; &lt;enumeration value="Proposed"/&gt; &lt;enumeration value="Sanctioned"/&gt; &lt;enumeration value="Canceled"/&gt; &lt;enumeration value="Rescheduled"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; </pre>

## Entries

| | |
|---|---|
| [RESCHEDULED](-r-e-s-c-h-e-d-u-l-e-d/index.md) | [jvm]<br>[RESCHEDULED](-r-e-s-c-h-e-d-u-l-e-d/index.md)<br>The date of the event or race has changed. |
| [CANCELED](-c-a-n-c-e-l-e-d/index.md) | [jvm]<br>[CANCELED](-c-a-n-c-e-l-e-d/index.md)<br>The event or race has been canceled, e.g. |
| [SANCTIONED](-s-a-n-c-t-i-o-n-e-d/index.md) | [jvm]<br>[SANCTIONED](-s-a-n-c-t-i-o-n-e-d/index.md)<br>The event oc race meets the relevant requirements and will happen. |
| [PROPOSED](-p-r-o-p-o-s-e-d/index.md) | [jvm]<br>[PROPOSED](-p-r-o-p-o-s-e-d/index.md)<br>The organiser has bid on hosting the event or race as e.g. |
| [APPLIED](-a-p-p-l-i-e-d/index.md) | [jvm]<br>[APPLIED](-a-p-p-l-i-e-d/index.md)<br>The organiser has submitted the event to the relevant sanctioning body. |
| [PLANNED](-p-l-a-n-n-e-d/index.md) | [jvm]<br>[PLANNED](-p-l-a-n-n-e-d/index.md)<br>The event or race is on a planning stadium and has not been submitted to any sanctioning body. |

## Functions

| Name | Summary |
|---|---|
| [fromValue](from-value.md) | [jvm]<br>open fun [fromValue](from-value.md)(v: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [EventStatus](index.md) |
| [value](value.md) | [jvm]<br>open fun [value](value.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [valueOf](value-of.md) | [jvm]<br>open fun [valueOf](value-of.md)(name: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [EventStatus](index.md) |
| [values](values.md) | [jvm]<br>open fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[EventStatus](index.md)> |

//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[ResultStatus](index.md)

# ResultStatus

[jvm]\
enum [ResultStatus](index.md)

<p>Java class for ResultStatus. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;simpleType name="ResultStatus"&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="OK"/&gt; &lt;enumeration value="Finished"/&gt; &lt;enumeration value="MissingPunch"/&gt; &lt;enumeration value="Disqualified"/&gt; &lt;enumeration value="DidNotFinish"/&gt; &lt;enumeration value="Active"/&gt; &lt;enumeration value="Inactive"/&gt; &lt;enumeration value="OverTime"/&gt; &lt;enumeration value="SportingWithdrawal"/&gt; &lt;enumeration value="NotCompeting"/&gt; &lt;enumeration value="Moved"/&gt; &lt;enumeration value="MovedUp"/&gt; &lt;enumeration value="DidNotStart"/&gt; &lt;enumeration value="DidNotEnter"/&gt; &lt;enumeration value="Cancelled"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; </pre>

## Entries

| | |
|---|---|
| [CANCELLED](-c-a-n-c-e-l-l-e-d/index.md) | [jvm]<br>[CANCELLED](-c-a-n-c-e-l-l-e-d/index.md)<br>The competitor has cancelled his/hers entry. |
| [DID_NOT_ENTER](-d-i-d_-n-o-t_-e-n-t-e-r/index.md) | [jvm]<br>[DID_NOT_ENTER](-d-i-d_-n-o-t_-e-n-t-e-r/index.md)<br>Did not enter (in this race). |
| [DID_NOT_START](-d-i-d_-n-o-t_-s-t-a-r-t/index.md) | [jvm]<br>[DID_NOT_START](-d-i-d_-n-o-t_-s-t-a-r-t/index.md)<br>Did not start (in this race). |
| [MOVED_UP](-m-o-v-e-d_-u-p/index.md) | [jvm]<br>[MOVED_UP](-m-o-v-e-d_-u-p/index.md)<br>Moved to a "better" class, in case of entry restrictions. |
| [MOVED](-m-o-v-e-d/index.md) | [jvm]<br>[MOVED](-m-o-v-e-d/index.md)<br>Moved to another class. |
| [NOT_COMPETING](-n-o-t_-c-o-m-p-e-t-i-n-g/index.md) | [jvm]<br>[NOT_COMPETING](-n-o-t_-c-o-m-p-e-t-i-n-g/index.md)<br>Not competing (i.e. |
| [SPORTING_WITHDRAWAL](-s-p-o-r-t-i-n-g_-w-i-t-h-d-r-a-w-a-l/index.md) | [jvm]<br>[SPORTING_WITHDRAWAL](-s-p-o-r-t-i-n-g_-w-i-t-h-d-r-a-w-a-l/index.md)<br>Sporting withdrawal (e.g. |
| [OVER_TIME](-o-v-e-r_-t-i-m-e/index.md) | [jvm]<br>[OVER_TIME](-o-v-e-r_-t-i-m-e/index.md)<br>Overtime, i.e. |
| [INACTIVE](-i-n-a-c-t-i-v-e/index.md) | [jvm]<br>[INACTIVE](-i-n-a-c-t-i-v-e/index.md)<br>Has not yet started. |
| [ACTIVE](-a-c-t-i-v-e/index.md) | [jvm]<br>[ACTIVE](-a-c-t-i-v-e/index.md)<br>Currently on course. |
| [DID_NOT_FINISH](-d-i-d_-n-o-t_-f-i-n-i-s-h/index.md) | [jvm]<br>[DID_NOT_FINISH](-d-i-d_-n-o-t_-f-i-n-i-s-h/index.md)<br>Did not finish (i.e. |
| [DISQUALIFIED](-d-i-s-q-u-a-l-i-f-i-e-d/index.md) | [jvm]<br>[DISQUALIFIED](-d-i-s-q-u-a-l-i-f-i-e-d/index.md)<br>Disqualified (for some other reason than a missing punch). |
| [MISSING_PUNCH](-m-i-s-s-i-n-g_-p-u-n-c-h/index.md) | [jvm]<br>[MISSING_PUNCH](-m-i-s-s-i-n-g_-p-u-n-c-h/index.md)<br>Missing punch. |
| [FINISHED](-f-i-n-i-s-h-e-d/index.md) | [jvm]<br>[FINISHED](-f-i-n-i-s-h-e-d/index.md)<br>Finished but not yet validated. |
| [OK](-o-k/index.md) | [jvm]<br>[OK](-o-k/index.md)<br>Finished and validated. |

## Functions

| Name | Summary |
|---|---|
| [fromValue](from-value.md) | [jvm]<br>open fun [fromValue](from-value.md)(v: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [ResultStatus](index.md) |
| [value](value.md) | [jvm]<br>open fun [value](value.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [valueOf](value-of.md) | [jvm]<br>open fun [valueOf](value-of.md)(name: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [ResultStatus](index.md) |
| [values](values.md) | [jvm]<br>open fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[ResultStatus](index.md)> |

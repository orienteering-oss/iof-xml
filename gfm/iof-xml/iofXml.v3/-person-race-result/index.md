//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[PersonRaceResult](index.md)

# PersonRaceResult

[jvm]\
open class [PersonRaceResult](index.md)

Result information for a person in a race. <p>Java class for PersonRaceResult complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="PersonRaceResult"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt; &lt;element name="FinishTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt; &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="TimeBehind" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt; &lt;element name="Status" type="{http://www.orienteering.org/datastandard/3.0}ResultStatus"/&gt; &lt;element name="Score" type="{http://www.orienteering.org/datastandard/3.0}Score" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="OverallResult" type="{http://www.orienteering.org/datastandard/3.0}OverallResult" minOccurs="0"/&gt; &lt;element name="Course" type="{http://www.orienteering.org/datastandard/3.0}SimpleCourse" minOccurs="0"/&gt; &lt;element name="SplitTime" type="{http://www.orienteering.org/datastandard/3.0}SplitTime" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="ControlAnswer" type="{http://www.orienteering.org/datastandard/3.0}ControlAnswer" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Route" type="{http://www.orienteering.org/datastandard/3.0}Route" minOccurs="0"/&gt; &lt;element name="ControlCard" type="{http://www.orienteering.org/datastandard/3.0}ControlCard" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [assignedFee](assigned-fee.md) | [jvm]<br>protected open val [assignedFee](assigned-fee.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[AssignedFee](../-assigned-fee/index.md)> |
| [bibNumber](bib-number.md) | [jvm]<br>protected open var [bibNumber](bib-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [controlAnswer](control-answer.md) | [jvm]<br>protected open val [controlAnswer](control-answer.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ControlAnswer](../-control-answer/index.md)> |
| [controlCard](control-card.md) | [jvm]<br>protected open val [controlCard](control-card.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ControlCard](../-control-card/index.md)> |
| [course](course.md) | [jvm]<br>protected open var [course](course.md): [SimpleCourse](../-simple-course/index.md) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [finishTime](finish-time.md) | [jvm]<br>protected open var [finishTime](finish-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [overallResult](overall-result.md) | [jvm]<br>protected open var [overallResult](overall-result.md): [OverallResult](../-overall-result/index.md) |
| [position](position.md) | [jvm]<br>protected open var [position](position.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [raceNumber](race-number.md) | [jvm]<br>protected open var [raceNumber](race-number.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [route](route.md) | [jvm]<br>protected open var [route](route.md): [Route](../-route/index.md) |
| [score](score.md) | [jvm]<br>protected open val [score](score.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Score](../-score/index.md)> |
| [serviceRequest](service-request.md) | [jvm]<br>protected open val [serviceRequest](service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ServiceRequest](../-service-request/index.md)> |
| [splitTime](split-time.md) | [jvm]<br>protected open val [splitTime](split-time.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[SplitTime](../-split-time/index.md)> |
| [startTime](start-time.md) | [jvm]<br>protected open var [startTime](start-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [status](status.md) | [jvm]<br>protected open var [status](status.md): [ResultStatus](../-result-status/index.md) |
| [time](time.md) | [jvm]<br>protected open var [time](time.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [timeBehind](time-behind.md) | [jvm]<br>protected open var [timeBehind](time-behind.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |

//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Race](index.md)

# Race

[jvm]\
open class [Race](index.md)

An event consists of a number of races. The number is equal to the number of times a competitor should start. <p>Java class for Race complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Race"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="RaceNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt; &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt; &lt;element name="StartTime" type="{http://www.orienteering.org/datastandard/3.0}DateAndOptionalTime" minOccurs="0"/&gt; &lt;element name="EndTime" type="{http://www.orienteering.org/datastandard/3.0}DateAndOptionalTime" minOccurs="0"/&gt; &lt;element name="Status" type="{http://www.orienteering.org/datastandard/3.0}EventStatus" minOccurs="0"/&gt; &lt;element name="Classification" type="{http://www.orienteering.org/datastandard/3.0}EventClassification" minOccurs="0"/&gt; &lt;element name="Position" type="{http://www.orienteering.org/datastandard/3.0}GeoPosition" minOccurs="0"/&gt; &lt;element name="Discipline" type="{http://www.orienteering.org/datastandard/3.0}RaceDiscipline" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Organiser" type="{http://www.orienteering.org/datastandard/3.0}Organisation" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Official" type="{http://www.orienteering.org/datastandard/3.0}Role" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Service" type="{http://www.orienteering.org/datastandard/3.0}Service" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="URL" type="{http://www.orienteering.org/datastandard/3.0}EventURL" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [classification](classification.md) | [jvm]<br>protected open var [classification](classification.md): [EventClassification](../-event-classification/index.md) |
| [discipline](discipline.md) | [jvm]<br>protected open val [discipline](discipline.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[RaceDiscipline](../-race-discipline/index.md)> |
| [endTime](end-time.md) | [jvm]<br>protected open var [endTime](end-time.md): [DateAndOptionalTime](../-date-and-optional-time/index.md) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [official](official.md) | [jvm]<br>protected open val [official](official.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Role](../-role/index.md)> |
| [organiser](organiser.md) | [jvm]<br>protected open val [organiser](organiser.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Organisation](../-organisation/index.md)> |
| [position](position.md) | [jvm]<br>protected open var [position](position.md): [GeoPosition](../-geo-position/index.md) |
| [raceNumber](race-number.md) | [jvm]<br>protected open var [raceNumber](race-number.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [service](service.md) | [jvm]<br>protected open val [service](service.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Service](../-service/index.md)> |
| [startTime](start-time.md) | [jvm]<br>protected open var [startTime](start-time.md): [DateAndOptionalTime](../-date-and-optional-time/index.md) |
| [status](status.md) | [jvm]<br>protected open var [status](status.md): [EventStatus](../-event-status/index.md) |
| [url](url.md) | [jvm]<br>protected open val [url](url.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[EventURL](../-event-u-r-l/index.md)> |

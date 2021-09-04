//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[ClassResult](index.md)

# ClassResult

[jvm]\
open class [ClassResult](index.md)

The result list for a single class containing either individual results or team results. <p>Java class for ClassResult complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="ClassResult"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Class" type="{http://www.orienteering.org/datastandard/3.0}Class"/&gt; &lt;element name="Course" type="{http://www.orienteering.org/datastandard/3.0}SimpleRaceCourse" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="PersonResult" type="{http://www.orienteering.org/datastandard/3.0}PersonResult" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="TeamResult" type="{http://www.orienteering.org/datastandard/3.0}TeamResult" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="timeResolution" type="{http://www.w3.org/2001/XMLSchema}double" default="1" /&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [clazz](clazz.md) | [jvm]<br>protected open var [clazz](clazz.md): [Class](../-class/index.md) |
| [course](course.md) | [jvm]<br>protected open val [course](course.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[SimpleRaceCourse](../-simple-race-course/index.md)> |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [personResult](person-result.md) | [jvm]<br>protected open val [personResult](person-result.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[PersonResult](../-person-result/index.md)> |
| [teamResult](team-result.md) | [jvm]<br>protected open val [teamResult](team-result.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[TeamResult](../-team-result/index.md)> |
| [timeResolution](time-resolution.md) | [jvm]<br>protected open var [timeResolution](time-resolution.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |

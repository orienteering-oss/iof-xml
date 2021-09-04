//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[EventClass](index.md)

# EventClass

[jvm]\
open class [EventClass](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;choice&gt; &lt;element ref="{}ClassId"/&gt; &lt;element ref="{}Class"/&gt; &lt;/choice&gt; &lt;choice minOccurs="0"&gt; &lt;choice&gt; &lt;sequence maxOccurs="unbounded"&gt; &lt;element ref="{}EventRaceId"/&gt; &lt;element ref="{}ClassRaceInfo"/&gt; &lt;element ref="{}PunchingUnitType"/&gt; &lt;/sequence&gt; &lt;/choice&gt; &lt;element ref="{}TransferedToClass" minOccurs="0"/&gt; &lt;element ref="{}DividedIntoClass"/&gt; &lt;/choice&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [classId](class-id.md) | [jvm]<br>protected open var [classId](class-id.md): [ClassId](../-class-id/index.md) |
| [clazz](clazz.md) | [jvm]<br>protected open var [clazz](clazz.md): [Class](../-class/index.md) |
| [dividedIntoClass](divided-into-class.md) | [jvm]<br>protected open var [dividedIntoClass](divided-into-class.md): [DividedIntoClass](../-divided-into-class/index.md) |
| [eventRaceIdAndClassRaceInfoAndPunchingUnitType](event-race-id-and-class-race-info-and-punching-unit-type.md) | [jvm]<br>protected open val [eventRaceIdAndClassRaceInfoAndPunchingUnitType](event-race-id-and-class-race-info-and-punching-unit-type.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [transferedToClass](transfered-to-class.md) | [jvm]<br>protected open var [transferedToClass](transfered-to-class.md): [TransferedToClass](../-transfered-to-class/index.md) |

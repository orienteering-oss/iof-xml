//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Event](index.md)

# Event

[jvm]\
open class [Event](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}EventId"/&gt; &lt;element ref="{}Name"/&gt; &lt;choice&gt; &lt;element ref="{}EventClassificationId"/&gt; &lt;element ref="{}EventClassification"/&gt; &lt;/choice&gt; &lt;element ref="{}StartDate"/&gt; &lt;element ref="{}FinishDate" minOccurs="0"/&gt; &lt;element ref="{}EventOfficial" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Organiser" minOccurs="0"/&gt; &lt;element ref="{}EventClass" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}EventRace" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}WebURL" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}EntryData" minOccurs="0"/&gt; &lt;element ref="{}Service" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Account" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="eventForm" default="IndSingleDay"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="IndSingleDay"/&gt; &lt;enumeration value="IndMultiDay"/&gt; &lt;enumeration value="teamSingleDay"/&gt; &lt;enumeration value="teamMultiDay"/&gt; &lt;enumeration value="relay"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [account](account.md) | [jvm]<br>protected open val [account](account.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Account](../-account/index.md)> |
| [entryData](entry-data.md) | [jvm]<br>protected open var [entryData](entry-data.md): [EntryData](../-entry-data/index.md) |
| [eventClass](event-class.md) | [jvm]<br>protected open val [eventClass](event-class.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[EventClass](../-event-class/index.md)> |
| [eventClassification](event-classification.md) | [jvm]<br>protected open var [eventClassification](event-classification.md): [EventClassification](../-event-classification/index.md) |
| [eventClassificationId](event-classification-id.md) | [jvm]<br>protected open var [eventClassificationId](event-classification-id.md): [EventClassificationId](../-event-classification-id/index.md) |
| [eventForm](event-form.md) | [jvm]<br>protected open var [eventForm](event-form.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [eventId](event-id.md) | [jvm]<br>protected open var [eventId](event-id.md): [EventId](../-event-id/index.md) |
| [eventOfficial](event-official.md) | [jvm]<br>protected open val [eventOfficial](event-official.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[EventOfficial](../-event-official/index.md)> |
| [eventRace](event-race.md) | [jvm]<br>protected open val [eventRace](event-race.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[EventRace](../-event-race/index.md)> |
| [finishDate](finish-date.md) | [jvm]<br>protected open var [finishDate](finish-date.md): [FinishDate](../-finish-date/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [Name](../-name/index.md) |
| [organiser](organiser.md) | [jvm]<br>protected open var [organiser](organiser.md): [Organiser](../-organiser/index.md) |
| [service](service.md) | [jvm]<br>protected open val [service](service.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Service](../-service/index.md)> |
| [startDate](start-date.md) | [jvm]<br>protected open var [startDate](start-date.md): [StartDate](../-start-date/index.md) |
| [webURL](web-u-r-l.md) | [jvm]<br>protected open val [webURL](web-u-r-l.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)> |

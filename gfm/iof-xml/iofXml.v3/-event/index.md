//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Event](index.md)

# Event

[jvm]\
open class [Event](index.md)

<p>Java class for Event complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Event"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&gt; &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt; &lt;element name="StartTime" type="{http://www.orienteering.org/datastandard/3.0}DateAndOptionalTime" minOccurs="0"/&gt; &lt;element name="EndTime" type="{http://www.orienteering.org/datastandard/3.0}DateAndOptionalTime" minOccurs="0"/&gt; &lt;element name="Status" type="{http://www.orienteering.org/datastandard/3.0}EventStatus" minOccurs="0"/&gt; &lt;element name="Classification" type="{http://www.orienteering.org/datastandard/3.0}EventClassification" minOccurs="0"/&gt; &lt;element name="Form" type="{http://www.orienteering.org/datastandard/3.0}EventForm" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Organiser" type="{http://www.orienteering.org/datastandard/3.0}Organisation" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Official" type="{http://www.orienteering.org/datastandard/3.0}Role" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Class" type="{http://www.orienteering.org/datastandard/3.0}Class" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Race" type="{http://www.orienteering.org/datastandard/3.0}Race" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="EntryReceiver" type="{http://www.orienteering.org/datastandard/3.0}EntryReceiver" minOccurs="0"/&gt; &lt;element name="Service" type="{http://www.orienteering.org/datastandard/3.0}Service" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Account" type="{http://www.orienteering.org/datastandard/3.0}Account" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="URL" type="{http://www.orienteering.org/datastandard/3.0}EventURL" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Information" type="{http://www.orienteering.org/datastandard/3.0}InformationItem" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Schedule" type="{http://www.orienteering.org/datastandard/3.0}Schedule" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="News" type="{http://www.orienteering.org/datastandard/3.0}InformationItem" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [account](account.md) | [jvm]<br>protected open val [account](account.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Account](../-account/index.md)> |
| [classification](classification.md) | [jvm]<br>protected open var [classification](classification.md): [EventClassification](../-event-classification/index.md) |
| [clazz](clazz.md) | [jvm]<br>protected open val [clazz](clazz.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Class](../-class/index.md)> |
| [endTime](end-time.md) | [jvm]<br>protected open var [endTime](end-time.md): [DateAndOptionalTime](../-date-and-optional-time/index.md) |
| [entryReceiver](entry-receiver.md) | [jvm]<br>protected open var [entryReceiver](entry-receiver.md): [EntryReceiver](../-entry-receiver/index.md) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [form](form.md) | [jvm]<br>protected open val [form](form.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[EventForm](../-event-form/index.md)> |
| [id](id.md) | [jvm]<br>protected open var [id](id.md): [Id](../-id/index.md) |
| [information](information.md) | [jvm]<br>protected open val [information](information.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[InformationItem](../-information-item/index.md)> |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [news](news.md) | [jvm]<br>protected open val [news](news.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[InformationItem](../-information-item/index.md)> |
| [official](official.md) | [jvm]<br>protected open val [official](official.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Role](../-role/index.md)> |
| [organiser](organiser.md) | [jvm]<br>protected open val [organiser](organiser.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Organisation](../-organisation/index.md)> |
| [race](race.md) | [jvm]<br>protected open val [race](race.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Race](../-race/index.md)> |
| [schedule](schedule.md) | [jvm]<br>protected open val [schedule](schedule.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Schedule](../-schedule/index.md)> |
| [service](service.md) | [jvm]<br>protected open val [service](service.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Service](../-service/index.md)> |
| [startTime](start-time.md) | [jvm]<br>protected open var [startTime](start-time.md): [DateAndOptionalTime](../-date-and-optional-time/index.md) |
| [status](status.md) | [jvm]<br>protected open var [status](status.md): [EventStatus](../-event-status/index.md) |
| [url](url.md) | [jvm]<br>protected open val [url](url.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[EventURL](../-event-u-r-l/index.md)> |

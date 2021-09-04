//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[StartList](index.md)

# StartList

[jvm]\
open class [StartList](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}IOFVersion" minOccurs="0"/&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}EventId"/&gt; &lt;element ref="{}Event"/&gt; &lt;/choice&gt; &lt;element ref="{}ClassStart" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [classStart](class-start.md) | [jvm]<br>protected open val [classStart](class-start.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ClassStart](../-class-start/index.md)> |
| [event](event.md) | [jvm]<br>protected open var [event](event.md): [Event](../-event/index.md) |
| [eventId](event-id.md) | [jvm]<br>protected open var [eventId](event-id.md): [EventId](../-event-id/index.md) |
| [iofVersion](iof-version.md) | [jvm]<br>protected open var [iofVersion](iof-version.md): [IOFVersion](../-i-o-f-version/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |

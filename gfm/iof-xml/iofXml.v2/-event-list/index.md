//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[EventList](index.md)

# EventList

[jvm]\
open class [EventList](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}IOFVersion" minOccurs="0"/&gt; &lt;element ref="{}EventClassification" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Event" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [event](event.md) | [jvm]<br>protected open val [event](event.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Event](../-event/index.md)> |
| [eventClassification](event-classification.md) | [jvm]<br>protected open val [eventClassification](event-classification.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[EventClassification](../-event-classification/index.md)> |
| [iofVersion](iof-version.md) | [jvm]<br>protected open var [iofVersion](iof-version.md): [IOFVersion](../-i-o-f-version/index.md) |

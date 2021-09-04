//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[BaseMessageElement](index.md)

# BaseMessageElement

[jvm]\
abstract class [BaseMessageElement](index.md)

The base message element that all message elements extend. <p>Java class for BaseMessageElement complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="BaseMessageElement"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;attribute name="iofVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="3.0" /&gt; &lt;attribute name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;attribute name="creator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [createTime](create-time.md) | [jvm]<br>protected open var [createTime](create-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [creator](creator.md) | [jvm]<br>protected open var [creator](creator.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [iofVersion](iof-version.md) | [jvm]<br>protected open var [iofVersion](iof-version.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

## Inheritors

| Name |
|---|
| [OrganisationList](../-organisation-list/index.md) |
| [ClassList](../-class-list/index.md) |
| [CourseData](../-course-data/index.md) |
| [ResultList](../-result-list/index.md) |
| [ServiceRequestList](../-service-request-list/index.md) |
| [CompetitorList](../-competitor-list/index.md) |
| [EventList](../-event-list/index.md) |
| [StartList](../-start-list/index.md) |
| [EntryList](../-entry-list/index.md) |
| [ControlCardList](../-control-card-list/index.md) |

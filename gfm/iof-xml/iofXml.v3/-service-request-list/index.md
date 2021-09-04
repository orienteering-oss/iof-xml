//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[ServiceRequestList](index.md)

# ServiceRequestList

[jvm]\
open class [ServiceRequestList](index.md) : [BaseMessageElement](../-base-message-element/index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;extension base="{http://www.orienteering.org/datastandard/3.0}BaseMessageElement"&gt; &lt;sequence&gt; &lt;element name="Event" type="{http://www.orienteering.org/datastandard/3.0}Event"/&gt; &lt;element name="OrganisationServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}OrganisationServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="PersonServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}PersonServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/extension&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Functions

| Name | Summary |
|---|---|
| [getCreateTime](../-control-card-list/index.md#1049010220%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getCreateTime](../-control-card-list/index.md#1049010220%2FFunctions%2F-1216412040)(): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html)<br>Gets the value of the createTime property. |
| [getCreator](../-control-card-list/index.md#977017305%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getCreator](../-control-card-list/index.md#977017305%2FFunctions%2F-1216412040)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>Gets the value of the creator property. |
| [getIofVersion](../-control-card-list/index.md#-418085827%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getIofVersion](../-control-card-list/index.md#-418085827%2FFunctions%2F-1216412040)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>Gets the value of the iofVersion property. |
| [setCreateTime](../-control-card-list/index.md#334755514%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setCreateTime](../-control-card-list/index.md#334755514%2FFunctions%2F-1216412040)(value: [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html))<br>Sets the value of the createTime property. |
| [setCreator](../-control-card-list/index.md#1893160672%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setCreator](../-control-card-list/index.md#1893160672%2FFunctions%2F-1216412040)(value: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))<br>Sets the value of the creator property. |
| [setIofVersion](../-control-card-list/index.md#1421542316%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setIofVersion](../-control-card-list/index.md#1421542316%2FFunctions%2F-1216412040)(value: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))<br>Sets the value of the iofVersion property. |

## Properties

| Name | Summary |
|---|---|
| [event](event.md) | [jvm]<br>protected open var [event](event.md): [Event](../-event/index.md) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [organisationServiceRequest](organisation-service-request.md) | [jvm]<br>protected open val [organisationServiceRequest](organisation-service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[OrganisationServiceRequest](../-organisation-service-request/index.md)> |
| [personServiceRequest](person-service-request.md) | [jvm]<br>protected open val [personServiceRequest](person-service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[PersonServiceRequest](../-person-service-request/index.md)> |

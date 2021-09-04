//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[ResultList](index.md)

# ResultList

[jvm]\
open class [ResultList](index.md) : [BaseMessageElement](../-base-message-element/index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;extension base="{http://www.orienteering.org/datastandard/3.0}BaseMessageElement"&gt; &lt;sequence&gt; &lt;element name="Event" type="{http://www.orienteering.org/datastandard/3.0}Event"/&gt; &lt;element name="ClassResult" type="{http://www.orienteering.org/datastandard/3.0}ClassResult" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="status" default="Complete"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="Complete"/&gt; &lt;enumeration value="Delta"/&gt; &lt;enumeration value="Snapshot"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/extension&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

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
| [classResult](class-result.md) | [jvm]<br>protected open val [classResult](class-result.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ClassResult](../-class-result/index.md)> |
| [event](event.md) | [jvm]<br>protected open var [event](event.md): [Event](../-event/index.md) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [status](status.md) | [jvm]<br>protected open var [status](status.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

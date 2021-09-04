//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[ControlCardList](index.md)

# ControlCardList

[jvm]\
open class [ControlCardList](index.md) : [BaseMessageElement](../-base-message-element/index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;extension base="{http://www.orienteering.org/datastandard/3.0}BaseMessageElement"&gt; &lt;sequence&gt; &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="ControlCard" type="{http://www.orienteering.org/datastandard/3.0}ControlCard" maxOccurs="unbounded"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/extension&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Functions

| Name | Summary |
|---|---|
| [getCreateTime](index.md#1049010220%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getCreateTime](index.md#1049010220%2FFunctions%2F-1216412040)(): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html)<br>Gets the value of the createTime property. |
| [getCreator](index.md#977017305%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getCreator](index.md#977017305%2FFunctions%2F-1216412040)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>Gets the value of the creator property. |
| [getIofVersion](index.md#-418085827%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getIofVersion](index.md#-418085827%2FFunctions%2F-1216412040)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>Gets the value of the iofVersion property. |
| [setCreateTime](index.md#334755514%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setCreateTime](index.md#334755514%2FFunctions%2F-1216412040)(value: [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html))<br>Sets the value of the createTime property. |
| [setCreator](index.md#1893160672%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setCreator](index.md#1893160672%2FFunctions%2F-1216412040)(value: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))<br>Sets the value of the creator property. |
| [setIofVersion](index.md#1421542316%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setIofVersion](index.md#1421542316%2FFunctions%2F-1216412040)(value: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))<br>Sets the value of the iofVersion property. |

## Properties

| Name | Summary |
|---|---|
| [controlCard](control-card.md) | [jvm]<br>protected open val [controlCard](control-card.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ControlCard](../-control-card/index.md)> |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [owner](owner.md) | [jvm]<br>protected open var [owner](owner.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

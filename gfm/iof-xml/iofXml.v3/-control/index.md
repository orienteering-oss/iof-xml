//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Control](index.md)

# Control

[jvm]\
open class [Control](index.md)

Defines a control, without any relationship to a particular course. <p>Java class for Control complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Control"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&gt; &lt;element name="PunchingUnitId" type="{http://www.orienteering.org/datastandard/3.0}Id" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Name" type="{http://www.orienteering.org/datastandard/3.0}LanguageString" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Position" type="{http://www.orienteering.org/datastandard/3.0}GeoPosition" minOccurs="0"/&gt; &lt;element name="MapPosition" type="{http://www.orienteering.org/datastandard/3.0}MapPosition" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="type" type="{http://www.orienteering.org/datastandard/3.0}ControlType" default="Control" /&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [id](id.md) | [jvm]<br>protected open var [id](id.md): [Id](../-id/index.md) |
| [mapPosition](map-position.md) | [jvm]<br>protected open var [mapPosition](map-position.md): [MapPosition](../-map-position/index.md) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [name](name.md) | [jvm]<br>protected open val [name](name.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LanguageString](../-language-string/index.md)> |
| [position](position.md) | [jvm]<br>protected open var [position](position.md): [GeoPosition](../-geo-position/index.md) |
| [punchingUnitId](punching-unit-id.md) | [jvm]<br>protected open val [punchingUnitId](punching-unit-id.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Id](../-id/index.md)> |
| [type](type.md) | [jvm]<br>protected open var [type](type.md): [ControlType](../-control-type/index.md) |

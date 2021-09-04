//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Control](index.md)

# Control

[jvm]\
open class [Control](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}ControlCode"/&gt; &lt;element ref="{}Description" minOccurs="0"/&gt; &lt;element ref="{}ControlPosition" minOccurs="0"/&gt; &lt;choice maxOccurs="unbounded" minOccurs="0"&gt; &lt;element ref="{}PunchingUnit"/&gt; &lt;element ref="{}PunchPattern"/&gt; &lt;/choice&gt; &lt;element ref="{}PunchingUnitType" minOccurs="0"/&gt; &lt;element ref="{}MapPosition" minOccurs="0"/&gt; &lt;element ref="{}Comment" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [comment](comment.md) | [jvm]<br>protected open val [comment](comment.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Comment](../-comment/index.md)> |
| [controlCode](control-code.md) | [jvm]<br>protected open var [controlCode](control-code.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [controlPosition](control-position.md) | [jvm]<br>protected open var [controlPosition](control-position.md): [ControlPosition](../-control-position/index.md) |
| [description](description.md) | [jvm]<br>protected open var [description](description.md): [Description](../-description/index.md) |
| [mapPosition](map-position.md) | [jvm]<br>protected open var [mapPosition](map-position.md): [MapPosition](../-map-position/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [punchingUnitOrPunchPattern](punching-unit-or-punch-pattern.md) | [jvm]<br>protected open val [punchingUnitOrPunchPattern](punching-unit-or-punch-pattern.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |
| [punchingUnitType](punching-unit-type.md) | [jvm]<br>protected open var [punchingUnitType](punching-unit-type.md): [PunchingUnitType](../-punching-unit-type/index.md) |

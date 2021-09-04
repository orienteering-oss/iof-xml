//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[FinishPoint](index.md)

# FinishPoint

[jvm]\
open class [FinishPoint](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}FinishPointCode"/&gt; &lt;element ref="{}Description" minOccurs="0"/&gt; &lt;element ref="{}ControlPosition" minOccurs="0"/&gt; &lt;choice maxOccurs="unbounded" minOccurs="0"&gt; &lt;element ref="{}PunchingUnit"/&gt; &lt;element ref="{}PunchPattern"/&gt; &lt;/choice&gt; &lt;element ref="{}PunchingUnitType" minOccurs="0"/&gt; &lt;element ref="{}MapPosition" minOccurs="0"/&gt; &lt;element ref="{}Comment" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [comment](comment.md) | [jvm]<br>protected open var [comment](comment.md): [Comment](../-comment/index.md) |
| [controlPosition](control-position.md) | [jvm]<br>protected open var [controlPosition](control-position.md): [ControlPosition](../-control-position/index.md) |
| [description](description.md) | [jvm]<br>protected open var [description](description.md): [Description](../-description/index.md) |
| [finishPointCode](finish-point-code.md) | [jvm]<br>protected open var [finishPointCode](finish-point-code.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [mapPosition](map-position.md) | [jvm]<br>protected open var [mapPosition](map-position.md): [MapPosition](../-map-position/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [punchingUnitOrPunchPattern](punching-unit-or-punch-pattern.md) | [jvm]<br>protected open val [punchingUnitOrPunchPattern](punching-unit-or-punch-pattern.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |
| [punchingUnitType](punching-unit-type.md) | [jvm]<br>protected open var [punchingUnitType](punching-unit-type.md): [PunchingUnitType](../-punching-unit-type/index.md) |

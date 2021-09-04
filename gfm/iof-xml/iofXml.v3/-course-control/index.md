//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[CourseControl](index.md)

# CourseControl

[jvm]\
open class [CourseControl](index.md)

A control included in a particular course. <p>Java class for CourseControl complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="CourseControl"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Control" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt; &lt;element name="MapText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="MapTextPosition" type="{http://www.orienteering.org/datastandard/3.0}MapPosition" minOccurs="0"/&gt; &lt;element name="LegLength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="type" type="{http://www.orienteering.org/datastandard/3.0}ControlType" /&gt; &lt;attribute name="randomOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt; &lt;attribute name="specialInstruction" default="None"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="None"/&gt; &lt;enumeration value="TapedRoute"/&gt; &lt;enumeration value="FunnelTapedRoute"/&gt; &lt;enumeration value="MandatoryCrossingPoint"/&gt; &lt;enumeration value="MandatoryOutOfBoundsAreaPassage"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;attribute name="tapedRouteLength" type="{http://www.w3.org/2001/XMLSchema}double" /&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Functions

| Name | Summary |
|---|---|
| [isRandomOrder](is-random-order.md) | [jvm]<br>open fun [isRandomOrder](is-random-order.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Gets the value of the randomOrder property. |

## Properties

| Name | Summary |
|---|---|
| [control](control.md) | [jvm]<br>protected open val [control](control.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)> |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [legLength](leg-length.md) | [jvm]<br>protected open var [legLength](leg-length.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [mapText](map-text.md) | [jvm]<br>protected open var [mapText](map-text.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [mapTextPosition](map-text-position.md) | [jvm]<br>protected open var [mapTextPosition](map-text-position.md): [MapPosition](../-map-position/index.md) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [randomOrder](random-order.md) | [jvm]<br>protected open var [randomOrder](random-order.md): [Boolean](https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html) |
| [score](score.md) | [jvm]<br>protected open var [score](score.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [specialInstruction](special-instruction.md) | [jvm]<br>protected open var [specialInstruction](special-instruction.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [tapedRouteLength](taped-route-length.md) | [jvm]<br>protected open var [tapedRouteLength](taped-route-length.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [type](type.md) | [jvm]<br>protected open var [type](type.md): [ControlType](../-control-type/index.md) |

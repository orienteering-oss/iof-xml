//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[SimpleRaceCourse](index.md)

# SimpleRaceCourse

[jvm]\
open class [SimpleRaceCourse](index.md) : [SimpleCourse](../-simple-course/index.md)

Defines a course for a certain race, excluding controls. <p>Java class for SimpleRaceCourse complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="SimpleRaceCourse"&gt; &lt;complexContent&gt; &lt;extension base="{http://www.orienteering.org/datastandard/3.0}SimpleCourse"&gt; &lt;attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt; &lt;/extension&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Functions

| Name | Summary |
|---|---|
| [getClimb](index.md#158709303%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getClimb](index.md#158709303%2FFunctions%2F-1216412040)(): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html)<br>Gets the value of the climb property. |
| [getCourseFamily](index.md#-1114484017%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getCourseFamily](index.md#-1114484017%2FFunctions%2F-1216412040)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>Gets the value of the courseFamily property. |
| [getId](index.md#-1206195757%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getId](index.md#-1206195757%2FFunctions%2F-1216412040)(): [Id](../-id/index.md)<br>Gets the value of the id property. |
| [getLength](index.md#1461220840%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getLength](index.md#1461220840%2FFunctions%2F-1216412040)(): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html)<br>Gets the value of the length property. |
| [getName](index.md#1388317219%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getName](index.md#1388317219%2FFunctions%2F-1216412040)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)<br>Gets the value of the name property. |
| [getNumberOfControls](index.md#-729642056%2FFunctions%2F-1216412040) | [jvm]<br>open fun [getNumberOfControls](index.md#-729642056%2FFunctions%2F-1216412040)(): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html)<br>Gets the value of the numberOfControls property. |
| [setClimb](index.md#511768190%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setClimb](index.md#511768190%2FFunctions%2F-1216412040)(value: [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html))<br>Sets the value of the climb property. |
| [setCourseFamily](index.md#402612542%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setCourseFamily](index.md#402612542%2FFunctions%2F-1216412040)(value: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))<br>Sets the value of the courseFamily property. |
| [setId](index.md#37325586%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setId](index.md#37325586%2FFunctions%2F-1216412040)(value: [Id](../-id/index.md))<br>Sets the value of the id property. |
| [setLength](index.md#-1011300969%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setLength](index.md#-1011300969%2FFunctions%2F-1216412040)(value: [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html))<br>Sets the value of the length property. |
| [setName](index.md#1066378386%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setName](index.md#1066378386%2FFunctions%2F-1216412040)(value: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))<br>Sets the value of the name property. |
| [setNumberOfControls](index.md#-87349612%2FFunctions%2F-1216412040) | [jvm]<br>open fun [setNumberOfControls](index.md#-87349612%2FFunctions%2F-1216412040)(value: [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html))<br>Sets the value of the numberOfControls property. |

## Properties

| Name | Summary |
|---|---|
| [raceNumber](race-number.md) | [jvm]<br>protected open var [raceNumber](race-number.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |

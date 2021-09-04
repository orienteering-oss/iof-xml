//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[SimpleCourse](index.md)

# SimpleCourse

[jvm]\
open class [SimpleCourse](index.md)

Defines a course, excluding controls. <p>Java class for SimpleCourse complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="SimpleCourse"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&gt; &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="CourseFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="Climb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="NumberOfControls" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [climb](climb.md) | [jvm]<br>protected open var [climb](climb.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [courseFamily](course-family.md) | [jvm]<br>protected open var [courseFamily](course-family.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [id](id.md) | [jvm]<br>protected open var [id](id.md): [Id](../-id/index.md) |
| [length](length.md) | [jvm]<br>protected open var [length](length.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [numberOfControls](number-of-controls.md) | [jvm]<br>protected open var [numberOfControls](number-of-controls.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |

## Inheritors

| Name |
|---|
| [SimpleRaceCourse](../-simple-race-course/index.md) |

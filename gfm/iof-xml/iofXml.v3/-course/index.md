//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Course](index.md)

# Course

[jvm]\
open class [Course](index.md)

Defines a course, i.e. a number of controls including start and finish. <p>Java class for Course complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Course"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&gt; &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt; &lt;element name="CourseFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="Climb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="CourseControl" type="{http://www.orienteering.org/datastandard/3.0}CourseControl" maxOccurs="unbounded" minOccurs="2"/&gt; &lt;element name="MapId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="numberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [climb](climb.md) | [jvm]<br>protected open var [climb](climb.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [courseControl](course-control.md) | [jvm]<br>protected open val [courseControl](course-control.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[CourseControl](../-course-control/index.md)> |
| [courseFamily](course-family.md) | [jvm]<br>protected open var [courseFamily](course-family.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [id](id.md) | [jvm]<br>protected open var [id](id.md): [Id](../-id/index.md) |
| [length](length.md) | [jvm]<br>protected open var [length](length.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [mapId](map-id.md) | [jvm]<br>protected open var [mapId](map-id.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [numberOfCompetitors](number-of-competitors.md) | [jvm]<br>protected open var [numberOfCompetitors](number-of-competitors.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |

//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[CourseData](index.md)

# CourseData

[jvm]\
open class [CourseData](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}IOFVersion" minOccurs="0"/&gt; &lt;element ref="{}Map" minOccurs="0"/&gt; &lt;element ref="{}StartPoint" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Control" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}FinishPoint" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Course" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [control](control.md) | [jvm]<br>protected open val [control](control.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Control](../-control/index.md)> |
| [course](course.md) | [jvm]<br>protected open val [course](course.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Course](../-course/index.md)> |
| [finishPoint](finish-point.md) | [jvm]<br>protected open val [finishPoint](finish-point.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[FinishPoint](../-finish-point/index.md)> |
| [iofVersion](iof-version.md) | [jvm]<br>protected open var [iofVersion](iof-version.md): [IOFVersion](../-i-o-f-version/index.md) |
| [map](map.md) | [jvm]<br>protected open var [map](map.md): [Map](../-map/index.md) |
| [startPoint](start-point.md) | [jvm]<br>protected open val [startPoint](start-point.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[StartPoint](../-start-point/index.md)> |

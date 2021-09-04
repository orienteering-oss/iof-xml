//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[CourseSectionList](index.md)

# CourseSectionList

[jvm]\
open class [CourseSectionList](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}StartPointCode" minOccurs="0"/&gt; &lt;element ref="{}CourseSection" maxOccurs="unbounded"/&gt; &lt;element ref="{}FinishPointCode" minOccurs="0"/&gt; &lt;element ref="{}DistanceToFinish" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [courseSection](course-section.md) | [jvm]<br>protected open val [courseSection](course-section.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[CourseSection](../-course-section/index.md)> |
| [distanceToFinish](distance-to-finish.md) | [jvm]<br>protected open val [distanceToFinish](distance-to-finish.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[DistanceToFinish](../-distance-to-finish/index.md)> |
| [finishPointCode](finish-point-code.md) | [jvm]<br>protected open var [finishPointCode](finish-point-code.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [startPointCode](start-point-code.md) | [jvm]<br>protected open var [startPointCode](start-point-code.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

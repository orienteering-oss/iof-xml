//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Course](index.md)

# Course

[jvm]\
open class [Course](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}CourseName"/&gt; &lt;element ref="{}CourseId" minOccurs="0"/&gt; &lt;element ref="{}EventId" minOccurs="0"/&gt; &lt;element ref="{}EventRaceId" minOccurs="0"/&gt; &lt;choice maxOccurs="unbounded" minOccurs="0"&gt; &lt;element ref="{}ClassId"/&gt; &lt;element ref="{}ClassShortName"/&gt; &lt;/choice&gt; &lt;element ref="{}CourseVariation" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}CourseSectionList" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [classIdOrClassShortName](class-id-or-class-short-name.md) | [jvm]<br>protected open val [classIdOrClassShortName](class-id-or-class-short-name.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |
| [courseId](course-id.md) | [jvm]<br>protected open var [courseId](course-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [courseName](course-name.md) | [jvm]<br>protected open var [courseName](course-name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [courseSectionList](course-section-list.md) | [jvm]<br>protected open var [courseSectionList](course-section-list.md): [CourseSectionList](../-course-section-list/index.md) |
| [courseVariation](course-variation.md) | [jvm]<br>protected open val [courseVariation](course-variation.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[CourseVariation](../-course-variation/index.md)> |
| [eventId](event-id.md) | [jvm]<br>protected open var [eventId](event-id.md): [EventId](../-event-id/index.md) |
| [eventRaceId](event-race-id.md) | [jvm]<br>protected open var [eventRaceId](event-race-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

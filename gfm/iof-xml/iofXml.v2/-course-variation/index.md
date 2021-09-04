//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[CourseVariation](index.md)

# CourseVariation

[jvm]\
open class [CourseVariation](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}CourseVariationId"/&gt; &lt;element ref="{}Name" minOccurs="0"/&gt; &lt;element ref="{}CourseLength"/&gt; &lt;element ref="{}CourseClimb" minOccurs="0"/&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}StartPointCode"/&gt; &lt;element ref="{}StartPoint"/&gt; &lt;/choice&gt; &lt;element ref="{}FinishChute" minOccurs="0"/&gt; &lt;element ref="{}CourseControl" maxOccurs="unbounded"/&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}FinishPointCode"/&gt; &lt;element ref="{}FinishPoint"/&gt; &lt;/choice&gt; &lt;element ref="{}DistanceToFinish" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="numberOfRunners" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [courseClimb](course-climb.md) | [jvm]<br>protected open var [courseClimb](course-climb.md): [CourseClimb](../-course-climb/index.md) |
| [courseControl](course-control.md) | [jvm]<br>protected open val [courseControl](course-control.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[CourseControl](../-course-control/index.md)> |
| [courseLength](course-length.md) | [jvm]<br>protected open var [courseLength](course-length.md): [CourseLength](../-course-length/index.md) |
| [courseVariationId](course-variation-id.md) | [jvm]<br>protected open var [courseVariationId](course-variation-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [distanceToFinish](distance-to-finish.md) | [jvm]<br>protected open var [distanceToFinish](distance-to-finish.md): [DistanceToFinish](../-distance-to-finish/index.md) |
| [finishChute](finish-chute.md) | [jvm]<br>protected open var [finishChute](finish-chute.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [finishPoint](finish-point.md) | [jvm]<br>protected open var [finishPoint](finish-point.md): [FinishPoint](../-finish-point/index.md) |
| [finishPointCode](finish-point-code.md) | [jvm]<br>protected open var [finishPointCode](finish-point-code.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [Name](../-name/index.md) |
| [numberOfRunners](number-of-runners.md) | [jvm]<br>protected open var [numberOfRunners](number-of-runners.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [startPoint](start-point.md) | [jvm]<br>protected open var [startPoint](start-point.md): [StartPoint](../-start-point/index.md) |
| [startPointCode](start-point-code.md) | [jvm]<br>protected open var [startPointCode](start-point-code.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

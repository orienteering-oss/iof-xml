//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Result](index.md)

# Result

[jvm]\
open class [Result](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}StartNumber" minOccurs="0"/&gt; &lt;element ref="{}BibNumber" minOccurs="0"/&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}CCardId"/&gt; &lt;element ref="{}CCard"/&gt; &lt;/choice&gt; &lt;element ref="{}StartTime" minOccurs="0"/&gt; &lt;element ref="{}FinishTime" minOccurs="0"/&gt; &lt;element ref="{}Time" minOccurs="0"/&gt; &lt;element ref="{}ResultPosition" minOccurs="0"/&gt; &lt;element ref="{}CompetitorStatus"/&gt; &lt;element ref="{}TeamSequence" minOccurs="0"/&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}CourseVariationId"/&gt; &lt;element ref="{}CourseVariation"/&gt; &lt;element ref="{}CourseLength"/&gt; &lt;/choice&gt; &lt;element ref="{}SplitTime" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}BadgeValueId"/&gt; &lt;element ref="{}BadgeValue"/&gt; &lt;/choice&gt; &lt;element ref="{}Point" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [badgeValue](badge-value.md) | [jvm]<br>protected open var [badgeValue](badge-value.md): [BadgeValue](../-badge-value/index.md) |
| [badgeValueId](badge-value-id.md) | [jvm]<br>protected open var [badgeValueId](badge-value-id.md): [BadgeValueId](../-badge-value-id/index.md) |
| [bibNumber](bib-number.md) | [jvm]<br>protected open var [bibNumber](bib-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [cCard](c-card.md) | [jvm]<br>protected open var [cCard](c-card.md): [CCard](../-c-card/index.md) |
| [cCardId](c-card-id.md) | [jvm]<br>protected open var [cCardId](c-card-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [competitorStatus](competitor-status.md) | [jvm]<br>protected open var [competitorStatus](competitor-status.md): [CompetitorStatus](../-competitor-status/index.md) |
| [courseLength](course-length.md) | [jvm]<br>protected open var [courseLength](course-length.md): [CourseLength](../-course-length/index.md) |
| [courseVariation](course-variation.md) | [jvm]<br>protected open var [courseVariation](course-variation.md): [CourseVariation](../-course-variation/index.md) |
| [courseVariationId](course-variation-id.md) | [jvm]<br>protected open var [courseVariationId](course-variation-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [finishTime](finish-time.md) | [jvm]<br>protected open var [finishTime](finish-time.md): [FinishTime](../-finish-time/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [point](point.md) | [jvm]<br>protected open val [point](point.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Point](../-point/index.md)> |
| [resultPosition](result-position.md) | [jvm]<br>protected open var [resultPosition](result-position.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [splitTime](split-time.md) | [jvm]<br>protected open val [splitTime](split-time.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[SplitTime](../-split-time/index.md)> |
| [startNumber](start-number.md) | [jvm]<br>protected open var [startNumber](start-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [startTime](start-time.md) | [jvm]<br>protected open var [startTime](start-time.md): [StartTime](../-start-time/index.md) |
| [teamSequence](team-sequence.md) | [jvm]<br>protected open var [teamSequence](team-sequence.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [time](time.md) | [jvm]<br>protected open var [time](time.md): [Time](../-time/index.md) |

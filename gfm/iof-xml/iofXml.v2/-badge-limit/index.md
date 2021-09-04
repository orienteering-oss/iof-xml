//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[BadgeLimit](index.md)

# BadgeLimit

[jvm]\
open class [BadgeLimit](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;choice&gt; &lt;element ref="{}BadgeValueId"/&gt; &lt;element ref="{}BadgeValue"/&gt; &lt;/choice&gt; &lt;choice&gt; &lt;element ref="{}EventClassificationId"/&gt; &lt;element ref="{}EventClassification"/&gt; &lt;/choice&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}ClassTypeId"/&gt; &lt;element ref="{}ClassType"/&gt; &lt;/choice&gt; &lt;element ref="{}TimeFactor"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [badgeValue](badge-value.md) | [jvm]<br>protected open var [badgeValue](badge-value.md): [BadgeValue](../-badge-value/index.md) |
| [badgeValueId](badge-value-id.md) | [jvm]<br>protected open var [badgeValueId](badge-value-id.md): [BadgeValueId](../-badge-value-id/index.md) |
| [classType](class-type.md) | [jvm]<br>protected open var [classType](class-type.md): [ClassType](../-class-type/index.md) |
| [classTypeId](class-type-id.md) | [jvm]<br>protected open var [classTypeId](class-type-id.md): [ClassTypeId](../-class-type-id/index.md) |
| [eventClassification](event-classification.md) | [jvm]<br>protected open var [eventClassification](event-classification.md): [EventClassification](../-event-classification/index.md) |
| [eventClassificationId](event-classification-id.md) | [jvm]<br>protected open var [eventClassificationId](event-classification-id.md): [EventClassificationId](../-event-classification-id/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [timeFactor](time-factor.md) | [jvm]<br>protected open var [timeFactor](time-factor.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

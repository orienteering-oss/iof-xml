//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Start](index.md)

# Start

[jvm]\
open class [Start](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}StartNumber" minOccurs="0"/&gt; &lt;element ref="{}BibNumber" minOccurs="0"/&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}CCardId"/&gt; &lt;element ref="{}CCard"/&gt; &lt;/choice&gt; &lt;element ref="{}StartTime" minOccurs="0"/&gt; &lt;element ref="{}TeamSequence" minOccurs="0"/&gt; &lt;element ref="{}CourseLength"/&gt; &lt;element ref="{}StartId" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [bibNumber](bib-number.md) | [jvm]<br>protected open var [bibNumber](bib-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [cCard](c-card.md) | [jvm]<br>protected open var [cCard](c-card.md): [CCard](../-c-card/index.md) |
| [cCardId](c-card-id.md) | [jvm]<br>protected open var [cCardId](c-card-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [courseLength](course-length.md) | [jvm]<br>protected open var [courseLength](course-length.md): [CourseLength](../-course-length/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [startId](start-id.md) | [jvm]<br>protected open var [startId](start-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [startNumber](start-number.md) | [jvm]<br>protected open var [startNumber](start-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [startTime](start-time.md) | [jvm]<br>protected open var [startTime](start-time.md): [StartTime](../-start-time/index.md) |
| [teamSequence](team-sequence.md) | [jvm]<br>protected open var [teamSequence](team-sequence.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

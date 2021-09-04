//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[ClassStart](index.md)

# ClassStart

[jvm]\
open class [ClassStart](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;choice&gt; &lt;element ref="{}ClassId"/&gt; &lt;element ref="{}ClassShortName"/&gt; &lt;element ref="{}EventClass"/&gt; &lt;/choice&gt; &lt;choice maxOccurs="unbounded" minOccurs="0"&gt; &lt;element ref="{}PersonStart"/&gt; &lt;element ref="{}TeamStart"/&gt; &lt;/choice&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [classId](class-id.md) | [jvm]<br>protected open var [classId](class-id.md): [ClassId](../-class-id/index.md) |
| [classShortName](class-short-name.md) | [jvm]<br>protected open var [classShortName](class-short-name.md): [ClassShortName](../-class-short-name/index.md) |
| [eventClass](event-class.md) | [jvm]<br>protected open var [eventClass](event-class.md): [EventClass](../-event-class/index.md) |
| [personStartOrTeamStart](person-start-or-team-start.md) | [jvm]<br>protected open val [personStartOrTeamStart](person-start-or-team-start.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |

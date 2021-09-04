//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Organiser](index.md)

# Organiser

[jvm]\
open class [Organiser](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;choice maxOccurs="unbounded" minOccurs="0"&gt; &lt;element ref="{}ClubId"/&gt; &lt;element ref="{}Club"/&gt; &lt;/choice&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [clubIdOrClub](club-id-or-club.md) | [jvm]<br>protected open val [clubIdOrClub](club-id-or-club.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |

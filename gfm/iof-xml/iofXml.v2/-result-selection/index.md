//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[ResultSelection](index.md)

# ResultSelection

[jvm]\
open class [ResultSelection](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;choice maxOccurs="unbounded" minOccurs="0"&gt; &lt;element ref="{}OrganisationId"/&gt; &lt;element ref="{}Organisation"/&gt; &lt;/choice&gt; &lt;choice maxOccurs="unbounded" minOccurs="0"&gt; &lt;element ref="{}ClubId"/&gt; &lt;element ref="{}Club"/&gt; &lt;/choice&gt; &lt;choice maxOccurs="unbounded" minOccurs="0"&gt; &lt;element ref="{}ClassId"/&gt; &lt;element ref="{}ClassShortName"/&gt; &lt;element ref="{}Class"/&gt; &lt;/choice&gt; &lt;element ref="{}Position"/&gt; &lt;element ref="{}ModifyDate"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [classIdOrClassShortNameOrClazz](class-id-or-class-short-name-or-clazz.md) | [jvm]<br>protected open val [classIdOrClassShortNameOrClazz](class-id-or-class-short-name-or-clazz.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |
| [clubIdOrClub](club-id-or-club.md) | [jvm]<br>protected open val [clubIdOrClub](club-id-or-club.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [organisationIdOrOrganisation](organisation-id-or-organisation.md) | [jvm]<br>protected open val [organisationIdOrOrganisation](organisation-id-or-organisation.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |
| [position](position.md) | [jvm]<br>protected open var [position](position.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Rank](index.md)

# Rank

[jvm]\
open class [Rank](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;choice&gt; &lt;element ref="{}Name"/&gt; &lt;element ref="{}OrganisationId"/&gt; &lt;element ref="{}Organisation"/&gt; &lt;/choice&gt; &lt;element ref="{}RankPosition"/&gt; &lt;element ref="{}RankValue"/&gt; &lt;element ref="{}ValidFromDate" minOccurs="0"/&gt; &lt;element ref="{}ValidToDate" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [Name](../-name/index.md) |
| [organisation](organisation.md) | [jvm]<br>protected open var [organisation](organisation.md): [Organisation](../-organisation/index.md) |
| [organisationId](organisation-id.md) | [jvm]<br>protected open var [organisationId](organisation-id.md): [OrganisationId](../-organisation-id/index.md) |
| [rankPosition](rank-position.md) | [jvm]<br>protected open var [rankPosition](rank-position.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [rankValue](rank-value.md) | [jvm]<br>protected open var [rankValue](rank-value.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [validFromDate](valid-from-date.md) | [jvm]<br>protected open var [validFromDate](valid-from-date.md): [ValidFromDate](../-valid-from-date/index.md) |
| [validToDate](valid-to-date.md) | [jvm]<br>protected open var [validToDate](valid-to-date.md): [ValidToDate](../-valid-to-date/index.md) |

//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[RankList](index.md)

# RankList

[jvm]\
open class [RankList](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}IOFVersion" minOccurs="0"/&gt; &lt;element ref="{}Name"/&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}OrganisationId"/&gt; &lt;element ref="{}Organisation"/&gt; &lt;/choice&gt; &lt;element ref="{}Competitor" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [competitor](competitor.md) | [jvm]<br>protected open val [competitor](competitor.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Competitor](../-competitor/index.md)> |
| [iofVersion](iof-version.md) | [jvm]<br>protected open var [iofVersion](iof-version.md): [IOFVersion](../-i-o-f-version/index.md) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [Name](../-name/index.md) |
| [organisation](organisation.md) | [jvm]<br>protected open var [organisation](organisation.md): [Organisation](../-organisation/index.md) |
| [organisationId](organisation-id.md) | [jvm]<br>protected open var [organisationId](organisation-id.md): [OrganisationId](../-organisation-id/index.md) |
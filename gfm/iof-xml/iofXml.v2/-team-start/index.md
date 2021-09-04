//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[TeamStart](index.md)

# TeamStart

[jvm]\
open class [TeamStart](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}TeamName"/&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}CountryId"/&gt; &lt;element ref="{}Country"/&gt; &lt;/choice&gt; &lt;element ref="{}PersonStart" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [country](country.md) | [jvm]<br>protected open var [country](country.md): [Country](../-country/index.md) |
| [countryId](country-id.md) | [jvm]<br>protected open var [countryId](country-id.md): [CountryId](../-country-id/index.md) |
| [personStart](person-start.md) | [jvm]<br>protected open val [personStart](person-start.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[PersonStart](../-person-start/index.md)> |
| [teamName](team-name.md) | [jvm]<br>protected open var [teamName](team-name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

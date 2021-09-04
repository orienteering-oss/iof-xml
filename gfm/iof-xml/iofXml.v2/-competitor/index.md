//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Competitor](index.md)

# Competitor

[jvm]\
open class [Competitor](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;choice&gt; &lt;element ref="{}PersonId"/&gt; &lt;element ref="{}Person"/&gt; &lt;/choice&gt; &lt;choice&gt; &lt;element ref="{}ClubId"/&gt; &lt;element ref="{}Club"/&gt; &lt;element ref="{}Country"/&gt; &lt;element ref="{}CountryId"/&gt; &lt;/choice&gt; &lt;element ref="{}PreSelectedClass" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}CCard" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Rank" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [cCard](c-card.md) | [jvm]<br>protected open val [cCard](c-card.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[CCard](../-c-card/index.md)> |
| [club](club.md) | [jvm]<br>protected open var [club](club.md): [Club](../-club/index.md) |
| [clubId](club-id.md) | [jvm]<br>protected open var [clubId](club-id.md): [ClubId](../-club-id/index.md) |
| [country](country.md) | [jvm]<br>protected open var [country](country.md): [Country](../-country/index.md) |
| [countryId](country-id.md) | [jvm]<br>protected open var [countryId](country-id.md): [CountryId](../-country-id/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [person](person.md) | [jvm]<br>protected open var [person](person.md): [Person](../-person/index.md) |
| [personId](person-id.md) | [jvm]<br>protected open var [personId](person-id.md): [PersonId](../-person-id/index.md) |
| [preSelectedClass](pre-selected-class.md) | [jvm]<br>protected open val [preSelectedClass](pre-selected-class.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[PreSelectedClass](../-pre-selected-class/index.md)> |
| [rank](rank.md) | [jvm]<br>protected open val [rank](rank.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Rank](../-rank/index.md)> |

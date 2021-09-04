//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Club](index.md)

# Club

[jvm]\
open class [Club](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}ClubId"/&gt; &lt;element ref="{}Name" minOccurs="0"/&gt; &lt;element ref="{}ShortName"/&gt; &lt;element ref="{}OrganisationId" minOccurs="0"/&gt; &lt;choice&gt; &lt;element ref="{}CountryId"/&gt; &lt;element ref="{}Country"/&gt; &lt;/choice&gt; &lt;element ref="{}Address" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Tele" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}WebURL" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Account" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Contact" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [account](account.md) | [jvm]<br>protected open val [account](account.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Account](../-account/index.md)> |
| [address](address.md) | [jvm]<br>protected open val [address](address.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Address](../-address/index.md)> |
| [clubId](club-id.md) | [jvm]<br>protected open var [clubId](club-id.md): [ClubId](../-club-id/index.md) |
| [contact](contact.md) | [jvm]<br>protected open val [contact](contact.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Contact](../-contact/index.md)> |
| [country](country.md) | [jvm]<br>protected open var [country](country.md): [Country](../-country/index.md) |
| [countryId](country-id.md) | [jvm]<br>protected open var [countryId](country-id.md): [CountryId](../-country-id/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [Name](../-name/index.md) |
| [organisationId](organisation-id.md) | [jvm]<br>protected open var [organisationId](organisation-id.md): [OrganisationId](../-organisation-id/index.md) |
| [shortName](short-name.md) | [jvm]<br>protected open var [shortName](short-name.md): [ShortName](../-short-name/index.md) |
| [tele](tele.md) | [jvm]<br>protected open val [tele](tele.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Tele](../-tele/index.md)> |
| [webURL](web-u-r-l.md) | [jvm]<br>protected open val [webURL](web-u-r-l.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)> |

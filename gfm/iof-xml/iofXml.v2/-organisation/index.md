//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Organisation](index.md)

# Organisation

[jvm]\
open class [Organisation](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}OrganisationId"/&gt; &lt;element ref="{}Name"/&gt; &lt;element ref="{}ShortName" minOccurs="0"/&gt; &lt;choice&gt; &lt;element ref="{}OrganisationTypeId"/&gt; &lt;element ref="{}OrganisationType"/&gt; &lt;/choice&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}CountryId"/&gt; &lt;element ref="{}Country"/&gt; &lt;/choice&gt; &lt;element ref="{}Address" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Tele" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Account" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Contact" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}SubOrganisation" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [account](account.md) | [jvm]<br>protected open val [account](account.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Account](../-account/index.md)> |
| [address](address.md) | [jvm]<br>protected open val [address](address.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Address](../-address/index.md)> |
| [contact](contact.md) | [jvm]<br>protected open val [contact](contact.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Contact](../-contact/index.md)> |
| [country](country.md) | [jvm]<br>protected open var [country](country.md): [Country](../-country/index.md) |
| [countryId](country-id.md) | [jvm]<br>protected open var [countryId](country-id.md): [CountryId](../-country-id/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [Name](../-name/index.md) |
| [organisationId](organisation-id.md) | [jvm]<br>protected open var [organisationId](organisation-id.md): [OrganisationId](../-organisation-id/index.md) |
| [organisationType](organisation-type.md) | [jvm]<br>protected open var [organisationType](organisation-type.md): [OrganisationType](../-organisation-type/index.md) |
| [organisationTypeId](organisation-type-id.md) | [jvm]<br>protected open var [organisationTypeId](organisation-type-id.md): [OrganisationTypeId](../-organisation-type-id/index.md) |
| [shortName](short-name.md) | [jvm]<br>protected open var [shortName](short-name.md): [ShortName](../-short-name/index.md) |
| [subOrganisation](sub-organisation.md) | [jvm]<br>protected open val [subOrganisation](sub-organisation.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[SubOrganisation](../-sub-organisation/index.md)> |
| [tele](tele.md) | [jvm]<br>protected open val [tele](tele.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Tele](../-tele/index.md)> |

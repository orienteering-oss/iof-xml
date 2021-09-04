//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Press](index.md)

# Press

[jvm]\
open class [Press](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}Name"/&gt; &lt;element ref="{}Contact" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Address" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Tele" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;choice&gt; &lt;element ref="{}Country"/&gt; &lt;element ref="{}CountryId"/&gt; &lt;/choice&gt; &lt;element ref="{}ResultSelection" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="mediaType" use="required"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="paper"/&gt; &lt;enumeration value="tv"/&gt; &lt;enumeration value="radio"/&gt; &lt;enumeration value="magazine"/&gt; &lt;enumeration value="web"/&gt; &lt;enumeration value="other"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [address](address.md) | [jvm]<br>protected open val [address](address.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Address](../-address/index.md)> |
| [contact](contact.md) | [jvm]<br>protected open val [contact](contact.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Contact](../-contact/index.md)> |
| [country](country.md) | [jvm]<br>protected open var [country](country.md): [Country](../-country/index.md) |
| [countryId](country-id.md) | [jvm]<br>protected open var [countryId](country-id.md): [CountryId](../-country-id/index.md) |
| [mediaType](media-type.md) | [jvm]<br>protected open var [mediaType](media-type.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [Name](../-name/index.md) |
| [resultSelection](result-selection.md) | [jvm]<br>protected open val [resultSelection](result-selection.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ResultSelection](../-result-selection/index.md)> |
| [tele](tele.md) | [jvm]<br>protected open val [tele](tele.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Tele](../-tele/index.md)> |

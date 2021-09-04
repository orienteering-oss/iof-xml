//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Address](index.md)

# Address

[jvm]\
open class [Address](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}AddressType" minOccurs="0"/&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}CountryId"/&gt; &lt;element ref="{}Country"/&gt; &lt;/choice&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="careOf" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="street" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="city" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="zipCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [addressType](address-type.md) | [jvm]<br>protected open var [addressType](address-type.md): [AddressType](../-address-type/index.md) |
| [careOf](care-of.md) | [jvm]<br>protected open var [careOf](care-of.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [city](city.md) | [jvm]<br>protected open var [city](city.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [country](country.md) | [jvm]<br>protected open var [country](country.md): [Country](../-country/index.md) |
| [countryId](country-id.md) | [jvm]<br>protected open var [countryId](country-id.md): [CountryId](../-country-id/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [street](street.md) | [jvm]<br>protected open var [street](street.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [zipCode](zip-code.md) | [jvm]<br>protected open var [zipCode](zip-code.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

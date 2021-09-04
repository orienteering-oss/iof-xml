//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Address](index.md)

# Address

[jvm]\
open class [Address](index.md)

The postal address of a person or organisation. <p>Java class for Address complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Address"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="CareOf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="Country" type="{http://www.orienteering.org/datastandard/3.0}Country" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [careOf](care-of.md) | [jvm]<br>protected open var [careOf](care-of.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [city](city.md) | [jvm]<br>protected open var [city](city.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [country](country.md) | [jvm]<br>protected open var [country](country.md): [Country](../-country/index.md) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [state](state.md) | [jvm]<br>protected open var [state](state.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [street](street.md) | [jvm]<br>protected open var [street](street.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [type](type.md) | [jvm]<br>protected open var [type](type.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [zipCode](zip-code.md) | [jvm]<br>protected open var [zipCode](zip-code.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Tele](index.md)

# Tele

[jvm]\
open class [Tele](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}TeleType" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="faxNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="mobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="mailAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [faxNumber](fax-number.md) | [jvm]<br>protected open var [faxNumber](fax-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [mailAddress](mail-address.md) | [jvm]<br>protected open var [mailAddress](mail-address.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [mobilePhoneNumber](mobile-phone-number.md) | [jvm]<br>protected open var [mobilePhoneNumber](mobile-phone-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [phoneNumber](phone-number.md) | [jvm]<br>protected open var [phoneNumber](phone-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [teleType](tele-type.md) | [jvm]<br>protected open var [teleType](tele-type.md): [TeleType](../-tele-type/index.md) |

//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Service](index.md)

# Service

[jvm]\
open class [Service](index.md)

Defines a general purpose service request, e.g. for rental card or accomodation. <p>Java class for Service complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Service"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&gt; &lt;element name="Name" type="{http://www.orienteering.org/datastandard/3.0}LanguageString" maxOccurs="unbounded"/&gt; &lt;element name="Fee" type="{http://www.orienteering.org/datastandard/3.0}Fee" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Description" type="{http://www.orienteering.org/datastandard/3.0}LanguageString" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="MaxNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="RequestedNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [description](description.md) | [jvm]<br>protected open val [description](description.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LanguageString](../-language-string/index.md)> |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [fee](fee.md) | [jvm]<br>protected open val [fee](fee.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Fee](../-fee/index.md)> |
| [id](id.md) | [jvm]<br>protected open var [id](id.md): [Id](../-id/index.md) |
| [maxNumber](max-number.md) | [jvm]<br>protected open var [maxNumber](max-number.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [name](name.md) | [jvm]<br>protected open val [name](name.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LanguageString](../-language-string/index.md)> |
| [requestedNumber](requested-number.md) | [jvm]<br>protected open var [requestedNumber](requested-number.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [type](type.md) | [jvm]<br>protected open var [type](type.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

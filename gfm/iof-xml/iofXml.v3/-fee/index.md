//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Fee](index.md)

# Fee

[jvm]\
open class [Fee](index.md)

A fee that applies when entering a class at a race or ordering a service. <p>Java class for Fee complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Fee"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&gt; &lt;element name="Name" type="{http://www.orienteering.org/datastandard/3.0}LanguageString" maxOccurs="unbounded"/&gt; &lt;element name="Amount" type="{http://www.orienteering.org/datastandard/3.0}Amount" minOccurs="0"/&gt; &lt;element name="TaxableAmount" type="{http://www.orienteering.org/datastandard/3.0}Amount" minOccurs="0"/&gt; &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="TaxablePercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="ValidFromTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt; &lt;element name="ValidToTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt; &lt;element name="FromDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt; &lt;element name="ToDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="type" default="Normal"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="Normal"/&gt; &lt;enumeration value="Late"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [amount](amount.md) | [jvm]<br>protected open var [amount](amount.md): [Amount](../-amount/index.md) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [fromDateOfBirth](from-date-of-birth.md) | [jvm]<br>protected open var [fromDateOfBirth](from-date-of-birth.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [id](id.md) | [jvm]<br>protected open var [id](id.md): [Id](../-id/index.md) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [name](name.md) | [jvm]<br>protected open val [name](name.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LanguageString](../-language-string/index.md)> |
| [percentage](percentage.md) | [jvm]<br>protected open var [percentage](percentage.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [taxableAmount](taxable-amount.md) | [jvm]<br>protected open var [taxableAmount](taxable-amount.md): [Amount](../-amount/index.md) |
| [taxablePercentage](taxable-percentage.md) | [jvm]<br>protected open var [taxablePercentage](taxable-percentage.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [toDateOfBirth](to-date-of-birth.md) | [jvm]<br>protected open var [toDateOfBirth](to-date-of-birth.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [type](type.md) | [jvm]<br>protected open var [type](type.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [validFromTime](valid-from-time.md) | [jvm]<br>protected open var [validFromTime](valid-from-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [validToTime](valid-to-time.md) | [jvm]<br>protected open var [validToTime](valid-to-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |

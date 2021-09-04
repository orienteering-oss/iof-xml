//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Person](index.md)

# Person

[jvm]\
open class [Person](index.md)

Represents a person. This could either be a competitor (see the Competitor element) or contact persons in an organisation (see the Organisation element). <p>Java class for Person complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Person"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Name" type="{http://www.orienteering.org/datastandard/3.0}PersonName"/&gt; &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt; &lt;element name="Nationality" type="{http://www.orienteering.org/datastandard/3.0}Country" minOccurs="0"/&gt; &lt;element name="Address" type="{http://www.orienteering.org/datastandard/3.0}Address" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Contact" type="{http://www.orienteering.org/datastandard/3.0}Contact" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="sex"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="F"/&gt; &lt;enumeration value="M"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [address](address.md) | [jvm]<br>protected open val [address](address.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Address](../-address/index.md)> |
| [birthDate](birth-date.md) | [jvm]<br>protected open var [birthDate](birth-date.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [contact](contact.md) | [jvm]<br>protected open val [contact](contact.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Contact](../-contact/index.md)> |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [id](id.md) | [jvm]<br>protected open val [id](id.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Id](../-id/index.md)> |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [PersonName](../-person-name/index.md) |
| [nationality](nationality.md) | [jvm]<br>protected open var [nationality](nationality.md): [Country](../-country/index.md) |
| [sex](sex.md) | [jvm]<br>protected open var [sex](sex.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

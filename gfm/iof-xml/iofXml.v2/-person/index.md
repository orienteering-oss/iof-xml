//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Person](index.md)

# Person

[jvm]\
open class [Person](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}PersonName"/&gt; &lt;element ref="{}PersonId"/&gt; &lt;element ref="{}BirthDate" minOccurs="0"/&gt; &lt;element ref="{}Address" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Tele" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Nationality" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="sex"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="M"/&gt; &lt;enumeration value="F"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [address](address.md) | [jvm]<br>protected open val [address](address.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Address](../-address/index.md)> |
| [birthDate](birth-date.md) | [jvm]<br>protected open var [birthDate](birth-date.md): [BirthDate](../-birth-date/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [nationality](nationality.md) | [jvm]<br>protected open var [nationality](nationality.md): [Nationality](../-nationality/index.md) |
| [personId](person-id.md) | [jvm]<br>protected open var [personId](person-id.md): [PersonId](../-person-id/index.md) |
| [personName](person-name.md) | [jvm]<br>protected open var [personName](person-name.md): [PersonName](../-person-name/index.md) |
| [sex](sex.md) | [jvm]<br>protected open var [sex](sex.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [tele](tele.md) | [jvm]<br>protected open val [tele](tele.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Tele](../-tele/index.md)> |

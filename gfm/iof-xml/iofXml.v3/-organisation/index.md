//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Organisation](index.md)

# Organisation

[jvm]\
open class [Organisation](index.md)

Information about an organisation, i.e. address, contact person(s) etc. An organisation is a general term including federations, clubs, etc. <p>Java class for Organisation complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Organisation"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&gt; &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt; &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="MediaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="ParentOrganisationId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt; &lt;element name="Country" type="{http://www.orienteering.org/datastandard/3.0}Country" minOccurs="0"/&gt; &lt;element name="Address" type="{http://www.orienteering.org/datastandard/3.0}Address" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Contact" type="{http://www.orienteering.org/datastandard/3.0}Contact" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Position" type="{http://www.orienteering.org/datastandard/3.0}GeoPosition" minOccurs="0"/&gt; &lt;element name="Account" type="{http://www.orienteering.org/datastandard/3.0}Account" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Role" type="{http://www.orienteering.org/datastandard/3.0}Role" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Logotype" type="{http://www.orienteering.org/datastandard/3.0}Image" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="type"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="IOF"/&gt; &lt;enumeration value="IOFRegion"/&gt; &lt;enumeration value="NationalFederation"/&gt; &lt;enumeration value="NationalRegion"/&gt; &lt;enumeration value="Club"/&gt; &lt;enumeration value="School"/&gt; &lt;enumeration value="Company"/&gt; &lt;enumeration value="Military"/&gt; &lt;enumeration value="Other"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [account](account.md) | [jvm]<br>protected open val [account](account.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Account](../-account/index.md)> |
| [address](address.md) | [jvm]<br>protected open val [address](address.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Address](../-address/index.md)> |
| [contact](contact.md) | [jvm]<br>protected open val [contact](contact.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Contact](../-contact/index.md)> |
| [country](country.md) | [jvm]<br>protected open var [country](country.md): [Country](../-country/index.md) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [id](id.md) | [jvm]<br>protected open var [id](id.md): [Id](../-id/index.md) |
| [logotype](logotype.md) | [jvm]<br>protected open val [logotype](logotype.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Image](../-image/index.md)> |
| [mediaName](media-name.md) | [jvm]<br>protected open var [mediaName](media-name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [parentOrganisationId](parent-organisation-id.md) | [jvm]<br>protected open var [parentOrganisationId](parent-organisation-id.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [position](position.md) | [jvm]<br>protected open var [position](position.md): [GeoPosition](../-geo-position/index.md) |
| [role](role.md) | [jvm]<br>protected open val [role](role.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Role](../-role/index.md)> |
| [shortName](short-name.md) | [jvm]<br>protected open var [shortName](short-name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [type](type.md) | [jvm]<br>protected open var [type](type.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

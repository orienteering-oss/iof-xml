//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Contact](index.md)

# Contact

[jvm]\
open class [Contact](index.md)

Contact information for a person, organisation or other entity. <p>Java class for Contact complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Contact"&gt; &lt;simpleContent&gt; &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt; &lt;attribute name="type" use="required"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="PhoneNumber"/&gt; &lt;enumeration value="MobilePhoneNumber"/&gt; &lt;enumeration value="FaxNumber"/&gt; &lt;enumeration value="EmailAddress"/&gt; &lt;enumeration value="WebAddress"/&gt; &lt;enumeration value="Other"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/extension&gt; &lt;/simpleContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [type](type.md) | [jvm]<br>protected open var [type](type.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [value](value.md) | [jvm]<br>protected open var [value](value.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

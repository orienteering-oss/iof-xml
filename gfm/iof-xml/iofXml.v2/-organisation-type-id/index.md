//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[OrganisationTypeId](index.md)

# OrganisationTypeId

[jvm]\
open class [OrganisationTypeId](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;attribute name="type"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="int"/&gt; &lt;enumeration value="nat"/&gt; &lt;enumeration value="reg"/&gt; &lt;enumeration value="loc"/&gt; &lt;enumeration value="other"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;attribute name="idManager" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [content](content.md) | [jvm]<br>protected open var [content](content.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [idManager](id-manager.md) | [jvm]<br>protected open var [idManager](id-manager.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [type](type.md) | [jvm]<br>protected open var [type](type.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

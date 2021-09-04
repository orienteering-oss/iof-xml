//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Account](index.md)

# Account

[jvm]\
open class [Account](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;attribute name="type" default="postalGiro"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="postalGiro"/&gt; &lt;enumeration value="bankGiro"/&gt; &lt;enumeration value="bankAccount"/&gt; &lt;enumeration value="other"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [content](content.md) | [jvm]<br>protected open var [content](content.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [type](type.md) | [jvm]<br>protected open var [type](type.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[TeleType](index.md)

# TeleType

[jvm]\
open class [TeleType](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;attribute name="value" use="required"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="official"/&gt; &lt;enumeration value="home"/&gt; &lt;enumeration value="work"/&gt; &lt;enumeration value="other"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [value](value.md) | [jvm]<br>protected open var [value](value.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

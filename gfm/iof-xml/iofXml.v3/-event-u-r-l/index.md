//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[EventURL](index.md)

# EventURL

[jvm]\
open class [EventURL](index.md)

<p>Java class for EventURL complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="EventURL"&gt; &lt;simpleContent&gt; &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt; &lt;attribute name="type" use="required"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="Website"/&gt; &lt;enumeration value="StartList"/&gt; &lt;enumeration value="ResultList"/&gt; &lt;enumeration value="Other"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/extension&gt; &lt;/simpleContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [type](type.md) | [jvm]<br>protected open var [type](type.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [value](value.md) | [jvm]<br>protected open var [value](value.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

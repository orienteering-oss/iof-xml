//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[AllocationControlType](index.md)

# AllocationControlType

[jvm]\
open class [AllocationControlType](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;attribute name="value" default="normal"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="normal"/&gt; &lt;enumeration value="groupedWithRef"/&gt; &lt;enumeration value="distributedFromRef"/&gt; &lt;enumeration value="earlyStart"/&gt; &lt;enumeration value="lateStart"/&gt; &lt;enumeration value="other"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [value](value.md) | [jvm]<br>protected open var [value](value.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

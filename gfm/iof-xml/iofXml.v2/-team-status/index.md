//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[TeamStatus](index.md)

# TeamStatus

[jvm]\
open class [TeamStatus](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;attribute name="value" use="required"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="Inactive"/&gt; &lt;enumeration value="DidNotStart"/&gt; &lt;enumeration value="Active"/&gt; &lt;enumeration value="Finished"/&gt; &lt;enumeration value="OK"/&gt; &lt;enumeration value="MisPunch"/&gt; &lt;enumeration value="DidNotFinish"/&gt; &lt;enumeration value="Disqualified"/&gt; &lt;enumeration value="NotCompeting"/&gt; &lt;enumeration value="SportWithdr"/&gt; &lt;enumeration value="OverTime"/&gt; &lt;enumeration value="Moved"/&gt; &lt;enumeration value="MovedUp"/&gt; &lt;enumeration value="Cancelled"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [value](value.md) | [jvm]<br>protected open var [value](value.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

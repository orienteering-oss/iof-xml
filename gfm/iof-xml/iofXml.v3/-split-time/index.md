//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[SplitTime](index.md)

# SplitTime

[jvm]\
open class [SplitTime](index.md)

Defines a split time at a control. <p>Java class for SplitTime complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="SplitTime"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="ControlCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt; &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="status" default="OK"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="OK"/&gt; &lt;enumeration value="Missing"/&gt; &lt;enumeration value="Additional"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [controlCode](control-code.md) | [jvm]<br>protected open var [controlCode](control-code.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [status](status.md) | [jvm]<br>protected open var [status](status.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [time](time.md) | [jvm]<br>protected open var [time](time.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |

//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[SplitTime](index.md)

# SplitTime

[jvm]\
open class [SplitTime](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}ControlCode"/&gt; &lt;element ref="{}Control"/&gt; &lt;/choice&gt; &lt;element ref="{}Time" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [control](control.md) | [jvm]<br>protected open var [control](control.md): [Control](../-control/index.md) |
| [controlCode](control-code.md) | [jvm]<br>protected open var [controlCode](control-code.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [sequence](sequence.md) | [jvm]<br>protected open var [sequence](sequence.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [time](time.md) | [jvm]<br>protected open var [time](time.md): [Time](../-time/index.md) |

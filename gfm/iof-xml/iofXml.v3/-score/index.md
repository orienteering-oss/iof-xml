//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Score](index.md)

# Score

[jvm]\
open class [Score](index.md)

The score earned in an event for some purpose, e.g. a ranking list. The 'type' attribute is used to specify which purpose. <p>Java class for Score complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Score"&gt; &lt;simpleContent&gt; &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;double"&gt; &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt; &lt;/extension&gt; &lt;/simpleContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [type](type.md) | [jvm]<br>protected open var [type](type.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [value](value.md) | [jvm]<br>protected open var [value](value.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |

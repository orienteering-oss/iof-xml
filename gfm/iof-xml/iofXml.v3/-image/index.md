//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Image](index.md)

# Image

[jvm]\
open class [Image](index.md)

Defines an image file, either as a link (use the url attribute) or as base64-encoded binary data. <p>Java class for Image complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Image"&gt; &lt;simpleContent&gt; &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt; &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" /&gt; &lt;attribute name="mediaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt; &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt; &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt; &lt;attribute name="resolution" type="{http://www.w3.org/2001/XMLSchema}double" /&gt; &lt;/extension&gt; &lt;/simpleContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [height](height.md) | [jvm]<br>protected open var [height](height.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [mediaType](media-type.md) | [jvm]<br>protected open var [mediaType](media-type.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [resolution](resolution.md) | [jvm]<br>protected open var [resolution](resolution.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [url](url.md) | [jvm]<br>protected open var [url](url.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [value](value.md) | [jvm]<br>protected open var [value](value.md): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)> |
| [width](width.md) | [jvm]<br>protected open var [width](width.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |

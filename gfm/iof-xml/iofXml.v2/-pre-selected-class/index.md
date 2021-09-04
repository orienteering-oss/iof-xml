//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[PreSelectedClass](index.md)

# PreSelectedClass

[jvm]\
open class [PreSelectedClass](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;choice&gt; &lt;element ref="{}ClassId"/&gt; &lt;element ref="{}ClassShortName"/&gt; &lt;element ref="{}Class"/&gt; &lt;/choice&gt; &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [classId](class-id.md) | [jvm]<br>protected open var [classId](class-id.md): [ClassId](../-class-id/index.md) |
| [classShortName](class-short-name.md) | [jvm]<br>protected open var [classShortName](class-short-name.md): [ClassShortName](../-class-short-name/index.md) |
| [clazz](clazz.md) | [jvm]<br>protected open var [clazz](clazz.md): [Class](../-class/index.md) |
| [sequence](sequence.md) | [jvm]<br>protected open var [sequence](sequence.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

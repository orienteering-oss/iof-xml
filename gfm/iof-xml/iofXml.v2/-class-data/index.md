//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[ClassData](index.md)

# ClassData

[jvm]\
open class [ClassData](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}IOFVersion" minOccurs="0"/&gt; &lt;element ref="{}ClassType" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Class" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [classType](class-type.md) | [jvm]<br>protected open val [classType](class-type.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ClassType](../-class-type/index.md)> |
| [clazz](clazz.md) | [jvm]<br>protected open val [clazz](clazz.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Class](../-class/index.md)> |
| [iofVersion](iof-version.md) | [jvm]<br>protected open var [iofVersion](iof-version.md): [IOFVersion](../-i-o-f-version/index.md) |

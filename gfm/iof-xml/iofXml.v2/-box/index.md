//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Box](index.md)

# Box

[jvm]\
open class [Box](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}Symbol" maxOccurs="unbounded"/&gt; &lt;element ref="{}Text"/&gt; &lt;/choice&gt; &lt;attribute name="column" use="required"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="A"/&gt; &lt;enumeration value="B"/&gt; &lt;enumeration value="C"/&gt; &lt;enumeration value="D"/&gt; &lt;enumeration value="E"/&gt; &lt;enumeration value="F"/&gt; &lt;enumeration value="G"/&gt; &lt;enumeration value="H"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;attribute name="hasDiagonal" default="N"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="Y"/&gt; &lt;enumeration value="N"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [column](column.md) | [jvm]<br>protected open var [column](column.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [hasDiagonal](has-diagonal.md) | [jvm]<br>protected open var [hasDiagonal](has-diagonal.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [symbol](symbol.md) | [jvm]<br>protected open val [symbol](symbol.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Symbol](../-symbol/index.md)> |
| [text](text.md) | [jvm]<br>protected open var [text](text.md): [Text](../-text/index.md) |

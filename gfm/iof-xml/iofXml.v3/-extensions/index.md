//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Extensions](index.md)

# Extensions

[jvm]\
open class [Extensions](index.md)

Container element that is used to add custom elements from other schemas. <p>Java class for Extensions complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Extensions"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [any](any.md) | [jvm]<br>protected open val [any](any.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |

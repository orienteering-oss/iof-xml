//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Role](index.md)

# Role

[jvm]\
open class [Role](index.md)

A role defines a connection between a person and some kind of task, responsibility or engagement, e.g. being a course setter at an event. <p>Java class for Role complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Role"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person"/&gt; &lt;/sequence&gt; &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [person](person.md) | [jvm]<br>protected open var [person](person.md): [Person](../-person/index.md) |
| [type](type.md) | [jvm]<br>protected open var [type](type.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[InformationItem](index.md)

# InformationItem

[jvm]\
open class [InformationItem](index.md)

Defines a general-purpose information object containing a title and content. <p>Java class for InformationItem complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="InformationItem"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt; &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string"/&gt; &lt;/sequence&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [content](content.md) | [jvm]<br>protected open var [content](content.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [title](title.md) | [jvm]<br>protected open var [title](title.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

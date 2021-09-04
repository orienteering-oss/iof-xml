//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Service](index.md)

# Service

[jvm]\
open class [Service](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}ServiceId"/&gt; &lt;element ref="{}Name"/&gt; &lt;element ref="{}Amount"/&gt; &lt;element ref="{}Comment" minOccurs="0"/&gt; &lt;element ref="{}MaxNumber" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [amount](amount.md) | [jvm]<br>protected open var [amount](amount.md): [Amount](../-amount/index.md) |
| [comment](comment.md) | [jvm]<br>protected open var [comment](comment.md): [Comment](../-comment/index.md) |
| [maxNumber](max-number.md) | [jvm]<br>protected open var [maxNumber](max-number.md): [MaxNumber](../-max-number/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [Name](../-name/index.md) |
| [serviceId](service-id.md) | [jvm]<br>protected open var [serviceId](service-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

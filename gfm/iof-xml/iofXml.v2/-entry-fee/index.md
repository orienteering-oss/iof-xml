//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[EntryFee](index.md)

# EntryFee

[jvm]\
open class [EntryFee](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}EntryFeeId" minOccurs="0"/&gt; &lt;element ref="{}Name" minOccurs="0"/&gt; &lt;element ref="{}Amount"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="taxIncluded" default="Y"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="Y"/&gt; &lt;enumeration value="N"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [amount](amount.md) | [jvm]<br>protected open var [amount](amount.md): [Amount](../-amount/index.md) |
| [entryFeeId](entry-fee-id.md) | [jvm]<br>protected open var [entryFeeId](entry-fee-id.md): [EntryFeeId](../-entry-fee-id/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [Name](../-name/index.md) |
| [taxIncluded](tax-included.md) | [jvm]<br>protected open var [taxIncluded](tax-included.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

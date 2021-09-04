//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Amount](index.md)

# Amount

[jvm]\
open class [Amount](index.md)

Defines a monetary amount. <p>Java class for Amount complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Amount"&gt; &lt;simpleContent&gt; &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt; &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt; &lt;/extension&gt; &lt;/simpleContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [currency](currency.md) | [jvm]<br>protected open var [currency](currency.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [value](value.md) | [jvm]<br>protected open var [value](value.md): [BigDecimal](https://docs.oracle.com/javase/8/docs/api/java/math/BigDecimal.html) |

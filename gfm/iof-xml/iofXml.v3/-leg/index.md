//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Leg](index.md)

# Leg

[jvm]\
open class [Leg](index.md)

Defines extra information for a relay leg. <p>Java class for Leg complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Leg"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="minNumberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" /&gt; &lt;attribute name="maxNumberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [maxNumberOfCompetitors](max-number-of-competitors.md) | [jvm]<br>protected open var [maxNumberOfCompetitors](max-number-of-competitors.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [minNumberOfCompetitors](min-number-of-competitors.md) | [jvm]<br>protected open var [minNumberOfCompetitors](min-number-of-competitors.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[OverallResult](index.md)

# OverallResult

[jvm]\
open class [OverallResult](index.md)

<p>Java class for OverallResult complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="OverallResult"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="TimeBehind" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt; &lt;element name="Status" type="{http://www.orienteering.org/datastandard/3.0}ResultStatus"/&gt; &lt;element name="Score" type="{http://www.orienteering.org/datastandard/3.0}Score" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [position](position.md) | [jvm]<br>protected open var [position](position.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [score](score.md) | [jvm]<br>protected open val [score](score.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Score](../-score/index.md)> |
| [status](status.md) | [jvm]<br>protected open var [status](status.md): [ResultStatus](../-result-status/index.md) |
| [time](time.md) | [jvm]<br>protected open var [time](time.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [timeBehind](time-behind.md) | [jvm]<br>protected open var [timeBehind](time-behind.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |

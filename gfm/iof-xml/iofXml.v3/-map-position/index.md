//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[MapPosition](index.md)

# MapPosition

[jvm]\
open class [MapPosition](index.md)

Defines a position in a map's coordinate system. <p>Java class for MapPosition complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="MapPosition"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt; &lt;attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt; &lt;attribute name="unit" default="mm"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="px"/&gt; &lt;enumeration value="mm"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [unit](unit.md) | [jvm]<br>protected open var [unit](unit.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [x](x.md) | [jvm]<br>protected open var [x](x.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [y](y.md) | [jvm]<br>protected open var [y](y.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |

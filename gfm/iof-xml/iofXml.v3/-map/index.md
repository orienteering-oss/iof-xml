//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Map](index.md)

# Map

[jvm]\
open class [Map](index.md)

Map information, used in course setting software with regard to the "real" map. <p>Java class for Map complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Map"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&gt; &lt;element name="Image" type="{http://www.orienteering.org/datastandard/3.0}Image" minOccurs="0"/&gt; &lt;element name="Scale" type="{http://www.w3.org/2001/XMLSchema}double"/&gt; &lt;element name="MapPositionTopLeft" type="{http://www.orienteering.org/datastandard/3.0}MapPosition"/&gt; &lt;element name="MapPositionBottomRight" type="{http://www.orienteering.org/datastandard/3.0}MapPosition"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [id](id.md) | [jvm]<br>protected open var [id](id.md): [Id](../-id/index.md) |
| [image](image.md) | [jvm]<br>protected open var [image](image.md): [Image](../-image/index.md) |
| [mapPositionBottomRight](map-position-bottom-right.md) | [jvm]<br>protected open var [mapPositionBottomRight](map-position-bottom-right.md): [MapPosition](../-map-position/index.md) |
| [mapPositionTopLeft](map-position-top-left.md) | [jvm]<br>protected open var [mapPositionTopLeft](map-position-top-left.md): [MapPosition](../-map-position/index.md) |
| [scale](scale.md) | [jvm]<br>protected open var [scale](scale.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |

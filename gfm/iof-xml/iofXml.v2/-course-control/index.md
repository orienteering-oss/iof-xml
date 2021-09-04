//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[CourseControl](index.md)

# CourseControl

[jvm]\
open class [CourseControl](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}Sequence"/&gt; &lt;choice&gt; &lt;element ref="{}ControlCode"/&gt; &lt;element ref="{}Control"/&gt; &lt;/choice&gt; &lt;element ref="{}Comment" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}LegLength" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}MapTextPosition" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="markedRoute" default="N"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="Y"/&gt; &lt;enumeration value="N"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [comment](comment.md) | [jvm]<br>protected open val [comment](comment.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Comment](../-comment/index.md)> |
| [control](control.md) | [jvm]<br>protected open var [control](control.md): [Control](../-control/index.md) |
| [controlCode](control-code.md) | [jvm]<br>protected open var [controlCode](control-code.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [legLength](leg-length.md) | [jvm]<br>protected open val [legLength](leg-length.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[LegLength](../-leg-length/index.md)> |
| [mapTextPosition](map-text-position.md) | [jvm]<br>protected open var [mapTextPosition](map-text-position.md): [MapTextPosition](../-map-text-position/index.md) |
| [markedRoute](marked-route.md) | [jvm]<br>protected open var [markedRoute](marked-route.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [sequence](sequence.md) | [jvm]<br>protected open var [sequence](sequence.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

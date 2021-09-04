//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[ControlCard](index.md)

# ControlCard

[jvm]\
open class [ControlCard](index.md)

The unique identifier of the control card, i.e. card number. <p>Java class for ControlCard complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="ControlCard"&gt; &lt;simpleContent&gt; &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt; &lt;attribute name="punchingSystem" type="{http://www.w3.org/2001/XMLSchema}string" /&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/extension&gt; &lt;/simpleContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [punchingSystem](punching-system.md) | [jvm]<br>protected open var [punchingSystem](punching-system.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [value](value.md) | [jvm]<br>protected open var [value](value.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

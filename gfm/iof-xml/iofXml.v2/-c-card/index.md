//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[CCard](index.md)

# CCard

[jvm]\
open class [CCard](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}CCardId"/&gt; &lt;element ref="{}PunchingUnitType"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="miscData" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [cCardId](c-card-id.md) | [jvm]<br>protected open var [cCardId](c-card-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [miscData](misc-data.md) | [jvm]<br>protected open var [miscData](misc-data.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [punchingUnitType](punching-unit-type.md) | [jvm]<br>protected open var [punchingUnitType](punching-unit-type.md): [PunchingUnitType](../-punching-unit-type/index.md) |

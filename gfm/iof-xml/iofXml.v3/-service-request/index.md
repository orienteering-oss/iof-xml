//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[ServiceRequest](index.md)

# ServiceRequest

[jvm]\
open class [ServiceRequest](index.md)

<p>Java class for ServiceRequest complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="ServiceRequest"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&gt; &lt;element name="Service" type="{http://www.orienteering.org/datastandard/3.0}Service"/&gt; &lt;element name="RequestedQuantity" type="{http://www.w3.org/2001/XMLSchema}double"/&gt; &lt;element name="DeliveredQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [assignedFee](assigned-fee.md) | [jvm]<br>protected open val [assignedFee](assigned-fee.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[AssignedFee](../-assigned-fee/index.md)> |
| [comment](comment.md) | [jvm]<br>protected open var [comment](comment.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [deliveredQuantity](delivered-quantity.md) | [jvm]<br>protected open var [deliveredQuantity](delivered-quantity.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [id](id.md) | [jvm]<br>protected open var [id](id.md): [Id](../-id/index.md) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [requestedQuantity](requested-quantity.md) | [jvm]<br>protected open var [requestedQuantity](requested-quantity.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [service](service.md) | [jvm]<br>protected open var [service](service.md): [Service](../-service/index.md) |

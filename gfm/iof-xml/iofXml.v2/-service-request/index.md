//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[ServiceRequest](index.md)

# ServiceRequest

[jvm]\
open class [ServiceRequest](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;choice&gt; &lt;element ref="{}ServiceId"/&gt; &lt;element ref="{}Service"/&gt; &lt;/choice&gt; &lt;element ref="{}ServiceOrderNumber" minOccurs="0"/&gt; &lt;element ref="{}RequestedQuantity"/&gt; &lt;element ref="{}DeliveredQuantity" minOccurs="0"/&gt; &lt;element ref="{}Comment" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [comment](comment.md) | [jvm]<br>protected open var [comment](comment.md): [Comment](../-comment/index.md) |
| [deliveredQuantity](delivered-quantity.md) | [jvm]<br>protected open var [deliveredQuantity](delivered-quantity.md): [DeliveredQuantity](../-delivered-quantity/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [requestedQuantity](requested-quantity.md) | [jvm]<br>protected open var [requestedQuantity](requested-quantity.md): [RequestedQuantity](../-requested-quantity/index.md) |
| [service](service.md) | [jvm]<br>protected open var [service](service.md): [Service](../-service/index.md) |
| [serviceId](service-id.md) | [jvm]<br>protected open var [serviceId](service-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [serviceOrderNumber](service-order-number.md) | [jvm]<br>protected open var [serviceOrderNumber](service-order-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

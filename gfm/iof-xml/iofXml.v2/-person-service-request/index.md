//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[PersonServiceRequest](index.md)

# PersonServiceRequest

[jvm]\
open class [PersonServiceRequest](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;choice&gt; &lt;element ref="{}PersonId"/&gt; &lt;element ref="{}Person"/&gt; &lt;/choice&gt; &lt;element ref="{}ServiceRequest" maxOccurs="unbounded"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [person](person.md) | [jvm]<br>protected open var [person](person.md): [Person](../-person/index.md) |
| [personId](person-id.md) | [jvm]<br>protected open var [personId](person-id.md): [PersonId](../-person-id/index.md) |
| [serviceRequest](service-request.md) | [jvm]<br>protected open val [serviceRequest](service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ServiceRequest](../-service-request/index.md)> |

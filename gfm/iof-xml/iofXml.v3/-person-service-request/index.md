//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[PersonServiceRequest](index.md)

# PersonServiceRequest

[jvm]\
open class [PersonServiceRequest](index.md)

Service requests made by a person. <p>Java class for PersonServiceRequest complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="PersonServiceRequest"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person"/&gt; &lt;element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [person](person.md) | [jvm]<br>protected open var [person](person.md): [Person](../-person/index.md) |
| [serviceRequest](service-request.md) | [jvm]<br>protected open val [serviceRequest](service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ServiceRequest](../-service-request/index.md)> |

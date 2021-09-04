//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[OrganisationServiceRequest](index.md)

# OrganisationServiceRequest

[jvm]\
open class [OrganisationServiceRequest](index.md)

Service requests made by an organisation. <p>Java class for OrganisationServiceRequest complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="OrganisationServiceRequest"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation"/&gt; &lt;element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="PersonServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}PersonServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [organisation](organisation.md) | [jvm]<br>protected open var [organisation](organisation.md): [Organisation](../-organisation/index.md) |
| [personServiceRequest](person-service-request.md) | [jvm]<br>protected open val [personServiceRequest](person-service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[PersonServiceRequest](../-person-service-request/index.md)> |
| [serviceRequest](service-request.md) | [jvm]<br>protected open val [serviceRequest](service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ServiceRequest](../-service-request/index.md)> |

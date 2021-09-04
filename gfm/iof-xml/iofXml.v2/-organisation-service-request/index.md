//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[OrganisationServiceRequest](index.md)

# OrganisationServiceRequest

[jvm]\
open class [OrganisationServiceRequest](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;choice&gt; &lt;element ref="{}OrganisationId"/&gt; &lt;element ref="{}Organisation"/&gt; &lt;/choice&gt; &lt;element ref="{}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}PersonServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [organisation](organisation.md) | [jvm]<br>protected open var [organisation](organisation.md): [Organisation](../-organisation/index.md) |
| [organisationId](organisation-id.md) | [jvm]<br>protected open var [organisationId](organisation-id.md): [OrganisationId](../-organisation-id/index.md) |
| [personServiceRequest](person-service-request.md) | [jvm]<br>protected open val [personServiceRequest](person-service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[PersonServiceRequest](../-person-service-request/index.md)> |
| [serviceRequest](service-request.md) | [jvm]<br>protected open val [serviceRequest](service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ServiceRequest](../-service-request/index.md)> |

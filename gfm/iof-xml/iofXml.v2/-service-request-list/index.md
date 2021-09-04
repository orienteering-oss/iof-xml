//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[ServiceRequestList](index.md)

# ServiceRequestList

[jvm]\
open class [ServiceRequestList](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}IOFVersion" minOccurs="0"/&gt; &lt;element ref="{}ClubServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}OrganisationServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [clubServiceRequest](club-service-request.md) | [jvm]<br>protected open val [clubServiceRequest](club-service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ClubServiceRequest](../-club-service-request/index.md)> |
| [iofVersion](iof-version.md) | [jvm]<br>protected open var [iofVersion](iof-version.md): [IOFVersion](../-i-o-f-version/index.md) |
| [organisationServiceRequest](organisation-service-request.md) | [jvm]<br>protected open val [organisationServiceRequest](organisation-service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[OrganisationServiceRequest](../-organisation-service-request/index.md)> |

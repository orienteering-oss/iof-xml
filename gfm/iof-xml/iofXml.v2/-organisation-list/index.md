//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[OrganisationList](index.md)

# OrganisationList

[jvm]\
open class [OrganisationList](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}IOFVersion" minOccurs="0"/&gt; &lt;element ref="{}OrganisationType" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Organisation" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [iofVersion](iof-version.md) | [jvm]<br>protected open var [iofVersion](iof-version.md): [IOFVersion](../-i-o-f-version/index.md) |
| [organisation](organisation.md) | [jvm]<br>protected open val [organisation](organisation.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Organisation](../-organisation/index.md)> |
| [organisationType](organisation-type.md) | [jvm]<br>protected open val [organisationType](organisation-type.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[OrganisationType](../-organisation-type/index.md)> |

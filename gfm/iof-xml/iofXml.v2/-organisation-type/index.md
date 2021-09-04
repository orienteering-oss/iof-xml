//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[OrganisationType](index.md)

# OrganisationType

[jvm]\
open class [OrganisationType](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}OrganisationTypeId"/&gt; &lt;element ref="{}Name"/&gt; &lt;element ref="{}SubOrganisationType" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [Name](../-name/index.md) |
| [organisationTypeId](organisation-type-id.md) | [jvm]<br>protected open var [organisationTypeId](organisation-type-id.md): [OrganisationTypeId](../-organisation-type-id/index.md) |
| [subOrganisationType](sub-organisation-type.md) | [jvm]<br>protected open val [subOrganisationType](sub-organisation-type.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[SubOrganisationType](../-sub-organisation-type/index.md)> |

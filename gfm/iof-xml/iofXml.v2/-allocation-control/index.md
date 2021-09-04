//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[AllocationControl](index.md)

# AllocationControl

[jvm]\
open class [AllocationControl](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;choice minOccurs="0"&gt; &lt;choice&gt; &lt;element ref="{}ClubId"/&gt; &lt;element ref="{}Club"/&gt; &lt;/choice&gt; &lt;choice&gt; &lt;element ref="{}PersonId"/&gt; &lt;element ref="{}Person"/&gt; &lt;/choice&gt; &lt;/choice&gt; &lt;element ref="{}AllocationControlType"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [allocationControlType](allocation-control-type.md) | [jvm]<br>protected open var [allocationControlType](allocation-control-type.md): [AllocationControlType](../-allocation-control-type/index.md) |
| [club](club.md) | [jvm]<br>protected open var [club](club.md): [Club](../-club/index.md) |
| [clubId](club-id.md) | [jvm]<br>protected open var [clubId](club-id.md): [ClubId](../-club-id/index.md) |
| [person](person.md) | [jvm]<br>protected open var [person](person.md): [Person](../-person/index.md) |
| [personId](person-id.md) | [jvm]<br>protected open var [personId](person-id.md): [PersonId](../-person-id/index.md) |

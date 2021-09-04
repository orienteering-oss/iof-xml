//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Transaction](index.md)

# Transaction

[jvm]\
open class [Transaction](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}Account"/&gt; &lt;element ref="{}ForeignAccount" minOccurs="0"/&gt; &lt;element ref="{}Date"/&gt; &lt;element ref="{}Amount"/&gt; &lt;choice&gt; &lt;element ref="{}ClubId"/&gt; &lt;element ref="{}Club"/&gt; &lt;element ref="{}OrganisationId"/&gt; &lt;element ref="{}Organisation"/&gt; &lt;/choice&gt; &lt;choice maxOccurs="unbounded" minOccurs="0"&gt; &lt;element ref="{}PersonId"/&gt; &lt;element ref="{}Person"/&gt; &lt;/choice&gt; &lt;element ref="{}EntryId" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;choice maxOccurs="unbounded" minOccurs="0"&gt; &lt;element ref="{}ServiceOrderNumber"/&gt; &lt;element ref="{}ServiceId"/&gt; &lt;element ref="{}Service"/&gt; &lt;/choice&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [account](account.md) | [jvm]<br>protected open var [account](account.md): [Account](../-account/index.md) |
| [amount](amount.md) | [jvm]<br>protected open var [amount](amount.md): [Amount](../-amount/index.md) |
| [club](club.md) | [jvm]<br>protected open var [club](club.md): [Club](../-club/index.md) |
| [clubId](club-id.md) | [jvm]<br>protected open var [clubId](club-id.md): [ClubId](../-club-id/index.md) |
| [date](date.md) | [jvm]<br>protected open var [date](date.md): [Date](../-date/index.md) |
| [entryId](entry-id.md) | [jvm]<br>protected open val [entryId](entry-id.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)> |
| [foreignAccount](foreign-account.md) | [jvm]<br>protected open var [foreignAccount](foreign-account.md): [ForeignAccount](../-foreign-account/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [organisation](organisation.md) | [jvm]<br>protected open var [organisation](organisation.md): [Organisation](../-organisation/index.md) |
| [organisationId](organisation-id.md) | [jvm]<br>protected open var [organisationId](organisation-id.md): [OrganisationId](../-organisation-id/index.md) |
| [personIdOrPerson](person-id-or-person.md) | [jvm]<br>protected open val [personIdOrPerson](person-id-or-person.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |
| [serviceOrderNumberOrServiceIdOrService](service-order-number-or-service-id-or-service.md) | [jvm]<br>protected open val [serviceOrderNumberOrServiceIdOrService](service-order-number-or-service-id-or-service.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |

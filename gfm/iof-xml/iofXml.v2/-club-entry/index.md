//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[ClubEntry](index.md)

# ClubEntry

[jvm]\
open class [ClubEntry](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;choice&gt; &lt;element ref="{}ClubId"/&gt; &lt;element ref="{}Club"/&gt; &lt;/choice&gt; &lt;element ref="{}Contact" minOccurs="0"/&gt; &lt;element ref="{}Entry" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [club](club.md) | [jvm]<br>protected open var [club](club.md): [Club](../-club/index.md) |
| [clubId](club-id.md) | [jvm]<br>protected open var [clubId](club-id.md): [ClubId](../-club-id/index.md) |
| [contact](contact.md) | [jvm]<br>protected open var [contact](contact.md): [Contact](../-contact/index.md) |
| [entry](entry.md) | [jvm]<br>protected open val [entry](entry.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Entry](../-entry/index.md)> |

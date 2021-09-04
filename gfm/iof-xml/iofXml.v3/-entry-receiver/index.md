//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[EntryReceiver](index.md)

# EntryReceiver

[jvm]\
open class [EntryReceiver](index.md)

<p>Java class for EntryReceiver complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="EntryReceiver"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Address" type="{http://www.orienteering.org/datastandard/3.0}Address" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Contact" type="{http://www.orienteering.org/datastandard/3.0}Contact" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [address](address.md) | [jvm]<br>protected open val [address](address.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Address](../-address/index.md)> |
| [contact](contact.md) | [jvm]<br>protected open val [contact](contact.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Contact](../-contact/index.md)> |

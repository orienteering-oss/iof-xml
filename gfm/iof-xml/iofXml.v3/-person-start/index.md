//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[PersonStart](index.md)

# PersonStart

[jvm]\
open class [PersonStart](index.md)

Start information for an individual competitor, including e.g. start time and bib number. <p>Java class for PersonStart complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="PersonStart"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="EntryId" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&gt; &lt;element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person" minOccurs="0"/&gt; &lt;element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" minOccurs="0"/&gt; &lt;element name="Start" type="{http://www.orienteering.org/datastandard/3.0}PersonRaceStart" maxOccurs="unbounded"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [entryId](entry-id.md) | [jvm]<br>protected open var [entryId](entry-id.md): [Id](../-id/index.md) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [organisation](organisation.md) | [jvm]<br>protected open var [organisation](organisation.md): [Organisation](../-organisation/index.md) |
| [person](person.md) | [jvm]<br>protected open var [person](person.md): [Person](../-person/index.md) |
| [start](start.md) | [jvm]<br>protected open val [start](start.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[PersonRaceStart](../-person-race-start/index.md)> |

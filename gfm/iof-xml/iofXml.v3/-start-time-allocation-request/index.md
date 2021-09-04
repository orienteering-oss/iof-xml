//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[StartTimeAllocationRequest](index.md)

# StartTimeAllocationRequest

[jvm]\
open class [StartTimeAllocationRequest](index.md)

Used to state start time allocation requests. It consists of a possible reference Organisation or Person and the allocation request, e.g. late start or grouped with the reference Organisation/Person. This way it is possible to state requests to the event organizer so that e.g. all members of an organisation has start times close to each other - or parents have start times far from each other. It is totally up to the event software and organizers whether they will support such requests. <p>Java class for StartTimeAllocationRequest complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="StartTimeAllocationRequest"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" minOccurs="0"/&gt; &lt;element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="type" default="Normal"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt; &lt;enumeration value="Normal"/&gt; &lt;enumeration value="EarlyStart"/&gt; &lt;enumeration value="LateStart"/&gt; &lt;enumeration value="SeparatedFrom"/&gt; &lt;enumeration value="GroupedWith"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [organisation](organisation.md) | [jvm]<br>protected open var [organisation](organisation.md): [Organisation](../-organisation/index.md) |
| [person](person.md) | [jvm]<br>protected open var [person](person.md): [Person](../-person/index.md) |
| [type](type.md) | [jvm]<br>protected open var [type](type.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

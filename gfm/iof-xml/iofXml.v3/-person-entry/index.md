//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[PersonEntry](index.md)

# PersonEntry

[jvm]\
open class [PersonEntry](index.md)

Defines an event entry for a person. <p>Java class for PersonEntry complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="PersonEntry"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&gt; &lt;element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person"/&gt; &lt;element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" minOccurs="0"/&gt; &lt;element name="ControlCard" type="{http://www.orienteering.org/datastandard/3.0}ControlCard" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Score" type="{http://www.orienteering.org/datastandard/3.0}Score" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Class" type="{http://www.orienteering.org/datastandard/3.0}Class" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="RaceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="StartTimeAllocationRequest" type="{http://www.orienteering.org/datastandard/3.0}StartTimeAllocationRequest" minOccurs="0"/&gt; &lt;element name="EntryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [assignedFee](assigned-fee.md) | [jvm]<br>protected open val [assignedFee](assigned-fee.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[AssignedFee](../-assigned-fee/index.md)> |
| [clazz](clazz.md) | [jvm]<br>protected open val [clazz](clazz.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Class](../-class/index.md)> |
| [controlCard](control-card.md) | [jvm]<br>protected open val [controlCard](control-card.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ControlCard](../-control-card/index.md)> |
| [entryTime](entry-time.md) | [jvm]<br>protected open var [entryTime](entry-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [id](id.md) | [jvm]<br>protected open var [id](id.md): [Id](../-id/index.md) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [organisation](organisation.md) | [jvm]<br>protected open var [organisation](organisation.md): [Organisation](../-organisation/index.md) |
| [person](person.md) | [jvm]<br>protected open var [person](person.md): [Person](../-person/index.md) |
| [raceNumber](race-number.md) | [jvm]<br>protected open val [raceNumber](race-number.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html)> |
| [score](score.md) | [jvm]<br>protected open val [score](score.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Score](../-score/index.md)> |
| [serviceRequest](service-request.md) | [jvm]<br>protected open val [serviceRequest](service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ServiceRequest](../-service-request/index.md)> |
| [startTimeAllocationRequest](start-time-allocation-request.md) | [jvm]<br>protected open var [startTimeAllocationRequest](start-time-allocation-request.md): [StartTimeAllocationRequest](../-start-time-allocation-request/index.md) |

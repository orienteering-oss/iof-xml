//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[TeamEntry](index.md)

# TeamEntry

[jvm]\
open class [TeamEntry](index.md)

Defines an event entry for a team. <p>Java class for TeamEntry complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="TeamEntry"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&gt; &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt; &lt;element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="TeamEntryPerson" type="{http://www.orienteering.org/datastandard/3.0}TeamEntryPerson" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Class" type="{http://www.orienteering.org/datastandard/3.0}Class" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Race" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="StartTimeAllocationRequest" type="{http://www.orienteering.org/datastandard/3.0}StartTimeAllocationRequest" minOccurs="0"/&gt; &lt;element name="ContactInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="EntryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [assignedFee](assigned-fee.md) | [jvm]<br>protected open val [assignedFee](assigned-fee.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[AssignedFee](../-assigned-fee/index.md)> |
| [clazz](clazz.md) | [jvm]<br>protected open val [clazz](clazz.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Class](../-class/index.md)> |
| [contactInformation](contact-information.md) | [jvm]<br>protected open var [contactInformation](contact-information.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [entryTime](entry-time.md) | [jvm]<br>protected open var [entryTime](entry-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [id](id.md) | [jvm]<br>protected open var [id](id.md): [Id](../-id/index.md) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [organisation](organisation.md) | [jvm]<br>protected open val [organisation](organisation.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Organisation](../-organisation/index.md)> |
| [race](race.md) | [jvm]<br>protected open val [race](race.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html)> |
| [serviceRequest](service-request.md) | [jvm]<br>protected open val [serviceRequest](service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ServiceRequest](../-service-request/index.md)> |
| [startTimeAllocationRequest](start-time-allocation-request.md) | [jvm]<br>protected open var [startTimeAllocationRequest](start-time-allocation-request.md): [StartTimeAllocationRequest](../-start-time-allocation-request/index.md) |
| [teamEntryPerson](team-entry-person.md) | [jvm]<br>protected open val [teamEntryPerson](team-entry-person.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[TeamEntryPerson](../-team-entry-person/index.md)> |

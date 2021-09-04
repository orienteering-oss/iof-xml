//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[TeamMemberRaceStart](index.md)

# TeamMemberRaceStart

[jvm]\
open class [TeamMemberRaceStart](index.md)

Start information for a team member in a race. <p>Java class for TeamMemberRaceStart complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="TeamMemberRaceStart"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Leg" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt; &lt;element name="LegOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt; &lt;element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt; &lt;element name="Course" type="{http://www.orienteering.org/datastandard/3.0}SimpleCourse" minOccurs="0"/&gt; &lt;element name="ControlCard" type="{http://www.orienteering.org/datastandard/3.0}ControlCard" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [assignedFee](assigned-fee.md) | [jvm]<br>protected open val [assignedFee](assigned-fee.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[AssignedFee](../-assigned-fee/index.md)> |
| [bibNumber](bib-number.md) | [jvm]<br>protected open var [bibNumber](bib-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [controlCard](control-card.md) | [jvm]<br>protected open val [controlCard](control-card.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ControlCard](../-control-card/index.md)> |
| [course](course.md) | [jvm]<br>protected open var [course](course.md): [SimpleCourse](../-simple-course/index.md) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [leg](leg.md) | [jvm]<br>protected open var [leg](leg.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [legOrder](leg-order.md) | [jvm]<br>protected open var [legOrder](leg-order.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [raceNumber](race-number.md) | [jvm]<br>protected open var [raceNumber](race-number.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [serviceRequest](service-request.md) | [jvm]<br>protected open val [serviceRequest](service-request.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ServiceRequest](../-service-request/index.md)> |
| [startTime](start-time.md) | [jvm]<br>protected open var [startTime](start-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |

//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[RaceClass](index.md)

# RaceClass

[jvm]\
open class [RaceClass](index.md)

Information about a class with respect to a race. <p>Java class for RaceClass complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="RaceClass"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="PunchingSystem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="TeamFee" type="{http://www.orienteering.org/datastandard/3.0}Fee" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Fee" type="{http://www.orienteering.org/datastandard/3.0}Fee" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="FirstStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt; &lt;element name="Status" type="{http://www.orienteering.org/datastandard/3.0}RaceClassStatus" minOccurs="0"/&gt; &lt;element name="Course" type="{http://www.orienteering.org/datastandard/3.0}SimpleCourse" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="OnlineControl" type="{http://www.orienteering.org/datastandard/3.0}Control" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt; &lt;attribute name="maxNumberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [course](course.md) | [jvm]<br>protected open val [course](course.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[SimpleCourse](../-simple-course/index.md)> |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [fee](fee.md) | [jvm]<br>protected open val [fee](fee.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Fee](../-fee/index.md)> |
| [firstStart](first-start.md) | [jvm]<br>protected open var [firstStart](first-start.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [maxNumberOfCompetitors](max-number-of-competitors.md) | [jvm]<br>protected open var [maxNumberOfCompetitors](max-number-of-competitors.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [onlineControl](online-control.md) | [jvm]<br>protected open val [onlineControl](online-control.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Control](../-control/index.md)> |
| [punchingSystem](punching-system.md) | [jvm]<br>protected open val [punchingSystem](punching-system.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)> |
| [raceNumber](race-number.md) | [jvm]<br>protected open var [raceNumber](race-number.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [status](status.md) | [jvm]<br>protected open var [status](status.md): [RaceClassStatus](../-race-class-status/index.md) |
| [teamFee](team-fee.md) | [jvm]<br>protected open val [teamFee](team-fee.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Fee](../-fee/index.md)> |

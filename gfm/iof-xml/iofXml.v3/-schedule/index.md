//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[Schedule](index.md)

# Schedule

[jvm]\
open class [Schedule](index.md)

Defines the schedule of sub-events that comprise the entire orienteering event, e.g. banquets, social events and awards ceremonies. <p>Java class for Schedule complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="Schedule"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt; &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt; &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt; &lt;element name="Venue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="Position" type="{http://www.orienteering.org/datastandard/3.0}GeoPosition" minOccurs="0"/&gt; &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [details](details.md) | [jvm]<br>protected open var [details](details.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [endTime](end-time.md) | [jvm]<br>protected open var [endTime](end-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [position](position.md) | [jvm]<br>protected open var [position](position.md): [GeoPosition](../-geo-position/index.md) |
| [startTime](start-time.md) | [jvm]<br>protected open var [startTime](start-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [venue](venue.md) | [jvm]<br>protected open var [venue](venue.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

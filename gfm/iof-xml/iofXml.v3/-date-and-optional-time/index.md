//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[DateAndOptionalTime](index.md)

# DateAndOptionalTime

[jvm]\
open class [DateAndOptionalTime](index.md)

Defines a point in time which either is known by date and time, or just by date. May be used for event dates, when the event date is decided before the time of the first start. <p>Java class for DateAndOptionalTime complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="DateAndOptionalTime"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt; &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [date](date.md) | [jvm]<br>protected open var [date](date.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [time](time.md) | [jvm]<br>protected open var [time](time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |

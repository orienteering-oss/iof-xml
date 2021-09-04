//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[AssignedFee](index.md)

# AssignedFee

[jvm]\
open class [AssignedFee](index.md)

Contains information about a fee that has been assigned to a competitor or a team, and the amount that has been paid. <p>Java class for AssignedFee complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="AssignedFee"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Fee" type="{http://www.orienteering.org/datastandard/3.0}Fee"/&gt; &lt;element name="PaidAmount" type="{http://www.orienteering.org/datastandard/3.0}Amount" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [fee](fee.md) | [jvm]<br>protected open var [fee](fee.md): [Fee](../-fee/index.md) |
| [modifyTime](modify-time.md) | [jvm]<br>protected open var [modifyTime](modify-time.md): [XMLGregorianCalendar](https://docs.oracle.com/javase/8/docs/api/javax/xml/datatype/XMLGregorianCalendar.html) |
| [paidAmount](paid-amount.md) | [jvm]<br>protected open var [paidAmount](paid-amount.md): [Amount](../-amount/index.md) |

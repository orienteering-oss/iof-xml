//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[ControlAnswer](index.md)

# ControlAnswer

[jvm]\
open class [ControlAnswer](index.md)

Defines the the selected answer, the correct answer and the time used on a Trail-O control. <p>Java class for ControlAnswer complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="ControlAnswer"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt; &lt;element name="CorrectAnswer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt; &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [answer](answer.md) | [jvm]<br>protected open var [answer](answer.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [correctAnswer](correct-answer.md) | [jvm]<br>protected open var [correctAnswer](correct-answer.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [time](time.md) | [jvm]<br>protected open var [time](time.md): [Double](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html) |

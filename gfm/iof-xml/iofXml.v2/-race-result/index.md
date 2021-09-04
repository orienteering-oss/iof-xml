//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[RaceResult](index.md)

# RaceResult

[jvm]\
open class [RaceResult](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;choice&gt; &lt;element ref="{}EventRaceId"/&gt; &lt;element ref="{}EventRace"/&gt; &lt;/choice&gt; &lt;element ref="{}Result"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [eventRace](event-race.md) | [jvm]<br>protected open var [eventRace](event-race.md): [EventRace](../-event-race/index.md) |
| [eventRaceId](event-race-id.md) | [jvm]<br>protected open var [eventRaceId](event-race-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [result](result.md) | [jvm]<br>protected open var [result](result.md): [Result](../-result/index.md) |

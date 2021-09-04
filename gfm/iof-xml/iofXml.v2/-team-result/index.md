//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[TeamResult](index.md)

# TeamResult

[jvm]\
open class [TeamResult](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}TeamName"/&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}CountryId"/&gt; &lt;element ref="{}Country"/&gt; &lt;/choice&gt; &lt;element ref="{}StartNumber" minOccurs="0"/&gt; &lt;element ref="{}BibNumber" minOccurs="0"/&gt; &lt;element ref="{}StartTime" minOccurs="0"/&gt; &lt;element ref="{}FinishTime" minOccurs="0"/&gt; &lt;element ref="{}Time" minOccurs="0"/&gt; &lt;element ref="{}ResultPosition" minOccurs="0"/&gt; &lt;element ref="{}TeamStatus"/&gt; &lt;element ref="{}Rank" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Point" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}PersonResult" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [bibNumber](bib-number.md) | [jvm]<br>protected open var [bibNumber](bib-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [country](country.md) | [jvm]<br>protected open var [country](country.md): [Country](../-country/index.md) |
| [countryId](country-id.md) | [jvm]<br>protected open var [countryId](country-id.md): [CountryId](../-country-id/index.md) |
| [finishTime](finish-time.md) | [jvm]<br>protected open var [finishTime](finish-time.md): [FinishTime](../-finish-time/index.md) |
| [personResult](person-result.md) | [jvm]<br>protected open val [personResult](person-result.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[PersonResult](../-person-result/index.md)> |
| [point](point.md) | [jvm]<br>protected open val [point](point.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Point](../-point/index.md)> |
| [rank](rank.md) | [jvm]<br>protected open val [rank](rank.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Rank](../-rank/index.md)> |
| [resultPosition](result-position.md) | [jvm]<br>protected open var [resultPosition](result-position.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [startNumber](start-number.md) | [jvm]<br>protected open var [startNumber](start-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [startTime](start-time.md) | [jvm]<br>protected open var [startTime](start-time.md): [StartTime](../-start-time/index.md) |
| [teamName](team-name.md) | [jvm]<br>protected open var [teamName](team-name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [teamStatus](team-status.md) | [jvm]<br>protected open var [teamStatus](team-status.md): [TeamStatus](../-team-status/index.md) |
| [time](time.md) | [jvm]<br>protected open var [time](time.md): [Time](../-time/index.md) |

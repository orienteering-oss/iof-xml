//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[ClassRaceInfo](index.md)

# ClassRaceInfo

[jvm]\
open class [ClassRaceInfo](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}FirstStart" minOccurs="0"/&gt; &lt;element ref="{}StartInterval" minOccurs="0"/&gt; &lt;element ref="{}EstimatedBestTime" minOccurs="0"/&gt; &lt;element ref="{}EstimatedLastPrizeTime" minOccurs="0"/&gt; &lt;element ref="{}PrizeCeremonyTime" minOccurs="0"/&gt; &lt;element ref="{}AllocationMethod" minOccurs="0"/&gt; &lt;element ref="{}StartMethod" minOccurs="0"/&gt; &lt;element ref="{}ClassRaceStatus"/&gt; &lt;element ref="{}CourseVariationId" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="numberOfVacants" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="rankingRace" default="N"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="Y"/&gt; &lt;enumeration value="N"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;attribute name="numberOfPrizes" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="bibNumberPrefix" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="bibNumberBase" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="finishChute" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [allocationMethod](allocation-method.md) | [jvm]<br>protected open var [allocationMethod](allocation-method.md): [AllocationMethod](../-allocation-method/index.md) |
| [bibNumberBase](bib-number-base.md) | [jvm]<br>protected open var [bibNumberBase](bib-number-base.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [bibNumberPrefix](bib-number-prefix.md) | [jvm]<br>protected open var [bibNumberPrefix](bib-number-prefix.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [classRaceStatus](class-race-status.md) | [jvm]<br>protected open var [classRaceStatus](class-race-status.md): [ClassRaceStatus](../-class-race-status/index.md) |
| [courseVariationId](course-variation-id.md) | [jvm]<br>protected open val [courseVariationId](course-variation-id.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)> |
| [estimatedBestTime](estimated-best-time.md) | [jvm]<br>protected open var [estimatedBestTime](estimated-best-time.md): [EstimatedBestTime](../-estimated-best-time/index.md) |
| [estimatedLastPrizeTime](estimated-last-prize-time.md) | [jvm]<br>protected open var [estimatedLastPrizeTime](estimated-last-prize-time.md): [EstimatedLastPrizeTime](../-estimated-last-prize-time/index.md) |
| [finishChute](finish-chute.md) | [jvm]<br>protected open var [finishChute](finish-chute.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [firstStart](first-start.md) | [jvm]<br>protected open var [firstStart](first-start.md): [FirstStart](../-first-start/index.md) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [numberOfPrizes](number-of-prizes.md) | [jvm]<br>protected open var [numberOfPrizes](number-of-prizes.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [numberOfVacants](number-of-vacants.md) | [jvm]<br>protected open var [numberOfVacants](number-of-vacants.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [prizeCeremonyTime](prize-ceremony-time.md) | [jvm]<br>protected open var [prizeCeremonyTime](prize-ceremony-time.md): [PrizeCeremonyTime](../-prize-ceremony-time/index.md) |
| [rankingRace](ranking-race.md) | [jvm]<br>protected open var [rankingRace](ranking-race.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [startInterval](start-interval.md) | [jvm]<br>protected open var [startInterval](start-interval.md): [StartInterval](../-start-interval/index.md) |
| [startMethod](start-method.md) | [jvm]<br>protected open var [startMethod](start-method.md): [StartMethod](../-start-method/index.md) |

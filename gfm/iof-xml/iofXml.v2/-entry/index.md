//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Entry](index.md)

# Entry

[jvm]\
open class [Entry](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}EntryId" minOccurs="0"/&gt; &lt;choice&gt; &lt;sequence&gt; &lt;choice&gt; &lt;element ref="{}PersonId"/&gt; &lt;element ref="{}Person"/&gt; &lt;/choice&gt; &lt;element ref="{}CCard" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}Rank" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;sequence&gt; &lt;element ref="{}TeamName"/&gt; &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}ClubId"/&gt; &lt;element ref="{}Club"/&gt; &lt;/choice&gt; &lt;element ref="{}TeamSequence" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/sequence&gt; &lt;/choice&gt; &lt;element ref="{}EntryClass" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element ref="{}AllocationControl" minOccurs="0"/&gt; &lt;element ref="{}EntryDate"/&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="nonCompetitor" default="N"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="Y"/&gt; &lt;enumeration value="N"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [allocationControl](allocation-control.md) | [jvm]<br>protected open var [allocationControl](allocation-control.md): [AllocationControl](../-allocation-control/index.md) |
| [cCard](c-card.md) | [jvm]<br>protected open val [cCard](c-card.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[CCard](../-c-card/index.md)> |
| [clubIdOrClubAndTeamSequence](club-id-or-club-and-team-sequence.md) | [jvm]<br>protected open val [clubIdOrClubAndTeamSequence](club-id-or-club-and-team-sequence.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |
| [entryClass](entry-class.md) | [jvm]<br>protected open val [entryClass](entry-class.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[EntryClass](../-entry-class/index.md)> |
| [entryDate](entry-date.md) | [jvm]<br>protected open var [entryDate](entry-date.md): [EntryDate](../-entry-date/index.md) |
| [entryId](entry-id.md) | [jvm]<br>protected open var [entryId](entry-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [nonCompetitor](non-competitor.md) | [jvm]<br>protected open var [nonCompetitor](non-competitor.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [person](person.md) | [jvm]<br>protected open var [person](person.md): [Person](../-person/index.md) |
| [personId](person-id.md) | [jvm]<br>protected open var [personId](person-id.md): [PersonId](../-person-id/index.md) |
| [rank](rank.md) | [jvm]<br>protected open val [rank](rank.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Rank](../-rank/index.md)> |
| [teamName](team-name.md) | [jvm]<br>protected open var [teamName](team-name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

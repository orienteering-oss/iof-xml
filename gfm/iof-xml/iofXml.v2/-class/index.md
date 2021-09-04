//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[Class](index.md)

# Class

[jvm]\
open class [Class](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}ClassId"/&gt; &lt;element ref="{}Name" minOccurs="0"/&gt; &lt;element ref="{}ClassShortName"/&gt; &lt;choice minOccurs="0"&gt; &lt;element ref="{}ClassTypeId"/&gt; &lt;element ref="{}ClassType"/&gt; &lt;/choice&gt; &lt;element ref="{}SubstituteClass" minOccurs="0"/&gt; &lt;element ref="{}NotQualifiedSubstituteClass" minOccurs="0"/&gt; &lt;choice maxOccurs="unbounded" minOccurs="0"&gt; &lt;element ref="{}EntryFeeId"/&gt; &lt;element ref="{}EntryFee"/&gt; &lt;/choice&gt; &lt;element ref="{}ModifyDate" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="lowAge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="highAge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="sex" use="required"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="M"/&gt; &lt;enumeration value="F"/&gt; &lt;enumeration value="B"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;attribute name="numberInTeam" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="1" /&gt; &lt;attribute name="teamEntry" default="N"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="Y"/&gt; &lt;enumeration value="N"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;attribute name="maxNumberInClass" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="actualForRanking" default="N"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="Y"/&gt; &lt;enumeration value="N"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;attribute name="timePresentation" default="Y"&gt; &lt;simpleType&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt; &lt;enumeration value="Y"/&gt; &lt;enumeration value="N"/&gt; &lt;/restriction&gt; &lt;/simpleType&gt; &lt;/attribute&gt; &lt;attribute name="allowedMinAge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;attribute name="allowedMaxAge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [actualForRanking](actual-for-ranking.md) | [jvm]<br>protected open var [actualForRanking](actual-for-ranking.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [allowedMaxAge](allowed-max-age.md) | [jvm]<br>protected open var [allowedMaxAge](allowed-max-age.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [allowedMinAge](allowed-min-age.md) | [jvm]<br>protected open var [allowedMinAge](allowed-min-age.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [classId](class-id.md) | [jvm]<br>protected open var [classId](class-id.md): [ClassId](../-class-id/index.md) |
| [classShortName](class-short-name.md) | [jvm]<br>protected open var [classShortName](class-short-name.md): [ClassShortName](../-class-short-name/index.md) |
| [classType](class-type.md) | [jvm]<br>protected open var [classType](class-type.md): [ClassType](../-class-type/index.md) |
| [classTypeId](class-type-id.md) | [jvm]<br>protected open var [classTypeId](class-type-id.md): [ClassTypeId](../-class-type-id/index.md) |
| [entryFeeIdOrEntryFee](entry-fee-id-or-entry-fee.md) | [jvm]<br>protected open val [entryFeeIdOrEntryFee](entry-fee-id-or-entry-fee.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)> |
| [highAge](high-age.md) | [jvm]<br>protected open var [highAge](high-age.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [lowAge](low-age.md) | [jvm]<br>protected open var [lowAge](low-age.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [maxNumberInClass](max-number-in-class.md) | [jvm]<br>protected open var [maxNumberInClass](max-number-in-class.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [modifyDate](modify-date.md) | [jvm]<br>protected open var [modifyDate](modify-date.md): [ModifyDate](../-modify-date/index.md) |
| [name](name.md) | [jvm]<br>protected open var [name](name.md): [Name](../-name/index.md) |
| [notQualifiedSubstituteClass](not-qualified-substitute-class.md) | [jvm]<br>protected open var [notQualifiedSubstituteClass](not-qualified-substitute-class.md): [NotQualifiedSubstituteClass](../-not-qualified-substitute-class/index.md) |
| [numberInTeam](number-in-team.md) | [jvm]<br>protected open var [numberInTeam](number-in-team.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [sex](sex.md) | [jvm]<br>protected open var [sex](sex.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [substituteClass](substitute-class.md) | [jvm]<br>protected open var [substituteClass](substitute-class.md): [SubstituteClass](../-substitute-class/index.md) |
| [teamEntry](team-entry.md) | [jvm]<br>protected open var [teamEntry](team-entry.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [timePresentation](time-presentation.md) | [jvm]<br>protected open var [timePresentation](time-presentation.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

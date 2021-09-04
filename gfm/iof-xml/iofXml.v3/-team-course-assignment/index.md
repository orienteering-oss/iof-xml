//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[TeamCourseAssignment](index.md)

# TeamCourseAssignment

[jvm]\
open class [TeamCourseAssignment](index.md)

Element that connects a number of team members in a relay team to a number of courses. Teams are matched by 1) BibNumber, 2) TeamName+ClassName. <p>Java class for TeamCourseAssignment complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="TeamCourseAssignment"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="TeamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="TeamMemberCourseAssignment" type="{http://www.orienteering.org/datastandard/3.0}TeamMemberCourseAssignment" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [bibNumber](bib-number.md) | [jvm]<br>protected open var [bibNumber](bib-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [className](class-name.md) | [jvm]<br>protected open var [className](class-name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [teamMemberCourseAssignment](team-member-course-assignment.md) | [jvm]<br>protected open val [teamMemberCourseAssignment](team-member-course-assignment.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[TeamMemberCourseAssignment](../-team-member-course-assignment/index.md)> |
| [teamName](team-name.md) | [jvm]<br>protected open var [teamName](team-name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

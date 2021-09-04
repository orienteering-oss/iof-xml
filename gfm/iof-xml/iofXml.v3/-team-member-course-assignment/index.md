//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[TeamMemberCourseAssignment](index.md)

# TeamMemberCourseAssignment

[jvm]\
open class [TeamMemberCourseAssignment](index.md)

Element that connects a course with a relay team member. Courses should be present in the RaceCourseData element and are matched on course name and/or course family. Team members are matched by 1) BibNumber, 2) Leg and LegOrder, 3) EntryId. <p>Java class for TeamMemberCourseAssignment complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="TeamMemberCourseAssignment"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="EntryId" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&gt; &lt;element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="Leg" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt; &lt;element name="LegOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt; &lt;element name="TeamMemberName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="CourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="CourseFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [bibNumber](bib-number.md) | [jvm]<br>protected open var [bibNumber](bib-number.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [courseFamily](course-family.md) | [jvm]<br>protected open var [courseFamily](course-family.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [courseName](course-name.md) | [jvm]<br>protected open var [courseName](course-name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [entryId](entry-id.md) | [jvm]<br>protected open var [entryId](entry-id.md): [Id](../-id/index.md) |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [leg](leg.md) | [jvm]<br>protected open var [leg](leg.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [legOrder](leg-order.md) | [jvm]<br>protected open var [legOrder](leg-order.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [teamMemberName](team-member-name.md) | [jvm]<br>protected open var [teamMemberName](team-member-name.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

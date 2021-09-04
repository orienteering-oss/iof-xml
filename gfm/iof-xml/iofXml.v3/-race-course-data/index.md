//[iofXml](../../../index.md)/[iofXml.v3](../index.md)/[RaceCourseData](index.md)

# RaceCourseData

[jvm]\
open class [RaceCourseData](index.md)

This element defines all the control and course information for a race. <p>Java class for RaceCourseData complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType name="RaceCourseData"&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element name="Map" type="{http://www.orienteering.org/datastandard/3.0}Map" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Control" type="{http://www.orienteering.org/datastandard/3.0}Control" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Course" type="{http://www.orienteering.org/datastandard/3.0}Course" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="ClassCourseAssignment" type="{http://www.orienteering.org/datastandard/3.0}ClassCourseAssignment" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="PersonCourseAssignment" type="{http://www.orienteering.org/datastandard/3.0}PersonCourseAssignment" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="TeamCourseAssignment" type="{http://www.orienteering.org/datastandard/3.0}TeamCourseAssignment" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [classCourseAssignment](class-course-assignment.md) | [jvm]<br>protected open val [classCourseAssignment](class-course-assignment.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[ClassCourseAssignment](../-class-course-assignment/index.md)> |
| [control](control.md) | [jvm]<br>protected open val [control](control.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Control](../-control/index.md)> |
| [course](course.md) | [jvm]<br>protected open val [course](course.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Course](../-course/index.md)> |
| [extensions](extensions.md) | [jvm]<br>protected open var [extensions](extensions.md): [Extensions](../-extensions/index.md) |
| [map](map.md) | [jvm]<br>protected open val [map](map.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[Map](../-map/index.md)> |
| [personCourseAssignment](person-course-assignment.md) | [jvm]<br>protected open val [personCourseAssignment](person-course-assignment.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[PersonCourseAssignment](../-person-course-assignment/index.md)> |
| [raceNumber](race-number.md) | [jvm]<br>protected open var [raceNumber](race-number.md): [BigInteger](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html) |
| [teamCourseAssignment](team-course-assignment.md) | [jvm]<br>protected open val [teamCourseAssignment](team-course-assignment.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[TeamCourseAssignment](../-team-course-assignment/index.md)> |

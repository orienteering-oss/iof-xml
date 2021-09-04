//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[CourseSection](index.md)

# CourseSection

[jvm]\
open class [CourseSection](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}CourseSectionId"/&gt; &lt;element ref="{}CourseBranch" maxOccurs="unbounded"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [courseBranch](course-branch.md) | [jvm]<br>protected open val [courseBranch](course-branch.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[CourseBranch](../-course-branch/index.md)> |
| [courseSectionId](course-section-id.md) | [jvm]<br>protected open var [courseSectionId](course-section-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

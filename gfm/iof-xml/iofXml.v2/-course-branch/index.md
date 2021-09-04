//[iofXml](../../../index.md)/[iofXml.v2](../index.md)/[CourseBranch](index.md)

# CourseBranch

[jvm]\
open class [CourseBranch](index.md)

<p>Java class for anonymous complex type. <p>The following schema fragment specifies the expected content contained within this class. <pre> &lt;complexType&gt; &lt;complexContent&gt; &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt; &lt;sequence&gt; &lt;element ref="{}CourseBranchId"/&gt; &lt;element ref="{}CourseControl" maxOccurs="unbounded" minOccurs="0"/&gt; &lt;/sequence&gt; &lt;/restriction&gt; &lt;/complexContent&gt; &lt;/complexType&gt; </pre>

## Properties

| Name | Summary |
|---|---|
| [courseBranchId](course-branch-id.md) | [jvm]<br>protected open var [courseBranchId](course-branch-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [courseControl](course-control.md) | [jvm]<br>protected open val [courseControl](course-control.md): [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)<[CourseControl](../-course-control/index.md)> |

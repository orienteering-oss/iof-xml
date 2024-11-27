
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Element that connects a course with an individual competitor. Courses should be present in the RaceCourseData element and are matched on course name and/or course family. Persons are matched by 1) BibNumber, 2) EntryId.
 * 
 * <p>Java class for PersonCourseAssignment complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PersonCourseAssignment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntryId" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PersonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CourseFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonCourseAssignment", propOrder = {
    "entryId",
    "bibNumber",
    "personName",
    "className",
    "courseName",
    "courseFamily",
    "extensions"
})
public class PersonCourseAssignment {

    /**
     * The id corresponding to this person's entry in an EntryList.
     * 
     */
    @XmlElement(name = "EntryId")
    protected Id entryId;
    /**
     * The bib number of the person.
     * 
     */
    @XmlElement(name = "BibNumber")
    protected String bibNumber;
    /**
     * The name of the person.
     * 
     */
    @XmlElement(name = "PersonName")
    protected String personName;
    /**
     * The name of the class that the person belongs to.
     * 
     */
    @XmlElement(name = "ClassName")
    protected String className;
    /**
     * The name of the course.
     * 
     */
    @XmlElement(name = "CourseName")
    protected String courseName;
    /**
     * The family or group of forked courses that the course is part of.
     * 
     */
    @XmlElement(name = "CourseFamily")
    protected String courseFamily;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * The id corresponding to this person's entry in an EntryList.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getEntryId() {
        return entryId;
    }

    /**
     * Sets the value of the entryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     * @see #getEntryId()
     */
    public void setEntryId(Id value) {
        this.entryId = value;
    }

    /**
     * The bib number of the person.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBibNumber() {
        return bibNumber;
    }

    /**
     * Sets the value of the bibNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBibNumber()
     */
    public void setBibNumber(String value) {
        this.bibNumber = value;
    }

    /**
     * The name of the person.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPersonName()
     */
    public void setPersonName(String value) {
        this.personName = value;
    }

    /**
     * The name of the class that the person belongs to.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getClassName()
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * The name of the course.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the value of the courseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCourseName()
     */
    public void setCourseName(String value) {
        this.courseName = value;
    }

    /**
     * The family or group of forked courses that the course is part of.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseFamily() {
        return courseFamily;
    }

    /**
     * Sets the value of the courseFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCourseFamily()
     */
    public void setCourseFamily(String value) {
        this.courseFamily = value;
    }

    /**
     * Container element for custom elements from other schemas.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     * @see #getExtensions()
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

}

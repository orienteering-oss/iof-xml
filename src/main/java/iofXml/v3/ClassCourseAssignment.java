
package iofXml.v3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Element that connects a course with a class. Courses should be present in the RaceCourseData element and are matched on course name and/or course family. Classes are matched by 1) Id, 2) Name.
 * 
 * <p>Java class for ClassCourseAssignment complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClassCourseAssignment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClassId" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="AllowedOnLeg" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CourseFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="numberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassCourseAssignment", propOrder = {
    "classId",
    "className",
    "allowedOnLeg",
    "courseName",
    "courseFamily",
    "extensions"
})
public class ClassCourseAssignment {

    /**
     * The id of the class.
     * 
     */
    @XmlElement(name = "ClassId")
    protected Id classId;
    /**
     * The name of the class.
     * 
     */
    @XmlElement(name = "ClassName", required = true)
    protected String className;
    /**
     * The legs that the course can be assigned to in a relay class. This element can be omitted for individual classes.
     * 
     */
    @XmlElement(name = "AllowedOnLeg")
    protected List<BigInteger> allowedOnLeg;
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
     * The number of competitors in the class. A competitor corresponds to a person (if an individual event) or a team (if a team or relay event).
     * 
     */
    @XmlAttribute(name = "numberOfCompetitors")
    protected BigInteger numberOfCompetitors;

    /**
     * The id of the class.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     * @see #getClassId()
     */
    public void setClassId(Id value) {
        this.classId = value;
    }

    /**
     * The name of the class.
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
     * The legs that the course can be assigned to in a relay class. This element can be omitted for individual classes.
     * 
     * Gets the value of the allowedOnLeg property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedOnLeg property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAllowedOnLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * </p>
     * 
     * 
     * @return
     *     The value of the allowedOnLeg property.
     */
    public List<BigInteger> getAllowedOnLeg() {
        if (allowedOnLeg == null) {
            allowedOnLeg = new ArrayList<>();
        }
        return this.allowedOnLeg;
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

    /**
     * The number of competitors in the class. A competitor corresponds to a person (if an individual event) or a team (if a team or relay event).
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCompetitors() {
        return numberOfCompetitors;
    }

    /**
     * Sets the value of the numberOfCompetitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getNumberOfCompetitors()
     */
    public void setNumberOfCompetitors(BigInteger value) {
        this.numberOfCompetitors = value;
    }

}

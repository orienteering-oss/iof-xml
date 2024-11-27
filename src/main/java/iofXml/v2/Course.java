
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{}CourseName"/>
 *         <element ref="{}CourseId" minOccurs="0"/>
 *         <element ref="{}EventId" minOccurs="0"/>
 *         <element ref="{}EventRaceId" minOccurs="0"/>
 *         <choice maxOccurs="unbounded" minOccurs="0">
 *           <element ref="{}ClassId"/>
 *           <element ref="{}ClassShortName"/>
 *         </choice>
 *         <element ref="{}CourseVariation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}CourseSectionList" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "courseName",
    "courseId",
    "eventId",
    "eventRaceId",
    "classIdOrClassShortName",
    "courseVariation",
    "courseSectionList"
})
@XmlRootElement(name = "Course")
public class Course {

    @XmlElement(name = "CourseName", required = true)
    protected String courseName;
    @XmlElement(name = "CourseId")
    protected String courseId;
    @XmlElement(name = "EventId")
    protected EventId eventId;
    @XmlElement(name = "EventRaceId")
    protected String eventRaceId;
    @XmlElements({
        @XmlElement(name = "ClassId", type = ClassId.class),
        @XmlElement(name = "ClassShortName", type = ClassShortName.class)
    })
    protected List<Object> classIdOrClassShortName;
    @XmlElement(name = "CourseVariation")
    protected List<CourseVariation> courseVariation;
    @XmlElement(name = "CourseSectionList")
    protected CourseSectionList courseSectionList;

    /**
     * Gets the value of the courseName property.
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
     */
    public void setCourseName(String value) {
        this.courseName = value;
    }

    /**
     * Gets the value of the courseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * Sets the value of the courseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseId(String value) {
        this.courseId = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link EventId }
     *     
     */
    public EventId getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventId }
     *     
     */
    public void setEventId(EventId value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the eventRaceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventRaceId() {
        return eventRaceId;
    }

    /**
     * Sets the value of the eventRaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventRaceId(String value) {
        this.eventRaceId = value;
    }

    /**
     * Gets the value of the classIdOrClassShortName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classIdOrClassShortName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClassIdOrClassShortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassId }
     * {@link ClassShortName }
     * </p>
     * 
     * 
     * @return
     *     The value of the classIdOrClassShortName property.
     */
    public List<Object> getClassIdOrClassShortName() {
        if (classIdOrClassShortName == null) {
            classIdOrClassShortName = new ArrayList<>();
        }
        return this.classIdOrClassShortName;
    }

    /**
     * Gets the value of the courseVariation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseVariation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCourseVariation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseVariation }
     * </p>
     * 
     * 
     * @return
     *     The value of the courseVariation property.
     */
    public List<CourseVariation> getCourseVariation() {
        if (courseVariation == null) {
            courseVariation = new ArrayList<>();
        }
        return this.courseVariation;
    }

    /**
     * Gets the value of the courseSectionList property.
     * 
     * @return
     *     possible object is
     *     {@link CourseSectionList }
     *     
     */
    public CourseSectionList getCourseSectionList() {
        return courseSectionList;
    }

    /**
     * Sets the value of the courseSectionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseSectionList }
     *     
     */
    public void setCourseSectionList(CourseSectionList value) {
        this.courseSectionList = value;
    }

}

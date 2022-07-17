
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{}CourseName"/&amp;gt;
 *         &amp;lt;element ref="{}CourseId" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}EventId" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}EventRaceId" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;element ref="{}ClassId"/&amp;gt;
 *           &amp;lt;element ref="{}ClassShortName"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element ref="{}CourseVariation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}CourseSectionList" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the classIdOrClassShortName property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getClassIdOrClassShortName().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ClassId }
     * {@link ClassShortName }
     * 
     * 
     */
    public List<Object> getClassIdOrClassShortName() {
        if (classIdOrClassShortName == null) {
            classIdOrClassShortName = new ArrayList<Object>();
        }
        return this.classIdOrClassShortName;
    }

    /**
     * Gets the value of the courseVariation property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the courseVariation property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCourseVariation().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link CourseVariation }
     * 
     * 
     */
    public List<CourseVariation> getCourseVariation() {
        if (courseVariation == null) {
            courseVariation = new ArrayList<CourseVariation>();
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

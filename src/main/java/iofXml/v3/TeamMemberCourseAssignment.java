
package iofXml.v3;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Element that connects a course with a relay team member. Courses should be present in the RaceCourseData element and are matched on course name and/or course family. Team members are matched by 1) BibNumber, 2) Leg and LegOrder, 3) EntryId.
 * 
 * <p>Java class for TeamMemberCourseAssignment complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TeamMemberCourseAssignment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntryId" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Leg" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="LegOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="TeamMemberName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TeamMemberCourseAssignment", propOrder = {
    "entryId",
    "bibNumber",
    "leg",
    "legOrder",
    "teamMemberName",
    "courseName",
    "courseFamily",
    "extensions"
})
public class TeamMemberCourseAssignment {

    /**
     * The id corresponding to this person's entry in an EntryList.
     * 
     */
    @XmlElement(name = "EntryId")
    protected Id entryId;
    /**
     * The bib number of the person or the team that the person belongs to. Omit if the bib number is specified in the TeamCourseAssignment element.
     * 
     */
    @XmlElement(name = "BibNumber")
    protected String bibNumber;
    /**
     * For relay entries, the number of the leg that the person is taking part in.
     * 
     */
    @XmlElement(name = "Leg")
    protected BigInteger leg;
    /**
     * Defines the person's starting order within a team at a parallel relay leg.
     * 
     */
    @XmlElement(name = "LegOrder")
    protected BigInteger legOrder;
    /**
     * The name of the person.
     * 
     */
    @XmlElement(name = "TeamMemberName")
    protected String teamMemberName;
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
     * The bib number of the person or the team that the person belongs to. Omit if the bib number is specified in the TeamCourseAssignment element.
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
     * For relay entries, the number of the leg that the person is taking part in.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeg() {
        return leg;
    }

    /**
     * Sets the value of the leg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getLeg()
     */
    public void setLeg(BigInteger value) {
        this.leg = value;
    }

    /**
     * Defines the person's starting order within a team at a parallel relay leg.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLegOrder() {
        return legOrder;
    }

    /**
     * Sets the value of the legOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getLegOrder()
     */
    public void setLegOrder(BigInteger value) {
        this.legOrder = value;
    }

    /**
     * The name of the person.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamMemberName() {
        return teamMemberName;
    }

    /**
     * Sets the value of the teamMemberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTeamMemberName()
     */
    public void setTeamMemberName(String value) {
        this.teamMemberName = value;
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

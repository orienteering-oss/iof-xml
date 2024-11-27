
package iofXml.v3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Element that connects a number of team members in a relay team to a number of courses. Teams are matched by 1) BibNumber, 2) TeamName+ClassName.
 * 
 * <p>Java class for TeamCourseAssignment complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TeamCourseAssignment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TeamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TeamMemberCourseAssignment" type="{http://www.orienteering.org/datastandard/3.0}TeamMemberCourseAssignment" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TeamCourseAssignment", propOrder = {
    "bibNumber",
    "teamName",
    "className",
    "teamMemberCourseAssignment",
    "extensions"
})
public class TeamCourseAssignment {

    /**
     * The bib number of the team.
     * 
     */
    @XmlElement(name = "BibNumber")
    protected String bibNumber;
    /**
     * The name of the team.
     * 
     */
    @XmlElement(name = "TeamName")
    protected String teamName;
    /**
     * The name of the class that the team belongs to.
     * 
     */
    @XmlElement(name = "ClassName")
    protected String className;
    /**
     * The assignment of courses to team members.
     * 
     */
    @XmlElement(name = "TeamMemberCourseAssignment")
    protected List<TeamMemberCourseAssignment> teamMemberCourseAssignment;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * The bib number of the team.
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
     * The name of the team.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the value of the teamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTeamName()
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

    /**
     * The name of the class that the team belongs to.
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
     * The assignment of courses to team members.
     * 
     * Gets the value of the teamMemberCourseAssignment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamMemberCourseAssignment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTeamMemberCourseAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMemberCourseAssignment }
     * </p>
     * 
     * 
     * @return
     *     The value of the teamMemberCourseAssignment property.
     */
    public List<TeamMemberCourseAssignment> getTeamMemberCourseAssignment() {
        if (teamMemberCourseAssignment == null) {
            teamMemberCourseAssignment = new ArrayList<>();
        }
        return this.teamMemberCourseAssignment;
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

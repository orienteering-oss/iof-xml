
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
 * This element defines all the control and course information for a race.
 * 
 * <p>Java class for RaceCourseData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RaceCourseData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Map" type="{http://www.orienteering.org/datastandard/3.0}Map" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Control" type="{http://www.orienteering.org/datastandard/3.0}Control" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Course" type="{http://www.orienteering.org/datastandard/3.0}Course" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ClassCourseAssignment" type="{http://www.orienteering.org/datastandard/3.0}ClassCourseAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PersonCourseAssignment" type="{http://www.orienteering.org/datastandard/3.0}PersonCourseAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TeamCourseAssignment" type="{http://www.orienteering.org/datastandard/3.0}TeamCourseAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RaceCourseData", propOrder = {
    "map",
    "control",
    "course",
    "classCourseAssignment",
    "personCourseAssignment",
    "teamCourseAssignment",
    "extensions"
})
public class RaceCourseData {

    /**
     * The map(s) used in this race. Usually just one map, but different courses may use different scales and/or areas.
     * 
     */
    @XmlElement(name = "Map")
    protected List<Map> map;
    /**
     * All controls of the race.
     * 
     */
    @XmlElement(name = "Control")
    protected List<Control> control;
    /**
     * All courses of the race.
     * 
     */
    @XmlElement(name = "Course")
    protected List<Course> course;
    /**
     * The assignment of courses to classes.
     * 
     */
    @XmlElement(name = "ClassCourseAssignment")
    protected List<ClassCourseAssignment> classCourseAssignment;
    /**
     * The assignment of courses to individual competitors.
     * 
     */
    @XmlElement(name = "PersonCourseAssignment")
    protected List<PersonCourseAssignment> personCourseAssignment;
    /**
     * The assignment of courses to relay team members teams.
     * 
     */
    @XmlElement(name = "TeamCourseAssignment")
    protected List<TeamCourseAssignment> teamCourseAssignment;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    /**
     * The ordinal number of the race that the information belongs to for a multi-race event, starting at 1.
     * 
     */
    @XmlAttribute(name = "raceNumber")
    protected BigInteger raceNumber;

    /**
     * The map(s) used in this race. Usually just one map, but different courses may use different scales and/or areas.
     * 
     * Gets the value of the map property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the map property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Map }
     * </p>
     * 
     * 
     * @return
     *     The value of the map property.
     */
    public List<Map> getMap() {
        if (map == null) {
            map = new ArrayList<>();
        }
        return this.map;
    }

    /**
     * All controls of the race.
     * 
     * Gets the value of the control property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the control property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Control }
     * </p>
     * 
     * 
     * @return
     *     The value of the control property.
     */
    public List<Control> getControl() {
        if (control == null) {
            control = new ArrayList<>();
        }
        return this.control;
    }

    /**
     * All courses of the race.
     * 
     * Gets the value of the course property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the course property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCourse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Course }
     * </p>
     * 
     * 
     * @return
     *     The value of the course property.
     */
    public List<Course> getCourse() {
        if (course == null) {
            course = new ArrayList<>();
        }
        return this.course;
    }

    /**
     * The assignment of courses to classes.
     * 
     * Gets the value of the classCourseAssignment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCourseAssignment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClassCourseAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassCourseAssignment }
     * </p>
     * 
     * 
     * @return
     *     The value of the classCourseAssignment property.
     */
    public List<ClassCourseAssignment> getClassCourseAssignment() {
        if (classCourseAssignment == null) {
            classCourseAssignment = new ArrayList<>();
        }
        return this.classCourseAssignment;
    }

    /**
     * The assignment of courses to individual competitors.
     * 
     * Gets the value of the personCourseAssignment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personCourseAssignment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPersonCourseAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonCourseAssignment }
     * </p>
     * 
     * 
     * @return
     *     The value of the personCourseAssignment property.
     */
    public List<PersonCourseAssignment> getPersonCourseAssignment() {
        if (personCourseAssignment == null) {
            personCourseAssignment = new ArrayList<>();
        }
        return this.personCourseAssignment;
    }

    /**
     * The assignment of courses to relay team members teams.
     * 
     * Gets the value of the teamCourseAssignment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamCourseAssignment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTeamCourseAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamCourseAssignment }
     * </p>
     * 
     * 
     * @return
     *     The value of the teamCourseAssignment property.
     */
    public List<TeamCourseAssignment> getTeamCourseAssignment() {
        if (teamCourseAssignment == null) {
            teamCourseAssignment = new ArrayList<>();
        }
        return this.teamCourseAssignment;
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
     * The ordinal number of the race that the information belongs to for a multi-race event, starting at 1.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRaceNumber() {
        return raceNumber;
    }

    /**
     * Sets the value of the raceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getRaceNumber()
     */
    public void setRaceNumber(BigInteger value) {
        this.raceNumber = value;
    }

}

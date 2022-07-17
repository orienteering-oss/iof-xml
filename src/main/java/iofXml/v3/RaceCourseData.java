
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
 * 
 *         This element defines all the control and course information for a race.
 *       
 * 
 * <p>Java class for RaceCourseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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

    @XmlElement(name = "Map")
    protected List<Map> map;
    @XmlElement(name = "Control")
    protected List<Control> control;
    @XmlElement(name = "Course")
    protected List<Course> course;
    @XmlElement(name = "ClassCourseAssignment")
    protected List<ClassCourseAssignment> classCourseAssignment;
    @XmlElement(name = "PersonCourseAssignment")
    protected List<PersonCourseAssignment> personCourseAssignment;
    @XmlElement(name = "TeamCourseAssignment")
    protected List<TeamCourseAssignment> teamCourseAssignment;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "raceNumber")
    protected BigInteger raceNumber;

    /**
     * Gets the value of the map property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the map property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Map }
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
     * Gets the value of the control property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the control property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Control }
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
     * Gets the value of the course property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the course property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Course }
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
     * Gets the value of the classCourseAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classCourseAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCourseAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassCourseAssignment }
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
     * Gets the value of the personCourseAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the personCourseAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonCourseAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonCourseAssignment }
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
     * Gets the value of the teamCourseAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the teamCourseAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamCourseAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamCourseAssignment }
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
     * Gets the value of the extensions property.
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
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the raceNumber property.
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
     */
    public void setRaceNumber(BigInteger value) {
        this.raceNumber = value;
    }

}

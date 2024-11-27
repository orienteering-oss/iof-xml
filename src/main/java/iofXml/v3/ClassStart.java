
package iofXml.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The start list of a single class containing either individual start times or team start times.
 * 
 * <p>Java class for ClassStart complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClassStart">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Class" type="{http://www.orienteering.org/datastandard/3.0}Class"/>
 *         <element name="Course" type="{http://www.orienteering.org/datastandard/3.0}SimpleRaceCourse" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="StartName" type="{http://www.orienteering.org/datastandard/3.0}StartName" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PersonStart" type="{http://www.orienteering.org/datastandard/3.0}PersonStart" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TeamStart" type="{http://www.orienteering.org/datastandard/3.0}TeamStart" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="timeResolution" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
 *       <attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassStart", propOrder = {
    "clazz",
    "course",
    "startName",
    "personStart",
    "teamStart",
    "extensions"
})
public class ClassStart {

    /**
     * The class that the start list belongs to.
     * 
     */
    @XmlElement(name = "Class", required = true)
    protected Class clazz;
    /**
     * Defines the course assigned to the class. If courses are unique per competitor, use PersonStart/Course or TeamStart/TeamMemberStart/Course instead. One element per race.
     * 
     */
    @XmlElement(name = "Course")
    protected List<SimpleRaceCourse> course;
    /**
     * Defines the name of the start place (e.g. Start 1), if the race has multiple start places. One element per race.
     * 
     */
    @XmlElement(name = "StartName")
    protected List<StartName> startName;
    /**
     * Start times for individual competitors in the class.
     * 
     */
    @XmlElement(name = "PersonStart")
    protected List<PersonStart> personStart;
    /**
     * Start times for teams in the class.
     * 
     */
    @XmlElement(name = "TeamStart")
    protected List<TeamStart> teamStart;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    /**
     * The time resolution of the start times, normally 1. For tenths of a second, use 0.1.
     * 
     */
    @XmlAttribute(name = "timeResolution")
    protected Double timeResolution;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * The class that the start list belongs to.
     * 
     * @return
     *     possible object is
     *     {@link Class }
     *     
     */
    public Class getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Class }
     *     
     * @see #getClazz()
     */
    public void setClazz(Class value) {
        this.clazz = value;
    }

    /**
     * Defines the course assigned to the class. If courses are unique per competitor, use PersonStart/Course or TeamStart/TeamMemberStart/Course instead. One element per race.
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
     * {@link SimpleRaceCourse }
     * </p>
     * 
     * 
     * @return
     *     The value of the course property.
     */
    public List<SimpleRaceCourse> getCourse() {
        if (course == null) {
            course = new ArrayList<>();
        }
        return this.course;
    }

    /**
     * Defines the name of the start place (e.g. Start 1), if the race has multiple start places. One element per race.
     * 
     * Gets the value of the startName property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStartName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StartName }
     * </p>
     * 
     * 
     * @return
     *     The value of the startName property.
     */
    public List<StartName> getStartName() {
        if (startName == null) {
            startName = new ArrayList<>();
        }
        return this.startName;
    }

    /**
     * Start times for individual competitors in the class.
     * 
     * Gets the value of the personStart property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personStart property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPersonStart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonStart }
     * </p>
     * 
     * 
     * @return
     *     The value of the personStart property.
     */
    public List<PersonStart> getPersonStart() {
        if (personStart == null) {
            personStart = new ArrayList<>();
        }
        return this.personStart;
    }

    /**
     * Start times for teams in the class.
     * 
     * Gets the value of the teamStart property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamStart property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTeamStart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamStart }
     * </p>
     * 
     * 
     * @return
     *     The value of the teamStart property.
     */
    public List<TeamStart> getTeamStart() {
        if (teamStart == null) {
            teamStart = new ArrayList<>();
        }
        return this.teamStart;
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
     * The time resolution of the start times, normally 1. For tenths of a second, use 0.1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getTimeResolution() {
        if (timeResolution == null) {
            return  1.0D;
        } else {
            return timeResolution;
        }
    }

    /**
     * Sets the value of the timeResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     * @see #getTimeResolution()
     */
    public void setTimeResolution(Double value) {
        this.timeResolution = value;
    }

    /**
     * Gets the value of the modifyTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifyTime() {
        return modifyTime;
    }

    /**
     * Sets the value of the modifyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifyTime(XMLGregorianCalendar value) {
        this.modifyTime = value;
    }

}

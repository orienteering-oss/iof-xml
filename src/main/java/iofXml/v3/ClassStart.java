
package iofXml.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         The start list of a single class containing either individual start times or team start times.
 *       
 * 
 * &lt;p&gt;Java class for ClassStart complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ClassStart"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Class" type="{http://www.orienteering.org/datastandard/3.0}Class"/&amp;gt;
 *         &amp;lt;element name="Course" type="{http://www.orienteering.org/datastandard/3.0}SimpleRaceCourse" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StartName" type="{http://www.orienteering.org/datastandard/3.0}StartName" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PersonStart" type="{http://www.orienteering.org/datastandard/3.0}PersonStart" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TeamStart" type="{http://www.orienteering.org/datastandard/3.0}TeamStart" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="timeResolution" type="{http://www.w3.org/2001/XMLSchema}double" default="1" /&amp;gt;
 *       &amp;lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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

    @XmlElement(name = "Class", required = true)
    protected Class clazz;
    @XmlElement(name = "Course")
    protected List<SimpleRaceCourse> course;
    @XmlElement(name = "StartName")
    protected List<StartName> startName;
    @XmlElement(name = "PersonStart")
    protected List<PersonStart> personStart;
    @XmlElement(name = "TeamStart")
    protected List<TeamStart> teamStart;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "timeResolution")
    protected Double timeResolution;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * Gets the value of the clazz property.
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
     */
    public void setClazz(Class value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the course property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the course property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCourse().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleRaceCourse }
     * 
     * 
     */
    public List<SimpleRaceCourse> getCourse() {
        if (course == null) {
            course = new ArrayList<SimpleRaceCourse>();
        }
        return this.course;
    }

    /**
     * Gets the value of the startName property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the startName property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getStartName().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link StartName }
     * 
     * 
     */
    public List<StartName> getStartName() {
        if (startName == null) {
            startName = new ArrayList<StartName>();
        }
        return this.startName;
    }

    /**
     * Gets the value of the personStart property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the personStart property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPersonStart().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PersonStart }
     * 
     * 
     */
    public List<PersonStart> getPersonStart() {
        if (personStart == null) {
            personStart = new ArrayList<PersonStart>();
        }
        return this.personStart;
    }

    /**
     * Gets the value of the teamStart property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the teamStart property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTeamStart().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TeamStart }
     * 
     * 
     */
    public List<TeamStart> getTeamStart() {
        if (teamStart == null) {
            teamStart = new ArrayList<TeamStart>();
        }
        return this.teamStart;
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
     * Gets the value of the timeResolution property.
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

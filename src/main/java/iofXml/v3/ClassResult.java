
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
 * The result list for a single class containing either individual results or team results.
 * 
 * <p>Java class for ClassResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClassResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Class" type="{http://www.orienteering.org/datastandard/3.0}Class"/>
 *         <element name="Course" type="{http://www.orienteering.org/datastandard/3.0}SimpleRaceCourse" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PersonResult" type="{http://www.orienteering.org/datastandard/3.0}PersonResult" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TeamResult" type="{http://www.orienteering.org/datastandard/3.0}TeamResult" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ClassResult", propOrder = {
    "clazz",
    "course",
    "personResult",
    "teamResult",
    "extensions"
})
public class ClassResult {

    /**
     * The class that the result list belongs to.
     * 
     */
    @XmlElement(name = "Class", required = true)
    protected Class clazz;
    /**
     * Defines the course assigned to the class. If courses are unique per competitor, use PersonResult/Course or TeamResult/TeamMemberResult/Course instead. One element per race.
     * 
     */
    @XmlElement(name = "Course")
    protected List<SimpleRaceCourse> course;
    /**
     * Results for individual competitors in the class.
     * 
     */
    @XmlElement(name = "PersonResult")
    protected List<PersonResult> personResult;
    /**
     * Results for teams in the class.
     * 
     */
    @XmlElement(name = "TeamResult")
    protected List<TeamResult> teamResult;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    /**
     * The time resolution of the results, normally 1. For tenths of a second, use 0.1.
     * 
     */
    @XmlAttribute(name = "timeResolution")
    protected Double timeResolution;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * The class that the result list belongs to.
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
     * Defines the course assigned to the class. If courses are unique per competitor, use PersonResult/Course or TeamResult/TeamMemberResult/Course instead. One element per race.
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
     * Results for individual competitors in the class.
     * 
     * Gets the value of the personResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPersonResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the personResult property.
     */
    public List<PersonResult> getPersonResult() {
        if (personResult == null) {
            personResult = new ArrayList<>();
        }
        return this.personResult;
    }

    /**
     * Results for teams in the class.
     * 
     * Gets the value of the teamResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTeamResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the teamResult property.
     */
    public List<TeamResult> getTeamResult() {
        if (teamResult == null) {
            teamResult = new ArrayList<>();
        }
        return this.teamResult;
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
     * The time resolution of the results, normally 1. For tenths of a second, use 0.1.
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

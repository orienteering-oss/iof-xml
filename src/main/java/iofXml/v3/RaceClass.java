
package iofXml.v3;

import java.math.BigInteger;
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
 * Information about a class with respect to a race.
 * 
 * <p>Java class for RaceClass complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RaceClass">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PunchingSystem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TeamFee" type="{http://www.orienteering.org/datastandard/3.0}Fee" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Fee" type="{http://www.orienteering.org/datastandard/3.0}Fee" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FirstStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Status" type="{http://www.orienteering.org/datastandard/3.0}RaceClassStatus" minOccurs="0"/>
 *         <element name="Course" type="{http://www.orienteering.org/datastandard/3.0}SimpleCourse" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OnlineControl" type="{http://www.orienteering.org/datastandard/3.0}Control" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="maxNumberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RaceClass", propOrder = {
    "punchingSystem",
    "teamFee",
    "fee",
    "firstStart",
    "status",
    "course",
    "onlineControl",
    "extensions"
})
public class RaceClass {

    /**
     * The punching system used for the class at the race. Multiple punching systems can be specified, e.g. one for punch checking and another for timing.
     * 
     */
    @XmlElement(name = "PunchingSystem")
    protected List<String> punchingSystem;
    /**
     * The entry fees for a team as a whole taking part in this class. Use the Fee element to specify a fee for an individual competitor in the team. Use the TeamFee subelement of the Class element to specify a fee on event level.
     * 
     */
    @XmlElement(name = "TeamFee")
    protected List<Fee> teamFee;
    /**
     * The entry fees for an individual competitor taking part in the race class. Use the TeamFee element to specify a fee for the team as a whole. Use the Fee subelement of the Class element to specify a fee on event level.
     * 
     */
    @XmlElement(name = "Fee")
    protected List<Fee> fee;
    @XmlElement(name = "FirstStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstStart;
    /**
     * The status of the race, e.g. if results should be considered invalid due to misplaced constrols.
     * 
     */
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "NMTOKEN")
    protected RaceClassStatus status;
    /**
     * The courses assigned to this class. For a mass-start event or a relay event, there are usually multiple courses per class due to the usage of spreading methods.
     * 
     */
    @XmlElement(name = "Course")
    protected List<SimpleCourse> course;
    /**
     * The controls that are online controls for this class.
     * 
     */
    @XmlElement(name = "OnlineControl")
    protected List<Control> onlineControl;
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
     * The maximum number of competitors that are allowed to take part in the race class. A competitor corresponds to a person (if an individual event) or a team (if a team or relay event). This attribute overrides the maxNumberOfCompetitors attribute in the Class element.
     * 
     */
    @XmlAttribute(name = "maxNumberOfCompetitors")
    protected BigInteger maxNumberOfCompetitors;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * The punching system used for the class at the race. Multiple punching systems can be specified, e.g. one for punch checking and another for timing.
     * 
     * Gets the value of the punchingSystem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the punchingSystem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPunchingSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the punchingSystem property.
     */
    public List<String> getPunchingSystem() {
        if (punchingSystem == null) {
            punchingSystem = new ArrayList<>();
        }
        return this.punchingSystem;
    }

    /**
     * The entry fees for a team as a whole taking part in this class. Use the Fee element to specify a fee for an individual competitor in the team. Use the TeamFee subelement of the Class element to specify a fee on event level.
     * 
     * Gets the value of the teamFee property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamFee property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTeamFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
     * </p>
     * 
     * 
     * @return
     *     The value of the teamFee property.
     */
    public List<Fee> getTeamFee() {
        if (teamFee == null) {
            teamFee = new ArrayList<>();
        }
        return this.teamFee;
    }

    /**
     * The entry fees for an individual competitor taking part in the race class. Use the TeamFee element to specify a fee for the team as a whole. Use the Fee subelement of the Class element to specify a fee on event level.
     * 
     * Gets the value of the fee property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
     * </p>
     * 
     * 
     * @return
     *     The value of the fee property.
     */
    public List<Fee> getFee() {
        if (fee == null) {
            fee = new ArrayList<>();
        }
        return this.fee;
    }

    /**
     * Gets the value of the firstStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstStart() {
        return firstStart;
    }

    /**
     * Sets the value of the firstStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstStart(XMLGregorianCalendar value) {
        this.firstStart = value;
    }

    /**
     * The status of the race, e.g. if results should be considered invalid due to misplaced constrols.
     * 
     * @return
     *     possible object is
     *     {@link RaceClassStatus }
     *     
     */
    public RaceClassStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link RaceClassStatus }
     *     
     * @see #getStatus()
     */
    public void setStatus(RaceClassStatus value) {
        this.status = value;
    }

    /**
     * The courses assigned to this class. For a mass-start event or a relay event, there are usually multiple courses per class due to the usage of spreading methods.
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
     * {@link SimpleCourse }
     * </p>
     * 
     * 
     * @return
     *     The value of the course property.
     */
    public List<SimpleCourse> getCourse() {
        if (course == null) {
            course = new ArrayList<>();
        }
        return this.course;
    }

    /**
     * The controls that are online controls for this class.
     * 
     * Gets the value of the onlineControl property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onlineControl property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOnlineControl().add(newItem);
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
     *     The value of the onlineControl property.
     */
    public List<Control> getOnlineControl() {
        if (onlineControl == null) {
            onlineControl = new ArrayList<>();
        }
        return this.onlineControl;
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

    /**
     * The maximum number of competitors that are allowed to take part in the race class. A competitor corresponds to a person (if an individual event) or a team (if a team or relay event). This attribute overrides the maxNumberOfCompetitors attribute in the Class element.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfCompetitors() {
        return maxNumberOfCompetitors;
    }

    /**
     * Sets the value of the maxNumberOfCompetitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaxNumberOfCompetitors()
     */
    public void setMaxNumberOfCompetitors(BigInteger value) {
        this.maxNumberOfCompetitors = value;
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


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
 * 
 *         Information about a class with respect to a race.
 *       
 * 
 * <p>Java class for RaceClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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

    @XmlElement(name = "PunchingSystem")
    protected List<String> punchingSystem;
    @XmlElement(name = "TeamFee")
    protected List<Fee> teamFee;
    @XmlElement(name = "Fee")
    protected List<Fee> fee;
    @XmlElement(name = "FirstStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstStart;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "NMTOKEN")
    protected RaceClassStatus status;
    @XmlElement(name = "Course")
    protected List<SimpleCourse> course;
    @XmlElement(name = "OnlineControl")
    protected List<Control> onlineControl;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "raceNumber")
    protected BigInteger raceNumber;
    @XmlAttribute(name = "maxNumberOfCompetitors")
    protected BigInteger maxNumberOfCompetitors;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * Gets the value of the punchingSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the punchingSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPunchingSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
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
     * Gets the value of the teamFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the teamFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
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
     * Gets the value of the fee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
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
     * Gets the value of the status property.
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
     */
    public void setStatus(RaceClassStatus value) {
        this.status = value;
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
     * {@link SimpleCourse }
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
     * Gets the value of the onlineControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the onlineControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnlineControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Control }
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

    /**
     * Gets the value of the maxNumberOfCompetitors property.
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

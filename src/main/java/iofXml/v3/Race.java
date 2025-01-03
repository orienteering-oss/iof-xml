
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
 * An event consists of a number of races. The number is equal to the number of times a competitor should start.
 * 
 * <p>Java class for Race complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Race">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RaceNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="StartTime" type="{http://www.orienteering.org/datastandard/3.0}DateAndOptionalTime" minOccurs="0"/>
 *         <element name="EndTime" type="{http://www.orienteering.org/datastandard/3.0}DateAndOptionalTime" minOccurs="0"/>
 *         <element name="Status" type="{http://www.orienteering.org/datastandard/3.0}EventStatus" minOccurs="0"/>
 *         <element name="Classification" type="{http://www.orienteering.org/datastandard/3.0}EventClassification" minOccurs="0"/>
 *         <element name="Position" type="{http://www.orienteering.org/datastandard/3.0}GeoPosition" minOccurs="0"/>
 *         <element name="Discipline" type="{http://www.orienteering.org/datastandard/3.0}RaceDiscipline" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Organiser" type="{http://www.orienteering.org/datastandard/3.0}Organisation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Official" type="{http://www.orienteering.org/datastandard/3.0}Role" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Service" type="{http://www.orienteering.org/datastandard/3.0}Service" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="URL" type="{http://www.orienteering.org/datastandard/3.0}EventURL" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Race", propOrder = {
    "raceNumber",
    "name",
    "startTime",
    "endTime",
    "status",
    "classification",
    "position",
    "discipline",
    "organiser",
    "official",
    "service",
    "url",
    "extensions"
})
public class Race {

    /**
     * The ordinal number of the race in the multi-race event, starting at 1.
     * 
     */
    @XmlElement(name = "RaceNumber", required = true)
    protected BigInteger raceNumber;
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * The start time for the first starting competitor of the race.
     * 
     */
    @XmlElement(name = "StartTime")
    protected DateAndOptionalTime startTime;
    /**
     * The time when the finish closes.
     * 
     */
    @XmlElement(name = "EndTime")
    protected DateAndOptionalTime endTime;
    /**
     * The status of the race. This element overrides the Status element of the parent Event element.
     * 
     */
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "NMTOKEN")
    protected EventStatus status;
    /**
     * The classification or level of the race. This element overrides the Classification element of the parent Event element.
     * 
     */
    @XmlElement(name = "Classification")
    @XmlSchemaType(name = "NMTOKEN")
    protected EventClassification classification;
    /**
     * The geographical location of the arena.
     * 
     */
    @XmlElement(name = "Position")
    protected GeoPosition position;
    @XmlElement(name = "Discipline")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<RaceDiscipline> discipline;
    /**
     * The organisations that organise the event.
     * 
     */
    @XmlElement(name = "Organiser")
    protected List<Organisation> organiser;
    /**
     * The main officials of the event, e.g. course setter and event president.
     * 
     */
    @XmlElement(name = "Official")
    protected List<Role> official;
    /**
     * The services available for the race, e.g. accomodation and transport.
     * 
     */
    @XmlElement(name = "Service")
    protected List<Service> service;
    /**
     * URLs to various types of additional information regarding the event, e.g. event website or result list.
     * 
     */
    @XmlElement(name = "URL")
    protected List<EventURL> url;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * The ordinal number of the race in the multi-race event, starting at 1.
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * The start time for the first starting competitor of the race.
     * 
     * @return
     *     possible object is
     *     {@link DateAndOptionalTime }
     *     
     */
    public DateAndOptionalTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndOptionalTime }
     *     
     * @see #getStartTime()
     */
    public void setStartTime(DateAndOptionalTime value) {
        this.startTime = value;
    }

    /**
     * The time when the finish closes.
     * 
     * @return
     *     possible object is
     *     {@link DateAndOptionalTime }
     *     
     */
    public DateAndOptionalTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndOptionalTime }
     *     
     * @see #getEndTime()
     */
    public void setEndTime(DateAndOptionalTime value) {
        this.endTime = value;
    }

    /**
     * The status of the race. This element overrides the Status element of the parent Event element.
     * 
     * @return
     *     possible object is
     *     {@link EventStatus }
     *     
     */
    public EventStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatus }
     *     
     * @see #getStatus()
     */
    public void setStatus(EventStatus value) {
        this.status = value;
    }

    /**
     * The classification or level of the race. This element overrides the Classification element of the parent Event element.
     * 
     * @return
     *     possible object is
     *     {@link EventClassification }
     *     
     */
    public EventClassification getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClassification }
     *     
     * @see #getClassification()
     */
    public void setClassification(EventClassification value) {
        this.classification = value;
    }

    /**
     * The geographical location of the arena.
     * 
     * @return
     *     possible object is
     *     {@link GeoPosition }
     *     
     */
    public GeoPosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoPosition }
     *     
     * @see #getPosition()
     */
    public void setPosition(GeoPosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the discipline property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discipline property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiscipline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RaceDiscipline }
     * </p>
     * 
     * 
     * @return
     *     The value of the discipline property.
     */
    public List<RaceDiscipline> getDiscipline() {
        if (discipline == null) {
            discipline = new ArrayList<>();
        }
        return this.discipline;
    }

    /**
     * The organisations that organise the event.
     * 
     * Gets the value of the organiser property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organiser property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrganiser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation }
     * </p>
     * 
     * 
     * @return
     *     The value of the organiser property.
     */
    public List<Organisation> getOrganiser() {
        if (organiser == null) {
            organiser = new ArrayList<>();
        }
        return this.organiser;
    }

    /**
     * The main officials of the event, e.g. course setter and event president.
     * 
     * Gets the value of the official property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the official property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOfficial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Role }
     * </p>
     * 
     * 
     * @return
     *     The value of the official property.
     */
    public List<Role> getOfficial() {
        if (official == null) {
            official = new ArrayList<>();
        }
        return this.official;
    }

    /**
     * The services available for the race, e.g. accomodation and transport.
     * 
     * Gets the value of the service property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Service }
     * </p>
     * 
     * 
     * @return
     *     The value of the service property.
     */
    public List<Service> getService() {
        if (service == null) {
            service = new ArrayList<>();
        }
        return this.service;
    }

    /**
     * URLs to various types of additional information regarding the event, e.g. event website or result list.
     * 
     * Gets the value of the url property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventURL }
     * </p>
     * 
     * 
     * @return
     *     The value of the url property.
     */
    public List<EventURL> getURL() {
        if (url == null) {
            url = new ArrayList<>();
        }
        return this.url;
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

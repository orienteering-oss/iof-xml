
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
 * Defines an event entry for a person.
 * 
 * <p>Java class for PersonEntry complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PersonEntry">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person"/>
 *         <element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" minOccurs="0"/>
 *         <element name="ControlCard" type="{http://www.orienteering.org/datastandard/3.0}ControlCard" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Score" type="{http://www.orienteering.org/datastandard/3.0}Score" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Class" type="{http://www.orienteering.org/datastandard/3.0}Class" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RaceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="StartTimeAllocationRequest" type="{http://www.orienteering.org/datastandard/3.0}StartTimeAllocationRequest" minOccurs="0"/>
 *         <element name="EntryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "PersonEntry", propOrder = {
    "id",
    "person",
    "organisation",
    "controlCard",
    "score",
    "clazz",
    "raceNumber",
    "assignedFee",
    "serviceRequest",
    "startTimeAllocationRequest",
    "entryTime",
    "extensions"
})
public class PersonEntry {

    @XmlElement(name = "Id")
    protected Id id;
    /**
     * The person that is entered.
     * 
     */
    @XmlElement(name = "Person", required = true)
    protected Person person;
    /**
     * The organisation that the person represents at the event.
     * 
     */
    @XmlElement(name = "Organisation")
    protected Organisation organisation;
    /**
     * Information about the control cards (punching cards) that the person uses at the event. Multiple control cards can be specified, e.g. one for punch checking and another for timing.
     * 
     */
    @XmlElement(name = "ControlCard")
    protected List<ControlCard> controlCard;
    /**
     * Any score that is submitted together with the entry, e.g. World Ranking points.
     * 
     */
    @XmlElement(name = "Score")
    protected List<Score> score;
    /**
     * The class(es) the person wants to take part in. Multiple classes may be provided in order of preference in scenarios where the number of competitors are limited in some classes.
     * 
     */
    @XmlElement(name = "Class")
    protected List<Class> clazz;
    /**
     * The ordinal numbers of the races that the person is taking part in, starting at 1. If not specified, the person takes part in all races.
     * 
     */
    @XmlElement(name = "RaceNumber")
    protected List<BigInteger> raceNumber;
    /**
     * The fees that the person has to pay when entering the event. In a multi-race event, there is usually one element for each race.
     * 
     */
    @XmlElement(name = "AssignedFee")
    protected List<AssignedFee> assignedFee;
    /**
     * Defines the services requested by the person.
     * 
     */
    @XmlElement(name = "ServiceRequest")
    protected List<ServiceRequest> serviceRequest;
    /**
     * Any special preferences regarding start time that has to be taken into consideration when making the start list draw.
     * 
     */
    @XmlElement(name = "StartTimeAllocationRequest")
    protected StartTimeAllocationRequest startTimeAllocationRequest;
    /**
     * The time when the entry was first submitted.
     * 
     */
    @XmlElement(name = "EntryTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryTime;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * The person that is entered.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     * @see #getPerson()
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * The organisation that the person represents at the event.
     * 
     * @return
     *     possible object is
     *     {@link Organisation }
     *     
     */
    public Organisation getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation }
     *     
     * @see #getOrganisation()
     */
    public void setOrganisation(Organisation value) {
        this.organisation = value;
    }

    /**
     * Information about the control cards (punching cards) that the person uses at the event. Multiple control cards can be specified, e.g. one for punch checking and another for timing.
     * 
     * Gets the value of the controlCard property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlCard property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getControlCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlCard }
     * </p>
     * 
     * 
     * @return
     *     The value of the controlCard property.
     */
    public List<ControlCard> getControlCard() {
        if (controlCard == null) {
            controlCard = new ArrayList<>();
        }
        return this.controlCard;
    }

    /**
     * Any score that is submitted together with the entry, e.g. World Ranking points.
     * 
     * Gets the value of the score property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the score property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Score }
     * </p>
     * 
     * 
     * @return
     *     The value of the score property.
     */
    public List<Score> getScore() {
        if (score == null) {
            score = new ArrayList<>();
        }
        return this.score;
    }

    /**
     * The class(es) the person wants to take part in. Multiple classes may be provided in order of preference in scenarios where the number of competitors are limited in some classes.
     * 
     * Gets the value of the clazz property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Class }
     * </p>
     * 
     * 
     * @return
     *     The value of the clazz property.
     */
    public List<Class> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<>();
        }
        return this.clazz;
    }

    /**
     * The ordinal numbers of the races that the person is taking part in, starting at 1. If not specified, the person takes part in all races.
     * 
     * Gets the value of the raceNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the raceNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRaceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * </p>
     * 
     * 
     * @return
     *     The value of the raceNumber property.
     */
    public List<BigInteger> getRaceNumber() {
        if (raceNumber == null) {
            raceNumber = new ArrayList<>();
        }
        return this.raceNumber;
    }

    /**
     * The fees that the person has to pay when entering the event. In a multi-race event, there is usually one element for each race.
     * 
     * Gets the value of the assignedFee property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedFee property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAssignedFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignedFee }
     * </p>
     * 
     * 
     * @return
     *     The value of the assignedFee property.
     */
    public List<AssignedFee> getAssignedFee() {
        if (assignedFee == null) {
            assignedFee = new ArrayList<>();
        }
        return this.assignedFee;
    }

    /**
     * Defines the services requested by the person.
     * 
     * Gets the value of the serviceRequest property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRequest property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRequest }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceRequest property.
     */
    public List<ServiceRequest> getServiceRequest() {
        if (serviceRequest == null) {
            serviceRequest = new ArrayList<>();
        }
        return this.serviceRequest;
    }

    /**
     * Any special preferences regarding start time that has to be taken into consideration when making the start list draw.
     * 
     * @return
     *     possible object is
     *     {@link StartTimeAllocationRequest }
     *     
     */
    public StartTimeAllocationRequest getStartTimeAllocationRequest() {
        return startTimeAllocationRequest;
    }

    /**
     * Sets the value of the startTimeAllocationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartTimeAllocationRequest }
     *     
     * @see #getStartTimeAllocationRequest()
     */
    public void setStartTimeAllocationRequest(StartTimeAllocationRequest value) {
        this.startTimeAllocationRequest = value;
    }

    /**
     * The time when the entry was first submitted.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryTime() {
        return entryTime;
    }

    /**
     * Sets the value of the entryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEntryTime()
     */
    public void setEntryTime(XMLGregorianCalendar value) {
        this.entryTime = value;
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

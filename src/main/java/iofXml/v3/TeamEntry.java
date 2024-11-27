
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
 * Defines an event entry for a team.
 * 
 * <p>Java class for TeamEntry complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TeamEntry">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TeamEntryPerson" type="{http://www.orienteering.org/datastandard/3.0}TeamEntryPerson" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Class" type="{http://www.orienteering.org/datastandard/3.0}Class" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Race" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="StartTimeAllocationRequest" type="{http://www.orienteering.org/datastandard/3.0}StartTimeAllocationRequest" minOccurs="0"/>
 *         <element name="ContactInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TeamEntry", propOrder = {
    "id",
    "name",
    "organisation",
    "teamEntryPerson",
    "clazz",
    "race",
    "assignedFee",
    "serviceRequest",
    "startTimeAllocationRequest",
    "contactInformation",
    "entryTime",
    "extensions"
})
public class TeamEntry {

    @XmlElement(name = "Id")
    protected Id id;
    /**
     * The name of the team. If a relay, this is probably the name of the club optionally followed by a sequence number to distinguish teams from the same club in a class.
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * The organisation(s) that the team represents.
     * 
     */
    @XmlElement(name = "Organisation")
    protected List<Organisation> organisation;
    /**
     * The persons that make up the team.
     * 
     */
    @XmlElement(name = "TeamEntryPerson")
    protected List<TeamEntryPerson> teamEntryPerson;
    /**
     * The class(es) the team wants to take part in. Multiple classes may be provided in order of preference in scenarios where the number of competitors are limited in some classes.
     * 
     */
    @XmlElement(name = "Class")
    protected List<Class> clazz;
    /**
     * The numbers of the races that the team is taking part in. If not specified, team person takes part in all races.
     * 
     */
    @XmlElement(name = "Race")
    protected List<BigInteger> race;
    /**
     * The fees that the team as a whole has to pay when entering the event. In a multi-race event, there is usually one element for each race. If there are differentated fees for the team members, specify them in the TeamEntryPerson elements.
     * 
     */
    @XmlElement(name = "AssignedFee")
    protected List<AssignedFee> assignedFee;
    /**
     * Defines the services requested by the team.
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
     * Contact information (name and e.g. mobile phone number) to a team leader or coach, expressed as plain text.
     * 
     */
    @XmlElement(name = "ContactInformation")
    protected String contactInformation;
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
     * The name of the team. If a relay, this is probably the name of the club optionally followed by a sequence number to distinguish teams from the same club in a class.
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
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * The organisation(s) that the team represents.
     * 
     * Gets the value of the organisation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrganisation().add(newItem);
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
     *     The value of the organisation property.
     */
    public List<Organisation> getOrganisation() {
        if (organisation == null) {
            organisation = new ArrayList<>();
        }
        return this.organisation;
    }

    /**
     * The persons that make up the team.
     * 
     * Gets the value of the teamEntryPerson property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamEntryPerson property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTeamEntryPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamEntryPerson }
     * </p>
     * 
     * 
     * @return
     *     The value of the teamEntryPerson property.
     */
    public List<TeamEntryPerson> getTeamEntryPerson() {
        if (teamEntryPerson == null) {
            teamEntryPerson = new ArrayList<>();
        }
        return this.teamEntryPerson;
    }

    /**
     * The class(es) the team wants to take part in. Multiple classes may be provided in order of preference in scenarios where the number of competitors are limited in some classes.
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
     * The numbers of the races that the team is taking part in. If not specified, team person takes part in all races.
     * 
     * Gets the value of the race property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the race property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRace().add(newItem);
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
     *     The value of the race property.
     */
    public List<BigInteger> getRace() {
        if (race == null) {
            race = new ArrayList<>();
        }
        return this.race;
    }

    /**
     * The fees that the team as a whole has to pay when entering the event. In a multi-race event, there is usually one element for each race. If there are differentated fees for the team members, specify them in the TeamEntryPerson elements.
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
     * Defines the services requested by the team.
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
     * Contact information (name and e.g. mobile phone number) to a team leader or coach, expressed as plain text.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContactInformation()
     */
    public void setContactInformation(String value) {
        this.contactInformation = value;
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

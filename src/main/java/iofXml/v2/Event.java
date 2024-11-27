
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{}EventId"/>
 *         <element ref="{}Name"/>
 *         <choice>
 *           <element ref="{}EventClassificationId"/>
 *           <element ref="{}EventClassification"/>
 *         </choice>
 *         <element ref="{}StartDate"/>
 *         <element ref="{}FinishDate" minOccurs="0"/>
 *         <element ref="{}EventOfficial" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}Organiser" minOccurs="0"/>
 *         <element ref="{}EventClass" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}EventRace" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}WebURL" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}EntryData" minOccurs="0"/>
 *         <element ref="{}Service" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}Account" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}ModifyDate" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="eventForm" default="IndSingleDay">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             <enumeration value="IndSingleDay"/>
 *             <enumeration value="IndMultiDay"/>
 *             <enumeration value="teamSingleDay"/>
 *             <enumeration value="teamMultiDay"/>
 *             <enumeration value="relay"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventId",
    "name",
    "eventClassificationId",
    "eventClassification",
    "startDate",
    "finishDate",
    "eventOfficial",
    "organiser",
    "eventClass",
    "eventRace",
    "webURL",
    "entryData",
    "service",
    "account",
    "modifyDate"
})
@XmlRootElement(name = "Event")
public class Event {

    @XmlElement(name = "EventId", required = true)
    protected EventId eventId;
    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "EventClassificationId")
    protected EventClassificationId eventClassificationId;
    @XmlElement(name = "EventClassification")
    protected EventClassification eventClassification;
    @XmlElement(name = "StartDate", required = true)
    protected StartDate startDate;
    @XmlElement(name = "FinishDate")
    protected FinishDate finishDate;
    @XmlElement(name = "EventOfficial")
    protected List<EventOfficial> eventOfficial;
    @XmlElement(name = "Organiser")
    protected Organiser organiser;
    @XmlElement(name = "EventClass")
    protected List<EventClass> eventClass;
    @XmlElement(name = "EventRace")
    protected List<EventRace> eventRace;
    @XmlElement(name = "WebURL")
    protected List<String> webURL;
    @XmlElement(name = "EntryData")
    protected EntryData entryData;
    @XmlElement(name = "Service")
    protected List<Service> service;
    @XmlElement(name = "Account")
    protected List<Account> account;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlAttribute(name = "eventForm")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String eventForm;

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link EventId }
     *     
     */
    public EventId getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventId }
     *     
     */
    public void setEventId(EventId value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the eventClassificationId property.
     * 
     * @return
     *     possible object is
     *     {@link EventClassificationId }
     *     
     */
    public EventClassificationId getEventClassificationId() {
        return eventClassificationId;
    }

    /**
     * Sets the value of the eventClassificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClassificationId }
     *     
     */
    public void setEventClassificationId(EventClassificationId value) {
        this.eventClassificationId = value;
    }

    /**
     * Gets the value of the eventClassification property.
     * 
     * @return
     *     possible object is
     *     {@link EventClassification }
     *     
     */
    public EventClassification getEventClassification() {
        return eventClassification;
    }

    /**
     * Sets the value of the eventClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClassification }
     *     
     */
    public void setEventClassification(EventClassification value) {
        this.eventClassification = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link StartDate }
     *     
     */
    public StartDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDate }
     *     
     */
    public void setStartDate(StartDate value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the finishDate property.
     * 
     * @return
     *     possible object is
     *     {@link FinishDate }
     *     
     */
    public FinishDate getFinishDate() {
        return finishDate;
    }

    /**
     * Sets the value of the finishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinishDate }
     *     
     */
    public void setFinishDate(FinishDate value) {
        this.finishDate = value;
    }

    /**
     * Gets the value of the eventOfficial property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventOfficial property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEventOfficial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventOfficial }
     * </p>
     * 
     * 
     * @return
     *     The value of the eventOfficial property.
     */
    public List<EventOfficial> getEventOfficial() {
        if (eventOfficial == null) {
            eventOfficial = new ArrayList<>();
        }
        return this.eventOfficial;
    }

    /**
     * Gets the value of the organiser property.
     * 
     * @return
     *     possible object is
     *     {@link Organiser }
     *     
     */
    public Organiser getOrganiser() {
        return organiser;
    }

    /**
     * Sets the value of the organiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organiser }
     *     
     */
    public void setOrganiser(Organiser value) {
        this.organiser = value;
    }

    /**
     * Gets the value of the eventClass property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventClass property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEventClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventClass }
     * </p>
     * 
     * 
     * @return
     *     The value of the eventClass property.
     */
    public List<EventClass> getEventClass() {
        if (eventClass == null) {
            eventClass = new ArrayList<>();
        }
        return this.eventClass;
    }

    /**
     * Gets the value of the eventRace property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventRace property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEventRace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventRace }
     * </p>
     * 
     * 
     * @return
     *     The value of the eventRace property.
     */
    public List<EventRace> getEventRace() {
        if (eventRace == null) {
            eventRace = new ArrayList<>();
        }
        return this.eventRace;
    }

    /**
     * Gets the value of the webURL property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webURL property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWebURL().add(newItem);
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
     *     The value of the webURL property.
     */
    public List<String> getWebURL() {
        if (webURL == null) {
            webURL = new ArrayList<>();
        }
        return this.webURL;
    }

    /**
     * Gets the value of the entryData property.
     * 
     * @return
     *     possible object is
     *     {@link EntryData }
     *     
     */
    public EntryData getEntryData() {
        return entryData;
    }

    /**
     * Sets the value of the entryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryData }
     *     
     */
    public void setEntryData(EntryData value) {
        this.entryData = value;
    }

    /**
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
     * Gets the value of the account property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * </p>
     * 
     * 
     * @return
     *     The value of the account property.
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<>();
        }
        return this.account;
    }

    /**
     * Gets the value of the modifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyDate }
     *     
     */
    public ModifyDate getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the value of the modifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyDate }
     *     
     */
    public void setModifyDate(ModifyDate value) {
        this.modifyDate = value;
    }

    /**
     * Gets the value of the eventForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventForm() {
        if (eventForm == null) {
            return "IndSingleDay";
        } else {
            return eventForm;
        }
    }

    /**
     * Sets the value of the eventForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventForm(String value) {
        this.eventForm = value;
    }

}

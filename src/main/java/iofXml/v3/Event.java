
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
 * <p>Java class for Event complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Event">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="StartTime" type="{http://www.orienteering.org/datastandard/3.0}DateAndOptionalTime" minOccurs="0"/>
 *         <element name="EndTime" type="{http://www.orienteering.org/datastandard/3.0}DateAndOptionalTime" minOccurs="0"/>
 *         <element name="Status" type="{http://www.orienteering.org/datastandard/3.0}EventStatus" minOccurs="0"/>
 *         <element name="Classification" type="{http://www.orienteering.org/datastandard/3.0}EventClassification" minOccurs="0"/>
 *         <element name="Form" type="{http://www.orienteering.org/datastandard/3.0}EventForm" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Organiser" type="{http://www.orienteering.org/datastandard/3.0}Organisation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Official" type="{http://www.orienteering.org/datastandard/3.0}Role" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Class" type="{http://www.orienteering.org/datastandard/3.0}Class" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Race" type="{http://www.orienteering.org/datastandard/3.0}Race" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EntryReceiver" type="{http://www.orienteering.org/datastandard/3.0}EntryReceiver" minOccurs="0"/>
 *         <element name="Service" type="{http://www.orienteering.org/datastandard/3.0}Service" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Account" type="{http://www.orienteering.org/datastandard/3.0}Account" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="URL" type="{http://www.orienteering.org/datastandard/3.0}EventURL" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Information" type="{http://www.orienteering.org/datastandard/3.0}InformationItem" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Schedule" type="{http://www.orienteering.org/datastandard/3.0}Schedule" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="News" type="{http://www.orienteering.org/datastandard/3.0}InformationItem" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Event", propOrder = {
    "id",
    "name",
    "startTime",
    "endTime",
    "status",
    "classification",
    "form",
    "organiser",
    "official",
    "clazz",
    "race",
    "entryReceiver",
    "service",
    "account",
    "url",
    "information",
    "schedule",
    "news",
    "extensions"
})
public class Event {

    @XmlElement(name = "Id")
    protected Id id;
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * The start time for the first starting competitor of the event. If the event contains multiple races, this is the start time for the first starting competitor of the first race.
     * 
     */
    @XmlElement(name = "StartTime")
    protected DateAndOptionalTime startTime;
    /**
     * The expected finish time for the last finishing competitor of the event. If the event contains multiple races, this is the expected finish time for the last finishing competitor of the last race.
     * 
     */
    @XmlElement(name = "EndTime")
    protected DateAndOptionalTime endTime;
    /**
     * The status of the event. If the event is a multi-race event, and status is set per race, use the Status element of the Race element.
     * 
     */
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "NMTOKEN")
    protected EventStatus status;
    /**
     * The classification or level of the event. If the event is a multi-race event, and classification is set per race, use the Classification element of the Race element.
     * 
     */
    @XmlElement(name = "Classification")
    @XmlSchemaType(name = "NMTOKEN")
    protected EventClassification classification;
    @XmlElement(name = "Form")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<EventForm> form;
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
     * The classes that are available at the event.
     * 
     */
    @XmlElement(name = "Class")
    protected List<Class> clazz;
    /**
     * An event consists of a number of races. The number is equal to the number of times a competitor should start. Most events contain a single race, and this elemend could then be omitted.
     * 
     */
    @XmlElement(name = "Race")
    protected List<Race> race;
    /**
     * Address and contact information to the person or organisation which registers the entries for the event.
     * 
     */
    @XmlElement(name = "EntryReceiver")
    protected EntryReceiver entryReceiver;
    /**
     * The services available for the event, e.g. accomodation and transport.
     * 
     */
    @XmlElement(name = "Service")
    protected List<Service> service;
    /**
     * The bank account for the event.
     * 
     */
    @XmlElement(name = "Account")
    protected List<Account> account;
    /**
     * URLs to various types of additional information regarding the event, e.g. event website or result list.
     * 
     */
    @XmlElement(name = "URL")
    protected List<EventURL> url;
    /**
     * Presents arbitrary data about the event, e.g. "Accommodation", "Local Attractions", and so on. Information present here should be defined well in advance of the event, in contrast to the 'News' element.
     * 
     */
    @XmlElement(name = "Information")
    protected List<InformationItem> information;
    /**
     * Defines the schedule of events that comprise the entire orienteering event, e.g. entry deadlines, banquet and social events, and awards ceremonies.
     * 
     */
    @XmlElement(name = "Schedule")
    protected List<Schedule> schedule;
    /**
     * Presents "last minute information" about the event.
     * 
     */
    @XmlElement(name = "News")
    protected List<InformationItem> news;
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
     * The start time for the first starting competitor of the event. If the event contains multiple races, this is the start time for the first starting competitor of the first race.
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
     * The expected finish time for the last finishing competitor of the event. If the event contains multiple races, this is the expected finish time for the last finishing competitor of the last race.
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
     * The status of the event. If the event is a multi-race event, and status is set per race, use the Status element of the Race element.
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
     * The classification or level of the event. If the event is a multi-race event, and classification is set per race, use the Classification element of the Race element.
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
     * Gets the value of the form property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the form property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventForm }
     * </p>
     * 
     * 
     * @return
     *     The value of the form property.
     */
    public List<EventForm> getForm() {
        if (form == null) {
            form = new ArrayList<>();
        }
        return this.form;
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
     * The classes that are available at the event.
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
     * An event consists of a number of races. The number is equal to the number of times a competitor should start. Most events contain a single race, and this elemend could then be omitted.
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
     * {@link Race }
     * </p>
     * 
     * 
     * @return
     *     The value of the race property.
     */
    public List<Race> getRace() {
        if (race == null) {
            race = new ArrayList<>();
        }
        return this.race;
    }

    /**
     * Address and contact information to the person or organisation which registers the entries for the event.
     * 
     * @return
     *     possible object is
     *     {@link EntryReceiver }
     *     
     */
    public EntryReceiver getEntryReceiver() {
        return entryReceiver;
    }

    /**
     * Sets the value of the entryReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryReceiver }
     *     
     * @see #getEntryReceiver()
     */
    public void setEntryReceiver(EntryReceiver value) {
        this.entryReceiver = value;
    }

    /**
     * The services available for the event, e.g. accomodation and transport.
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
     * The bank account for the event.
     * 
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
     * Presents arbitrary data about the event, e.g. "Accommodation", "Local Attractions", and so on. Information present here should be defined well in advance of the event, in contrast to the 'News' element.
     * 
     * Gets the value of the information property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the information property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the information property.
     */
    public List<InformationItem> getInformation() {
        if (information == null) {
            information = new ArrayList<>();
        }
        return this.information;
    }

    /**
     * Defines the schedule of events that comprise the entire orienteering event, e.g. entry deadlines, banquet and social events, and awards ceremonies.
     * 
     * Gets the value of the schedule property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedule property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule }
     * </p>
     * 
     * 
     * @return
     *     The value of the schedule property.
     */
    public List<Schedule> getSchedule() {
        if (schedule == null) {
            schedule = new ArrayList<>();
        }
        return this.schedule;
    }

    /**
     * Presents "last minute information" about the event.
     * 
     * Gets the value of the news property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the news property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNews().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the news property.
     */
    public List<InformationItem> getNews() {
        if (news == null) {
            news = new ArrayList<>();
        }
        return this.news;
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

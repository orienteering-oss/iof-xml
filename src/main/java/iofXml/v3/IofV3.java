
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://www.orienteering.org/datastandard/3.0}CompetitorList" minOccurs="0"/>
 *         <element ref="{http://www.orienteering.org/datastandard/3.0}OrganisationList" minOccurs="0"/>
 *         <element ref="{http://www.orienteering.org/datastandard/3.0}EventList" minOccurs="0"/>
 *         <element ref="{http://www.orienteering.org/datastandard/3.0}ClassList" minOccurs="0"/>
 *         <element ref="{http://www.orienteering.org/datastandard/3.0}EntryList" minOccurs="0"/>
 *         <element ref="{http://www.orienteering.org/datastandard/3.0}CourseData" minOccurs="0"/>
 *         <element ref="{http://www.orienteering.org/datastandard/3.0}StartList" minOccurs="0"/>
 *         <element ref="{http://www.orienteering.org/datastandard/3.0}ResultList" minOccurs="0"/>
 *         <element ref="{http://www.orienteering.org/datastandard/3.0}ServiceRequestList" minOccurs="0"/>
 *         <element ref="{http://www.orienteering.org/datastandard/3.0}ControlCardList" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "competitorList",
    "organisationList",
    "eventList",
    "classList",
    "entryList",
    "courseData",
    "startList",
    "resultList",
    "serviceRequestList",
    "controlCardList"
})
@XmlRootElement(name = "IofV3")
public class IofV3 {

    /**
     * A list of competitors. This is used to exchange a "brutto" list of possible competitors. This should not be used to exchange entries; use EntryList instead.
     * 
     */
    @XmlElement(name = "CompetitorList")
    protected CompetitorList competitorList;
    /**
     * A list of organisations, including address and contact information.
     * 
     */
    @XmlElement(name = "OrganisationList")
    protected OrganisationList organisationList;
    /**
     * A list of events. This can be used to exchange fixtures.
     * 
     */
    @XmlElement(name = "EventList")
    protected EventList eventList;
    /**
     * A list of classes.
     * 
     */
    @XmlElement(name = "ClassList")
    protected ClassList classList;
    /**
     * A list of persons and/or teams which are registered for a particular event.
     * 
     */
    @XmlElement(name = "EntryList")
    protected EntryList entryList;
    /**
     * This element defines all the control and course information for an event or race. Used when transferring courses from course-setting software to event administration software.
     * 
     */
    @XmlElement(name = "CourseData")
    protected CourseData courseData;
    /**
     * Contains information about the start lists for the classes in an event.
     * 
     */
    @XmlElement(name = "StartList")
    protected StartList startList;
    /**
     * Contains information about the result lists for the classes in an event.
     * 
     */
    @XmlElement(name = "ResultList")
    protected ResultList resultList;
    /**
     * A list of service requests.
     * 
     */
    @XmlElement(name = "ServiceRequestList")
    protected ServiceRequestList serviceRequestList;
    /**
     * Defines control card ownership, e.g. for rental control card handling purposes.
     * 
     */
    @XmlElement(name = "ControlCardList")
    protected ControlCardList controlCardList;

    /**
     * A list of competitors. This is used to exchange a "brutto" list of possible competitors. This should not be used to exchange entries; use EntryList instead.
     * 
     * @return
     *     possible object is
     *     {@link CompetitorList }
     *     
     */
    public CompetitorList getCompetitorList() {
        return competitorList;
    }

    /**
     * Sets the value of the competitorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetitorList }
     *     
     * @see #getCompetitorList()
     */
    public void setCompetitorList(CompetitorList value) {
        this.competitorList = value;
    }

    /**
     * A list of organisations, including address and contact information.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationList }
     *     
     */
    public OrganisationList getOrganisationList() {
        return organisationList;
    }

    /**
     * Sets the value of the organisationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationList }
     *     
     * @see #getOrganisationList()
     */
    public void setOrganisationList(OrganisationList value) {
        this.organisationList = value;
    }

    /**
     * A list of events. This can be used to exchange fixtures.
     * 
     * @return
     *     possible object is
     *     {@link EventList }
     *     
     */
    public EventList getEventList() {
        return eventList;
    }

    /**
     * Sets the value of the eventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventList }
     *     
     * @see #getEventList()
     */
    public void setEventList(EventList value) {
        this.eventList = value;
    }

    /**
     * A list of classes.
     * 
     * @return
     *     possible object is
     *     {@link ClassList }
     *     
     */
    public ClassList getClassList() {
        return classList;
    }

    /**
     * Sets the value of the classList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassList }
     *     
     * @see #getClassList()
     */
    public void setClassList(ClassList value) {
        this.classList = value;
    }

    /**
     * A list of persons and/or teams which are registered for a particular event.
     * 
     * @return
     *     possible object is
     *     {@link EntryList }
     *     
     */
    public EntryList getEntryList() {
        return entryList;
    }

    /**
     * Sets the value of the entryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryList }
     *     
     * @see #getEntryList()
     */
    public void setEntryList(EntryList value) {
        this.entryList = value;
    }

    /**
     * This element defines all the control and course information for an event or race. Used when transferring courses from course-setting software to event administration software.
     * 
     * @return
     *     possible object is
     *     {@link CourseData }
     *     
     */
    public CourseData getCourseData() {
        return courseData;
    }

    /**
     * Sets the value of the courseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseData }
     *     
     * @see #getCourseData()
     */
    public void setCourseData(CourseData value) {
        this.courseData = value;
    }

    /**
     * Contains information about the start lists for the classes in an event.
     * 
     * @return
     *     possible object is
     *     {@link StartList }
     *     
     */
    public StartList getStartList() {
        return startList;
    }

    /**
     * Sets the value of the startList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartList }
     *     
     * @see #getStartList()
     */
    public void setStartList(StartList value) {
        this.startList = value;
    }

    /**
     * Contains information about the result lists for the classes in an event.
     * 
     * @return
     *     possible object is
     *     {@link ResultList }
     *     
     */
    public ResultList getResultList() {
        return resultList;
    }

    /**
     * Sets the value of the resultList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultList }
     *     
     * @see #getResultList()
     */
    public void setResultList(ResultList value) {
        this.resultList = value;
    }

    /**
     * A list of service requests.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequestList }
     *     
     */
    public ServiceRequestList getServiceRequestList() {
        return serviceRequestList;
    }

    /**
     * Sets the value of the serviceRequestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequestList }
     *     
     * @see #getServiceRequestList()
     */
    public void setServiceRequestList(ServiceRequestList value) {
        this.serviceRequestList = value;
    }

    /**
     * Defines control card ownership, e.g. for rental control card handling purposes.
     * 
     * @return
     *     possible object is
     *     {@link ControlCardList }
     *     
     */
    public ControlCardList getControlCardList() {
        return controlCardList;
    }

    /**
     * Sets the value of the controlCardList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlCardList }
     *     
     * @see #getControlCardList()
     */
    public void setControlCardList(ControlCardList value) {
        this.controlCardList = value;
    }

}

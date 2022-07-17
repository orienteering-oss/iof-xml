
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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

    @XmlElement(name = "CompetitorList")
    protected CompetitorList competitorList;
    @XmlElement(name = "OrganisationList")
    protected OrganisationList organisationList;
    @XmlElement(name = "EventList")
    protected EventList eventList;
    @XmlElement(name = "ClassList")
    protected ClassList classList;
    @XmlElement(name = "EntryList")
    protected EntryList entryList;
    @XmlElement(name = "CourseData")
    protected CourseData courseData;
    @XmlElement(name = "StartList")
    protected StartList startList;
    @XmlElement(name = "ResultList")
    protected ResultList resultList;
    @XmlElement(name = "ServiceRequestList")
    protected ServiceRequestList serviceRequestList;
    @XmlElement(name = "ControlCardList")
    protected ControlCardList controlCardList;

    /**
     * Gets the value of the competitorList property.
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
     */
    public void setCompetitorList(CompetitorList value) {
        this.competitorList = value;
    }

    /**
     * Gets the value of the organisationList property.
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
     */
    public void setOrganisationList(OrganisationList value) {
        this.organisationList = value;
    }

    /**
     * Gets the value of the eventList property.
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
     */
    public void setEventList(EventList value) {
        this.eventList = value;
    }

    /**
     * Gets the value of the classList property.
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
     */
    public void setClassList(ClassList value) {
        this.classList = value;
    }

    /**
     * Gets the value of the entryList property.
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
     */
    public void setEntryList(EntryList value) {
        this.entryList = value;
    }

    /**
     * Gets the value of the courseData property.
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
     */
    public void setCourseData(CourseData value) {
        this.courseData = value;
    }

    /**
     * Gets the value of the startList property.
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
     */
    public void setStartList(StartList value) {
        this.startList = value;
    }

    /**
     * Gets the value of the resultList property.
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
     */
    public void setResultList(ResultList value) {
        this.resultList = value;
    }

    /**
     * Gets the value of the serviceRequestList property.
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
     */
    public void setServiceRequestList(ServiceRequestList value) {
        this.serviceRequestList = value;
    }

    /**
     * Gets the value of the controlCardList property.
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
     */
    public void setControlCardList(ControlCardList value) {
        this.controlCardList = value;
    }

}

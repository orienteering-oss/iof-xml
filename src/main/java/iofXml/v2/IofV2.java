
package iofXml.v2;

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
 *         <element ref="{}PersonList" minOccurs="0"/>
 *         <element ref="{}CompetitorList" minOccurs="0"/>
 *         <element ref="{}RankList" minOccurs="0"/>
 *         <element ref="{}ClubList" minOccurs="0"/>
 *         <element ref="{}EventList" minOccurs="0"/>
 *         <element ref="{}ServiceRequestList" minOccurs="0"/>
 *         <element ref="{}EntryList" minOccurs="0"/>
 *         <element ref="{}StartList" minOccurs="0"/>
 *         <element ref="{}ResultList" minOccurs="0"/>
 *         <element ref="{}ClassData" minOccurs="0"/>
 *         <element ref="{}CourseData" minOccurs="0"/>
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
    "personList",
    "competitorList",
    "rankList",
    "clubList",
    "eventList",
    "serviceRequestList",
    "entryList",
    "startList",
    "resultList",
    "classData",
    "courseData"
})
@XmlRootElement(name = "IofV2")
public class IofV2 {

    @XmlElement(name = "PersonList")
    protected PersonList personList;
    @XmlElement(name = "CompetitorList")
    protected CompetitorList competitorList;
    @XmlElement(name = "RankList")
    protected RankList rankList;
    @XmlElement(name = "ClubList")
    protected ClubList clubList;
    @XmlElement(name = "EventList")
    protected EventList eventList;
    @XmlElement(name = "ServiceRequestList")
    protected ServiceRequestList serviceRequestList;
    @XmlElement(name = "EntryList")
    protected EntryList entryList;
    @XmlElement(name = "StartList")
    protected StartList startList;
    @XmlElement(name = "ResultList")
    protected ResultList resultList;
    @XmlElement(name = "ClassData")
    protected ClassData classData;
    @XmlElement(name = "CourseData")
    protected CourseData courseData;

    /**
     * Gets the value of the personList property.
     * 
     * @return
     *     possible object is
     *     {@link PersonList }
     *     
     */
    public PersonList getPersonList() {
        return personList;
    }

    /**
     * Sets the value of the personList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonList }
     *     
     */
    public void setPersonList(PersonList value) {
        this.personList = value;
    }

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
     * Gets the value of the rankList property.
     * 
     * @return
     *     possible object is
     *     {@link RankList }
     *     
     */
    public RankList getRankList() {
        return rankList;
    }

    /**
     * Sets the value of the rankList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RankList }
     *     
     */
    public void setRankList(RankList value) {
        this.rankList = value;
    }

    /**
     * Gets the value of the clubList property.
     * 
     * @return
     *     possible object is
     *     {@link ClubList }
     *     
     */
    public ClubList getClubList() {
        return clubList;
    }

    /**
     * Sets the value of the clubList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClubList }
     *     
     */
    public void setClubList(ClubList value) {
        this.clubList = value;
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
     * Gets the value of the classData property.
     * 
     * @return
     *     possible object is
     *     {@link ClassData }
     *     
     */
    public ClassData getClassData() {
        return classData;
    }

    /**
     * Sets the value of the classData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassData }
     *     
     */
    public void setClassData(ClassData value) {
        this.classData = value;
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

}

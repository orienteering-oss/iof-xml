
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
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
 *       <sequence>
 *         <element ref="{}StartNumber" minOccurs="0"/>
 *         <element ref="{}BibNumber" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element ref="{}CCardId"/>
 *           <element ref="{}CCard"/>
 *         </choice>
 *         <element ref="{}StartTime" minOccurs="0"/>
 *         <element ref="{}FinishTime" minOccurs="0"/>
 *         <element ref="{}Time" minOccurs="0"/>
 *         <element ref="{}ResultPosition" minOccurs="0"/>
 *         <element ref="{}CompetitorStatus"/>
 *         <element ref="{}TeamSequence" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element ref="{}CourseVariationId"/>
 *           <element ref="{}CourseVariation"/>
 *           <element ref="{}CourseLength"/>
 *         </choice>
 *         <element ref="{}SplitTime" maxOccurs="unbounded" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element ref="{}BadgeValueId"/>
 *           <element ref="{}BadgeValue"/>
 *         </choice>
 *         <element ref="{}Point" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}ModifyDate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "startNumber",
    "bibNumber",
    "cCardId",
    "cCard",
    "startTime",
    "finishTime",
    "time",
    "resultPosition",
    "competitorStatus",
    "teamSequence",
    "courseVariationId",
    "courseVariation",
    "courseLength",
    "splitTime",
    "badgeValueId",
    "badgeValue",
    "point",
    "modifyDate"
})
@XmlRootElement(name = "Result")
public class Result {

    @XmlElement(name = "StartNumber")
    protected String startNumber;
    @XmlElement(name = "BibNumber")
    protected String bibNumber;
    @XmlElement(name = "CCardId")
    protected String cCardId;
    @XmlElement(name = "CCard")
    protected CCard cCard;
    @XmlElement(name = "StartTime")
    protected StartTime startTime;
    @XmlElement(name = "FinishTime")
    protected FinishTime finishTime;
    @XmlElement(name = "Time")
    protected Time time;
    @XmlElement(name = "ResultPosition")
    protected String resultPosition;
    @XmlElement(name = "CompetitorStatus", required = true)
    protected CompetitorStatus competitorStatus;
    @XmlElement(name = "TeamSequence")
    protected String teamSequence;
    @XmlElement(name = "CourseVariationId")
    protected String courseVariationId;
    @XmlElement(name = "CourseVariation")
    protected CourseVariation courseVariation;
    @XmlElement(name = "CourseLength")
    protected CourseLength courseLength;
    @XmlElement(name = "SplitTime")
    protected List<SplitTime> splitTime;
    @XmlElement(name = "BadgeValueId")
    protected BadgeValueId badgeValueId;
    @XmlElement(name = "BadgeValue")
    protected BadgeValue badgeValue;
    @XmlElement(name = "Point")
    protected List<Point> point;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;

    /**
     * Gets the value of the startNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartNumber() {
        return startNumber;
    }

    /**
     * Sets the value of the startNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartNumber(String value) {
        this.startNumber = value;
    }

    /**
     * Gets the value of the bibNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBibNumber() {
        return bibNumber;
    }

    /**
     * Sets the value of the bibNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBibNumber(String value) {
        this.bibNumber = value;
    }

    /**
     * Gets the value of the cCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCardId() {
        return cCardId;
    }

    /**
     * Sets the value of the cCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCardId(String value) {
        this.cCardId = value;
    }

    /**
     * Gets the value of the cCard property.
     * 
     * @return
     *     possible object is
     *     {@link CCard }
     *     
     */
    public CCard getCCard() {
        return cCard;
    }

    /**
     * Sets the value of the cCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCard }
     *     
     */
    public void setCCard(CCard value) {
        this.cCard = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link StartTime }
     *     
     */
    public StartTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartTime }
     *     
     */
    public void setStartTime(StartTime value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the finishTime property.
     * 
     * @return
     *     possible object is
     *     {@link FinishTime }
     *     
     */
    public FinishTime getFinishTime() {
        return finishTime;
    }

    /**
     * Sets the value of the finishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinishTime }
     *     
     */
    public void setFinishTime(FinishTime value) {
        this.finishTime = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTime(Time value) {
        this.time = value;
    }

    /**
     * Gets the value of the resultPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultPosition() {
        return resultPosition;
    }

    /**
     * Sets the value of the resultPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultPosition(String value) {
        this.resultPosition = value;
    }

    /**
     * Gets the value of the competitorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CompetitorStatus }
     *     
     */
    public CompetitorStatus getCompetitorStatus() {
        return competitorStatus;
    }

    /**
     * Sets the value of the competitorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetitorStatus }
     *     
     */
    public void setCompetitorStatus(CompetitorStatus value) {
        this.competitorStatus = value;
    }

    /**
     * Gets the value of the teamSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamSequence() {
        return teamSequence;
    }

    /**
     * Sets the value of the teamSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamSequence(String value) {
        this.teamSequence = value;
    }

    /**
     * Gets the value of the courseVariationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseVariationId() {
        return courseVariationId;
    }

    /**
     * Sets the value of the courseVariationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseVariationId(String value) {
        this.courseVariationId = value;
    }

    /**
     * Gets the value of the courseVariation property.
     * 
     * @return
     *     possible object is
     *     {@link CourseVariation }
     *     
     */
    public CourseVariation getCourseVariation() {
        return courseVariation;
    }

    /**
     * Sets the value of the courseVariation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseVariation }
     *     
     */
    public void setCourseVariation(CourseVariation value) {
        this.courseVariation = value;
    }

    /**
     * Gets the value of the courseLength property.
     * 
     * @return
     *     possible object is
     *     {@link CourseLength }
     *     
     */
    public CourseLength getCourseLength() {
        return courseLength;
    }

    /**
     * Sets the value of the courseLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseLength }
     *     
     */
    public void setCourseLength(CourseLength value) {
        this.courseLength = value;
    }

    /**
     * Gets the value of the splitTime property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitTime property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSplitTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitTime }
     * </p>
     * 
     * 
     * @return
     *     The value of the splitTime property.
     */
    public List<SplitTime> getSplitTime() {
        if (splitTime == null) {
            splitTime = new ArrayList<>();
        }
        return this.splitTime;
    }

    /**
     * Gets the value of the badgeValueId property.
     * 
     * @return
     *     possible object is
     *     {@link BadgeValueId }
     *     
     */
    public BadgeValueId getBadgeValueId() {
        return badgeValueId;
    }

    /**
     * Sets the value of the badgeValueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BadgeValueId }
     *     
     */
    public void setBadgeValueId(BadgeValueId value) {
        this.badgeValueId = value;
    }

    /**
     * Gets the value of the badgeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BadgeValue }
     *     
     */
    public BadgeValue getBadgeValue() {
        return badgeValue;
    }

    /**
     * Sets the value of the badgeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BadgeValue }
     *     
     */
    public void setBadgeValue(BadgeValue value) {
        this.badgeValue = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Point }
     * </p>
     * 
     * 
     * @return
     *     The value of the point property.
     */
    public List<Point> getPoint() {
        if (point == null) {
            point = new ArrayList<>();
        }
        return this.point;
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

}

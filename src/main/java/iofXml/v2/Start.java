
package iofXml.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}StartNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{}BibNumber" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{}CCardId"/&gt;
 *           &lt;element ref="{}CCard"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}StartTime" minOccurs="0"/&gt;
 *         &lt;element ref="{}TeamSequence" minOccurs="0"/&gt;
 *         &lt;element ref="{}CourseLength"/&gt;
 *         &lt;element ref="{}StartId" minOccurs="0"/&gt;
 *         &lt;element ref="{}ModifyDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
    "teamSequence",
    "courseLength",
    "startId",
    "modifyDate"
})
@XmlRootElement(name = "Start")
public class Start {

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
    @XmlElement(name = "TeamSequence")
    protected String teamSequence;
    @XmlElement(name = "CourseLength", required = true)
    protected CourseLength courseLength;
    @XmlElement(name = "StartId")
    protected String startId;
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
     * Gets the value of the startId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartId() {
        return startId;
    }

    /**
     * Sets the value of the startId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartId(String value) {
        this.startId = value;
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


package iofXml.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element ref="{}BadgeValueId"/&amp;gt;
 *           &amp;lt;element ref="{}BadgeValue"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element ref="{}EventClassificationId"/&amp;gt;
 *           &amp;lt;element ref="{}EventClassification"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element ref="{}ClassTypeId"/&amp;gt;
 *           &amp;lt;element ref="{}ClassType"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element ref="{}TimeFactor"/&amp;gt;
 *         &amp;lt;element ref="{}ModifyDate" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "badgeValueId",
    "badgeValue",
    "eventClassificationId",
    "eventClassification",
    "classTypeId",
    "classType",
    "timeFactor",
    "modifyDate"
})
@XmlRootElement(name = "BadgeLimit")
public class BadgeLimit {

    @XmlElement(name = "BadgeValueId")
    protected BadgeValueId badgeValueId;
    @XmlElement(name = "BadgeValue")
    protected BadgeValue badgeValue;
    @XmlElement(name = "EventClassificationId")
    protected EventClassificationId eventClassificationId;
    @XmlElement(name = "EventClassification")
    protected EventClassification eventClassification;
    @XmlElement(name = "ClassTypeId")
    protected ClassTypeId classTypeId;
    @XmlElement(name = "ClassType")
    protected ClassType classType;
    @XmlElement(name = "TimeFactor", required = true)
    protected String timeFactor;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;

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
     * Gets the value of the classTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link ClassTypeId }
     *     
     */
    public ClassTypeId getClassTypeId() {
        return classTypeId;
    }

    /**
     * Sets the value of the classTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassTypeId }
     *     
     */
    public void setClassTypeId(ClassTypeId value) {
        this.classTypeId = value;
    }

    /**
     * Gets the value of the classType property.
     * 
     * @return
     *     possible object is
     *     {@link ClassType }
     *     
     */
    public ClassType getClassType() {
        return classType;
    }

    /**
     * Sets the value of the classType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassType }
     *     
     */
    public void setClassType(ClassType value) {
        this.classType = value;
    }

    /**
     * Gets the value of the timeFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFactor() {
        return timeFactor;
    }

    /**
     * Sets the value of the timeFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeFactor(String value) {
        this.timeFactor = value;
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


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
 *         &lt;element ref="{}EventRaceId"/&gt;
 *         &lt;element ref="{}Name"/&gt;
 *         &lt;element ref="{}RaceDate"/&gt;
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
    "eventRaceId",
    "name",
    "raceDate",
    "modifyDate"
})
@XmlRootElement(name = "EventRace")
public class EventRace {

    @XmlElement(name = "EventRaceId", required = true)
    protected String eventRaceId;
    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "RaceDate", required = true)
    protected RaceDate raceDate;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;

    /**
     * Gets the value of the eventRaceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventRaceId() {
        return eventRaceId;
    }

    /**
     * Sets the value of the eventRaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventRaceId(String value) {
        this.eventRaceId = value;
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
     * Gets the value of the raceDate property.
     * 
     * @return
     *     possible object is
     *     {@link RaceDate }
     *     
     */
    public RaceDate getRaceDate() {
        return raceDate;
    }

    /**
     * Sets the value of the raceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RaceDate }
     *     
     */
    public void setRaceDate(RaceDate value) {
        this.raceDate = value;
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

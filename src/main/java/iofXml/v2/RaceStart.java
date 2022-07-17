
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
 *         &lt;choice&gt;
 *           &lt;element ref="{}EventRaceId"/&gt;
 *           &lt;element ref="{}EventRace"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}Start"/&gt;
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
    "eventRace",
    "start"
})
@XmlRootElement(name = "RaceStart")
public class RaceStart {

    @XmlElement(name = "EventRaceId")
    protected String eventRaceId;
    @XmlElement(name = "EventRace")
    protected EventRace eventRace;
    @XmlElement(name = "Start", required = true)
    protected Start start;

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
     * Gets the value of the eventRace property.
     * 
     * @return
     *     possible object is
     *     {@link EventRace }
     *     
     */
    public EventRace getEventRace() {
        return eventRace;
    }

    /**
     * Sets the value of the eventRace property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventRace }
     *     
     */
    public void setEventRace(EventRace value) {
        this.eventRace = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Start }
     *     
     */
    public Start getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Start }
     *     
     */
    public void setStart(Start value) {
        this.start = value;
    }

}

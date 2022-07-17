
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
 *           &amp;lt;element ref="{}EventRaceId"/&amp;gt;
 *           &amp;lt;element ref="{}EventRace"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element ref="{}Result"/&amp;gt;
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
    "eventRaceId",
    "eventRace",
    "result"
})
@XmlRootElement(name = "RaceResult")
public class RaceResult {

    @XmlElement(name = "EventRaceId")
    protected String eventRaceId;
    @XmlElement(name = "EventRace")
    protected EventRace eventRace;
    @XmlElement(name = "Result", required = true)
    protected Result result;

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
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

}

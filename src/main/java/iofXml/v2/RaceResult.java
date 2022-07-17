
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
 *       <sequence>
 *         <choice>
 *           <element ref="{}EventRaceId"/>
 *           <element ref="{}EventRace"/>
 *         </choice>
 *         <element ref="{}Result"/>
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

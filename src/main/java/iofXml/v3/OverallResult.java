
package iofXml.v3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverallResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OverallResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="TimeBehind" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Position" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="Status" type="{http://www.orienteering.org/datastandard/3.0}ResultStatus"/>
 *         <element name="Score" type="{http://www.orienteering.org/datastandard/3.0}Score" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallResult", propOrder = {
    "time",
    "timeBehind",
    "position",
    "status",
    "score",
    "extensions"
})
public class OverallResult {

    /**
     * The time, in seconds, that is shown in the result list. Fractions of seconds (e.g. 258.7) may be used if the time resolution is higher than one second.
     * 
     */
    @XmlElement(name = "Time")
    protected Double time;
    /**
     * The time, in seconds, that the the person or team is behind the leader or winner. Fractions of seconds (e.g. 258.7) may be used if the time resolution is higher than one second.
     * 
     */
    @XmlElement(name = "TimeBehind")
    protected Double timeBehind;
    /**
     * The position in the result list for the person or team that the result belongs to. This element should only be present when the Status element is set to OK.
     * 
     */
    @XmlElement(name = "Position")
    protected BigInteger position;
    /**
     * The status of the result.
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected ResultStatus status;
    /**
     * Any scores that are attached to the result, e.g. World Ranking points.
     * 
     */
    @XmlElement(name = "Score")
    protected List<Score> score;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * The time, in seconds, that is shown in the result list. Fractions of seconds (e.g. 258.7) may be used if the time resolution is higher than one second.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     * @see #getTime()
     */
    public void setTime(Double value) {
        this.time = value;
    }

    /**
     * The time, in seconds, that the the person or team is behind the leader or winner. Fractions of seconds (e.g. 258.7) may be used if the time resolution is higher than one second.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTimeBehind() {
        return timeBehind;
    }

    /**
     * Sets the value of the timeBehind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     * @see #getTimeBehind()
     */
    public void setTimeBehind(Double value) {
        this.timeBehind = value;
    }

    /**
     * The position in the result list for the person or team that the result belongs to. This element should only be present when the Status element is set to OK.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getPosition()
     */
    public void setPosition(BigInteger value) {
        this.position = value;
    }

    /**
     * The status of the result.
     * 
     * @return
     *     possible object is
     *     {@link ResultStatus }
     *     
     */
    public ResultStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStatus }
     *     
     * @see #getStatus()
     */
    public void setStatus(ResultStatus value) {
        this.status = value;
    }

    /**
     * Any scores that are attached to the result, e.g. World Ranking points.
     * 
     * Gets the value of the score property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the score property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Score }
     * </p>
     * 
     * 
     * @return
     *     The value of the score property.
     */
    public List<Score> getScore() {
        if (score == null) {
            score = new ArrayList<>();
        }
        return this.score;
    }

    /**
     * Container element for custom elements from other schemas.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     * @see #getExtensions()
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

}

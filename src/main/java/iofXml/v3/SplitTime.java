
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Defines a split time at a control.
 * 
 * <p>Java class for SplitTime complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SplitTime">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ControlCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="status" default="OK">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             <enumeration value="OK"/>
 *             <enumeration value="Missing"/>
 *             <enumeration value="Additional"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitTime", propOrder = {
    "controlCode",
    "time",
    "extensions"
})
public class SplitTime {

    /**
     * The code of the control.
     * 
     */
    @XmlElement(name = "ControlCode", required = true)
    protected String controlCode;
    /**
     * The time, in seconds, elapsed from start to punching the control. Fractions of seconds (e.g. 258.7) may be used if the time resolution is higher than one second.
     * 
     */
    @XmlElement(name = "Time")
    protected Double time;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    /**
     * The status of the split time.
     * 
     */
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;

    /**
     * The code of the control.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlCode() {
        return controlCode;
    }

    /**
     * Sets the value of the controlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getControlCode()
     */
    public void setControlCode(String value) {
        this.controlCode = value;
    }

    /**
     * The time, in seconds, elapsed from start to punching the control. Fractions of seconds (e.g. 258.7) may be used if the time resolution is higher than one second.
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

    /**
     * The status of the split time.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        if (status == null) {
            return "OK";
        } else {
            return status;
        }
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

}

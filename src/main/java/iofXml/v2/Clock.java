
package iofXml.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="clockFormat" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="HH:MM:SS" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Clock")
public class Clock {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "clockFormat")
    @XmlSchemaType(name = "anySimpleType")
    protected String clockFormat;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the clockFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClockFormat() {
        if (clockFormat == null) {
            return "HH:MM:SS";
        } else {
            return clockFormat;
        }
    }

    /**
     * Sets the value of the clockFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClockFormat(String value) {
        this.clockFormat = value;
    }

}

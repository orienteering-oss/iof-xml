
package iofXml.v3;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines extra information for a relay leg.
 * 
 * <p>Java class for Leg complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Leg">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="minNumberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       <attribute name="maxNumberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Leg", propOrder = {
    "name",
    "extensions"
})
public class Leg {

    /**
     * The name of the leg, if not sequentially named.
     * 
     */
    @XmlElement(name = "Name")
    protected String name;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    /**
     * The minimum number of competitors in case of a parallel leg.
     * 
     */
    @XmlAttribute(name = "minNumberOfCompetitors")
    protected BigInteger minNumberOfCompetitors;
    /**
     * The maximum number of competitors in case of a parallel leg.
     * 
     */
    @XmlAttribute(name = "maxNumberOfCompetitors")
    protected BigInteger maxNumberOfCompetitors;

    /**
     * The name of the leg, if not sequentially named.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
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
     * The minimum number of competitors in case of a parallel leg.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinNumberOfCompetitors() {
        if (minNumberOfCompetitors == null) {
            return new BigInteger("1");
        } else {
            return minNumberOfCompetitors;
        }
    }

    /**
     * Sets the value of the minNumberOfCompetitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMinNumberOfCompetitors()
     */
    public void setMinNumberOfCompetitors(BigInteger value) {
        this.minNumberOfCompetitors = value;
    }

    /**
     * The maximum number of competitors in case of a parallel leg.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfCompetitors() {
        if (maxNumberOfCompetitors == null) {
            return new BigInteger("1");
        } else {
            return maxNumberOfCompetitors;
        }
    }

    /**
     * Sets the value of the maxNumberOfCompetitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaxNumberOfCompetitors()
     */
    public void setMaxNumberOfCompetitors(BigInteger value) {
        this.maxNumberOfCompetitors = value;
    }

}

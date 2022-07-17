
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PersonName">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Family" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Given" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonName", propOrder = {
    "family",
    "given"
})
public class PersonName {

    @XmlElement(name = "Family", required = true)
    protected String family;
    @XmlElement(name = "Given", required = true)
    protected String given;

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

    /**
     * Gets the value of the given property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiven() {
        return given;
    }

    /**
     * Sets the value of the given property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiven(String value) {
        this.given = value;
    }

}


package iofXml.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="value" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             <enumeration value="ARG"/>
 *             <enumeration value="AUS"/>
 *             <enumeration value="AUT"/>
 *             <enumeration value="BEL"/>
 *             <enumeration value="BLR"/>
 *             <enumeration value="BRA"/>
 *             <enumeration value="BUL"/>
 *             <enumeration value="CAN"/>
 *             <enumeration value="CHI"/>
 *             <enumeration value="CHN"/>
 *             <enumeration value="COL"/>
 *             <enumeration value="CRO"/>
 *             <enumeration value="CUB"/>
 *             <enumeration value="CZE"/>
 *             <enumeration value="DEN"/>
 *             <enumeration value="ECU"/>
 *             <enumeration value="ESP"/>
 *             <enumeration value="EST"/>
 *             <enumeration value="FIN"/>
 *             <enumeration value="FRA"/>
 *             <enumeration value="GBR"/>
 *             <enumeration value="GER"/>
 *             <enumeration value="GRE"/>
 *             <enumeration value="HKG"/>
 *             <enumeration value="HUN"/>
 *             <enumeration value="INA"/>
 *             <enumeration value="IND"/>
 *             <enumeration value="IRL"/>
 *             <enumeration value="ISR"/>
 *             <enumeration value="ITA"/>
 *             <enumeration value="JAM"/>
 *             <enumeration value="JPN"/>
 *             <enumeration value="KAZ"/>
 *             <enumeration value="KOR"/>
 *             <enumeration value="LAT"/>
 *             <enumeration value="LTU"/>
 *             <enumeration value="MAS"/>
 *             <enumeration value="MDA"/>
 *             <enumeration value="MKD"/>
 *             <enumeration value="NED"/>
 *             <enumeration value="NOR"/>
 *             <enumeration value="NZL"/>
 *             <enumeration value="PAK"/>
 *             <enumeration value="POL"/>
 *             <enumeration value="POR"/>
 *             <enumeration value="PRK"/>
 *             <enumeration value="ROM"/>
 *             <enumeration value="RSA"/>
 *             <enumeration value="RUS"/>
 *             <enumeration value="SLO"/>
 *             <enumeration value="SUI"/>
 *             <enumeration value="SVK"/>
 *             <enumeration value="SWE"/>
 *             <enumeration value="TPE"/>
 *             <enumeration value="UKR"/>
 *             <enumeration value="URU"/>
 *             <enumeration value="USA"/>
 *             <enumeration value="VEN"/>
 *             <enumeration value="YOG"/>
 *             <enumeration value="other"/>
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
@XmlType(name = "")
@XmlRootElement(name = "CountryId")
public class CountryId {

    @XmlAttribute(name = "value", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}


package iofXml.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="value" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="ARG"/&gt;
 *             &lt;enumeration value="AUS"/&gt;
 *             &lt;enumeration value="AUT"/&gt;
 *             &lt;enumeration value="BEL"/&gt;
 *             &lt;enumeration value="BLR"/&gt;
 *             &lt;enumeration value="BRA"/&gt;
 *             &lt;enumeration value="BUL"/&gt;
 *             &lt;enumeration value="CAN"/&gt;
 *             &lt;enumeration value="CHI"/&gt;
 *             &lt;enumeration value="CHN"/&gt;
 *             &lt;enumeration value="COL"/&gt;
 *             &lt;enumeration value="CRO"/&gt;
 *             &lt;enumeration value="CUB"/&gt;
 *             &lt;enumeration value="CZE"/&gt;
 *             &lt;enumeration value="DEN"/&gt;
 *             &lt;enumeration value="ECU"/&gt;
 *             &lt;enumeration value="ESP"/&gt;
 *             &lt;enumeration value="EST"/&gt;
 *             &lt;enumeration value="FIN"/&gt;
 *             &lt;enumeration value="FRA"/&gt;
 *             &lt;enumeration value="GBR"/&gt;
 *             &lt;enumeration value="GER"/&gt;
 *             &lt;enumeration value="GRE"/&gt;
 *             &lt;enumeration value="HKG"/&gt;
 *             &lt;enumeration value="HUN"/&gt;
 *             &lt;enumeration value="INA"/&gt;
 *             &lt;enumeration value="IND"/&gt;
 *             &lt;enumeration value="IRL"/&gt;
 *             &lt;enumeration value="ISR"/&gt;
 *             &lt;enumeration value="ITA"/&gt;
 *             &lt;enumeration value="JAM"/&gt;
 *             &lt;enumeration value="JPN"/&gt;
 *             &lt;enumeration value="KAZ"/&gt;
 *             &lt;enumeration value="KOR"/&gt;
 *             &lt;enumeration value="LAT"/&gt;
 *             &lt;enumeration value="LTU"/&gt;
 *             &lt;enumeration value="MAS"/&gt;
 *             &lt;enumeration value="MDA"/&gt;
 *             &lt;enumeration value="MKD"/&gt;
 *             &lt;enumeration value="NED"/&gt;
 *             &lt;enumeration value="NOR"/&gt;
 *             &lt;enumeration value="NZL"/&gt;
 *             &lt;enumeration value="PAK"/&gt;
 *             &lt;enumeration value="POL"/&gt;
 *             &lt;enumeration value="POR"/&gt;
 *             &lt;enumeration value="PRK"/&gt;
 *             &lt;enumeration value="ROM"/&gt;
 *             &lt;enumeration value="RSA"/&gt;
 *             &lt;enumeration value="RUS"/&gt;
 *             &lt;enumeration value="SLO"/&gt;
 *             &lt;enumeration value="SUI"/&gt;
 *             &lt;enumeration value="SVK"/&gt;
 *             &lt;enumeration value="SWE"/&gt;
 *             &lt;enumeration value="TPE"/&gt;
 *             &lt;enumeration value="UKR"/&gt;
 *             &lt;enumeration value="URU"/&gt;
 *             &lt;enumeration value="USA"/&gt;
 *             &lt;enumeration value="VEN"/&gt;
 *             &lt;enumeration value="YOG"/&gt;
 *             &lt;enumeration value="other"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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

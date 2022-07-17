
package iofXml.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;attribute name="value" use="required"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&amp;gt;
 *             &amp;lt;enumeration value="ARG"/&amp;gt;
 *             &amp;lt;enumeration value="AUS"/&amp;gt;
 *             &amp;lt;enumeration value="AUT"/&amp;gt;
 *             &amp;lt;enumeration value="BEL"/&amp;gt;
 *             &amp;lt;enumeration value="BLR"/&amp;gt;
 *             &amp;lt;enumeration value="BRA"/&amp;gt;
 *             &amp;lt;enumeration value="BUL"/&amp;gt;
 *             &amp;lt;enumeration value="CAN"/&amp;gt;
 *             &amp;lt;enumeration value="CHI"/&amp;gt;
 *             &amp;lt;enumeration value="CHN"/&amp;gt;
 *             &amp;lt;enumeration value="COL"/&amp;gt;
 *             &amp;lt;enumeration value="CRO"/&amp;gt;
 *             &amp;lt;enumeration value="CUB"/&amp;gt;
 *             &amp;lt;enumeration value="CZE"/&amp;gt;
 *             &amp;lt;enumeration value="DEN"/&amp;gt;
 *             &amp;lt;enumeration value="ECU"/&amp;gt;
 *             &amp;lt;enumeration value="ESP"/&amp;gt;
 *             &amp;lt;enumeration value="EST"/&amp;gt;
 *             &amp;lt;enumeration value="FIN"/&amp;gt;
 *             &amp;lt;enumeration value="FRA"/&amp;gt;
 *             &amp;lt;enumeration value="GBR"/&amp;gt;
 *             &amp;lt;enumeration value="GER"/&amp;gt;
 *             &amp;lt;enumeration value="GRE"/&amp;gt;
 *             &amp;lt;enumeration value="HKG"/&amp;gt;
 *             &amp;lt;enumeration value="HUN"/&amp;gt;
 *             &amp;lt;enumeration value="INA"/&amp;gt;
 *             &amp;lt;enumeration value="IND"/&amp;gt;
 *             &amp;lt;enumeration value="IRL"/&amp;gt;
 *             &amp;lt;enumeration value="ISR"/&amp;gt;
 *             &amp;lt;enumeration value="ITA"/&amp;gt;
 *             &amp;lt;enumeration value="JAM"/&amp;gt;
 *             &amp;lt;enumeration value="JPN"/&amp;gt;
 *             &amp;lt;enumeration value="KAZ"/&amp;gt;
 *             &amp;lt;enumeration value="KOR"/&amp;gt;
 *             &amp;lt;enumeration value="LAT"/&amp;gt;
 *             &amp;lt;enumeration value="LTU"/&amp;gt;
 *             &amp;lt;enumeration value="MAS"/&amp;gt;
 *             &amp;lt;enumeration value="MDA"/&amp;gt;
 *             &amp;lt;enumeration value="MKD"/&amp;gt;
 *             &amp;lt;enumeration value="NED"/&amp;gt;
 *             &amp;lt;enumeration value="NOR"/&amp;gt;
 *             &amp;lt;enumeration value="NZL"/&amp;gt;
 *             &amp;lt;enumeration value="PAK"/&amp;gt;
 *             &amp;lt;enumeration value="POL"/&amp;gt;
 *             &amp;lt;enumeration value="POR"/&amp;gt;
 *             &amp;lt;enumeration value="PRK"/&amp;gt;
 *             &amp;lt;enumeration value="ROM"/&amp;gt;
 *             &amp;lt;enumeration value="RSA"/&amp;gt;
 *             &amp;lt;enumeration value="RUS"/&amp;gt;
 *             &amp;lt;enumeration value="SLO"/&amp;gt;
 *             &amp;lt;enumeration value="SUI"/&amp;gt;
 *             &amp;lt;enumeration value="SVK"/&amp;gt;
 *             &amp;lt;enumeration value="SWE"/&amp;gt;
 *             &amp;lt;enumeration value="TPE"/&amp;gt;
 *             &amp;lt;enumeration value="UKR"/&amp;gt;
 *             &amp;lt;enumeration value="URU"/&amp;gt;
 *             &amp;lt;enumeration value="USA"/&amp;gt;
 *             &amp;lt;enumeration value="VEN"/&amp;gt;
 *             &amp;lt;enumeration value="YOG"/&amp;gt;
 *             &amp;lt;enumeration value="other"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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

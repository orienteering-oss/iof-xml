
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
 *             &lt;enumeration value="Inactive"/&gt;
 *             &lt;enumeration value="DidNotStart"/&gt;
 *             &lt;enumeration value="Active"/&gt;
 *             &lt;enumeration value="Finished"/&gt;
 *             &lt;enumeration value="OK"/&gt;
 *             &lt;enumeration value="MisPunch"/&gt;
 *             &lt;enumeration value="DidNotFinish"/&gt;
 *             &lt;enumeration value="Disqualified"/&gt;
 *             &lt;enumeration value="NotCompeting"/&gt;
 *             &lt;enumeration value="SportWithdr"/&gt;
 *             &lt;enumeration value="OverTime"/&gt;
 *             &lt;enumeration value="Moved"/&gt;
 *             &lt;enumeration value="MovedUp"/&gt;
 *             &lt;enumeration value="Cancelled"/&gt;
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
@XmlRootElement(name = "CompetitorStatus")
public class CompetitorStatus {

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

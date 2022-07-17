
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{}Address"/&gt;
 *         &lt;element ref="{}Tele"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressAndTele"
})
@XmlRootElement(name = "EntryData")
public class EntryData {

    @XmlElements({
        @XmlElement(name = "Address", type = Address.class),
        @XmlElement(name = "Tele", type = Tele.class)
    })
    protected List<Object> addressAndTele;

    /**
     * Gets the value of the addressAndTele property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressAndTele property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressAndTele().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * {@link Tele }
     * 
     * 
     */
    public List<Object> getAddressAndTele() {
        if (addressAndTele == null) {
            addressAndTele = new ArrayList<Object>();
        }
        return this.addressAndTele;
    }

}

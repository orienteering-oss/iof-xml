
package iofXml.v3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://www.orienteering.org/datastandard/3.0}BaseMessageElement">
 *       <sequence>
 *         <element name="Competitor" type="{http://www.orienteering.org/datastandard/3.0}Competitor" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "competitor",
    "extensions"
})
@XmlRootElement(name = "CompetitorList")
public class CompetitorList
    extends BaseMessageElement
{

    @XmlElement(name = "Competitor")
    protected List<Competitor> competitor;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * Gets the value of the competitor property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competitor property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCompetitor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Competitor }
     * </p>
     * 
     * 
     * @return
     *     The value of the competitor property.
     */
    public List<Competitor> getCompetitor() {
        if (competitor == null) {
            competitor = new ArrayList<>();
        }
        return this.competitor;
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

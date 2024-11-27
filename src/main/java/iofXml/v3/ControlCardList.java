
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
 *         <element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ControlCard" type="{http://www.orienteering.org/datastandard/3.0}ControlCard" maxOccurs="unbounded"/>
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
    "owner",
    "controlCard",
    "extensions"
})
@XmlRootElement(name = "ControlCardList")
public class ControlCardList
    extends BaseMessageElement
{

    /**
     * The owner of the control cards.
     * 
     */
    @XmlElement(name = "Owner")
    protected String owner;
    /**
     * The control cards.
     * 
     */
    @XmlElement(name = "ControlCard", required = true)
    protected List<ControlCard> controlCard;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * The owner of the control cards.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOwner()
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * The control cards.
     * 
     * Gets the value of the controlCard property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlCard property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getControlCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlCard }
     * </p>
     * 
     * 
     * @return
     *     The value of the controlCard property.
     */
    public List<ControlCard> getControlCard() {
        if (controlCard == null) {
            controlCard = new ArrayList<>();
        }
        return this.controlCard;
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

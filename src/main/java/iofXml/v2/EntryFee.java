
package iofXml.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{}EntryFeeId" minOccurs="0"/>
 *         <element ref="{}Name" minOccurs="0"/>
 *         <element ref="{}Amount"/>
 *         <element ref="{}ModifyDate" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="taxIncluded" default="Y">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             <enumeration value="Y"/>
 *             <enumeration value="N"/>
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
@XmlType(name = "", propOrder = {
    "entryFeeId",
    "name",
    "amount",
    "modifyDate"
})
@XmlRootElement(name = "EntryFee")
public class EntryFee {

    @XmlElement(name = "EntryFeeId")
    protected EntryFeeId entryFeeId;
    @XmlElement(name = "Name")
    protected Name name;
    @XmlElement(name = "Amount", required = true)
    protected Amount amount;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlAttribute(name = "taxIncluded")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxIncluded;

    /**
     * Gets the value of the entryFeeId property.
     * 
     * @return
     *     possible object is
     *     {@link EntryFeeId }
     *     
     */
    public EntryFeeId getEntryFeeId() {
        return entryFeeId;
    }

    /**
     * Sets the value of the entryFeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryFeeId }
     *     
     */
    public void setEntryFeeId(EntryFeeId value) {
        this.entryFeeId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the modifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyDate }
     *     
     */
    public ModifyDate getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the value of the modifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyDate }
     *     
     */
    public void setModifyDate(ModifyDate value) {
        this.modifyDate = value;
    }

    /**
     * Gets the value of the taxIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIncluded() {
        if (taxIncluded == null) {
            return "Y";
        } else {
            return taxIncluded;
        }
    }

    /**
     * Sets the value of the taxIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIncluded(String value) {
        this.taxIncluded = value;
    }

}


package iofXml.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{}CCardId"/>
 *         <element ref="{}PunchingUnitType"/>
 *         <element ref="{}ModifyDate" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="miscData" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cCardId",
    "punchingUnitType",
    "modifyDate"
})
@XmlRootElement(name = "CCard")
public class CCard {

    @XmlElement(name = "CCardId", required = true)
    protected String cCardId;
    @XmlElement(name = "PunchingUnitType", required = true)
    protected PunchingUnitType punchingUnitType;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlAttribute(name = "miscData")
    @XmlSchemaType(name = "anySimpleType")
    protected String miscData;

    /**
     * Gets the value of the cCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCardId() {
        return cCardId;
    }

    /**
     * Sets the value of the cCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCardId(String value) {
        this.cCardId = value;
    }

    /**
     * Gets the value of the punchingUnitType property.
     * 
     * @return
     *     possible object is
     *     {@link PunchingUnitType }
     *     
     */
    public PunchingUnitType getPunchingUnitType() {
        return punchingUnitType;
    }

    /**
     * Sets the value of the punchingUnitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PunchingUnitType }
     *     
     */
    public void setPunchingUnitType(PunchingUnitType value) {
        this.punchingUnitType = value;
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
     * Gets the value of the miscData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiscData() {
        return miscData;
    }

    /**
     * Sets the value of the miscData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiscData(String value) {
        this.miscData = value;
    }

}

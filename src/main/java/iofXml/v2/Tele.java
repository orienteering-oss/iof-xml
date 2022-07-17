
package iofXml.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{}TeleType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}ModifyDate" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
 *       &amp;lt;attribute name="faxNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
 *       &amp;lt;attribute name="mobilePhoneNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
 *       &amp;lt;attribute name="mailAddress" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teleType",
    "modifyDate"
})
@XmlRootElement(name = "Tele")
public class Tele {

    @XmlElement(name = "TeleType")
    protected TeleType teleType;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlAttribute(name = "phoneNumber")
    @XmlSchemaType(name = "anySimpleType")
    protected String phoneNumber;
    @XmlAttribute(name = "faxNumber")
    @XmlSchemaType(name = "anySimpleType")
    protected String faxNumber;
    @XmlAttribute(name = "mobilePhoneNumber")
    @XmlSchemaType(name = "anySimpleType")
    protected String mobilePhoneNumber;
    @XmlAttribute(name = "mailAddress")
    @XmlSchemaType(name = "anySimpleType")
    protected String mailAddress;

    /**
     * Gets the value of the teleType property.
     * 
     * @return
     *     possible object is
     *     {@link TeleType }
     *     
     */
    public TeleType getTeleType() {
        return teleType;
    }

    /**
     * Sets the value of the teleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeleType }
     *     
     */
    public void setTeleType(TeleType value) {
        this.teleType = value;
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
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the mobilePhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Sets the value of the mobilePhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhoneNumber(String value) {
        this.mobilePhoneNumber = value;
    }

    /**
     * Gets the value of the mailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * Sets the value of the mailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailAddress(String value) {
        this.mailAddress = value;
    }

}

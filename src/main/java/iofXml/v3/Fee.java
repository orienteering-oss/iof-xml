
package iofXml.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A fee that applies when entering a class at a race or ordering a service.
 * 
 * <p>Java class for Fee complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Fee">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="Name" type="{http://www.orienteering.org/datastandard/3.0}LanguageString" maxOccurs="unbounded"/>
 *         <element name="Amount" type="{http://www.orienteering.org/datastandard/3.0}Amount" minOccurs="0"/>
 *         <element name="TaxableAmount" type="{http://www.orienteering.org/datastandard/3.0}Amount" minOccurs="0"/>
 *         <element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="TaxablePercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="ValidFromTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="ValidToTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="FromDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ToDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="type" default="Normal">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             <enumeration value="Normal"/>
 *             <enumeration value="Late"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee", propOrder = {
    "id",
    "name",
    "amount",
    "taxableAmount",
    "percentage",
    "taxablePercentage",
    "validFromTime",
    "validToTime",
    "fromDateOfBirth",
    "toDateOfBirth",
    "extensions"
})
public class Fee {

    @XmlElement(name = "Id")
    protected Id id;
    /**
     * A describing name of the fee, e.g. 'Late entry fee'.
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected List<LanguageString> name;
    /**
     * The fee amount, optionally including currency code. This element must not be present if a Percentage element exists.
     * 
     */
    @XmlElement(name = "Amount")
    protected Amount amount;
    /**
     * The fee amount that is taxable, i.e. considered when calculating taxes for an event. This element must not be present if a Percentage element exists, or if an Amount element does not exist.
     * 
     */
    @XmlElement(name = "TaxableAmount")
    protected Amount taxableAmount;
    /**
     * The percentage to increase or decrease already existing fees in a fee list with. This element must not be present if an Amount element exists.
     * 
     */
    @XmlElement(name = "Percentage")
    protected Double percentage;
    /**
     * The percentage to increase or decrease already existing taxable fees in a fee list with. This element must not be present if an Amount element exists, or if a Percentage element does not exist.
     * 
     */
    @XmlElement(name = "TaxablePercentage")
    protected Double taxablePercentage;
    /**
     * The time when the fee takes effect.
     * 
     */
    @XmlElement(name = "ValidFromTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFromTime;
    /**
     * The time when the fee expires.
     * 
     */
    @XmlElement(name = "ValidToTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validToTime;
    /**
     * The start of the birth date interval that the fee should be applied to. Omit if no lower birth date restriction.
     * 
     */
    @XmlElement(name = "FromDateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDateOfBirth;
    /**
     * The end of the birth date interval that the fee should be applied to. Omit if no upper birth date restriction.
     * 
     */
    @XmlElement(name = "ToDateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDateOfBirth;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    /**
     * The type of fee.
     * 
     */
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * A describing name of the fee, e.g. 'Late entry fee'.
     * 
     * Gets the value of the name property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageString }
     * </p>
     * 
     * 
     * @return
     *     The value of the name property.
     */
    public List<LanguageString> getName() {
        if (name == null) {
            name = new ArrayList<>();
        }
        return this.name;
    }

    /**
     * The fee amount, optionally including currency code. This element must not be present if a Percentage element exists.
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
     * @see #getAmount()
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * The fee amount that is taxable, i.e. considered when calculating taxes for an event. This element must not be present if a Percentage element exists, or if an Amount element does not exist.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Sets the value of the taxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     * @see #getTaxableAmount()
     */
    public void setTaxableAmount(Amount value) {
        this.taxableAmount = value;
    }

    /**
     * The percentage to increase or decrease already existing fees in a fee list with. This element must not be present if an Amount element exists.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     * @see #getPercentage()
     */
    public void setPercentage(Double value) {
        this.percentage = value;
    }

    /**
     * The percentage to increase or decrease already existing taxable fees in a fee list with. This element must not be present if an Amount element exists, or if a Percentage element does not exist.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxablePercentage() {
        return taxablePercentage;
    }

    /**
     * Sets the value of the taxablePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     * @see #getTaxablePercentage()
     */
    public void setTaxablePercentage(Double value) {
        this.taxablePercentage = value;
    }

    /**
     * The time when the fee takes effect.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFromTime() {
        return validFromTime;
    }

    /**
     * Sets the value of the validFromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getValidFromTime()
     */
    public void setValidFromTime(XMLGregorianCalendar value) {
        this.validFromTime = value;
    }

    /**
     * The time when the fee expires.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidToTime() {
        return validToTime;
    }

    /**
     * Sets the value of the validToTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getValidToTime()
     */
    public void setValidToTime(XMLGregorianCalendar value) {
        this.validToTime = value;
    }

    /**
     * The start of the birth date interval that the fee should be applied to. Omit if no lower birth date restriction.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDateOfBirth() {
        return fromDateOfBirth;
    }

    /**
     * Sets the value of the fromDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getFromDateOfBirth()
     */
    public void setFromDateOfBirth(XMLGregorianCalendar value) {
        this.fromDateOfBirth = value;
    }

    /**
     * The end of the birth date interval that the fee should be applied to. Omit if no upper birth date restriction.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDateOfBirth() {
        return toDateOfBirth;
    }

    /**
     * Sets the value of the toDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getToDateOfBirth()
     */
    public void setToDateOfBirth(XMLGregorianCalendar value) {
        this.toDateOfBirth = value;
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

    /**
     * The type of fee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "Normal";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the modifyTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifyTime() {
        return modifyTime;
    }

    /**
     * Sets the value of the modifyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifyTime(XMLGregorianCalendar value) {
        this.modifyTime = value;
    }

}

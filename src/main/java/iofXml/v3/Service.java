
package iofXml.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Defines a general purpose service request, e.g. for rental card or accomodation.
 *       
 * 
 * &lt;p&gt;Java class for Service complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Service"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.orienteering.org/datastandard/3.0}LanguageString" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="Fee" type="{http://www.orienteering.org/datastandard/3.0}Fee" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Description" type="{http://www.orienteering.org/datastandard/3.0}LanguageString" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MaxNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RequestedNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *       &amp;lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "id",
    "name",
    "fee",
    "description",
    "maxNumber",
    "requestedNumber",
    "extensions"
})
public class Service {

    @XmlElement(name = "Id")
    protected Id id;
    @XmlElement(name = "Name", required = true)
    protected List<LanguageString> name;
    @XmlElement(name = "Fee")
    protected List<Fee> fee;
    @XmlElement(name = "Description")
    protected List<LanguageString> description;
    @XmlElement(name = "MaxNumber")
    protected Double maxNumber;
    @XmlElement(name = "RequestedNumber")
    protected Double requestedNumber;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "type")
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
     * Gets the value of the name property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the name property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getName().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageString }
     * 
     * 
     */
    public List<LanguageString> getName() {
        if (name == null) {
            name = new ArrayList<LanguageString>();
        }
        return this.name;
    }

    /**
     * Gets the value of the fee property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the fee property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFee().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
     * 
     * 
     */
    public List<Fee> getFee() {
        if (fee == null) {
            fee = new ArrayList<Fee>();
        }
        return this.fee;
    }

    /**
     * Gets the value of the description property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the description property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDescription().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageString }
     * 
     * 
     */
    public List<LanguageString> getDescription() {
        if (description == null) {
            description = new ArrayList<LanguageString>();
        }
        return this.description;
    }

    /**
     * Gets the value of the maxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxNumber() {
        return maxNumber;
    }

    /**
     * Sets the value of the maxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxNumber(Double value) {
        this.maxNumber = value;
    }

    /**
     * Gets the value of the requestedNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRequestedNumber() {
        return requestedNumber;
    }

    /**
     * Sets the value of the requestedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRequestedNumber(Double value) {
        this.requestedNumber = value;
    }

    /**
     * Gets the value of the extensions property.
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
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
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

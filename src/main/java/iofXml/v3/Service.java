
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


/**
 * Defines a general purpose service request, e.g. for rental card or accomodation.
 * 
 * <p>Java class for Service complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Service">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="Name" type="{http://www.orienteering.org/datastandard/3.0}LanguageString" maxOccurs="unbounded"/>
 *         <element name="Fee" type="{http://www.orienteering.org/datastandard/3.0}Fee" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Description" type="{http://www.orienteering.org/datastandard/3.0}LanguageString" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MaxNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="RequestedNumber" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    /**
     * The name of the service.
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected List<LanguageString> name;
    /**
     * The fees attached to this service.
     * 
     */
    @XmlElement(name = "Fee")
    protected List<Fee> fee;
    /**
     * A further description of the service than the Name element gives.
     * 
     */
    @XmlElement(name = "Description")
    protected List<LanguageString> description;
    /**
     * The maximum number of instances of this service that are available. Omit this element if there is no such limit.
     * 
     */
    @XmlElement(name = "MaxNumber")
    protected Double maxNumber;
    /**
     * The number of instances of this service that has been requested.
     * 
     */
    @XmlElement(name = "RequestedNumber")
    protected Double requestedNumber;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    /**
     * Used to mark special services, e.g. rental cards whose fees that are to be used in entry scenarios.
     * 
     */
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
     * The name of the service.
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
     * The fees attached to this service.
     * 
     * Gets the value of the fee property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
     * </p>
     * 
     * 
     * @return
     *     The value of the fee property.
     */
    public List<Fee> getFee() {
        if (fee == null) {
            fee = new ArrayList<>();
        }
        return this.fee;
    }

    /**
     * A further description of the service than the Name element gives.
     * 
     * Gets the value of the description property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDescription().add(newItem);
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
     *     The value of the description property.
     */
    public List<LanguageString> getDescription() {
        if (description == null) {
            description = new ArrayList<>();
        }
        return this.description;
    }

    /**
     * The maximum number of instances of this service that are available. Omit this element if there is no such limit.
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
     * @see #getMaxNumber()
     */
    public void setMaxNumber(Double value) {
        this.maxNumber = value;
    }

    /**
     * The number of instances of this service that has been requested.
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
     * @see #getRequestedNumber()
     */
    public void setRequestedNumber(Double value) {
        this.requestedNumber = value;
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
     * Used to mark special services, e.g. rental cards whose fees that are to be used in entry scenarios.
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

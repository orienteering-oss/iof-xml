
package iofXml.v3;

import java.math.BigInteger;
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
 * Information about an organisation, i.e. address, contact person(s) etc. An organisation is a general term including federations, clubs, etc.
 * 
 * <p>Java class for Organisation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Organisation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MediaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ParentOrganisationId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="Country" type="{http://www.orienteering.org/datastandard/3.0}Country" minOccurs="0"/>
 *         <element name="Address" type="{http://www.orienteering.org/datastandard/3.0}Address" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Contact" type="{http://www.orienteering.org/datastandard/3.0}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Position" type="{http://www.orienteering.org/datastandard/3.0}GeoPosition" minOccurs="0"/>
 *         <element name="Account" type="{http://www.orienteering.org/datastandard/3.0}Account" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Role" type="{http://www.orienteering.org/datastandard/3.0}Role" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Logotype" type="{http://www.orienteering.org/datastandard/3.0}Image" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="type">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             <enumeration value="IOF"/>
 *             <enumeration value="IOFRegion"/>
 *             <enumeration value="NationalFederation"/>
 *             <enumeration value="NationalRegion"/>
 *             <enumeration value="Club"/>
 *             <enumeration value="School"/>
 *             <enumeration value="Company"/>
 *             <enumeration value="Military"/>
 *             <enumeration value="Other"/>
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
@XmlType(name = "Organisation", propOrder = {
    "id",
    "name",
    "shortName",
    "mediaName",
    "parentOrganisationId",
    "country",
    "address",
    "contact",
    "position",
    "account",
    "role",
    "logotype",
    "extensions"
})
public class Organisation {

    @XmlElement(name = "Id")
    protected Id id;
    /**
     * The full name of the organisation.
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * The short (abbreviated) name of the organisation.
     * 
     */
    @XmlElement(name = "ShortName")
    protected String shortName;
    /**
     * The name of the organisation as appearing in result lists targeted to media.
     * 
     */
    @XmlElement(name = "MediaName")
    protected String mediaName;
    /**
     * The id of the parent of this organisation, e.g. a regional organisation for a club.
     * 
     */
    @XmlElement(name = "ParentOrganisationId")
    protected BigInteger parentOrganisationId;
    @XmlElement(name = "Country")
    protected Country country;
    @XmlElement(name = "Address")
    protected List<Address> address;
    @XmlElement(name = "Contact")
    protected List<Contact> contact;
    /**
     * The geographical location of the organisation, e.g. a city center, an office or a club house.
     * 
     */
    @XmlElement(name = "Position")
    protected GeoPosition position;
    @XmlElement(name = "Account")
    protected List<Account> account;
    /**
     * Persons having certain roles within the organisation, e.g. chairman, secretary, and treasurer.
     * 
     */
    @XmlElement(name = "Role")
    protected List<Role> role;
    /**
     * The logotype for the organisation. Multiple logotypes may be included; in this case, make sure to include width and height attributes.
     * 
     */
    @XmlElement(name = "Logotype")
    protected List<Image> logotype;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    /**
     * The hierarchical level or type of an organisation.
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
     * The full name of the organisation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * The short (abbreviated) name of the organisation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getShortName()
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * The name of the organisation as appearing in result lists targeted to media.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaName() {
        return mediaName;
    }

    /**
     * Sets the value of the mediaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMediaName()
     */
    public void setMediaName(String value) {
        this.mediaName = value;
    }

    /**
     * The id of the parent of this organisation, e.g. a regional organisation for a club.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentOrganisationId() {
        return parentOrganisationId;
    }

    /**
     * Sets the value of the parentOrganisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getParentOrganisationId()
     */
    public void setParentOrganisationId(BigInteger value) {
        this.parentOrganisationId = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * </p>
     * 
     * 
     * @return
     *     The value of the address property.
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<>();
        }
        return this.address;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * </p>
     * 
     * 
     * @return
     *     The value of the contact property.
     */
    public List<Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<>();
        }
        return this.contact;
    }

    /**
     * The geographical location of the organisation, e.g. a city center, an office or a club house.
     * 
     * @return
     *     possible object is
     *     {@link GeoPosition }
     *     
     */
    public GeoPosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoPosition }
     *     
     * @see #getPosition()
     */
    public void setPosition(GeoPosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * </p>
     * 
     * 
     * @return
     *     The value of the account property.
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<>();
        }
        return this.account;
    }

    /**
     * Persons having certain roles within the organisation, e.g. chairman, secretary, and treasurer.
     * 
     * Gets the value of the role property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Role }
     * </p>
     * 
     * 
     * @return
     *     The value of the role property.
     */
    public List<Role> getRole() {
        if (role == null) {
            role = new ArrayList<>();
        }
        return this.role;
    }

    /**
     * The logotype for the organisation. Multiple logotypes may be included; in this case, make sure to include width and height attributes.
     * 
     * Gets the value of the logotype property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logotype property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLogotype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Image }
     * </p>
     * 
     * 
     * @return
     *     The value of the logotype property.
     */
    public List<Image> getLogotype() {
        if (logotype == null) {
            logotype = new ArrayList<>();
        }
        return this.logotype;
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
     * The hierarchical level or type of an organisation.
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

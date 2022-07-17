
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element ref="{}Account"/>
 *         <element ref="{}ForeignAccount" minOccurs="0"/>
 *         <element ref="{}Date"/>
 *         <element ref="{}Amount"/>
 *         <choice>
 *           <element ref="{}ClubId"/>
 *           <element ref="{}Club"/>
 *           <element ref="{}OrganisationId"/>
 *           <element ref="{}Organisation"/>
 *         </choice>
 *         <choice maxOccurs="unbounded" minOccurs="0">
 *           <element ref="{}PersonId"/>
 *           <element ref="{}Person"/>
 *         </choice>
 *         <element ref="{}EntryId" maxOccurs="unbounded" minOccurs="0"/>
 *         <choice maxOccurs="unbounded" minOccurs="0">
 *           <element ref="{}ServiceOrderNumber"/>
 *           <element ref="{}ServiceId"/>
 *           <element ref="{}Service"/>
 *         </choice>
 *         <element ref="{}ModifyDate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "account",
    "foreignAccount",
    "date",
    "amount",
    "clubId",
    "club",
    "organisationId",
    "organisation",
    "personIdOrPerson",
    "entryId",
    "serviceOrderNumberOrServiceIdOrService",
    "modifyDate"
})
@XmlRootElement(name = "Transaction")
public class Transaction {

    @XmlElement(name = "Account", required = true)
    protected Account account;
    @XmlElement(name = "ForeignAccount")
    protected ForeignAccount foreignAccount;
    @XmlElement(name = "Date", required = true)
    protected Date date;
    @XmlElement(name = "Amount", required = true)
    protected Amount amount;
    @XmlElement(name = "ClubId")
    protected ClubId clubId;
    @XmlElement(name = "Club")
    protected Club club;
    @XmlElement(name = "OrganisationId")
    protected OrganisationId organisationId;
    @XmlElement(name = "Organisation")
    protected Organisation organisation;
    @XmlElements({
        @XmlElement(name = "PersonId", type = PersonId.class),
        @XmlElement(name = "Person", type = Person.class)
    })
    protected List<Object> personIdOrPerson;
    @XmlElement(name = "EntryId")
    protected List<String> entryId;
    @XmlElementRefs({
        @XmlElementRef(name = "ServiceOrderNumber", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ServiceId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Service", type = Service.class, required = false)
    })
    protected List<Object> serviceOrderNumberOrServiceIdOrService;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Account }
     *     
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account }
     *     
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the foreignAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignAccount }
     *     
     */
    public ForeignAccount getForeignAccount() {
        return foreignAccount;
    }

    /**
     * Sets the value of the foreignAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignAccount }
     *     
     */
    public void setForeignAccount(ForeignAccount value) {
        this.foreignAccount = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
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
     * Gets the value of the clubId property.
     * 
     * @return
     *     possible object is
     *     {@link ClubId }
     *     
     */
    public ClubId getClubId() {
        return clubId;
    }

    /**
     * Sets the value of the clubId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClubId }
     *     
     */
    public void setClubId(ClubId value) {
        this.clubId = value;
    }

    /**
     * Gets the value of the club property.
     * 
     * @return
     *     possible object is
     *     {@link Club }
     *     
     */
    public Club getClub() {
        return club;
    }

    /**
     * Sets the value of the club property.
     * 
     * @param value
     *     allowed object is
     *     {@link Club }
     *     
     */
    public void setClub(Club value) {
        this.club = value;
    }

    /**
     * Gets the value of the organisationId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationId }
     *     
     */
    public OrganisationId getOrganisationId() {
        return organisationId;
    }

    /**
     * Sets the value of the organisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationId }
     *     
     */
    public void setOrganisationId(OrganisationId value) {
        this.organisationId = value;
    }

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation }
     *     
     */
    public Organisation getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation }
     *     
     */
    public void setOrganisation(Organisation value) {
        this.organisation = value;
    }

    /**
     * Gets the value of the personIdOrPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the personIdOrPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonIdOrPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person }
     * {@link PersonId }
     * 
     * 
     * @return
     *     The value of the personIdOrPerson property.
     */
    public List<Object> getPersonIdOrPerson() {
        if (personIdOrPerson == null) {
            personIdOrPerson = new ArrayList<>();
        }
        return this.personIdOrPerson;
    }

    /**
     * Gets the value of the entryId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the entryId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the entryId property.
     */
    public List<String> getEntryId() {
        if (entryId == null) {
            entryId = new ArrayList<>();
        }
        return this.entryId;
    }

    /**
     * Gets the value of the serviceOrderNumberOrServiceIdOrService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the serviceOrderNumberOrServiceIdOrService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceOrderNumberOrServiceIdOrService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Service }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     * @return
     *     The value of the serviceOrderNumberOrServiceIdOrService property.
     */
    public List<Object> getServiceOrderNumberOrServiceIdOrService() {
        if (serviceOrderNumberOrServiceIdOrService == null) {
            serviceOrderNumberOrServiceIdOrService = new ArrayList<>();
        }
        return this.serviceOrderNumberOrServiceIdOrService;
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

}

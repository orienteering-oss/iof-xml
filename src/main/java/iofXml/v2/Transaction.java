
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &amp;lt;element ref="{}Account"/&amp;gt;
 *         &amp;lt;element ref="{}ForeignAccount" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}Date"/&amp;gt;
 *         &amp;lt;element ref="{}Amount"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element ref="{}ClubId"/&amp;gt;
 *           &amp;lt;element ref="{}Club"/&amp;gt;
 *           &amp;lt;element ref="{}OrganisationId"/&amp;gt;
 *           &amp;lt;element ref="{}Organisation"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;element ref="{}PersonId"/&amp;gt;
 *           &amp;lt;element ref="{}Person"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element ref="{}EntryId" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;element ref="{}ServiceOrderNumber"/&amp;gt;
 *           &amp;lt;element ref="{}ServiceId"/&amp;gt;
 *           &amp;lt;element ref="{}Service"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element ref="{}ModifyDate" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the personIdOrPerson property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPersonIdOrPerson().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PersonId }
     * {@link Person }
     * 
     * 
     */
    public List<Object> getPersonIdOrPerson() {
        if (personIdOrPerson == null) {
            personIdOrPerson = new ArrayList<Object>();
        }
        return this.personIdOrPerson;
    }

    /**
     * Gets the value of the entryId property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the entryId property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEntryId().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEntryId() {
        if (entryId == null) {
            entryId = new ArrayList<String>();
        }
        return this.entryId;
    }

    /**
     * Gets the value of the serviceOrderNumberOrServiceIdOrService property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the serviceOrderNumberOrServiceIdOrService property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getServiceOrderNumberOrServiceIdOrService().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Service }
     * 
     * 
     */
    public List<Object> getServiceOrderNumberOrServiceIdOrService() {
        if (serviceOrderNumberOrServiceIdOrService == null) {
            serviceOrderNumberOrServiceIdOrService = new ArrayList<Object>();
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

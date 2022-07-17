
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}Account"/&gt;
 *         &lt;element ref="{}ForeignAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{}Date"/&gt;
 *         &lt;element ref="{}Amount"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}ClubId"/&gt;
 *           &lt;element ref="{}Club"/&gt;
 *           &lt;element ref="{}OrganisationId"/&gt;
 *           &lt;element ref="{}Organisation"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}PersonId"/&gt;
 *           &lt;element ref="{}Person"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}EntryId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}ServiceOrderNumber"/&gt;
 *           &lt;element ref="{}ServiceId"/&gt;
 *           &lt;element ref="{}Service"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}ModifyDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personIdOrPerson property.
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryId property.
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceOrderNumberOrServiceIdOrService property.
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

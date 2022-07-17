
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}EntryId" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;choice&gt;
 *               &lt;element ref="{}PersonId"/&gt;
 *               &lt;element ref="{}Person"/&gt;
 *             &lt;/choice&gt;
 *             &lt;element ref="{}CCard" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element ref="{}Rank" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{}TeamName"/&gt;
 *             &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *               &lt;choice minOccurs="0"&gt;
 *                 &lt;element ref="{}ClubId"/&gt;
 *                 &lt;element ref="{}Club"/&gt;
 *               &lt;/choice&gt;
 *               &lt;element ref="{}TeamSequence" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}EntryClass" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}AllocationControl" minOccurs="0"/&gt;
 *         &lt;element ref="{}EntryDate"/&gt;
 *         &lt;element ref="{}ModifyDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nonCompetitor" default="N"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Y"/&gt;
 *             &lt;enumeration value="N"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entryId",
    "personId",
    "person",
    "cCard",
    "rank",
    "teamName",
    "clubIdOrClubAndTeamSequence",
    "entryClass",
    "allocationControl",
    "entryDate",
    "modifyDate"
})
@XmlRootElement(name = "Entry")
public class Entry {

    @XmlElement(name = "EntryId")
    protected String entryId;
    @XmlElement(name = "PersonId")
    protected PersonId personId;
    @XmlElement(name = "Person")
    protected Person person;
    @XmlElement(name = "CCard")
    protected List<CCard> cCard;
    @XmlElement(name = "Rank")
    protected List<Rank> rank;
    @XmlElement(name = "TeamName")
    protected String teamName;
    @XmlElements({
        @XmlElement(name = "ClubId", type = ClubId.class),
        @XmlElement(name = "Club", type = Club.class),
        @XmlElement(name = "TeamSequence", type = String.class)
    })
    protected List<Object> clubIdOrClubAndTeamSequence;
    @XmlElement(name = "EntryClass")
    protected List<EntryClass> entryClass;
    @XmlElement(name = "AllocationControl")
    protected AllocationControl allocationControl;
    @XmlElement(name = "EntryDate", required = true)
    protected EntryDate entryDate;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlAttribute(name = "nonCompetitor")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String nonCompetitor;

    /**
     * Gets the value of the entryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * Sets the value of the entryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryId(String value) {
        this.entryId = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonId }
     *     
     */
    public PersonId getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonId }
     *     
     */
    public void setPersonId(PersonId value) {
        this.personId = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the cCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCard }
     * 
     * 
     */
    public List<CCard> getCCard() {
        if (cCard == null) {
            cCard = new ArrayList<CCard>();
        }
        return this.cCard;
    }

    /**
     * Gets the value of the rank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rank }
     * 
     * 
     */
    public List<Rank> getRank() {
        if (rank == null) {
            rank = new ArrayList<Rank>();
        }
        return this.rank;
    }

    /**
     * Gets the value of the teamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the value of the teamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

    /**
     * Gets the value of the clubIdOrClubAndTeamSequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clubIdOrClubAndTeamSequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClubIdOrClubAndTeamSequence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Club }
     * {@link ClubId }
     * {@link String }
     * 
     * 
     */
    public List<Object> getClubIdOrClubAndTeamSequence() {
        if (clubIdOrClubAndTeamSequence == null) {
            clubIdOrClubAndTeamSequence = new ArrayList<Object>();
        }
        return this.clubIdOrClubAndTeamSequence;
    }

    /**
     * Gets the value of the entryClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryClass }
     * 
     * 
     */
    public List<EntryClass> getEntryClass() {
        if (entryClass == null) {
            entryClass = new ArrayList<EntryClass>();
        }
        return this.entryClass;
    }

    /**
     * Gets the value of the allocationControl property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationControl }
     *     
     */
    public AllocationControl getAllocationControl() {
        return allocationControl;
    }

    /**
     * Sets the value of the allocationControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationControl }
     *     
     */
    public void setAllocationControl(AllocationControl value) {
        this.allocationControl = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link EntryDate }
     *     
     */
    public EntryDate getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryDate }
     *     
     */
    public void setEntryDate(EntryDate value) {
        this.entryDate = value;
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
     * Gets the value of the nonCompetitor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonCompetitor() {
        if (nonCompetitor == null) {
            return "N";
        } else {
            return nonCompetitor;
        }
    }

    /**
     * Sets the value of the nonCompetitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonCompetitor(String value) {
        this.nonCompetitor = value;
    }

}


package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <choice>
 *           <element ref="{}PersonId"/>
 *           <element ref="{}Person"/>
 *         </choice>
 *         <choice>
 *           <element ref="{}ClubId"/>
 *           <element ref="{}Club"/>
 *           <element ref="{}Country"/>
 *           <element ref="{}CountryId"/>
 *         </choice>
 *         <element ref="{}PreSelectedClass" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}CCard" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}Rank" maxOccurs="unbounded" minOccurs="0"/>
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
    "personId",
    "person",
    "clubId",
    "club",
    "country",
    "countryId",
    "preSelectedClass",
    "cCard",
    "rank",
    "modifyDate"
})
@XmlRootElement(name = "Competitor")
public class Competitor {

    @XmlElement(name = "PersonId")
    protected PersonId personId;
    @XmlElement(name = "Person")
    protected Person person;
    @XmlElement(name = "ClubId")
    protected ClubId clubId;
    @XmlElement(name = "Club")
    protected Club club;
    @XmlElement(name = "Country")
    protected Country country;
    @XmlElement(name = "CountryId")
    protected CountryId countryId;
    @XmlElement(name = "PreSelectedClass")
    protected List<PreSelectedClass> preSelectedClass;
    @XmlElement(name = "CCard")
    protected List<CCard> cCard;
    @XmlElement(name = "Rank")
    protected List<Rank> rank;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;

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
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link CountryId }
     *     
     */
    public CountryId getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryId }
     *     
     */
    public void setCountryId(CountryId value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the preSelectedClass property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preSelectedClass property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPreSelectedClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreSelectedClass }
     * </p>
     * 
     * 
     * @return
     *     The value of the preSelectedClass property.
     */
    public List<PreSelectedClass> getPreSelectedClass() {
        if (preSelectedClass == null) {
            preSelectedClass = new ArrayList<>();
        }
        return this.preSelectedClass;
    }

    /**
     * Gets the value of the cCard property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cCard property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCard }
     * </p>
     * 
     * 
     * @return
     *     The value of the cCard property.
     */
    public List<CCard> getCCard() {
        if (cCard == null) {
            cCard = new ArrayList<>();
        }
        return this.cCard;
    }

    /**
     * Gets the value of the rank property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rank property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rank }
     * </p>
     * 
     * 
     * @return
     *     The value of the rank property.
     */
    public List<Rank> getRank() {
        if (rank == null) {
            rank = new ArrayList<>();
        }
        return this.rank;
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

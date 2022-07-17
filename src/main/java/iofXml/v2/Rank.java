
package iofXml.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element ref="{}Name"/&amp;gt;
 *           &amp;lt;element ref="{}OrganisationId"/&amp;gt;
 *           &amp;lt;element ref="{}Organisation"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element ref="{}RankPosition"/&amp;gt;
 *         &amp;lt;element ref="{}RankValue"/&amp;gt;
 *         &amp;lt;element ref="{}ValidFromDate" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}ValidToDate" minOccurs="0"/&amp;gt;
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
    "name",
    "organisationId",
    "organisation",
    "rankPosition",
    "rankValue",
    "validFromDate",
    "validToDate",
    "modifyDate"
})
@XmlRootElement(name = "Rank")
public class Rank {

    @XmlElement(name = "Name")
    protected Name name;
    @XmlElement(name = "OrganisationId")
    protected OrganisationId organisationId;
    @XmlElement(name = "Organisation")
    protected Organisation organisation;
    @XmlElement(name = "RankPosition", required = true)
    protected String rankPosition;
    @XmlElement(name = "RankValue", required = true)
    protected String rankValue;
    @XmlElement(name = "ValidFromDate")
    protected ValidFromDate validFromDate;
    @XmlElement(name = "ValidToDate")
    protected ValidToDate validToDate;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
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
     * Gets the value of the rankPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankPosition() {
        return rankPosition;
    }

    /**
     * Sets the value of the rankPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankPosition(String value) {
        this.rankPosition = value;
    }

    /**
     * Gets the value of the rankValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRankValue() {
        return rankValue;
    }

    /**
     * Sets the value of the rankValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRankValue(String value) {
        this.rankValue = value;
    }

    /**
     * Gets the value of the validFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link ValidFromDate }
     *     
     */
    public ValidFromDate getValidFromDate() {
        return validFromDate;
    }

    /**
     * Sets the value of the validFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidFromDate }
     *     
     */
    public void setValidFromDate(ValidFromDate value) {
        this.validFromDate = value;
    }

    /**
     * Gets the value of the validToDate property.
     * 
     * @return
     *     possible object is
     *     {@link ValidToDate }
     *     
     */
    public ValidToDate getValidToDate() {
        return validToDate;
    }

    /**
     * Sets the value of the validToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidToDate }
     *     
     */
    public void setValidToDate(ValidToDate value) {
        this.validToDate = value;
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

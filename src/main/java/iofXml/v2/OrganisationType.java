
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{}OrganisationTypeId"/&gt;
 *         &lt;element ref="{}Name"/&gt;
 *         &lt;element ref="{}SubOrganisationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "organisationTypeId",
    "name",
    "subOrganisationType",
    "modifyDate"
})
@XmlRootElement(name = "OrganisationType")
public class OrganisationType {

    @XmlElement(name = "OrganisationTypeId", required = true)
    protected OrganisationTypeId organisationTypeId;
    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "SubOrganisationType")
    protected List<SubOrganisationType> subOrganisationType;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;

    /**
     * Gets the value of the organisationTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationTypeId }
     *     
     */
    public OrganisationTypeId getOrganisationTypeId() {
        return organisationTypeId;
    }

    /**
     * Sets the value of the organisationTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationTypeId }
     *     
     */
    public void setOrganisationTypeId(OrganisationTypeId value) {
        this.organisationTypeId = value;
    }

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
     * Gets the value of the subOrganisationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subOrganisationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubOrganisationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubOrganisationType }
     * 
     * 
     */
    public List<SubOrganisationType> getSubOrganisationType() {
        if (subOrganisationType == null) {
            subOrganisationType = new ArrayList<SubOrganisationType>();
        }
        return this.subOrganisationType;
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

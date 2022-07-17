
package iofXml.v2;

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
 *       &lt;choice&gt;
 *         &lt;element ref="{}OrganisationTypeId"/&gt;
 *         &lt;element ref="{}OrganisationType"/&gt;
 *       &lt;/choice&gt;
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
    "organisationType"
})
@XmlRootElement(name = "SubOrganisationType")
public class SubOrganisationType {

    @XmlElement(name = "OrganisationTypeId")
    protected OrganisationTypeId organisationTypeId;
    @XmlElement(name = "OrganisationType")
    protected OrganisationType organisationType;

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
     * Gets the value of the organisationType property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationType }
     *     
     */
    public OrganisationType getOrganisationType() {
        return organisationType;
    }

    /**
     * Sets the value of the organisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationType }
     *     
     */
    public void setOrganisationType(OrganisationType value) {
        this.organisationType = value;
    }

}

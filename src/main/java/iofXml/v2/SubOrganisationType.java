
package iofXml.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       <choice>
 *         <element ref="{}OrganisationTypeId"/>
 *         <element ref="{}OrganisationType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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

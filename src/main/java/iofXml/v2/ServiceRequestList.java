
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
 *         <element ref="{}IOFVersion" minOccurs="0"/>
 *         <element ref="{}ClubServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}OrganisationServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
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
    "iofVersion",
    "clubServiceRequest",
    "organisationServiceRequest"
})
@XmlRootElement(name = "ServiceRequestList")
public class ServiceRequestList {

    @XmlElement(name = "IOFVersion")
    protected IOFVersion iofVersion;
    @XmlElement(name = "ClubServiceRequest")
    protected List<ClubServiceRequest> clubServiceRequest;
    @XmlElement(name = "OrganisationServiceRequest")
    protected List<OrganisationServiceRequest> organisationServiceRequest;

    /**
     * Gets the value of the iofVersion property.
     * 
     * @return
     *     possible object is
     *     {@link IOFVersion }
     *     
     */
    public IOFVersion getIOFVersion() {
        return iofVersion;
    }

    /**
     * Sets the value of the iofVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link IOFVersion }
     *     
     */
    public void setIOFVersion(IOFVersion value) {
        this.iofVersion = value;
    }

    /**
     * Gets the value of the clubServiceRequest property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clubServiceRequest property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClubServiceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClubServiceRequest }
     * </p>
     * 
     * 
     * @return
     *     The value of the clubServiceRequest property.
     */
    public List<ClubServiceRequest> getClubServiceRequest() {
        if (clubServiceRequest == null) {
            clubServiceRequest = new ArrayList<>();
        }
        return this.clubServiceRequest;
    }

    /**
     * Gets the value of the organisationServiceRequest property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationServiceRequest property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrganisationServiceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationServiceRequest }
     * </p>
     * 
     * 
     * @return
     *     The value of the organisationServiceRequest property.
     */
    public List<OrganisationServiceRequest> getOrganisationServiceRequest() {
        if (organisationServiceRequest == null) {
            organisationServiceRequest = new ArrayList<>();
        }
        return this.organisationServiceRequest;
    }

}

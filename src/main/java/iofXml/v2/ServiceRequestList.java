
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
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
 *         &amp;lt;element ref="{}IOFVersion" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}ClubServiceRequest" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}OrganisationServiceRequest" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the clubServiceRequest property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getClubServiceRequest().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ClubServiceRequest }
     * 
     * 
     */
    public List<ClubServiceRequest> getClubServiceRequest() {
        if (clubServiceRequest == null) {
            clubServiceRequest = new ArrayList<ClubServiceRequest>();
        }
        return this.clubServiceRequest;
    }

    /**
     * Gets the value of the organisationServiceRequest property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the organisationServiceRequest property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOrganisationServiceRequest().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationServiceRequest }
     * 
     * 
     */
    public List<OrganisationServiceRequest> getOrganisationServiceRequest() {
        if (organisationServiceRequest == null) {
            organisationServiceRequest = new ArrayList<OrganisationServiceRequest>();
        }
        return this.organisationServiceRequest;
    }

}


package iofXml.v3;

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
 *     <extension base="{http://www.orienteering.org/datastandard/3.0}BaseMessageElement">
 *       <sequence>
 *         <element name="Event" type="{http://www.orienteering.org/datastandard/3.0}Event"/>
 *         <element name="OrganisationServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}OrganisationServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PersonServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}PersonServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "event",
    "organisationServiceRequest",
    "personServiceRequest",
    "extensions"
})
@XmlRootElement(name = "ServiceRequestList")
public class ServiceRequestList
    extends BaseMessageElement
{

    /**
     * The event that the service requests are valid for.
     * 
     */
    @XmlElement(name = "Event", required = true)
    protected Event event;
    /**
     * Service requests made by organisations.
     * 
     */
    @XmlElement(name = "OrganisationServiceRequest")
    protected List<OrganisationServiceRequest> organisationServiceRequest;
    /**
     * Service requests made by persons.
     * 
     */
    @XmlElement(name = "PersonServiceRequest")
    protected List<PersonServiceRequest> personServiceRequest;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * The event that the service requests are valid for.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     * @see #getEvent()
     */
    public void setEvent(Event value) {
        this.event = value;
    }

    /**
     * Service requests made by organisations.
     * 
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

    /**
     * Service requests made by persons.
     * 
     * Gets the value of the personServiceRequest property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personServiceRequest property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPersonServiceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonServiceRequest }
     * </p>
     * 
     * 
     * @return
     *     The value of the personServiceRequest property.
     */
    public List<PersonServiceRequest> getPersonServiceRequest() {
        if (personServiceRequest == null) {
            personServiceRequest = new ArrayList<>();
        }
        return this.personServiceRequest;
    }

    /**
     * Container element for custom elements from other schemas.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     * @see #getExtensions()
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

}

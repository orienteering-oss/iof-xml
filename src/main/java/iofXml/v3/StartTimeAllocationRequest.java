
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Used to state start time allocation requests. It consists of a possible reference Organisation or Person and the allocation request, e.g. late start or grouped with the reference Organisation/Person. This way it is possible to state requests to the event organizer so that e.g. all members of an organisation has start times close to each other - or parents have start times far from each other. It is totally up to the event software and organizers whether they will support such requests.
 * 
 * <p>Java class for StartTimeAllocationRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="StartTimeAllocationRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" minOccurs="0"/>
 *         <element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="type" default="Normal">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             <enumeration value="Normal"/>
 *             <enumeration value="EarlyStart"/>
 *             <enumeration value="LateStart"/>
 *             <enumeration value="SeparatedFrom"/>
 *             <enumeration value="GroupedWith"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartTimeAllocationRequest", propOrder = {
    "organisation",
    "person"
})
public class StartTimeAllocationRequest {

    /**
     * The reference organisation for the start time allocation request.
     * 
     */
    @XmlElement(name = "Organisation")
    protected Organisation organisation;
    /**
     * The reference person for the start time allocation request.
     * 
     */
    @XmlElement(name = "Person")
    protected Person person;
    /**
     * The type of start time allocation request.
     * 
     */
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * The reference organisation for the start time allocation request.
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
     * @see #getOrganisation()
     */
    public void setOrganisation(Organisation value) {
        this.organisation = value;
    }

    /**
     * The reference person for the start time allocation request.
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
     * @see #getPerson()
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * The type of start time allocation request.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "Normal";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

}

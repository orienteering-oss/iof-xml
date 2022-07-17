
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
 *       <sequence>
 *         <element ref="{}EventOfficialRole"/>
 *         <choice>
 *           <element ref="{}PersonId"/>
 *           <element ref="{}Person"/>
 *         </choice>
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
    "eventOfficialRole",
    "personId",
    "person"
})
@XmlRootElement(name = "EventOfficial")
public class EventOfficial {

    @XmlElement(name = "EventOfficialRole", required = true)
    protected String eventOfficialRole;
    @XmlElement(name = "PersonId")
    protected PersonId personId;
    @XmlElement(name = "Person")
    protected Person person;

    /**
     * Gets the value of the eventOfficialRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventOfficialRole() {
        return eventOfficialRole;
    }

    /**
     * Sets the value of the eventOfficialRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventOfficialRole(String value) {
        this.eventOfficialRole = value;
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

}

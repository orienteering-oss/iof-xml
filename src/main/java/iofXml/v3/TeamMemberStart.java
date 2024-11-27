
package iofXml.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Start information for an individual competitor, including e.g. start time and bib number.
 * 
 * <p>Java class for TeamMemberStart complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TeamMemberStart">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntryId" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person" minOccurs="0"/>
 *         <element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" minOccurs="0"/>
 *         <element name="Start" type="{http://www.orienteering.org/datastandard/3.0}TeamMemberRaceStart" maxOccurs="unbounded"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamMemberStart", propOrder = {
    "entryId",
    "person",
    "organisation",
    "start",
    "extensions"
})
public class TeamMemberStart {

    /**
     * The id corresponding to this team member's entry in an EntryList.
     * 
     */
    @XmlElement(name = "EntryId")
    protected Id entryId;
    /**
     * The team member that the start time belongs to.
     * 
     */
    @XmlElement(name = "Person")
    protected Person person;
    /**
     * The organisation that the team member is representing at the event.
     * 
     */
    @XmlElement(name = "Organisation")
    protected Organisation organisation;
    /**
     * The core start information for the team member; one element per race in the event.
     * 
     */
    @XmlElement(name = "Start", required = true)
    protected List<TeamMemberRaceStart> start;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * The id corresponding to this team member's entry in an EntryList.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getEntryId() {
        return entryId;
    }

    /**
     * Sets the value of the entryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     * @see #getEntryId()
     */
    public void setEntryId(Id value) {
        this.entryId = value;
    }

    /**
     * The team member that the start time belongs to.
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
     * The organisation that the team member is representing at the event.
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
     * The core start information for the team member; one element per race in the event.
     * 
     * Gets the value of the start property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the start property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMemberRaceStart }
     * </p>
     * 
     * 
     * @return
     *     The value of the start property.
     */
    public List<TeamMemberRaceStart> getStart() {
        if (start == null) {
            start = new ArrayList<>();
        }
        return this.start;
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

    /**
     * Gets the value of the modifyTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifyTime() {
        return modifyTime;
    }

    /**
     * Sets the value of the modifyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifyTime(XMLGregorianCalendar value) {
        this.modifyTime = value;
    }

}

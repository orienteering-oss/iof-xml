
package iofXml.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Start information for a team, including e.g. team name, start times and bib numbers.
 *       
 * 
 * &lt;p&gt;Java class for TeamStart complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TeamStart"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="EntryId" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TeamMemberStart" type="{http://www.orienteering.org/datastandard/3.0}TeamMemberStart" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamStart", propOrder = {
    "entryId",
    "name",
    "organisation",
    "bibNumber",
    "teamMemberStart",
    "assignedFee",
    "serviceRequest",
    "extensions"
})
public class TeamStart {

    @XmlElement(name = "EntryId")
    protected Id entryId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Organisation")
    protected List<Organisation> organisation;
    @XmlElement(name = "BibNumber")
    protected String bibNumber;
    @XmlElement(name = "TeamMemberStart")
    protected List<TeamMemberStart> teamMemberStart;
    @XmlElement(name = "AssignedFee")
    protected List<AssignedFee> assignedFee;
    @XmlElement(name = "ServiceRequest")
    protected List<ServiceRequest> serviceRequest;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * Gets the value of the entryId property.
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
     */
    public void setEntryId(Id value) {
        this.entryId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the organisation property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the organisation property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getOrganisation().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation }
     * 
     * 
     */
    public List<Organisation> getOrganisation() {
        if (organisation == null) {
            organisation = new ArrayList<Organisation>();
        }
        return this.organisation;
    }

    /**
     * Gets the value of the bibNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBibNumber() {
        return bibNumber;
    }

    /**
     * Sets the value of the bibNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBibNumber(String value) {
        this.bibNumber = value;
    }

    /**
     * Gets the value of the teamMemberStart property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the teamMemberStart property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTeamMemberStart().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMemberStart }
     * 
     * 
     */
    public List<TeamMemberStart> getTeamMemberStart() {
        if (teamMemberStart == null) {
            teamMemberStart = new ArrayList<TeamMemberStart>();
        }
        return this.teamMemberStart;
    }

    /**
     * Gets the value of the assignedFee property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the assignedFee property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAssignedFee().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link AssignedFee }
     * 
     * 
     */
    public List<AssignedFee> getAssignedFee() {
        if (assignedFee == null) {
            assignedFee = new ArrayList<AssignedFee>();
        }
        return this.assignedFee;
    }

    /**
     * Gets the value of the serviceRequest property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the serviceRequest property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getServiceRequest().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRequest }
     * 
     * 
     */
    public List<ServiceRequest> getServiceRequest() {
        if (serviceRequest == null) {
            serviceRequest = new ArrayList<ServiceRequest>();
        }
        return this.serviceRequest;
    }

    /**
     * Gets the value of the extensions property.
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

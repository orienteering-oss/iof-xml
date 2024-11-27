
package iofXml.v3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Result information for a team, including e.g. result status, place, finish time and individual times for the team members.
 * 
 * <p>Java class for TeamResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TeamResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntryId" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TeamMemberResult" type="{http://www.orienteering.org/datastandard/3.0}TeamMemberResult" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamResult", propOrder = {
    "entryId",
    "name",
    "organisation",
    "bibNumber",
    "teamMemberResult",
    "assignedFee",
    "serviceRequest",
    "extensions"
})
public class TeamResult {

    /**
     * The id corresponding to this team's entry in an EntryList.
     * 
     */
    @XmlElement(name = "EntryId")
    protected Id entryId;
    /**
     * The name of the team, e.g. organisation name and team number for a relay team.
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * The organisation(s) the team is representing.
     * 
     */
    @XmlElement(name = "Organisation")
    protected List<Organisation> organisation;
    /**
     * The bib number that the members of the team are wearing. If each team member has a unique bib number, use the BibNumber of the TeamMemberStart element.
     * 
     */
    @XmlElement(name = "BibNumber")
    protected String bibNumber;
    /**
     * Defines the result information for each team member. One element per relay leg must be included, even if the team has not assigned any team member to the leg.
     * 
     */
    @XmlElement(name = "TeamMemberResult")
    protected List<TeamMemberResult> teamMemberResult;
    /**
     * Defines the fees that the team has been assigned.
     * 
     */
    @XmlElement(name = "AssignedFee")
    protected List<AssignedFee> assignedFee;
    /**
     * Defines the services requested by the team.
     * 
     */
    @XmlElement(name = "ServiceRequest")
    protected List<ServiceRequest> serviceRequest;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * The id corresponding to this team's entry in an EntryList.
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
     * The name of the team, e.g. organisation name and team number for a relay team.
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
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * The organisation(s) the team is representing.
     * 
     * Gets the value of the organisation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrganisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation }
     * </p>
     * 
     * 
     * @return
     *     The value of the organisation property.
     */
    public List<Organisation> getOrganisation() {
        if (organisation == null) {
            organisation = new ArrayList<>();
        }
        return this.organisation;
    }

    /**
     * The bib number that the members of the team are wearing. If each team member has a unique bib number, use the BibNumber of the TeamMemberStart element.
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
     * @see #getBibNumber()
     */
    public void setBibNumber(String value) {
        this.bibNumber = value;
    }

    /**
     * Defines the result information for each team member. One element per relay leg must be included, even if the team has not assigned any team member to the leg.
     * 
     * Gets the value of the teamMemberResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamMemberResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTeamMemberResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMemberResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the teamMemberResult property.
     */
    public List<TeamMemberResult> getTeamMemberResult() {
        if (teamMemberResult == null) {
            teamMemberResult = new ArrayList<>();
        }
        return this.teamMemberResult;
    }

    /**
     * Defines the fees that the team has been assigned.
     * 
     * Gets the value of the assignedFee property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedFee property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAssignedFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssignedFee }
     * </p>
     * 
     * 
     * @return
     *     The value of the assignedFee property.
     */
    public List<AssignedFee> getAssignedFee() {
        if (assignedFee == null) {
            assignedFee = new ArrayList<>();
        }
        return this.assignedFee;
    }

    /**
     * Defines the services requested by the team.
     * 
     * Gets the value of the serviceRequest property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRequest property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceRequest }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceRequest property.
     */
    public List<ServiceRequest> getServiceRequest() {
        if (serviceRequest == null) {
            serviceRequest = new ArrayList<>();
        }
        return this.serviceRequest;
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

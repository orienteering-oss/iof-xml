
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}OrganisationId"/&gt;
 *           &lt;element ref="{}Organisation"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}ClubId"/&gt;
 *           &lt;element ref="{}Club"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{}ClassId"/&gt;
 *           &lt;element ref="{}ClassShortName"/&gt;
 *           &lt;element ref="{}Class"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}Position"/&gt;
 *         &lt;element ref="{}ModifyDate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "organisationIdOrOrganisation",
    "clubIdOrClub",
    "classIdOrClassShortNameOrClazz",
    "position",
    "modifyDate"
})
@XmlRootElement(name = "ResultSelection")
public class ResultSelection {

    @XmlElements({
        @XmlElement(name = "OrganisationId", type = OrganisationId.class),
        @XmlElement(name = "Organisation", type = Organisation.class)
    })
    protected List<Object> organisationIdOrOrganisation;
    @XmlElements({
        @XmlElement(name = "ClubId", type = ClubId.class),
        @XmlElement(name = "Club", type = Club.class)
    })
    protected List<Object> clubIdOrClub;
    @XmlElements({
        @XmlElement(name = "ClassId", type = ClassId.class),
        @XmlElement(name = "ClassShortName", type = ClassShortName.class),
        @XmlElement(name = "Class", type = Class.class)
    })
    protected List<Object> classIdOrClassShortNameOrClazz;
    @XmlElement(name = "Position", required = true)
    protected String position;
    @XmlElement(name = "ModifyDate", required = true)
    protected ModifyDate modifyDate;

    /**
     * Gets the value of the organisationIdOrOrganisation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationIdOrOrganisation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationIdOrOrganisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation }
     * {@link OrganisationId }
     * 
     * 
     */
    public List<Object> getOrganisationIdOrOrganisation() {
        if (organisationIdOrOrganisation == null) {
            organisationIdOrOrganisation = new ArrayList<Object>();
        }
        return this.organisationIdOrOrganisation;
    }

    /**
     * Gets the value of the clubIdOrClub property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clubIdOrClub property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClubIdOrClub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Club }
     * {@link ClubId }
     * 
     * 
     */
    public List<Object> getClubIdOrClub() {
        if (clubIdOrClub == null) {
            clubIdOrClub = new ArrayList<Object>();
        }
        return this.clubIdOrClub;
    }

    /**
     * Gets the value of the classIdOrClassShortNameOrClazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classIdOrClassShortNameOrClazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassIdOrClassShortNameOrClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Class }
     * {@link ClassId }
     * {@link ClassShortName }
     * 
     * 
     */
    public List<Object> getClassIdOrClassShortNameOrClazz() {
        if (classIdOrClassShortNameOrClazz == null) {
            classIdOrClassShortNameOrClazz = new ArrayList<Object>();
        }
        return this.classIdOrClassShortNameOrClazz;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the modifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyDate }
     *     
     */
    public ModifyDate getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the value of the modifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyDate }
     *     
     */
    public void setModifyDate(ModifyDate value) {
        this.modifyDate = value;
    }

}

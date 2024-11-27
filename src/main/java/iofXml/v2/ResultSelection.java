
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
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
 *         <choice maxOccurs="unbounded" minOccurs="0">
 *           <element ref="{}OrganisationId"/>
 *           <element ref="{}Organisation"/>
 *         </choice>
 *         <choice maxOccurs="unbounded" minOccurs="0">
 *           <element ref="{}ClubId"/>
 *           <element ref="{}Club"/>
 *         </choice>
 *         <choice maxOccurs="unbounded" minOccurs="0">
 *           <element ref="{}ClassId"/>
 *           <element ref="{}ClassShortName"/>
 *           <element ref="{}Class"/>
 *         </choice>
 *         <element ref="{}Position"/>
 *         <element ref="{}ModifyDate"/>
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
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationIdOrOrganisation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrganisationIdOrOrganisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation }
     * {@link OrganisationId }
     * </p>
     * 
     * 
     * @return
     *     The value of the organisationIdOrOrganisation property.
     */
    public List<Object> getOrganisationIdOrOrganisation() {
        if (organisationIdOrOrganisation == null) {
            organisationIdOrOrganisation = new ArrayList<>();
        }
        return this.organisationIdOrOrganisation;
    }

    /**
     * Gets the value of the clubIdOrClub property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clubIdOrClub property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClubIdOrClub().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Club }
     * {@link ClubId }
     * </p>
     * 
     * 
     * @return
     *     The value of the clubIdOrClub property.
     */
    public List<Object> getClubIdOrClub() {
        if (clubIdOrClub == null) {
            clubIdOrClub = new ArrayList<>();
        }
        return this.clubIdOrClub;
    }

    /**
     * Gets the value of the classIdOrClassShortNameOrClazz property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classIdOrClassShortNameOrClazz property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClassIdOrClassShortNameOrClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Class }
     * {@link ClassId }
     * {@link ClassShortName }
     * </p>
     * 
     * 
     * @return
     *     The value of the classIdOrClassShortNameOrClazz property.
     */
    public List<Object> getClassIdOrClassShortNameOrClazz() {
        if (classIdOrClassShortNameOrClazz == null) {
            classIdOrClassShortNameOrClazz = new ArrayList<>();
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


package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element ref="{}ClassId"/>
 *         <element ref="{}Name" minOccurs="0"/>
 *         <element ref="{}ClassShortName"/>
 *         <choice minOccurs="0">
 *           <element ref="{}ClassTypeId"/>
 *           <element ref="{}ClassType"/>
 *         </choice>
 *         <element ref="{}SubstituteClass" minOccurs="0"/>
 *         <element ref="{}NotQualifiedSubstituteClass" minOccurs="0"/>
 *         <choice maxOccurs="unbounded" minOccurs="0">
 *           <element ref="{}EntryFeeId"/>
 *           <element ref="{}EntryFee"/>
 *         </choice>
 *         <element ref="{}ModifyDate" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="lowAge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       <attribute name="highAge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       <attribute name="sex" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             <enumeration value="M"/>
 *             <enumeration value="F"/>
 *             <enumeration value="B"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="numberInTeam" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="1" />
 *       <attribute name="teamEntry" default="N">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             <enumeration value="Y"/>
 *             <enumeration value="N"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="maxNumberInClass" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       <attribute name="actualForRanking" default="N">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             <enumeration value="Y"/>
 *             <enumeration value="N"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="timePresentation" default="Y">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             <enumeration value="Y"/>
 *             <enumeration value="N"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="allowedMinAge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       <attribute name="allowedMaxAge" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "classId",
    "name",
    "classShortName",
    "classTypeId",
    "classType",
    "substituteClass",
    "notQualifiedSubstituteClass",
    "entryFeeIdOrEntryFee",
    "modifyDate"
})
@XmlRootElement(name = "Class")
public class Class {

    @XmlElement(name = "ClassId", required = true)
    protected ClassId classId;
    @XmlElement(name = "Name")
    protected Name name;
    @XmlElement(name = "ClassShortName", required = true)
    protected ClassShortName classShortName;
    @XmlElement(name = "ClassTypeId")
    protected ClassTypeId classTypeId;
    @XmlElement(name = "ClassType")
    protected ClassType classType;
    @XmlElement(name = "SubstituteClass")
    protected SubstituteClass substituteClass;
    @XmlElement(name = "NotQualifiedSubstituteClass")
    protected NotQualifiedSubstituteClass notQualifiedSubstituteClass;
    @XmlElements({
        @XmlElement(name = "EntryFeeId", type = EntryFeeId.class),
        @XmlElement(name = "EntryFee", type = EntryFee.class)
    })
    protected List<Object> entryFeeIdOrEntryFee;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlAttribute(name = "lowAge")
    @XmlSchemaType(name = "anySimpleType")
    protected String lowAge;
    @XmlAttribute(name = "highAge")
    @XmlSchemaType(name = "anySimpleType")
    protected String highAge;
    @XmlAttribute(name = "sex", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sex;
    @XmlAttribute(name = "numberInTeam")
    @XmlSchemaType(name = "anySimpleType")
    protected String numberInTeam;
    @XmlAttribute(name = "teamEntry")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String teamEntry;
    @XmlAttribute(name = "maxNumberInClass")
    @XmlSchemaType(name = "anySimpleType")
    protected String maxNumberInClass;
    @XmlAttribute(name = "actualForRanking")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actualForRanking;
    @XmlAttribute(name = "timePresentation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String timePresentation;
    @XmlAttribute(name = "allowedMinAge")
    @XmlSchemaType(name = "anySimpleType")
    protected String allowedMinAge;
    @XmlAttribute(name = "allowedMaxAge")
    @XmlSchemaType(name = "anySimpleType")
    protected String allowedMaxAge;

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link ClassId }
     *     
     */
    public ClassId getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassId }
     *     
     */
    public void setClassId(ClassId value) {
        this.classId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the classShortName property.
     * 
     * @return
     *     possible object is
     *     {@link ClassShortName }
     *     
     */
    public ClassShortName getClassShortName() {
        return classShortName;
    }

    /**
     * Sets the value of the classShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassShortName }
     *     
     */
    public void setClassShortName(ClassShortName value) {
        this.classShortName = value;
    }

    /**
     * Gets the value of the classTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link ClassTypeId }
     *     
     */
    public ClassTypeId getClassTypeId() {
        return classTypeId;
    }

    /**
     * Sets the value of the classTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassTypeId }
     *     
     */
    public void setClassTypeId(ClassTypeId value) {
        this.classTypeId = value;
    }

    /**
     * Gets the value of the classType property.
     * 
     * @return
     *     possible object is
     *     {@link ClassType }
     *     
     */
    public ClassType getClassType() {
        return classType;
    }

    /**
     * Sets the value of the classType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassType }
     *     
     */
    public void setClassType(ClassType value) {
        this.classType = value;
    }

    /**
     * Gets the value of the substituteClass property.
     * 
     * @return
     *     possible object is
     *     {@link SubstituteClass }
     *     
     */
    public SubstituteClass getSubstituteClass() {
        return substituteClass;
    }

    /**
     * Sets the value of the substituteClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstituteClass }
     *     
     */
    public void setSubstituteClass(SubstituteClass value) {
        this.substituteClass = value;
    }

    /**
     * Gets the value of the notQualifiedSubstituteClass property.
     * 
     * @return
     *     possible object is
     *     {@link NotQualifiedSubstituteClass }
     *     
     */
    public NotQualifiedSubstituteClass getNotQualifiedSubstituteClass() {
        return notQualifiedSubstituteClass;
    }

    /**
     * Sets the value of the notQualifiedSubstituteClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotQualifiedSubstituteClass }
     *     
     */
    public void setNotQualifiedSubstituteClass(NotQualifiedSubstituteClass value) {
        this.notQualifiedSubstituteClass = value;
    }

    /**
     * Gets the value of the entryFeeIdOrEntryFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the entryFeeIdOrEntryFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryFeeIdOrEntryFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntryFee }
     * {@link EntryFeeId }
     * 
     * 
     * @return
     *     The value of the entryFeeIdOrEntryFee property.
     */
    public List<Object> getEntryFeeIdOrEntryFee() {
        if (entryFeeIdOrEntryFee == null) {
            entryFeeIdOrEntryFee = new ArrayList<>();
        }
        return this.entryFeeIdOrEntryFee;
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

    /**
     * Gets the value of the lowAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowAge() {
        return lowAge;
    }

    /**
     * Sets the value of the lowAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowAge(String value) {
        this.lowAge = value;
    }

    /**
     * Gets the value of the highAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighAge() {
        return highAge;
    }

    /**
     * Sets the value of the highAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighAge(String value) {
        this.highAge = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the numberInTeam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberInTeam() {
        if (numberInTeam == null) {
            return "1";
        } else {
            return numberInTeam;
        }
    }

    /**
     * Sets the value of the numberInTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberInTeam(String value) {
        this.numberInTeam = value;
    }

    /**
     * Gets the value of the teamEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamEntry() {
        if (teamEntry == null) {
            return "N";
        } else {
            return teamEntry;
        }
    }

    /**
     * Sets the value of the teamEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamEntry(String value) {
        this.teamEntry = value;
    }

    /**
     * Gets the value of the maxNumberInClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxNumberInClass() {
        return maxNumberInClass;
    }

    /**
     * Sets the value of the maxNumberInClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNumberInClass(String value) {
        this.maxNumberInClass = value;
    }

    /**
     * Gets the value of the actualForRanking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualForRanking() {
        if (actualForRanking == null) {
            return "N";
        } else {
            return actualForRanking;
        }
    }

    /**
     * Sets the value of the actualForRanking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualForRanking(String value) {
        this.actualForRanking = value;
    }

    /**
     * Gets the value of the timePresentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimePresentation() {
        if (timePresentation == null) {
            return "Y";
        } else {
            return timePresentation;
        }
    }

    /**
     * Sets the value of the timePresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimePresentation(String value) {
        this.timePresentation = value;
    }

    /**
     * Gets the value of the allowedMinAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedMinAge() {
        return allowedMinAge;
    }

    /**
     * Sets the value of the allowedMinAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedMinAge(String value) {
        this.allowedMinAge = value;
    }

    /**
     * Gets the value of the allowedMaxAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedMaxAge() {
        return allowedMaxAge;
    }

    /**
     * Sets the value of the allowedMaxAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedMaxAge(String value) {
        this.allowedMaxAge = value;
    }

}

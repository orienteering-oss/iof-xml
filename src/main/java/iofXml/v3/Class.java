
package iofXml.v3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Defines a class in an event.
 * 
 * <p>Java class for Class complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Class">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ClassType" type="{http://www.orienteering.org/datastandard/3.0}ClassType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Leg" type="{http://www.orienteering.org/datastandard/3.0}Leg" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TeamFee" type="{http://www.orienteering.org/datastandard/3.0}Fee" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Fee" type="{http://www.orienteering.org/datastandard/3.0}Fee" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Status" type="{http://www.orienteering.org/datastandard/3.0}EventClassStatus" minOccurs="0"/>
 *         <element name="RaceClass" type="{http://www.orienteering.org/datastandard/3.0}RaceClass" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TooFewEntriesSubstituteClass" type="{http://www.orienteering.org/datastandard/3.0}Class" minOccurs="0"/>
 *         <element name="TooManyEntriesSubstituteClass" type="{http://www.orienteering.org/datastandard/3.0}Class" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="minAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="maxAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="sex" default="B">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             <enumeration value="B"/>
 *             <enumeration value="F"/>
 *             <enumeration value="M"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="minNumberOfTeamMembers" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       <attribute name="maxNumberOfTeamMembers" type="{http://www.w3.org/2001/XMLSchema}integer" default="1" />
 *       <attribute name="minTeamAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="maxTeamAge" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="numberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="maxNumberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="resultListMode" default="Default">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             <enumeration value="Default"/>
 *             <enumeration value="Unordered"/>
 *             <enumeration value="UnorderedNoTimes"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Class", propOrder = {
    "id",
    "name",
    "shortName",
    "classType",
    "leg",
    "teamFee",
    "fee",
    "status",
    "raceClass",
    "tooFewEntriesSubstituteClass",
    "tooManyEntriesSubstituteClass",
    "extensions"
})
public class Class {

    @XmlElement(name = "Id")
    protected Id id;
    /**
     * The name of the class.
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * The abbreviated name of a class, used when space is limited.
     * 
     */
    @XmlElement(name = "ShortName")
    protected String shortName;
    /**
     * The class type(s) for the class.
     * 
     */
    @XmlElement(name = "ClassType")
    protected List<ClassType> classType;
    /**
     * Information about the legs, if the class is a relay class. One Leg element per leg must be present.
     * 
     */
    @XmlElement(name = "Leg")
    protected List<Leg> leg;
    /**
     * The entry fees for a team as a whole taking part in this class. Use the Fee element to specify a fee for an individual competitor in the team. Use the TeamFee subelement of the RaceClass element to specify a fee on race level.
     * 
     */
    @XmlElement(name = "TeamFee")
    protected List<Fee> teamFee;
    /**
     * The entry fees for an individual competitor taking part in the class. Use the TeamFee element to specify a fee for the team as a whole. Use the Fee subelement of the RaceClass element to specify a fee on race level.
     * 
     */
    @XmlElement(name = "Fee")
    protected List<Fee> fee;
    /**
     * The overall status of the class, e.g. if overall results should be considered invalid due to misplaced controls.
     * 
     */
    @XmlElement(name = "Status", defaultValue = "Normal")
    @XmlSchemaType(name = "NMTOKEN")
    protected EventClassStatus status;
    /**
     * Race-specific information for the class, e.g. course(s) assigned to the class.
     * 
     */
    @XmlElement(name = "RaceClass")
    protected List<RaceClass> raceClass;
    /**
     * The class that competitors in this class should be transferred to if there are too few entries in this class.
     * 
     */
    @XmlElement(name = "TooFewEntriesSubstituteClass")
    protected Class tooFewEntriesSubstituteClass;
    /**
     * The class that competitors that are not qualified (e.g. due to too low ranking) should be transferred to if there are too many entries in this class.
     * 
     */
    @XmlElement(name = "TooManyEntriesSubstituteClass")
    protected Class tooManyEntriesSubstituteClass;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    /**
     * The lowest allowed age for a competitor taking part in the class.
     * 
     */
    @XmlAttribute(name = "minAge")
    protected BigInteger minAge;
    /**
     * The highest allowed age for a competitor taking part in the class.
     * 
     */
    @XmlAttribute(name = "maxAge")
    protected BigInteger maxAge;
    @XmlAttribute(name = "sex")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sex;
    /**
     * The minimum number of members in a team taking part in the class, if the class is a team class.
     * 
     */
    @XmlAttribute(name = "minNumberOfTeamMembers")
    protected BigInteger minNumberOfTeamMembers;
    /**
     * The maximum number of members in a team taking part in the class, if the class is a team class.
     * 
     */
    @XmlAttribute(name = "maxNumberOfTeamMembers")
    protected BigInteger maxNumberOfTeamMembers;
    /**
     * The lowest allowed age sum of the team members for a team taking part in the class.
     * 
     */
    @XmlAttribute(name = "minTeamAge")
    protected BigInteger minTeamAge;
    /**
     * The highest allowed age sum of the team members for a team taking part in the class.
     * 
     */
    @XmlAttribute(name = "maxTeamAge")
    protected BigInteger maxTeamAge;
    /**
     * The number of competitors in the class. A competitor corresponds to a person (if an individual event) or a team (if a team or relay event).
     * 
     */
    @XmlAttribute(name = "numberOfCompetitors")
    protected BigInteger numberOfCompetitors;
    /**
     * The maximum number of competitors that are allowed to take part in the class. A competitor corresponds to a person (if an individual event) or a team (if a team or relay event). If the maximum number of competitors varies between races in a multi-day event, use the maxNumberOfCompetitors attribute in the RaceClass element.
     * 
     */
    @XmlAttribute(name = "maxNumberOfCompetitors")
    protected BigInteger maxNumberOfCompetitors;
    /**
     * Defines the kind of information to include in the result list, and how to sort it. For example, the result list of a beginner's class may include just "finished" or "did not finish" instead of the actual times.
     * 
     */
    @XmlAttribute(name = "resultListMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String resultListMode;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * The name of the class.
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
     * The abbreviated name of a class, used when space is limited.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getShortName()
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * The class type(s) for the class.
     * 
     * Gets the value of the classType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClassType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassType }
     * </p>
     * 
     * 
     * @return
     *     The value of the classType property.
     */
    public List<ClassType> getClassType() {
        if (classType == null) {
            classType = new ArrayList<>();
        }
        return this.classType;
    }

    /**
     * Information about the legs, if the class is a relay class. One Leg element per leg must be present.
     * 
     * Gets the value of the leg property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leg property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Leg }
     * </p>
     * 
     * 
     * @return
     *     The value of the leg property.
     */
    public List<Leg> getLeg() {
        if (leg == null) {
            leg = new ArrayList<>();
        }
        return this.leg;
    }

    /**
     * The entry fees for a team as a whole taking part in this class. Use the Fee element to specify a fee for an individual competitor in the team. Use the TeamFee subelement of the RaceClass element to specify a fee on race level.
     * 
     * Gets the value of the teamFee property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamFee property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTeamFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
     * </p>
     * 
     * 
     * @return
     *     The value of the teamFee property.
     */
    public List<Fee> getTeamFee() {
        if (teamFee == null) {
            teamFee = new ArrayList<>();
        }
        return this.teamFee;
    }

    /**
     * The entry fees for an individual competitor taking part in the class. Use the TeamFee element to specify a fee for the team as a whole. Use the Fee subelement of the RaceClass element to specify a fee on race level.
     * 
     * Gets the value of the fee property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fee property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee }
     * </p>
     * 
     * 
     * @return
     *     The value of the fee property.
     */
    public List<Fee> getFee() {
        if (fee == null) {
            fee = new ArrayList<>();
        }
        return this.fee;
    }

    /**
     * The overall status of the class, e.g. if overall results should be considered invalid due to misplaced controls.
     * 
     * @return
     *     possible object is
     *     {@link EventClassStatus }
     *     
     */
    public EventClassStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClassStatus }
     *     
     * @see #getStatus()
     */
    public void setStatus(EventClassStatus value) {
        this.status = value;
    }

    /**
     * Race-specific information for the class, e.g. course(s) assigned to the class.
     * 
     * Gets the value of the raceClass property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the raceClass property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRaceClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RaceClass }
     * </p>
     * 
     * 
     * @return
     *     The value of the raceClass property.
     */
    public List<RaceClass> getRaceClass() {
        if (raceClass == null) {
            raceClass = new ArrayList<>();
        }
        return this.raceClass;
    }

    /**
     * The class that competitors in this class should be transferred to if there are too few entries in this class.
     * 
     * @return
     *     possible object is
     *     {@link Class }
     *     
     */
    public Class getTooFewEntriesSubstituteClass() {
        return tooFewEntriesSubstituteClass;
    }

    /**
     * Sets the value of the tooFewEntriesSubstituteClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Class }
     *     
     * @see #getTooFewEntriesSubstituteClass()
     */
    public void setTooFewEntriesSubstituteClass(Class value) {
        this.tooFewEntriesSubstituteClass = value;
    }

    /**
     * The class that competitors that are not qualified (e.g. due to too low ranking) should be transferred to if there are too many entries in this class.
     * 
     * @return
     *     possible object is
     *     {@link Class }
     *     
     */
    public Class getTooManyEntriesSubstituteClass() {
        return tooManyEntriesSubstituteClass;
    }

    /**
     * Sets the value of the tooManyEntriesSubstituteClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Class }
     *     
     * @see #getTooManyEntriesSubstituteClass()
     */
    public void setTooManyEntriesSubstituteClass(Class value) {
        this.tooManyEntriesSubstituteClass = value;
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
     * The lowest allowed age for a competitor taking part in the class.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinAge() {
        return minAge;
    }

    /**
     * Sets the value of the minAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMinAge()
     */
    public void setMinAge(BigInteger value) {
        this.minAge = value;
    }

    /**
     * The highest allowed age for a competitor taking part in the class.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAge() {
        return maxAge;
    }

    /**
     * Sets the value of the maxAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaxAge()
     */
    public void setMaxAge(BigInteger value) {
        this.maxAge = value;
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
        if (sex == null) {
            return "B";
        } else {
            return sex;
        }
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
     * The minimum number of members in a team taking part in the class, if the class is a team class.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinNumberOfTeamMembers() {
        if (minNumberOfTeamMembers == null) {
            return new BigInteger("1");
        } else {
            return minNumberOfTeamMembers;
        }
    }

    /**
     * Sets the value of the minNumberOfTeamMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMinNumberOfTeamMembers()
     */
    public void setMinNumberOfTeamMembers(BigInteger value) {
        this.minNumberOfTeamMembers = value;
    }

    /**
     * The maximum number of members in a team taking part in the class, if the class is a team class.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfTeamMembers() {
        if (maxNumberOfTeamMembers == null) {
            return new BigInteger("1");
        } else {
            return maxNumberOfTeamMembers;
        }
    }

    /**
     * Sets the value of the maxNumberOfTeamMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaxNumberOfTeamMembers()
     */
    public void setMaxNumberOfTeamMembers(BigInteger value) {
        this.maxNumberOfTeamMembers = value;
    }

    /**
     * The lowest allowed age sum of the team members for a team taking part in the class.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinTeamAge() {
        return minTeamAge;
    }

    /**
     * Sets the value of the minTeamAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMinTeamAge()
     */
    public void setMinTeamAge(BigInteger value) {
        this.minTeamAge = value;
    }

    /**
     * The highest allowed age sum of the team members for a team taking part in the class.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxTeamAge() {
        return maxTeamAge;
    }

    /**
     * Sets the value of the maxTeamAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaxTeamAge()
     */
    public void setMaxTeamAge(BigInteger value) {
        this.maxTeamAge = value;
    }

    /**
     * The number of competitors in the class. A competitor corresponds to a person (if an individual event) or a team (if a team or relay event).
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCompetitors() {
        return numberOfCompetitors;
    }

    /**
     * Sets the value of the numberOfCompetitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getNumberOfCompetitors()
     */
    public void setNumberOfCompetitors(BigInteger value) {
        this.numberOfCompetitors = value;
    }

    /**
     * The maximum number of competitors that are allowed to take part in the class. A competitor corresponds to a person (if an individual event) or a team (if a team or relay event). If the maximum number of competitors varies between races in a multi-day event, use the maxNumberOfCompetitors attribute in the RaceClass element.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfCompetitors() {
        return maxNumberOfCompetitors;
    }

    /**
     * Sets the value of the maxNumberOfCompetitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMaxNumberOfCompetitors()
     */
    public void setMaxNumberOfCompetitors(BigInteger value) {
        this.maxNumberOfCompetitors = value;
    }

    /**
     * Defines the kind of information to include in the result list, and how to sort it. For example, the result list of a beginner's class may include just "finished" or "did not finish" instead of the actual times.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultListMode() {
        if (resultListMode == null) {
            return "Default";
        } else {
            return resultListMode;
        }
    }

    /**
     * Sets the value of the resultListMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getResultListMode()
     */
    public void setResultListMode(String value) {
        this.resultListMode = value;
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

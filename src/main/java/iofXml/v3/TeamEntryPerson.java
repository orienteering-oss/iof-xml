
package iofXml.v3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines a person that is part of a team entry.
 * 
 * <p>Java class for TeamEntryPerson complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TeamEntryPerson">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Person" type="{http://www.orienteering.org/datastandard/3.0}Person" minOccurs="0"/>
 *         <element name="Organisation" type="{http://www.orienteering.org/datastandard/3.0}Organisation" minOccurs="0"/>
 *         <element name="Leg" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="LegOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="ControlCard" type="{http://www.orienteering.org/datastandard/3.0}ControlCard" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Score" type="{http://www.orienteering.org/datastandard/3.0}Score" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TeamEntryPerson", propOrder = {
    "person",
    "organisation",
    "leg",
    "legOrder",
    "controlCard",
    "score",
    "assignedFee",
    "extensions"
})
public class TeamEntryPerson {

    /**
     * The person. Omit if the person is not known at the moment, but for example the control card is known.
     * 
     */
    @XmlElement(name = "Person")
    protected Person person;
    /**
     * The organisation that the person represent. Omit if this is the same as the organsiation given in the TeamEntry element.
     * 
     */
    @XmlElement(name = "Organisation")
    protected Organisation organisation;
    /**
     * For relay entries, the number of the leg that this person is taking part in.
     * 
     */
    @XmlElement(name = "Leg")
    protected BigInteger leg;
    /**
     * Defines the person's starting order within a team at a parallel relay leg.
     * 
     */
    @XmlElement(name = "LegOrder")
    protected BigInteger legOrder;
    /**
     * Information about the control cards (punching cards) that the person uses at the event. Multiple control cards can be specified, e.g. one for punch checking and another for timing.
     * 
     */
    @XmlElement(name = "ControlCard")
    protected List<ControlCard> controlCard;
    /**
     * Any score that is submitted together with the entry, e.g. World Ranking points.
     * 
     */
    @XmlElement(name = "Score")
    protected List<Score> score;
    /**
     * The fees that this particular person has to pay when entering the event. In a multi-race event, there is usually one element for each race. Fees assigned to the team as a whole should be defined in the TeamEntry element.
     * 
     */
    @XmlElement(name = "AssignedFee")
    protected List<AssignedFee> assignedFee;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * The person. Omit if the person is not known at the moment, but for example the control card is known.
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
     * The organisation that the person represent. Omit if this is the same as the organsiation given in the TeamEntry element.
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
     * For relay entries, the number of the leg that this person is taking part in.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeg() {
        return leg;
    }

    /**
     * Sets the value of the leg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getLeg()
     */
    public void setLeg(BigInteger value) {
        this.leg = value;
    }

    /**
     * Defines the person's starting order within a team at a parallel relay leg.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLegOrder() {
        return legOrder;
    }

    /**
     * Sets the value of the legOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getLegOrder()
     */
    public void setLegOrder(BigInteger value) {
        this.legOrder = value;
    }

    /**
     * Information about the control cards (punching cards) that the person uses at the event. Multiple control cards can be specified, e.g. one for punch checking and another for timing.
     * 
     * Gets the value of the controlCard property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlCard property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getControlCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlCard }
     * </p>
     * 
     * 
     * @return
     *     The value of the controlCard property.
     */
    public List<ControlCard> getControlCard() {
        if (controlCard == null) {
            controlCard = new ArrayList<>();
        }
        return this.controlCard;
    }

    /**
     * Any score that is submitted together with the entry, e.g. World Ranking points.
     * 
     * Gets the value of the score property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the score property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Score }
     * </p>
     * 
     * 
     * @return
     *     The value of the score property.
     */
    public List<Score> getScore() {
        if (score == null) {
            score = new ArrayList<>();
        }
        return this.score;
    }

    /**
     * The fees that this particular person has to pay when entering the event. In a multi-race event, there is usually one element for each race. Fees assigned to the team as a whole should be defined in the TeamEntry element.
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


package iofXml.v3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Result information for a person in a race.
 *       
 * 
 * &lt;p&gt;Java class for TeamMemberRaceResult complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="TeamMemberRaceResult"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Leg" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LegOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FinishTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TimeBehind" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;simpleContent&amp;gt;
 *               &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;double"&amp;gt;
 *                 &amp;lt;attribute name="type" use="required"&amp;gt;
 *                   &amp;lt;simpleType&amp;gt;
 *                     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&amp;gt;
 *                       &amp;lt;enumeration value="Leg"/&amp;gt;
 *                       &amp;lt;enumeration value="Course"/&amp;gt;
 *                     &amp;lt;/restriction&amp;gt;
 *                   &amp;lt;/simpleType&amp;gt;
 *                 &amp;lt;/attribute&amp;gt;
 *               &amp;lt;/extension&amp;gt;
 *             &amp;lt;/simpleContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Position" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;simpleContent&amp;gt;
 *               &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;integer"&amp;gt;
 *                 &amp;lt;attribute name="type" use="required"&amp;gt;
 *                   &amp;lt;simpleType&amp;gt;
 *                     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&amp;gt;
 *                       &amp;lt;enumeration value="Leg"/&amp;gt;
 *                       &amp;lt;enumeration value="Course"/&amp;gt;
 *                     &amp;lt;/restriction&amp;gt;
 *                   &amp;lt;/simpleType&amp;gt;
 *                 &amp;lt;/attribute&amp;gt;
 *               &amp;lt;/extension&amp;gt;
 *             &amp;lt;/simpleContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Status" type="{http://www.orienteering.org/datastandard/3.0}ResultStatus"/&amp;gt;
 *         &amp;lt;element name="Score" type="{http://www.orienteering.org/datastandard/3.0}Score" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OverallResult" type="{http://www.orienteering.org/datastandard/3.0}OverallResult" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Course" type="{http://www.orienteering.org/datastandard/3.0}SimpleCourse" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SplitTime" type="{http://www.orienteering.org/datastandard/3.0}SplitTime" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ControlAnswer" type="{http://www.orienteering.org/datastandard/3.0}ControlAnswer" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Route" type="{http://www.orienteering.org/datastandard/3.0}Route" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ControlCard" type="{http://www.orienteering.org/datastandard/3.0}ControlCard" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeamMemberRaceResult", propOrder = {
    "leg",
    "legOrder",
    "bibNumber",
    "startTime",
    "finishTime",
    "time",
    "timeBehind",
    "position",
    "status",
    "score",
    "overallResult",
    "course",
    "splitTime",
    "controlAnswer",
    "route",
    "controlCard",
    "assignedFee",
    "serviceRequest",
    "extensions"
})
public class TeamMemberRaceResult {

    @XmlElement(name = "Leg")
    protected BigInteger leg;
    @XmlElement(name = "LegOrder")
    protected BigInteger legOrder;
    @XmlElement(name = "BibNumber")
    protected String bibNumber;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "FinishTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishTime;
    @XmlElement(name = "Time")
    protected Double time;
    @XmlElement(name = "TimeBehind")
    protected List<TeamMemberRaceResult.TimeBehind> timeBehind;
    @XmlElement(name = "Position")
    protected List<TeamMemberRaceResult.Position> position;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected ResultStatus status;
    @XmlElement(name = "Score")
    protected List<Score> score;
    @XmlElement(name = "OverallResult")
    protected OverallResult overallResult;
    @XmlElement(name = "Course")
    protected SimpleCourse course;
    @XmlElement(name = "SplitTime")
    protected List<SplitTime> splitTime;
    @XmlElement(name = "ControlAnswer")
    protected List<ControlAnswer> controlAnswer;
    @XmlElement(name = "Route")
    protected Route route;
    @XmlElement(name = "ControlCard")
    protected List<ControlCard> controlCard;
    @XmlElement(name = "AssignedFee")
    protected List<AssignedFee> assignedFee;
    @XmlElement(name = "ServiceRequest")
    protected List<ServiceRequest> serviceRequest;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "raceNumber")
    protected BigInteger raceNumber;

    /**
     * Gets the value of the leg property.
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
     */
    public void setLeg(BigInteger value) {
        this.leg = value;
    }

    /**
     * Gets the value of the legOrder property.
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
     */
    public void setLegOrder(BigInteger value) {
        this.legOrder = value;
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
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the finishTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishTime() {
        return finishTime;
    }

    /**
     * Sets the value of the finishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishTime(XMLGregorianCalendar value) {
        this.finishTime = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTime(Double value) {
        this.time = value;
    }

    /**
     * Gets the value of the timeBehind property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the timeBehind property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTimeBehind().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMemberRaceResult.TimeBehind }
     * 
     * 
     */
    public List<TeamMemberRaceResult.TimeBehind> getTimeBehind() {
        if (timeBehind == null) {
            timeBehind = new ArrayList<TeamMemberRaceResult.TimeBehind>();
        }
        return this.timeBehind;
    }

    /**
     * Gets the value of the position property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the position property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPosition().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMemberRaceResult.Position }
     * 
     * 
     */
    public List<TeamMemberRaceResult.Position> getPosition() {
        if (position == null) {
            position = new ArrayList<TeamMemberRaceResult.Position>();
        }
        return this.position;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ResultStatus }
     *     
     */
    public ResultStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStatus }
     *     
     */
    public void setStatus(ResultStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the score property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getScore().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Score }
     * 
     * 
     */
    public List<Score> getScore() {
        if (score == null) {
            score = new ArrayList<Score>();
        }
        return this.score;
    }

    /**
     * Gets the value of the overallResult property.
     * 
     * @return
     *     possible object is
     *     {@link OverallResult }
     *     
     */
    public OverallResult getOverallResult() {
        return overallResult;
    }

    /**
     * Sets the value of the overallResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallResult }
     *     
     */
    public void setOverallResult(OverallResult value) {
        this.overallResult = value;
    }

    /**
     * Gets the value of the course property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCourse }
     *     
     */
    public SimpleCourse getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCourse }
     *     
     */
    public void setCourse(SimpleCourse value) {
        this.course = value;
    }

    /**
     * Gets the value of the splitTime property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the splitTime property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSplitTime().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link SplitTime }
     * 
     * 
     */
    public List<SplitTime> getSplitTime() {
        if (splitTime == null) {
            splitTime = new ArrayList<SplitTime>();
        }
        return this.splitTime;
    }

    /**
     * Gets the value of the controlAnswer property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the controlAnswer property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getControlAnswer().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ControlAnswer }
     * 
     * 
     */
    public List<ControlAnswer> getControlAnswer() {
        if (controlAnswer == null) {
            controlAnswer = new ArrayList<ControlAnswer>();
        }
        return this.controlAnswer;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link Route }
     *     
     */
    public Route getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link Route }
     *     
     */
    public void setRoute(Route value) {
        this.route = value;
    }

    /**
     * Gets the value of the controlCard property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the controlCard property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getControlCard().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ControlCard }
     * 
     * 
     */
    public List<ControlCard> getControlCard() {
        if (controlCard == null) {
            controlCard = new ArrayList<ControlCard>();
        }
        return this.controlCard;
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
     * Gets the value of the raceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRaceNumber() {
        return raceNumber;
    }

    /**
     * Sets the value of the raceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRaceNumber(BigInteger value) {
        this.raceNumber = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;simpleContent&amp;gt;
     *     &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;integer"&amp;gt;
     *       &amp;lt;attribute name="type" use="required"&amp;gt;
     *         &amp;lt;simpleType&amp;gt;
     *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&amp;gt;
     *             &amp;lt;enumeration value="Leg"/&amp;gt;
     *             &amp;lt;enumeration value="Course"/&amp;gt;
     *           &amp;lt;/restriction&amp;gt;
     *         &amp;lt;/simpleType&amp;gt;
     *       &amp;lt;/attribute&amp;gt;
     *     &amp;lt;/extension&amp;gt;
     *   &amp;lt;/simpleContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Position {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "type", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;simpleContent&amp;gt;
     *     &amp;lt;extension base="&amp;lt;http://www.w3.org/2001/XMLSchema&amp;gt;double"&amp;gt;
     *       &amp;lt;attribute name="type" use="required"&amp;gt;
     *         &amp;lt;simpleType&amp;gt;
     *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&amp;gt;
     *             &amp;lt;enumeration value="Leg"/&amp;gt;
     *             &amp;lt;enumeration value="Course"/&amp;gt;
     *           &amp;lt;/restriction&amp;gt;
     *         &amp;lt;/simpleType&amp;gt;
     *       &amp;lt;/attribute&amp;gt;
     *     &amp;lt;/extension&amp;gt;
     *   &amp;lt;/simpleContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TimeBehind {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "type", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;

        /**
         * Gets the value of the value property.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}

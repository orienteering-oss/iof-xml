
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
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Result information for a person in a race.
 * 
 * <p>Java class for TeamMemberRaceResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TeamMemberRaceResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Leg" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="LegOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="BibNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="FinishTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="Time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="TimeBehind" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>double">
 *                 <attribute name="type" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       <enumeration value="Leg"/>
 *                       <enumeration value="Course"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="Position" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://www.w3.org/2001/XMLSchema>integer">
 *                 <attribute name="type" use="required">
 *                   <simpleType>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       <enumeration value="Leg"/>
 *                       <enumeration value="Course"/>
 *                     </restriction>
 *                   </simpleType>
 *                 </attribute>
 *               </extension>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *         <element name="Status" type="{http://www.orienteering.org/datastandard/3.0}ResultStatus"/>
 *         <element name="Score" type="{http://www.orienteering.org/datastandard/3.0}Score" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OverallResult" type="{http://www.orienteering.org/datastandard/3.0}OverallResult" minOccurs="0"/>
 *         <element name="Course" type="{http://www.orienteering.org/datastandard/3.0}SimpleCourse" minOccurs="0"/>
 *         <element name="SplitTime" type="{http://www.orienteering.org/datastandard/3.0}SplitTime" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ControlAnswer" type="{http://www.orienteering.org/datastandard/3.0}ControlAnswer" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Route" type="{http://www.orienteering.org/datastandard/3.0}Route" minOccurs="0"/>
 *         <element name="ControlCard" type="{http://www.orienteering.org/datastandard/3.0}ControlCard" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AssignedFee" type="{http://www.orienteering.org/datastandard/3.0}AssignedFee" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ServiceRequest" type="{http://www.orienteering.org/datastandard/3.0}ServiceRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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

    /**
     * In case of a relay, this is the number of the leg that the team member takes part in.
     * 
     */
    @XmlElement(name = "Leg")
    protected BigInteger leg;
    /**
     * In case of a relay with parallel legs, this defines the team member's starting order of the leg within the team.
     * 
     */
    @XmlElement(name = "LegOrder")
    protected BigInteger legOrder;
    /**
     * The bib number that the team member that the result belongs to is wearing.
     * 
     */
    @XmlElement(name = "BibNumber")
    protected String bibNumber;
    /**
     * The time when the team member that the result belongs to started, expressed in ISO 8601 format.
     * 
     */
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    /**
     * The time when the team member that the result belongs to finished, expressed in ISO 8601 format.
     * 
     */
    @XmlElement(name = "FinishTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishTime;
    /**
     * The time, in seconds, that is shown in the result list. Fractions of seconds (e.g. 258.7) may be used if the time resolution is higher than one second.
     * 
     */
    @XmlElement(name = "Time")
    protected Double time;
    /**
     * The time, in seconds, that the the team member is behind the winner. Fractions of seconds (e.g. 258.7) may be used if the time resolution is higher than one second.
     * 
     */
    @XmlElement(name = "TimeBehind")
    protected List<TeamMemberRaceResult.TimeBehind> timeBehind;
    /**
     * The position in the result list for the person that the result belongs to. This element should only be present when the Status element is set to OK.
     * 
     */
    @XmlElement(name = "Position")
    protected List<TeamMemberRaceResult.Position> position;
    /**
     * The status of the result.
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected ResultStatus status;
    /**
     * Any scores that are attached to the result, e.g. World Ranking points.
     * 
     */
    @XmlElement(name = "Score")
    protected List<Score> score;
    /**
     * Holds the result after the current leg for the team.
     * 
     */
    @XmlElement(name = "OverallResult")
    protected OverallResult overallResult;
    /**
     * Defines the course assigned to the person.
     * 
     */
    @XmlElement(name = "Course")
    protected SimpleCourse course;
    /**
     * Contains the times at each control of the course. Each control of the team member's course has to be defined in a SplitTime element, even if the control has not been punched. Start and finish times must not be present as SplitTime elements.
     * 
     */
    @XmlElement(name = "SplitTime")
    protected List<SplitTime> splitTime;
    /**
     * Defines the answer for a trail-O control.
     * 
     */
    @XmlElement(name = "ControlAnswer")
    protected List<ControlAnswer> controlAnswer;
    /**
     * Defines the person's route recorded by a tracking device.
     * 
     */
    @XmlElement(name = "Route")
    protected Route route;
    /**
     * Defines the control card assigned to the person. Multiple control cards can be specified, e.g. one for punch checking and another for timing.
     * 
     */
    @XmlElement(name = "ControlCard")
    protected List<ControlCard> controlCard;
    /**
     * Defines the fees that the team member has been assigned.
     * 
     */
    @XmlElement(name = "AssignedFee")
    protected List<AssignedFee> assignedFee;
    /**
     * Defines the services requested by the team member.
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
     * The ordinal number of the race that the information belongs to for a multi-race event, starting at 1.
     * 
     */
    @XmlAttribute(name = "raceNumber")
    protected BigInteger raceNumber;

    /**
     * In case of a relay, this is the number of the leg that the team member takes part in.
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
     * In case of a relay with parallel legs, this defines the team member's starting order of the leg within the team.
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
     * The bib number that the team member that the result belongs to is wearing.
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
     * The time when the team member that the result belongs to started, expressed in ISO 8601 format.
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
     * @see #getStartTime()
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * The time when the team member that the result belongs to finished, expressed in ISO 8601 format.
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
     * @see #getFinishTime()
     */
    public void setFinishTime(XMLGregorianCalendar value) {
        this.finishTime = value;
    }

    /**
     * The time, in seconds, that is shown in the result list. Fractions of seconds (e.g. 258.7) may be used if the time resolution is higher than one second.
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
     * @see #getTime()
     */
    public void setTime(Double value) {
        this.time = value;
    }

    /**
     * The time, in seconds, that the the team member is behind the winner. Fractions of seconds (e.g. 258.7) may be used if the time resolution is higher than one second.
     * 
     * Gets the value of the timeBehind property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeBehind property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTimeBehind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMemberRaceResult.TimeBehind }
     * </p>
     * 
     * 
     * @return
     *     The value of the timeBehind property.
     */
    public List<TeamMemberRaceResult.TimeBehind> getTimeBehind() {
        if (timeBehind == null) {
            timeBehind = new ArrayList<>();
        }
        return this.timeBehind;
    }

    /**
     * The position in the result list for the person that the result belongs to. This element should only be present when the Status element is set to OK.
     * 
     * Gets the value of the position property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMemberRaceResult.Position }
     * </p>
     * 
     * 
     * @return
     *     The value of the position property.
     */
    public List<TeamMemberRaceResult.Position> getPosition() {
        if (position == null) {
            position = new ArrayList<>();
        }
        return this.position;
    }

    /**
     * The status of the result.
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
     * @see #getStatus()
     */
    public void setStatus(ResultStatus value) {
        this.status = value;
    }

    /**
     * Any scores that are attached to the result, e.g. World Ranking points.
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
     * Holds the result after the current leg for the team.
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
     * @see #getOverallResult()
     */
    public void setOverallResult(OverallResult value) {
        this.overallResult = value;
    }

    /**
     * Defines the course assigned to the person.
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
     * @see #getCourse()
     */
    public void setCourse(SimpleCourse value) {
        this.course = value;
    }

    /**
     * Contains the times at each control of the course. Each control of the team member's course has to be defined in a SplitTime element, even if the control has not been punched. Start and finish times must not be present as SplitTime elements.
     * 
     * Gets the value of the splitTime property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitTime property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSplitTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitTime }
     * </p>
     * 
     * 
     * @return
     *     The value of the splitTime property.
     */
    public List<SplitTime> getSplitTime() {
        if (splitTime == null) {
            splitTime = new ArrayList<>();
        }
        return this.splitTime;
    }

    /**
     * Defines the answer for a trail-O control.
     * 
     * Gets the value of the controlAnswer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlAnswer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getControlAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlAnswer }
     * </p>
     * 
     * 
     * @return
     *     The value of the controlAnswer property.
     */
    public List<ControlAnswer> getControlAnswer() {
        if (controlAnswer == null) {
            controlAnswer = new ArrayList<>();
        }
        return this.controlAnswer;
    }

    /**
     * Defines the person's route recorded by a tracking device.
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
     * @see #getRoute()
     */
    public void setRoute(Route value) {
        this.route = value;
    }

    /**
     * Defines the control card assigned to the person. Multiple control cards can be specified, e.g. one for punch checking and another for timing.
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
     * Defines the fees that the team member has been assigned.
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
     * Defines the services requested by the team member.
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

    /**
     * The ordinal number of the race that the information belongs to for a multi-race event, starting at 1.
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
     * @see #getRaceNumber()
     */
    public void setRaceNumber(BigInteger value) {
        this.raceNumber = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.w3.org/2001/XMLSchema>integer">
     *       <attribute name="type" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             <enumeration value="Leg"/>
     *             <enumeration value="Course"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *     </extension>
     *   </simpleContent>
     * </complexType>
     * }</pre>
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://www.w3.org/2001/XMLSchema>double">
     *       <attribute name="type" use="required">
     *         <simpleType>
     *           <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             <enumeration value="Leg"/>
     *             <enumeration value="Course"/>
     *           </restriction>
     *         </simpleType>
     *       </attribute>
     *     </extension>
     *   </simpleContent>
     * </complexType>
     * }</pre>
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

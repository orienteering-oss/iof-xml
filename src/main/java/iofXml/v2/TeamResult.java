
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         <element ref="{}TeamName"/>
 *         <choice minOccurs="0">
 *           <element ref="{}CountryId"/>
 *           <element ref="{}Country"/>
 *         </choice>
 *         <element ref="{}StartNumber" minOccurs="0"/>
 *         <element ref="{}BibNumber" minOccurs="0"/>
 *         <element ref="{}StartTime" minOccurs="0"/>
 *         <element ref="{}FinishTime" minOccurs="0"/>
 *         <element ref="{}Time" minOccurs="0"/>
 *         <element ref="{}ResultPosition" minOccurs="0"/>
 *         <element ref="{}TeamStatus"/>
 *         <element ref="{}Rank" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}Point" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}PersonResult" maxOccurs="unbounded" minOccurs="0"/>
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
    "teamName",
    "countryId",
    "country",
    "startNumber",
    "bibNumber",
    "startTime",
    "finishTime",
    "time",
    "resultPosition",
    "teamStatus",
    "rank",
    "point",
    "personResult"
})
@XmlRootElement(name = "TeamResult")
public class TeamResult {

    @XmlElement(name = "TeamName", required = true)
    protected String teamName;
    @XmlElement(name = "CountryId")
    protected CountryId countryId;
    @XmlElement(name = "Country")
    protected Country country;
    @XmlElement(name = "StartNumber")
    protected String startNumber;
    @XmlElement(name = "BibNumber")
    protected String bibNumber;
    @XmlElement(name = "StartTime")
    protected StartTime startTime;
    @XmlElement(name = "FinishTime")
    protected FinishTime finishTime;
    @XmlElement(name = "Time")
    protected Time time;
    @XmlElement(name = "ResultPosition")
    protected String resultPosition;
    @XmlElement(name = "TeamStatus", required = true)
    protected TeamStatus teamStatus;
    @XmlElement(name = "Rank")
    protected List<Rank> rank;
    @XmlElement(name = "Point")
    protected List<Point> point;
    @XmlElement(name = "PersonResult")
    protected List<PersonResult> personResult;

    /**
     * Gets the value of the teamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the value of the teamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamName(String value) {
        this.teamName = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link CountryId }
     *     
     */
    public CountryId getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryId }
     *     
     */
    public void setCountryId(CountryId value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the startNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartNumber() {
        return startNumber;
    }

    /**
     * Sets the value of the startNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartNumber(String value) {
        this.startNumber = value;
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
     *     {@link StartTime }
     *     
     */
    public StartTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartTime }
     *     
     */
    public void setStartTime(StartTime value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the finishTime property.
     * 
     * @return
     *     possible object is
     *     {@link FinishTime }
     *     
     */
    public FinishTime getFinishTime() {
        return finishTime;
    }

    /**
     * Sets the value of the finishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinishTime }
     *     
     */
    public void setFinishTime(FinishTime value) {
        this.finishTime = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTime(Time value) {
        this.time = value;
    }

    /**
     * Gets the value of the resultPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultPosition() {
        return resultPosition;
    }

    /**
     * Sets the value of the resultPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultPosition(String value) {
        this.resultPosition = value;
    }

    /**
     * Gets the value of the teamStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TeamStatus }
     *     
     */
    public TeamStatus getTeamStatus() {
        return teamStatus;
    }

    /**
     * Sets the value of the teamStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamStatus }
     *     
     */
    public void setTeamStatus(TeamStatus value) {
        this.teamStatus = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rank property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rank }
     * </p>
     * 
     * 
     * @return
     *     The value of the rank property.
     */
    public List<Rank> getRank() {
        if (rank == null) {
            rank = new ArrayList<>();
        }
        return this.rank;
    }

    /**
     * Gets the value of the point property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Point }
     * </p>
     * 
     * 
     * @return
     *     The value of the point property.
     */
    public List<Point> getPoint() {
        if (point == null) {
            point = new ArrayList<>();
        }
        return this.point;
    }

    /**
     * Gets the value of the personResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPersonResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the personResult property.
     */
    public List<PersonResult> getPersonResult() {
        if (personResult == null) {
            personResult = new ArrayList<>();
        }
        return this.personResult;
    }

}

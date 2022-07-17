
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{}TeamName"/&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element ref="{}CountryId"/&amp;gt;
 *           &amp;lt;element ref="{}Country"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element ref="{}StartNumber" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}BibNumber" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}StartTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}FinishTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}Time" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}ResultPosition" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}TeamStatus"/&amp;gt;
 *         &amp;lt;element ref="{}Rank" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}Point" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}PersonResult" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rank property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRank().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Rank }
     * 
     * 
     */
    public List<Rank> getRank() {
        if (rank == null) {
            rank = new ArrayList<Rank>();
        }
        return this.rank;
    }

    /**
     * Gets the value of the point property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the point property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPoint().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Point }
     * 
     * 
     */
    public List<Point> getPoint() {
        if (point == null) {
            point = new ArrayList<Point>();
        }
        return this.point;
    }

    /**
     * Gets the value of the personResult property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the personResult property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPersonResult().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PersonResult }
     * 
     * 
     */
    public List<PersonResult> getPersonResult() {
        if (personResult == null) {
            personResult = new ArrayList<PersonResult>();
        }
        return this.personResult;
    }

}

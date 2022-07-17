
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
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{}ControlCode"/&amp;gt;
 *         &amp;lt;element ref="{}Description" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}ControlPosition" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *           &amp;lt;element ref="{}PunchingUnit"/&amp;gt;
 *           &amp;lt;element ref="{}PunchPattern"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element ref="{}PunchingUnitType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}MapPosition" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}Comment" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{}ModifyDate" minOccurs="0"/&amp;gt;
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
    "controlCode",
    "description",
    "controlPosition",
    "punchingUnitOrPunchPattern",
    "punchingUnitType",
    "mapPosition",
    "comment",
    "modifyDate"
})
@XmlRootElement(name = "Control")
public class Control {

    @XmlElement(name = "ControlCode", required = true)
    protected String controlCode;
    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "ControlPosition")
    protected ControlPosition controlPosition;
    @XmlElements({
        @XmlElement(name = "PunchingUnit", type = PunchingUnit.class),
        @XmlElement(name = "PunchPattern", type = String.class)
    })
    protected List<Object> punchingUnitOrPunchPattern;
    @XmlElement(name = "PunchingUnitType")
    protected PunchingUnitType punchingUnitType;
    @XmlElement(name = "MapPosition")
    protected MapPosition mapPosition;
    @XmlElement(name = "Comment")
    protected List<Comment> comment;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;

    /**
     * Gets the value of the controlCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlCode() {
        return controlCode;
    }

    /**
     * Sets the value of the controlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlCode(String value) {
        this.controlCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the controlPosition property.
     * 
     * @return
     *     possible object is
     *     {@link ControlPosition }
     *     
     */
    public ControlPosition getControlPosition() {
        return controlPosition;
    }

    /**
     * Sets the value of the controlPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlPosition }
     *     
     */
    public void setControlPosition(ControlPosition value) {
        this.controlPosition = value;
    }

    /**
     * Gets the value of the punchingUnitOrPunchPattern property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the punchingUnitOrPunchPattern property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPunchingUnitOrPunchPattern().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link PunchingUnit }
     * {@link String }
     * 
     * 
     */
    public List<Object> getPunchingUnitOrPunchPattern() {
        if (punchingUnitOrPunchPattern == null) {
            punchingUnitOrPunchPattern = new ArrayList<Object>();
        }
        return this.punchingUnitOrPunchPattern;
    }

    /**
     * Gets the value of the punchingUnitType property.
     * 
     * @return
     *     possible object is
     *     {@link PunchingUnitType }
     *     
     */
    public PunchingUnitType getPunchingUnitType() {
        return punchingUnitType;
    }

    /**
     * Sets the value of the punchingUnitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PunchingUnitType }
     *     
     */
    public void setPunchingUnitType(PunchingUnitType value) {
        this.punchingUnitType = value;
    }

    /**
     * Gets the value of the mapPosition property.
     * 
     * @return
     *     possible object is
     *     {@link MapPosition }
     *     
     */
    public MapPosition getMapPosition() {
        return mapPosition;
    }

    /**
     * Sets the value of the mapPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapPosition }
     *     
     */
    public void setMapPosition(MapPosition value) {
        this.mapPosition = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the comment property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getComment().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * 
     * 
     */
    public List<Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<Comment>();
        }
        return this.comment;
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

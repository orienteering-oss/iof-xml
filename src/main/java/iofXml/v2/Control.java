
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
 *         <element ref="{}ControlCode"/>
 *         <element ref="{}Description" minOccurs="0"/>
 *         <element ref="{}ControlPosition" minOccurs="0"/>
 *         <choice maxOccurs="unbounded" minOccurs="0">
 *           <element ref="{}PunchingUnit"/>
 *           <element ref="{}PunchPattern"/>
 *         </choice>
 *         <element ref="{}PunchingUnitType" minOccurs="0"/>
 *         <element ref="{}MapPosition" minOccurs="0"/>
 *         <element ref="{}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}ModifyDate" minOccurs="0"/>
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
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the punchingUnitOrPunchPattern property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPunchingUnitOrPunchPattern().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PunchingUnit }
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the punchingUnitOrPunchPattern property.
     */
    public List<Object> getPunchingUnitOrPunchPattern() {
        if (punchingUnitOrPunchPattern == null) {
            punchingUnitOrPunchPattern = new ArrayList<>();
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
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Comment }
     * </p>
     * 
     * 
     * @return
     *     The value of the comment property.
     */
    public List<Comment> getComment() {
        if (comment == null) {
            comment = new ArrayList<>();
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

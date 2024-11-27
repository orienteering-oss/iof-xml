
package iofXml.v3;

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
 * A control included in a particular course.
 * 
 * <p>Java class for CourseControl complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CourseControl">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Control" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="MapText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MapTextPosition" type="{http://www.orienteering.org/datastandard/3.0}MapPosition" minOccurs="0"/>
 *         <element name="LegLength" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Score" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="type" type="{http://www.orienteering.org/datastandard/3.0}ControlType" />
 *       <attribute name="randomOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       <attribute name="specialInstruction" default="None">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             <enumeration value="None"/>
 *             <enumeration value="TapedRoute"/>
 *             <enumeration value="FunnelTapedRoute"/>
 *             <enumeration value="MandatoryCrossingPoint"/>
 *             <enumeration value="MandatoryOutOfBoundsAreaPassage"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="tapedRouteLength" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       <attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseControl", propOrder = {
    "control",
    "mapText",
    "mapTextPosition",
    "legLength",
    "score",
    "extensions"
})
public class CourseControl {

    /**
     * The code(s) of the control(s), without course-specific information. Specifying multiple control codes means that the competitor is required to punch one of the controls, but not all of them.
     * 
     */
    @XmlElement(name = "Control", required = true)
    protected List<String> control;
    /**
     * Indicates the text shown next to the control circle, i.e. the control number.
     * 
     */
    @XmlElement(name = "MapText")
    protected String mapText;
    /**
     * Indicates the position of the center of the text relative to the center of the control circle.
     * 
     */
    @XmlElement(name = "MapTextPosition")
    protected MapPosition mapTextPosition;
    /**
     * The length in meters from the previous control on the course. For starts, this length may refer to the distance from the time start to the start flag.
     * 
     */
    @XmlElement(name = "LegLength")
    protected Double legLength;
    /**
     * The score of the control in score-O events.
     * 
     */
    @XmlElement(name = "Score")
    protected Double score;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    /**
     * The type of the control: (ordinary) control, start, finish, crossing point or end of marked route. If this attribute is specified, it overrides the corresponding Control's type.
     * 
     */
    @XmlAttribute(name = "type")
    protected ControlType type;
    /**
     * Non-broken sequences of course controls having randomOrder set to true can be visited in an arbitrary order.
     * 
     */
    @XmlAttribute(name = "randomOrder")
    protected Boolean randomOrder;
    /**
     * Any special instruction applied at the control, see the column G as defined in International Specification for Control Descriptions.
     * 
     */
    @XmlAttribute(name = "specialInstruction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String specialInstruction;
    /**
     * The length of the taped route in meters. Only to be specified if specialInstruction is TapedRoute or FunnelTapedRoute and if different from the value specified in LegLength element, i.e. when Special Instruction 13.1 is used.
     * 
     */
    @XmlAttribute(name = "tapedRouteLength")
    protected Double tapedRouteLength;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * The code(s) of the control(s), without course-specific information. Specifying multiple control codes means that the competitor is required to punch one of the controls, but not all of them.
     * 
     * Gets the value of the control property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the control property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the control property.
     */
    public List<String> getControl() {
        if (control == null) {
            control = new ArrayList<>();
        }
        return this.control;
    }

    /**
     * Indicates the text shown next to the control circle, i.e. the control number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapText() {
        return mapText;
    }

    /**
     * Sets the value of the mapText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMapText()
     */
    public void setMapText(String value) {
        this.mapText = value;
    }

    /**
     * Indicates the position of the center of the text relative to the center of the control circle.
     * 
     * @return
     *     possible object is
     *     {@link MapPosition }
     *     
     */
    public MapPosition getMapTextPosition() {
        return mapTextPosition;
    }

    /**
     * Sets the value of the mapTextPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapPosition }
     *     
     * @see #getMapTextPosition()
     */
    public void setMapTextPosition(MapPosition value) {
        this.mapTextPosition = value;
    }

    /**
     * The length in meters from the previous control on the course. For starts, this length may refer to the distance from the time start to the start flag.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLegLength() {
        return legLength;
    }

    /**
     * Sets the value of the legLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     * @see #getLegLength()
     */
    public void setLegLength(Double value) {
        this.legLength = value;
    }

    /**
     * The score of the control in score-O events.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     * @see #getScore()
     */
    public void setScore(Double value) {
        this.score = value;
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
     * The type of the control: (ordinary) control, start, finish, crossing point or end of marked route. If this attribute is specified, it overrides the corresponding Control's type.
     * 
     * @return
     *     possible object is
     *     {@link ControlType }
     *     
     */
    public ControlType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlType }
     *     
     * @see #getType()
     */
    public void setType(ControlType value) {
        this.type = value;
    }

    /**
     * Non-broken sequences of course controls having randomOrder set to true can be visited in an arbitrary order.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRandomOrder() {
        if (randomOrder == null) {
            return false;
        } else {
            return randomOrder;
        }
    }

    /**
     * Sets the value of the randomOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRandomOrder()
     */
    public void setRandomOrder(Boolean value) {
        this.randomOrder = value;
    }

    /**
     * Any special instruction applied at the control, see the column G as defined in International Specification for Control Descriptions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstruction() {
        if (specialInstruction == null) {
            return "None";
        } else {
            return specialInstruction;
        }
    }

    /**
     * Sets the value of the specialInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSpecialInstruction()
     */
    public void setSpecialInstruction(String value) {
        this.specialInstruction = value;
    }

    /**
     * The length of the taped route in meters. Only to be specified if specialInstruction is TapedRoute or FunnelTapedRoute and if different from the value specified in LegLength element, i.e. when Special Instruction 13.1 is used.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTapedRouteLength() {
        return tapedRouteLength;
    }

    /**
     * Sets the value of the tapedRouteLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     * @see #getTapedRouteLength()
     */
    public void setTapedRouteLength(Double value) {
        this.tapedRouteLength = value;
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

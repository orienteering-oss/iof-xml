
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
 * 
 *         A control included in a particular course.
 *       
 * 
 * <p>Java class for CourseControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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

    @XmlElement(name = "Control", required = true)
    protected List<String> control;
    @XmlElement(name = "MapText")
    protected String mapText;
    @XmlElement(name = "MapTextPosition")
    protected MapPosition mapTextPosition;
    @XmlElement(name = "LegLength")
    protected Double legLength;
    @XmlElement(name = "Score")
    protected Double score;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    @XmlAttribute(name = "type")
    protected ControlType type;
    @XmlAttribute(name = "randomOrder")
    protected Boolean randomOrder;
    @XmlAttribute(name = "specialInstruction")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String specialInstruction;
    @XmlAttribute(name = "tapedRouteLength")
    protected Double tapedRouteLength;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

    /**
     * Gets the value of the control property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the control property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
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
     * Gets the value of the mapText property.
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
     */
    public void setMapText(String value) {
        this.mapText = value;
    }

    /**
     * Gets the value of the mapTextPosition property.
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
     */
    public void setMapTextPosition(MapPosition value) {
        this.mapTextPosition = value;
    }

    /**
     * Gets the value of the legLength property.
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
     */
    public void setLegLength(Double value) {
        this.legLength = value;
    }

    /**
     * Gets the value of the score property.
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
     */
    public void setScore(Double value) {
        this.score = value;
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
     * Gets the value of the type property.
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
     */
    public void setType(ControlType value) {
        this.type = value;
    }

    /**
     * Gets the value of the randomOrder property.
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
     */
    public void setRandomOrder(Boolean value) {
        this.randomOrder = value;
    }

    /**
     * Gets the value of the specialInstruction property.
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
     */
    public void setSpecialInstruction(String value) {
        this.specialInstruction = value;
    }

    /**
     * Gets the value of the tapedRouteLength property.
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


package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element ref="{}Sequence"/>
 *         <choice>
 *           <element ref="{}ControlCode"/>
 *           <element ref="{}Control"/>
 *         </choice>
 *         <element ref="{}Comment" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}LegLength" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}MapTextPosition" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="markedRoute" default="N">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             <enumeration value="Y"/>
 *             <enumeration value="N"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sequence",
    "controlCode",
    "control",
    "comment",
    "legLength",
    "mapTextPosition"
})
@XmlRootElement(name = "CourseControl")
public class CourseControl {

    @XmlElement(name = "Sequence", required = true)
    protected String sequence;
    @XmlElement(name = "ControlCode")
    protected String controlCode;
    @XmlElement(name = "Control")
    protected Control control;
    @XmlElement(name = "Comment")
    protected List<Comment> comment;
    @XmlElement(name = "LegLength")
    protected List<LegLength> legLength;
    @XmlElement(name = "MapTextPosition")
    protected MapTextPosition mapTextPosition;
    @XmlAttribute(name = "markedRoute")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String markedRoute;

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

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
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link Control }
     *     
     */
    public Control getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link Control }
     *     
     */
    public void setControl(Control value) {
        this.control = value;
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
     * Gets the value of the legLength property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legLength property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLegLength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegLength }
     * </p>
     * 
     * 
     * @return
     *     The value of the legLength property.
     */
    public List<LegLength> getLegLength() {
        if (legLength == null) {
            legLength = new ArrayList<>();
        }
        return this.legLength;
    }

    /**
     * Gets the value of the mapTextPosition property.
     * 
     * @return
     *     possible object is
     *     {@link MapTextPosition }
     *     
     */
    public MapTextPosition getMapTextPosition() {
        return mapTextPosition;
    }

    /**
     * Sets the value of the mapTextPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapTextPosition }
     *     
     */
    public void setMapTextPosition(MapTextPosition value) {
        this.mapTextPosition = value;
    }

    /**
     * Gets the value of the markedRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkedRoute() {
        if (markedRoute == null) {
            return "N";
        } else {
            return markedRoute;
        }
    }

    /**
     * Sets the value of the markedRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkedRoute(String value) {
        this.markedRoute = value;
    }

}

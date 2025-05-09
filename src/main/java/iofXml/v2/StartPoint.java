
package iofXml.v2;

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
 *         <element ref="{}StartPointCode"/>
 *         <element ref="{}Description" minOccurs="0"/>
 *         <element ref="{}ControlPosition" minOccurs="0"/>
 *         <element ref="{}MapPosition" minOccurs="0"/>
 *         <element ref="{}Comment" minOccurs="0"/>
 *         <element ref="{}DistanceFromStart" minOccurs="0"/>
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
    "startPointCode",
    "description",
    "controlPosition",
    "mapPosition",
    "comment",
    "distanceFromStart",
    "modifyDate"
})
@XmlRootElement(name = "StartPoint")
public class StartPoint {

    @XmlElement(name = "StartPointCode", required = true)
    protected String startPointCode;
    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "ControlPosition")
    protected ControlPosition controlPosition;
    @XmlElement(name = "MapPosition")
    protected MapPosition mapPosition;
    @XmlElement(name = "Comment")
    protected Comment comment;
    @XmlElement(name = "DistanceFromStart")
    protected DistanceFromStart distanceFromStart;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;

    /**
     * Gets the value of the startPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPointCode() {
        return startPointCode;
    }

    /**
     * Sets the value of the startPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPointCode(String value) {
        this.startPointCode = value;
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
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

    /**
     * Gets the value of the distanceFromStart property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceFromStart }
     *     
     */
    public DistanceFromStart getDistanceFromStart() {
        return distanceFromStart;
    }

    /**
     * Sets the value of the distanceFromStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceFromStart }
     *     
     */
    public void setDistanceFromStart(DistanceFromStart value) {
        this.distanceFromStart = value;
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

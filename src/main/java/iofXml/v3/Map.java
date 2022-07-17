
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Map information, used in course setting software with regard to the "real" map.
 *       
 * 
 * <p>Java class for Map complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Map">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="Image" type="{http://www.orienteering.org/datastandard/3.0}Image" minOccurs="0"/>
 *         <element name="Scale" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="MapPositionTopLeft" type="{http://www.orienteering.org/datastandard/3.0}MapPosition"/>
 *         <element name="MapPositionBottomRight" type="{http://www.orienteering.org/datastandard/3.0}MapPosition"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Map", propOrder = {
    "id",
    "image",
    "scale",
    "mapPositionTopLeft",
    "mapPositionBottomRight",
    "extensions"
})
public class Map {

    @XmlElement(name = "Id")
    protected Id id;
    @XmlElement(name = "Image")
    protected Image image;
    @XmlElement(name = "Scale")
    protected double scale;
    @XmlElement(name = "MapPositionTopLeft", required = true)
    protected MapPosition mapPositionTopLeft;
    @XmlElement(name = "MapPositionBottomRight", required = true)
    protected MapPosition mapPositionBottomRight;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     */
    public double getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     */
    public void setScale(double value) {
        this.scale = value;
    }

    /**
     * Gets the value of the mapPositionTopLeft property.
     * 
     * @return
     *     possible object is
     *     {@link MapPosition }
     *     
     */
    public MapPosition getMapPositionTopLeft() {
        return mapPositionTopLeft;
    }

    /**
     * Sets the value of the mapPositionTopLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapPosition }
     *     
     */
    public void setMapPositionTopLeft(MapPosition value) {
        this.mapPositionTopLeft = value;
    }

    /**
     * Gets the value of the mapPositionBottomRight property.
     * 
     * @return
     *     possible object is
     *     {@link MapPosition }
     *     
     */
    public MapPosition getMapPositionBottomRight() {
        return mapPositionBottomRight;
    }

    /**
     * Sets the value of the mapPositionBottomRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapPosition }
     *     
     */
    public void setMapPositionBottomRight(MapPosition value) {
        this.mapPositionBottomRight = value;
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

}

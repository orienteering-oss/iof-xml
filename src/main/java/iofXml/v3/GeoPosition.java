
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines a geographical position, e.g. of a control.
 * 
 * <p>Java class for GeoPosition complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeoPosition">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="lng" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       <attribute name="lat" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       <attribute name="alt" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoPosition")
public class GeoPosition {

    /**
     * The longitude.
     * 
     */
    @XmlAttribute(name = "lng", required = true)
    protected double lng;
    /**
     * The latitude.
     * 
     */
    @XmlAttribute(name = "lat", required = true)
    protected double lat;
    /**
     * The altitude (elevation above sea level), in meters.
     * 
     */
    @XmlAttribute(name = "alt")
    protected Double alt;

    /**
     * The longitude.
     * 
     */
    public double getLng() {
        return lng;
    }

    /**
     * Sets the value of the lng property.
     * 
     */
    public void setLng(double value) {
        this.lng = value;
    }

    /**
     * The latitude.
     * 
     */
    public double getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     */
    public void setLat(double value) {
        this.lat = value;
    }

    /**
     * The altitude (elevation above sea level), in meters.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAlt() {
        return alt;
    }

    /**
     * Sets the value of the alt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     * @see #getAlt()
     */
    public void setAlt(Double value) {
        this.alt = value;
    }

}

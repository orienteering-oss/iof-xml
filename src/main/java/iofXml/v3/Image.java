
package iofXml.v3;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Defines an image file, either as a link (use the url attribute) or as base64-encoded binary data.
 * 
 * <p>Java class for Image complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Image">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>base64Binary">
 *       <attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="mediaType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="width" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="height" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="resolution" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {
    "value"
})
public class Image {

    @XmlValue
    protected byte[] value;
    /**
     * The url to the image if it is stored externally (i.e. not as base64-encoded binary data).
     * 
     */
    @XmlAttribute(name = "url")
    protected String url;
    /**
     * The type of the image file, e.g. image/jpeg. Refer to https://www.iana.org/assignments/media-types/media-types.xhtml#image for available media types.
     * 
     */
    @XmlAttribute(name = "mediaType", required = true)
    protected String mediaType;
    /**
     * The width of the image in pixels.
     * 
     */
    @XmlAttribute(name = "width")
    protected BigInteger width;
    /**
     * The height of the image in pixels.
     * 
     */
    @XmlAttribute(name = "height")
    protected BigInteger height;
    /**
     * The resolution of the image in dpi.
     * 
     */
    @XmlAttribute(name = "resolution")
    protected Double resolution;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * The url to the image if it is stored externally (i.e. not as base64-encoded binary data).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUrl()
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * The type of the image file, e.g. image/jpeg. Refer to https://www.iana.org/assignments/media-types/media-types.xhtml#image for available media types.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMediaType()
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * The width of the image in pixels.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getWidth()
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * The height of the image in pixels.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getHeight()
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

    /**
     * The resolution of the image in dpi.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     * @see #getResolution()
     */
    public void setResolution(Double value) {
        this.resolution = value;
    }

}

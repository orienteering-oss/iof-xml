
package iofXml.v3;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Defines a course, excluding controls.
 *       
 * 
 * <p>Java class for SimpleCourse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SimpleCourse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CourseFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Length" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Climb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="NumberOfControls" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleCourse", propOrder = {
    "id",
    "name",
    "courseFamily",
    "length",
    "climb",
    "numberOfControls"
})
@XmlSeeAlso({
    SimpleRaceCourse.class
})
public class SimpleCourse {

    @XmlElement(name = "Id")
    protected Id id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CourseFamily")
    protected String courseFamily;
    @XmlElement(name = "Length")
    protected Double length;
    @XmlElement(name = "Climb")
    protected Double climb;
    @XmlElement(name = "NumberOfControls")
    protected BigInteger numberOfControls;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the courseFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseFamily() {
        return courseFamily;
    }

    /**
     * Sets the value of the courseFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseFamily(String value) {
        this.courseFamily = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLength(Double value) {
        this.length = value;
    }

    /**
     * Gets the value of the climb property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClimb() {
        return climb;
    }

    /**
     * Sets the value of the climb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClimb(Double value) {
        this.climb = value;
    }

    /**
     * Gets the value of the numberOfControls property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfControls() {
        return numberOfControls;
    }

    /**
     * Sets the value of the numberOfControls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfControls(BigInteger value) {
        this.numberOfControls = value;
    }

}

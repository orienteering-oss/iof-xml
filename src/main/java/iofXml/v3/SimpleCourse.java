
package iofXml.v3;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines a course, excluding controls.
 * 
 * <p>Java class for SimpleCourse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
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
    /**
     * The name of the course.
     * 
     */
    @XmlElement(name = "Name")
    protected String name;
    /**
     * The family or group of forked courses that the course is part of.
     * 
     */
    @XmlElement(name = "CourseFamily")
    protected String courseFamily;
    /**
     * The length of the course, in meters.
     * 
     */
    @XmlElement(name = "Length")
    protected Double length;
    /**
     * The climb of the course, in meters, along the expected best route choice.
     * 
     */
    @XmlElement(name = "Climb")
    protected Double climb;
    /**
     * The number of controls in the course, excluding start and finish.
     * 
     */
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
     * The name of the course.
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
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * The family or group of forked courses that the course is part of.
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
     * @see #getCourseFamily()
     */
    public void setCourseFamily(String value) {
        this.courseFamily = value;
    }

    /**
     * The length of the course, in meters.
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
     * @see #getLength()
     */
    public void setLength(Double value) {
        this.length = value;
    }

    /**
     * The climb of the course, in meters, along the expected best route choice.
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
     * @see #getClimb()
     */
    public void setClimb(Double value) {
        this.climb = value;
    }

    /**
     * The number of controls in the course, excluding start and finish.
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
     * @see #getNumberOfControls()
     */
    public void setNumberOfControls(BigInteger value) {
        this.numberOfControls = value;
    }

}

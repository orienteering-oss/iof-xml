
package iofXml.v3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines a course, i.e. a number of controls including start and finish.
 * 
 * <p>Java class for Course complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Course">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.orienteering.org/datastandard/3.0}Id" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="CourseFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Length" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Climb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="CourseControl" type="{http://www.orienteering.org/datastandard/3.0}CourseControl" maxOccurs="unbounded" minOccurs="2"/>
 *         <element name="MapId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="numberOfCompetitors" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       <attribute name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Course", propOrder = {
    "id",
    "name",
    "courseFamily",
    "length",
    "climb",
    "courseControl",
    "mapId",
    "extensions"
})
public class Course {

    @XmlElement(name = "Id")
    protected Id id;
    /**
     * The name of the course.
     * 
     */
    @XmlElement(name = "Name", required = true)
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
     * The controls, including start and finish, that the course is made up of.
     * 
     */
    @XmlElement(name = "CourseControl", required = true)
    protected List<CourseControl> courseControl;
    /**
     * The id of the map used for this course.
     * 
     */
    @XmlElement(name = "MapId")
    protected BigInteger mapId;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;
    /**
     * The number of competitors that this course has been assigned to.
     * 
     */
    @XmlAttribute(name = "numberOfCompetitors")
    protected BigInteger numberOfCompetitors;
    @XmlAttribute(name = "modifyTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTime;

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
     * The controls, including start and finish, that the course is made up of.
     * 
     * Gets the value of the courseControl property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseControl property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCourseControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseControl }
     * </p>
     * 
     * 
     * @return
     *     The value of the courseControl property.
     */
    public List<CourseControl> getCourseControl() {
        if (courseControl == null) {
            courseControl = new ArrayList<>();
        }
        return this.courseControl;
    }

    /**
     * The id of the map used for this course.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMapId() {
        return mapId;
    }

    /**
     * Sets the value of the mapId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getMapId()
     */
    public void setMapId(BigInteger value) {
        this.mapId = value;
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
     * The number of competitors that this course has been assigned to.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCompetitors() {
        return numberOfCompetitors;
    }

    /**
     * Sets the value of the numberOfCompetitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getNumberOfCompetitors()
     */
    public void setNumberOfCompetitors(BigInteger value) {
        this.numberOfCompetitors = value;
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

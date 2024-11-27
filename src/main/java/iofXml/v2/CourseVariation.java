
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element ref="{}CourseVariationId"/>
 *         <element ref="{}Name" minOccurs="0"/>
 *         <element ref="{}CourseLength"/>
 *         <element ref="{}CourseClimb" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element ref="{}StartPointCode"/>
 *           <element ref="{}StartPoint"/>
 *         </choice>
 *         <element ref="{}FinishChute" minOccurs="0"/>
 *         <element ref="{}CourseControl" maxOccurs="unbounded"/>
 *         <choice minOccurs="0">
 *           <element ref="{}FinishPointCode"/>
 *           <element ref="{}FinishPoint"/>
 *         </choice>
 *         <element ref="{}DistanceToFinish" minOccurs="0"/>
 *         <element ref="{}ModifyDate" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="numberOfRunners" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "courseVariationId",
    "name",
    "courseLength",
    "courseClimb",
    "startPointCode",
    "startPoint",
    "finishChute",
    "courseControl",
    "finishPointCode",
    "finishPoint",
    "distanceToFinish",
    "modifyDate"
})
@XmlRootElement(name = "CourseVariation")
public class CourseVariation {

    @XmlElement(name = "CourseVariationId", required = true)
    protected String courseVariationId;
    @XmlElement(name = "Name")
    protected Name name;
    @XmlElement(name = "CourseLength", required = true)
    protected CourseLength courseLength;
    @XmlElement(name = "CourseClimb")
    protected CourseClimb courseClimb;
    @XmlElement(name = "StartPointCode")
    protected String startPointCode;
    @XmlElement(name = "StartPoint")
    protected StartPoint startPoint;
    @XmlElement(name = "FinishChute")
    protected String finishChute;
    @XmlElement(name = "CourseControl", required = true)
    protected List<CourseControl> courseControl;
    @XmlElement(name = "FinishPointCode")
    protected String finishPointCode;
    @XmlElement(name = "FinishPoint")
    protected FinishPoint finishPoint;
    @XmlElement(name = "DistanceToFinish")
    protected DistanceToFinish distanceToFinish;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;
    @XmlAttribute(name = "numberOfRunners")
    @XmlSchemaType(name = "anySimpleType")
    protected String numberOfRunners;

    /**
     * Gets the value of the courseVariationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseVariationId() {
        return courseVariationId;
    }

    /**
     * Sets the value of the courseVariationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseVariationId(String value) {
        this.courseVariationId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the courseLength property.
     * 
     * @return
     *     possible object is
     *     {@link CourseLength }
     *     
     */
    public CourseLength getCourseLength() {
        return courseLength;
    }

    /**
     * Sets the value of the courseLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseLength }
     *     
     */
    public void setCourseLength(CourseLength value) {
        this.courseLength = value;
    }

    /**
     * Gets the value of the courseClimb property.
     * 
     * @return
     *     possible object is
     *     {@link CourseClimb }
     *     
     */
    public CourseClimb getCourseClimb() {
        return courseClimb;
    }

    /**
     * Sets the value of the courseClimb property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseClimb }
     *     
     */
    public void setCourseClimb(CourseClimb value) {
        this.courseClimb = value;
    }

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
     * Gets the value of the startPoint property.
     * 
     * @return
     *     possible object is
     *     {@link StartPoint }
     *     
     */
    public StartPoint getStartPoint() {
        return startPoint;
    }

    /**
     * Sets the value of the startPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartPoint }
     *     
     */
    public void setStartPoint(StartPoint value) {
        this.startPoint = value;
    }

    /**
     * Gets the value of the finishChute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishChute() {
        return finishChute;
    }

    /**
     * Sets the value of the finishChute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishChute(String value) {
        this.finishChute = value;
    }

    /**
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
     * Gets the value of the finishPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinishPointCode() {
        return finishPointCode;
    }

    /**
     * Sets the value of the finishPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinishPointCode(String value) {
        this.finishPointCode = value;
    }

    /**
     * Gets the value of the finishPoint property.
     * 
     * @return
     *     possible object is
     *     {@link FinishPoint }
     *     
     */
    public FinishPoint getFinishPoint() {
        return finishPoint;
    }

    /**
     * Sets the value of the finishPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinishPoint }
     *     
     */
    public void setFinishPoint(FinishPoint value) {
        this.finishPoint = value;
    }

    /**
     * Gets the value of the distanceToFinish property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceToFinish }
     *     
     */
    public DistanceToFinish getDistanceToFinish() {
        return distanceToFinish;
    }

    /**
     * Sets the value of the distanceToFinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceToFinish }
     *     
     */
    public void setDistanceToFinish(DistanceToFinish value) {
        this.distanceToFinish = value;
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

    /**
     * Gets the value of the numberOfRunners property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfRunners() {
        return numberOfRunners;
    }

    /**
     * Sets the value of the numberOfRunners property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfRunners(String value) {
        this.numberOfRunners = value;
    }

}

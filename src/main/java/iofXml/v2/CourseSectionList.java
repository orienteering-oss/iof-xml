
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{}StartPointCode" minOccurs="0"/>
 *         <element ref="{}CourseSection" maxOccurs="unbounded"/>
 *         <element ref="{}FinishPointCode" minOccurs="0"/>
 *         <element ref="{}DistanceToFinish" maxOccurs="unbounded" minOccurs="0"/>
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
    "courseSection",
    "finishPointCode",
    "distanceToFinish"
})
@XmlRootElement(name = "CourseSectionList")
public class CourseSectionList {

    @XmlElement(name = "StartPointCode")
    protected String startPointCode;
    @XmlElement(name = "CourseSection", required = true)
    protected List<CourseSection> courseSection;
    @XmlElement(name = "FinishPointCode")
    protected String finishPointCode;
    @XmlElement(name = "DistanceToFinish")
    protected List<DistanceToFinish> distanceToFinish;

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
     * Gets the value of the courseSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the courseSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseSection }
     * 
     * 
     * @return
     *     The value of the courseSection property.
     */
    public List<CourseSection> getCourseSection() {
        if (courseSection == null) {
            courseSection = new ArrayList<>();
        }
        return this.courseSection;
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
     * Gets the value of the distanceToFinish property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the distanceToFinish property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistanceToFinish().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistanceToFinish }
     * 
     * 
     * @return
     *     The value of the distanceToFinish property.
     */
    public List<DistanceToFinish> getDistanceToFinish() {
        if (distanceToFinish == null) {
            distanceToFinish = new ArrayList<>();
        }
        return this.distanceToFinish;
    }

}

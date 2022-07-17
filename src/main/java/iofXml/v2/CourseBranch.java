
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
 *         <element ref="{}CourseBranchId"/>
 *         <element ref="{}CourseControl" maxOccurs="unbounded" minOccurs="0"/>
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
    "courseBranchId",
    "courseControl"
})
@XmlRootElement(name = "CourseBranch")
public class CourseBranch {

    @XmlElement(name = "CourseBranchId", required = true)
    protected String courseBranchId;
    @XmlElement(name = "CourseControl")
    protected List<CourseControl> courseControl;

    /**
     * Gets the value of the courseBranchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseBranchId() {
        return courseBranchId;
    }

    /**
     * Sets the value of the courseBranchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseBranchId(String value) {
        this.courseBranchId = value;
    }

    /**
     * Gets the value of the courseControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the courseControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseControl }
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

}

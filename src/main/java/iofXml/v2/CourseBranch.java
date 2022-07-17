
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}CourseBranchId"/&gt;
 *         &lt;element ref="{}CourseControl" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseControl property.
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
     */
    public List<CourseControl> getCourseControl() {
        if (courseControl == null) {
            courseControl = new ArrayList<CourseControl>();
        }
        return this.courseControl;
    }

}

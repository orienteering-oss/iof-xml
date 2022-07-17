
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{}CourseBranchId"/&amp;gt;
 *         &amp;lt;element ref="{}CourseControl" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the courseControl property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCourseControl().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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

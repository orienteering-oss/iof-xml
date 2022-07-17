
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
 *         <element ref="{}CourseSectionId"/>
 *         <element ref="{}CourseBranch" maxOccurs="unbounded"/>
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
    "courseSectionId",
    "courseBranch"
})
@XmlRootElement(name = "CourseSection")
public class CourseSection {

    @XmlElement(name = "CourseSectionId", required = true)
    protected String courseSectionId;
    @XmlElement(name = "CourseBranch", required = true)
    protected List<CourseBranch> courseBranch;

    /**
     * Gets the value of the courseSectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseSectionId() {
        return courseSectionId;
    }

    /**
     * Sets the value of the courseSectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseSectionId(String value) {
        this.courseSectionId = value;
    }

    /**
     * Gets the value of the courseBranch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the courseBranch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseBranch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseBranch }
     * 
     * 
     * @return
     *     The value of the courseBranch property.
     */
    public List<CourseBranch> getCourseBranch() {
        if (courseBranch == null) {
            courseBranch = new ArrayList<>();
        }
        return this.courseBranch;
    }

}

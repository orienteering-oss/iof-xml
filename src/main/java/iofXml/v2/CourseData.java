
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element ref="{}IOFVersion" minOccurs="0"/>
 *         <element ref="{}Map" minOccurs="0"/>
 *         <element ref="{}StartPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}Control" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}FinishPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}Course" maxOccurs="unbounded" minOccurs="0"/>
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
    "iofVersion",
    "map",
    "startPoint",
    "control",
    "finishPoint",
    "course"
})
@XmlRootElement(name = "CourseData")
public class CourseData {

    @XmlElement(name = "IOFVersion")
    protected IOFVersion iofVersion;
    @XmlElement(name = "Map")
    protected Map map;
    @XmlElement(name = "StartPoint")
    protected List<StartPoint> startPoint;
    @XmlElement(name = "Control")
    protected List<Control> control;
    @XmlElement(name = "FinishPoint")
    protected List<FinishPoint> finishPoint;
    @XmlElement(name = "Course")
    protected List<Course> course;

    /**
     * Gets the value of the iofVersion property.
     * 
     * @return
     *     possible object is
     *     {@link IOFVersion }
     *     
     */
    public IOFVersion getIOFVersion() {
        return iofVersion;
    }

    /**
     * Sets the value of the iofVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link IOFVersion }
     *     
     */
    public void setIOFVersion(IOFVersion value) {
        this.iofVersion = value;
    }

    /**
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link Map }
     *     
     */
    public Map getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link Map }
     *     
     */
    public void setMap(Map value) {
        this.map = value;
    }

    /**
     * Gets the value of the startPoint property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startPoint property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStartPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StartPoint }
     * </p>
     * 
     * 
     * @return
     *     The value of the startPoint property.
     */
    public List<StartPoint> getStartPoint() {
        if (startPoint == null) {
            startPoint = new ArrayList<>();
        }
        return this.startPoint;
    }

    /**
     * Gets the value of the control property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the control property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Control }
     * </p>
     * 
     * 
     * @return
     *     The value of the control property.
     */
    public List<Control> getControl() {
        if (control == null) {
            control = new ArrayList<>();
        }
        return this.control;
    }

    /**
     * Gets the value of the finishPoint property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finishPoint property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFinishPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinishPoint }
     * </p>
     * 
     * 
     * @return
     *     The value of the finishPoint property.
     */
    public List<FinishPoint> getFinishPoint() {
        if (finishPoint == null) {
            finishPoint = new ArrayList<>();
        }
        return this.finishPoint;
    }

    /**
     * Gets the value of the course property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the course property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCourse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Course }
     * </p>
     * 
     * 
     * @return
     *     The value of the course property.
     */
    public List<Course> getCourse() {
        if (course == null) {
            course = new ArrayList<>();
        }
        return this.course;
    }

}

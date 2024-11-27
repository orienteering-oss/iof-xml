
package iofXml.v3;

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
 *     <extension base="{http://www.orienteering.org/datastandard/3.0}BaseMessageElement">
 *       <sequence>
 *         <element name="Event" type="{http://www.orienteering.org/datastandard/3.0}Event"/>
 *         <element name="RaceCourseData" type="{http://www.orienteering.org/datastandard/3.0}RaceCourseData" maxOccurs="unbounded"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "event",
    "raceCourseData",
    "extensions"
})
@XmlRootElement(name = "CourseData")
public class CourseData
    extends BaseMessageElement
{

    /**
     * The event that the course data belongs to.
     * 
     */
    @XmlElement(name = "Event", required = true)
    protected Event event;
    /**
     * The course data for each race; one element per race in the event.
     * 
     */
    @XmlElement(name = "RaceCourseData", required = true)
    protected List<RaceCourseData> raceCourseData;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * The event that the course data belongs to.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     * @see #getEvent()
     */
    public void setEvent(Event value) {
        this.event = value;
    }

    /**
     * The course data for each race; one element per race in the event.
     * 
     * Gets the value of the raceCourseData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the raceCourseData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRaceCourseData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RaceCourseData }
     * </p>
     * 
     * 
     * @return
     *     The value of the raceCourseData property.
     */
    public List<RaceCourseData> getRaceCourseData() {
        if (raceCourseData == null) {
            raceCourseData = new ArrayList<>();
        }
        return this.raceCourseData;
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

}

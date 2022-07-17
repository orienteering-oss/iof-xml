
package iofXml.v3;

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
 *     &amp;lt;extension base="{http://www.orienteering.org/datastandard/3.0}BaseMessageElement"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Event" type="{http://www.orienteering.org/datastandard/3.0}Event"/&amp;gt;
 *         &amp;lt;element name="RaceCourseData" type="{http://www.orienteering.org/datastandard/3.0}RaceCourseData" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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

    @XmlElement(name = "Event", required = true)
    protected Event event;
    @XmlElement(name = "RaceCourseData", required = true)
    protected List<RaceCourseData> raceCourseData;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * Gets the value of the event property.
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
     */
    public void setEvent(Event value) {
        this.event = value;
    }

    /**
     * Gets the value of the raceCourseData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the raceCourseData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRaceCourseData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link RaceCourseData }
     * 
     * 
     */
    public List<RaceCourseData> getRaceCourseData() {
        if (raceCourseData == null) {
            raceCourseData = new ArrayList<RaceCourseData>();
        }
        return this.raceCourseData;
    }

    /**
     * Gets the value of the extensions property.
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
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

}

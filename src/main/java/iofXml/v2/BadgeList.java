
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
 *         <element ref="{}BadgeValue" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{}BadgeLimit" maxOccurs="unbounded" minOccurs="0"/>
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
    "badgeValue",
    "badgeLimit"
})
@XmlRootElement(name = "BadgeList")
public class BadgeList {

    @XmlElement(name = "IOFVersion")
    protected IOFVersion iofVersion;
    @XmlElement(name = "BadgeValue")
    protected List<BadgeValue> badgeValue;
    @XmlElement(name = "BadgeLimit")
    protected List<BadgeLimit> badgeLimit;

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
     * Gets the value of the badgeValue property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the badgeValue property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBadgeValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BadgeValue }
     * </p>
     * 
     * 
     * @return
     *     The value of the badgeValue property.
     */
    public List<BadgeValue> getBadgeValue() {
        if (badgeValue == null) {
            badgeValue = new ArrayList<>();
        }
        return this.badgeValue;
    }

    /**
     * Gets the value of the badgeLimit property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the badgeLimit property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBadgeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BadgeLimit }
     * </p>
     * 
     * 
     * @return
     *     The value of the badgeLimit property.
     */
    public List<BadgeLimit> getBadgeLimit() {
        if (badgeLimit == null) {
            badgeLimit = new ArrayList<>();
        }
        return this.badgeLimit;
    }

}


package iofXml.v2;

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
 *       <choice>
 *         <element ref="{}ClassId"/>
 *         <element ref="{}ClassShortName"/>
 *         <element ref="{}EventClass"/>
 *       </choice>
 *       <attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "classId",
    "classShortName",
    "eventClass"
})
@XmlRootElement(name = "EntryClass")
public class EntryClass {

    @XmlElement(name = "ClassId")
    protected ClassId classId;
    @XmlElement(name = "ClassShortName")
    protected ClassShortName classShortName;
    @XmlElement(name = "EventClass")
    protected EventClass eventClass;
    @XmlAttribute(name = "sequence")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequence;

    /**
     * Gets the value of the classId property.
     * 
     * @return
     *     possible object is
     *     {@link ClassId }
     *     
     */
    public ClassId getClassId() {
        return classId;
    }

    /**
     * Sets the value of the classId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassId }
     *     
     */
    public void setClassId(ClassId value) {
        this.classId = value;
    }

    /**
     * Gets the value of the classShortName property.
     * 
     * @return
     *     possible object is
     *     {@link ClassShortName }
     *     
     */
    public ClassShortName getClassShortName() {
        return classShortName;
    }

    /**
     * Sets the value of the classShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassShortName }
     *     
     */
    public void setClassShortName(ClassShortName value) {
        this.classShortName = value;
    }

    /**
     * Gets the value of the eventClass property.
     * 
     * @return
     *     possible object is
     *     {@link EventClass }
     *     
     */
    public EventClass getEventClass() {
        return eventClass;
    }

    /**
     * Sets the value of the eventClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventClass }
     *     
     */
    public void setEventClass(EventClass value) {
        this.eventClass = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

}

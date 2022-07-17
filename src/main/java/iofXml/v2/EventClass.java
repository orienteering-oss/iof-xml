
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;choice&gt;
 *           &lt;element ref="{}ClassId"/&gt;
 *           &lt;element ref="{}Class"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;choice&gt;
 *             &lt;sequence maxOccurs="unbounded"&gt;
 *               &lt;element ref="{}EventRaceId"/&gt;
 *               &lt;element ref="{}ClassRaceInfo"/&gt;
 *               &lt;element ref="{}PunchingUnitType"/&gt;
 *             &lt;/sequence&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{}TransferedToClass" minOccurs="0"/&gt;
 *           &lt;element ref="{}DividedIntoClass"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}ModifyDate" minOccurs="0"/&gt;
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
    "classId",
    "clazz",
    "eventRaceIdAndClassRaceInfoAndPunchingUnitType",
    "transferedToClass",
    "dividedIntoClass",
    "modifyDate"
})
@XmlRootElement(name = "EventClass")
public class EventClass {

    @XmlElement(name = "ClassId")
    protected ClassId classId;
    @XmlElement(name = "Class")
    protected Class clazz;
    @XmlElements({
        @XmlElement(name = "EventRaceId", type = String.class),
        @XmlElement(name = "ClassRaceInfo", type = ClassRaceInfo.class),
        @XmlElement(name = "PunchingUnitType", type = PunchingUnitType.class)
    })
    protected List<Object> eventRaceIdAndClassRaceInfoAndPunchingUnitType;
    @XmlElement(name = "TransferedToClass")
    protected TransferedToClass transferedToClass;
    @XmlElement(name = "DividedIntoClass")
    protected DividedIntoClass dividedIntoClass;
    @XmlElement(name = "ModifyDate")
    protected ModifyDate modifyDate;

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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link Class }
     *     
     */
    public Class getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Class }
     *     
     */
    public void setClazz(Class value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the eventRaceIdAndClassRaceInfoAndPunchingUnitType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventRaceIdAndClassRaceInfoAndPunchingUnitType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventRaceIdAndClassRaceInfoAndPunchingUnitType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassRaceInfo }
     * {@link PunchingUnitType }
     * {@link String }
     * 
     * 
     */
    public List<Object> getEventRaceIdAndClassRaceInfoAndPunchingUnitType() {
        if (eventRaceIdAndClassRaceInfoAndPunchingUnitType == null) {
            eventRaceIdAndClassRaceInfoAndPunchingUnitType = new ArrayList<Object>();
        }
        return this.eventRaceIdAndClassRaceInfoAndPunchingUnitType;
    }

    /**
     * Gets the value of the transferedToClass property.
     * 
     * @return
     *     possible object is
     *     {@link TransferedToClass }
     *     
     */
    public TransferedToClass getTransferedToClass() {
        return transferedToClass;
    }

    /**
     * Sets the value of the transferedToClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferedToClass }
     *     
     */
    public void setTransferedToClass(TransferedToClass value) {
        this.transferedToClass = value;
    }

    /**
     * Gets the value of the dividedIntoClass property.
     * 
     * @return
     *     possible object is
     *     {@link DividedIntoClass }
     *     
     */
    public DividedIntoClass getDividedIntoClass() {
        return dividedIntoClass;
    }

    /**
     * Sets the value of the dividedIntoClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividedIntoClass }
     *     
     */
    public void setDividedIntoClass(DividedIntoClass value) {
        this.dividedIntoClass = value;
    }

    /**
     * Gets the value of the modifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyDate }
     *     
     */
    public ModifyDate getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the value of the modifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyDate }
     *     
     */
    public void setModifyDate(ModifyDate value) {
        this.modifyDate = value;
    }

}

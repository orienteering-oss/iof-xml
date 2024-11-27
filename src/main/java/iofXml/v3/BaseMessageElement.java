
package iofXml.v3;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The base message element that all message elements extend.
 * 
 * <p>Java class for BaseMessageElement complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseMessageElement">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="iofVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="3.0" />
 *       <attribute name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       <attribute name="creator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMessageElement")
@XmlSeeAlso({
    ControlCardList.class,
    ServiceRequestList.class,
    ResultList.class,
    StartList.class,
    CourseData.class,
    EntryList.class,
    ClassList.class,
    EventList.class,
    OrganisationList.class,
    CompetitorList.class
})
public abstract class BaseMessageElement {

    /**
     * The version of the IOF Interface Standard that the file conforms to.
     * 
     */
    @XmlAttribute(name = "iofVersion", required = true)
    protected String iofVersion;
    /**
     * The time when the file was created.
     * 
     */
    @XmlAttribute(name = "createTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    /**
     * The name of the software that created the file.
     * 
     */
    @XmlAttribute(name = "creator")
    protected String creator;

    /**
     * The version of the IOF Interface Standard that the file conforms to.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIofVersion() {
        if (iofVersion == null) {
            return "3.0";
        } else {
            return iofVersion;
        }
    }

    /**
     * Sets the value of the iofVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIofVersion()
     */
    public void setIofVersion(String value) {
        this.iofVersion = value;
    }

    /**
     * The time when the file was created.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreateTime()
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * The name of the software that created the file.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCreator()
     */
    public void setCreator(String value) {
        this.creator = value;
    }

}

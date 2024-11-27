
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
 *         <element name="TeamEntry" type="{http://www.orienteering.org/datastandard/3.0}TeamEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PersonEntry" type="{http://www.orienteering.org/datastandard/3.0}PersonEntry" maxOccurs="unbounded" minOccurs="0"/>
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
    "teamEntry",
    "personEntry",
    "extensions"
})
@XmlRootElement(name = "EntryList")
public class EntryList
    extends BaseMessageElement
{

    /**
     * The event that the entry list belongs to.
     * 
     */
    @XmlElement(name = "Event", required = true)
    protected Event event;
    /**
     * The teams registered for the event.
     * 
     */
    @XmlElement(name = "TeamEntry")
    protected List<TeamEntry> teamEntry;
    /**
     * The individual competitors registered for the event.
     * 
     */
    @XmlElement(name = "PersonEntry")
    protected List<PersonEntry> personEntry;
    /**
     * Container element for custom elements from other schemas.
     * 
     */
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * The event that the entry list belongs to.
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
     * The teams registered for the event.
     * 
     * Gets the value of the teamEntry property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamEntry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTeamEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamEntry }
     * </p>
     * 
     * 
     * @return
     *     The value of the teamEntry property.
     */
    public List<TeamEntry> getTeamEntry() {
        if (teamEntry == null) {
            teamEntry = new ArrayList<>();
        }
        return this.teamEntry;
    }

    /**
     * The individual competitors registered for the event.
     * 
     * Gets the value of the personEntry property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personEntry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPersonEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonEntry }
     * </p>
     * 
     * 
     * @return
     *     The value of the personEntry property.
     */
    public List<PersonEntry> getPersonEntry() {
        if (personEntry == null) {
            personEntry = new ArrayList<>();
        }
        return this.personEntry;
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

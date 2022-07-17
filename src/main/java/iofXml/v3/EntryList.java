
package iofXml.v3;

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

    @XmlElement(name = "Event", required = true)
    protected Event event;
    @XmlElement(name = "TeamEntry")
    protected List<TeamEntry> teamEntry;
    @XmlElement(name = "PersonEntry")
    protected List<PersonEntry> personEntry;
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
     * Gets the value of the teamEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the teamEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamEntry }
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
     * Gets the value of the personEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the personEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonEntry }
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

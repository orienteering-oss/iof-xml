
package iofXml.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EventForm.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="EventForm"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&amp;gt;
 *     &amp;lt;enumeration value="Individual"/&amp;gt;
 *     &amp;lt;enumeration value="Team"/&amp;gt;
 *     &amp;lt;enumeration value="Relay"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "EventForm")
@XmlEnum
public enum EventForm {

    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("Team")
    TEAM("Team"),
    @XmlEnumValue("Relay")
    RELAY("Relay");
    private final String value;

    EventForm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventForm fromValue(String v) {
        for (EventForm c: EventForm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

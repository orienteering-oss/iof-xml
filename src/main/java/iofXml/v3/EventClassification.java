
package iofXml.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventClassification.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EventClassification"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="International"/&gt;
 *     &lt;enumeration value="National"/&gt;
 *     &lt;enumeration value="Regional"/&gt;
 *     &lt;enumeration value="Local"/&gt;
 *     &lt;enumeration value="Club"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventClassification")
@XmlEnum
public enum EventClassification {

    @XmlEnumValue("International")
    INTERNATIONAL("International"),
    @XmlEnumValue("National")
    NATIONAL("National"),
    @XmlEnumValue("Regional")
    REGIONAL("Regional"),
    @XmlEnumValue("Local")
    LOCAL("Local"),
    @XmlEnumValue("Club")
    CLUB("Club");
    private final String value;

    EventClassification(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventClassification fromValue(String v) {
        for (EventClassification c: EventClassification.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

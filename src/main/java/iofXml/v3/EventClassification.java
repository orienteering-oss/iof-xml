
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventClassification.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="EventClassification">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     <enumeration value="International"/>
 *     <enumeration value="National"/>
 *     <enumeration value="Regional"/>
 *     <enumeration value="Local"/>
 *     <enumeration value="Club"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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

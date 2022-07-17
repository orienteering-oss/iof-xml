
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RaceDiscipline.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RaceDiscipline">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     <enumeration value="Sprint"/>
 *     <enumeration value="Middle"/>
 *     <enumeration value="Long"/>
 *     <enumeration value="Ultralong"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RaceDiscipline")
@XmlEnum
public enum RaceDiscipline {

    @XmlEnumValue("Sprint")
    SPRINT("Sprint"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle"),
    @XmlEnumValue("Long")
    LONG("Long"),
    @XmlEnumValue("Ultralong")
    ULTRALONG("Ultralong"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RaceDiscipline(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RaceDiscipline fromValue(String v) {
        for (RaceDiscipline c: RaceDiscipline.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

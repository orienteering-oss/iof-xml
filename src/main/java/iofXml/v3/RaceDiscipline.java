
package iofXml.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RaceDiscipline.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RaceDiscipline"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Sprint"/&gt;
 *     &lt;enumeration value="Middle"/&gt;
 *     &lt;enumeration value="Long"/&gt;
 *     &lt;enumeration value="Ultralong"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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

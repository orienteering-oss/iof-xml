
package iofXml.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ControlType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Control"/&gt;
 *     &lt;enumeration value="Start"/&gt;
 *     &lt;enumeration value="Finish"/&gt;
 *     &lt;enumeration value="CrossingPoint"/&gt;
 *     &lt;enumeration value="EndOfMarkedRoute"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ControlType")
@XmlEnum
public enum ControlType {

    @XmlEnumValue("Control")
    CONTROL("Control"),
    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("Finish")
    FINISH("Finish"),
    @XmlEnumValue("CrossingPoint")
    CROSSING_POINT("CrossingPoint"),
    @XmlEnumValue("EndOfMarkedRoute")
    END_OF_MARKED_ROUTE("EndOfMarkedRoute");
    private final String value;

    ControlType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ControlType fromValue(String v) {
        for (ControlType c: ControlType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

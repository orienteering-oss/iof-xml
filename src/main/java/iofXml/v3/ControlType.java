
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ControlType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     <enumeration value="Control"/>
 *     <enumeration value="Start"/>
 *     <enumeration value="Finish"/>
 *     <enumeration value="CrossingPoint"/>
 *     <enumeration value="EndOfMarkedRoute"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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

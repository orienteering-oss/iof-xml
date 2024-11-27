
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The status of the class.
 * 
 * <p>Java class for EventClassStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EventClassStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     <enumeration value="Normal"/>
 *     <enumeration value="Divided"/>
 *     <enumeration value="Joined"/>
 *     <enumeration value="Invalidated"/>
 *     <enumeration value="InvalidatedNoFee"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EventClassStatus")
@XmlEnum
public enum EventClassStatus {


    /**
     * The default status.
     * 
     */
    @XmlEnumValue("Normal")
    NORMAL("Normal"),

    /**
     * The class has been divided in two or more classes due to a large number of entries.
     * 
     */
    @XmlEnumValue("Divided")
    DIVIDED("Divided"),

    /**
     * The class has been joined with another class due to a small number of entries.
     * 
     */
    @XmlEnumValue("Joined")
    JOINED("Joined"),

    /**
     * The results are considered invalid due to technical issues such as misplaced controls. Entry fees are not refunded.
     * 
     */
    @XmlEnumValue("Invalidated")
    INVALIDATED("Invalidated"),

    /**
     * The results are considered invalid due to technical issues such as misplaced controls. Entry fees are refunded.
     * 
     */
    @XmlEnumValue("InvalidatedNoFee")
    INVALIDATED_NO_FEE("InvalidatedNoFee");
    private final String value;

    EventClassStatus(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static EventClassStatus fromValue(String v) {
        for (EventClassStatus c: EventClassStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package iofXml.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RaceClassStatus.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="RaceClassStatus"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&amp;gt;
 *     &amp;lt;enumeration value="StartTimesNotAllocated"/&amp;gt;
 *     &amp;lt;enumeration value="StartTimesAllocated"/&amp;gt;
 *     &amp;lt;enumeration value="NotUsed"/&amp;gt;
 *     &amp;lt;enumeration value="Completed"/&amp;gt;
 *     &amp;lt;enumeration value="Invalidated"/&amp;gt;
 *     &amp;lt;enumeration value="InvalidatedNoFee"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "RaceClassStatus")
@XmlEnum
public enum RaceClassStatus {


    /**
     * 
     *             The start list draw has not been made for this class in this race.
     *           
     * 
     */
    @XmlEnumValue("StartTimesNotAllocated")
    START_TIMES_NOT_ALLOCATED("StartTimesNotAllocated"),

    /**
     * 
     *             The start list draw has been made for this class in this race.
     *           
     * 
     */
    @XmlEnumValue("StartTimesAllocated")
    START_TIMES_ALLOCATED("StartTimesAllocated"),

    /**
     * 
     *             The class is not organised in this race, e.g. for classes that are organised in only some of the races in a multi-race event.
     *           
     * 
     */
    @XmlEnumValue("NotUsed")
    NOT_USED("NotUsed"),

    /**
     * 
     *             The result list is complete for this class in this race.
     *           
     * 
     */
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),

    /**
     * 
     *             The results are considered invalid due to technical issues such as misplaced controls. Entry fees are not refunded.
     *           
     * 
     */
    @XmlEnumValue("Invalidated")
    INVALIDATED("Invalidated"),

    /**
     * 
     *             The results are considered invalid due to technical issues such as misplaced controls. Entry fees are refunded.
     *           
     * 
     */
    @XmlEnumValue("InvalidatedNoFee")
    INVALIDATED_NO_FEE("InvalidatedNoFee");
    private final String value;

    RaceClassStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RaceClassStatus fromValue(String v) {
        for (RaceClassStatus c: RaceClassStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

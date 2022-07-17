
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RaceClassStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RaceClassStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     <enumeration value="StartTimesNotAllocated"/>
 *     <enumeration value="StartTimesAllocated"/>
 *     <enumeration value="NotUsed"/>
 *     <enumeration value="Completed"/>
 *     <enumeration value="Invalidated"/>
 *     <enumeration value="InvalidatedNoFee"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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

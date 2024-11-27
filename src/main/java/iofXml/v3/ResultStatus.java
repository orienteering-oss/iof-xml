
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The result status of the person or team at the time of the result generation.
 * 
 * <p>Java class for ResultStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ResultStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     <enumeration value="OK"/>
 *     <enumeration value="Finished"/>
 *     <enumeration value="MissingPunch"/>
 *     <enumeration value="Disqualified"/>
 *     <enumeration value="DidNotFinish"/>
 *     <enumeration value="Active"/>
 *     <enumeration value="Inactive"/>
 *     <enumeration value="OverTime"/>
 *     <enumeration value="SportingWithdrawal"/>
 *     <enumeration value="NotCompeting"/>
 *     <enumeration value="Moved"/>
 *     <enumeration value="MovedUp"/>
 *     <enumeration value="DidNotStart"/>
 *     <enumeration value="DidNotEnter"/>
 *     <enumeration value="Cancelled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResultStatus")
@XmlEnum
public enum ResultStatus {


    /**
     * Finished and validated.
     * 
     */
    OK("OK"),

    /**
     * Finished but not yet validated.
     * 
     */
    @XmlEnumValue("Finished")
    FINISHED("Finished"),

    /**
     * Missing punch.
     * 
     */
    @XmlEnumValue("MissingPunch")
    MISSING_PUNCH("MissingPunch"),

    /**
     * Disqualified (for some other reason than a missing punch).
     * 
     */
    @XmlEnumValue("Disqualified")
    DISQUALIFIED("Disqualified"),

    /**
     * Did not finish (i.e. conciously cancelling the race after having started, in contrast to MissingPunch).
     * 
     */
    @XmlEnumValue("DidNotFinish")
    DID_NOT_FINISH("DidNotFinish"),

    /**
     * Currently on course.
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * Has not yet started.
     * 
     */
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),

    /**
     * Overtime, i.e. did not finish within the maximum time set by the organiser.
     * 
     */
    @XmlEnumValue("OverTime")
    OVER_TIME("OverTime"),

    /**
     * Sporting withdrawal (e.g. helping an injured competitor).
     * 
     */
    @XmlEnumValue("SportingWithdrawal")
    SPORTING_WITHDRAWAL("SportingWithdrawal"),

    /**
     * Not competing (i.e. running outside the competition).
     * 
     */
    @XmlEnumValue("NotCompeting")
    NOT_COMPETING("NotCompeting"),

    /**
     * Moved to another class.
     * 
     */
    @XmlEnumValue("Moved")
    MOVED("Moved"),

    /**
     * Moved to a "better" class, in case of entry restrictions.
     * 
     */
    @XmlEnumValue("MovedUp")
    MOVED_UP("MovedUp"),

    /**
     * Did not start (in this race).
     * 
     */
    @XmlEnumValue("DidNotStart")
    DID_NOT_START("DidNotStart"),

    /**
     * Did not enter (in this race).
     * 
     */
    @XmlEnumValue("DidNotEnter")
    DID_NOT_ENTER("DidNotEnter"),

    /**
     * The competitor has cancelled his/hers entry.
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    ResultStatus(String v) {
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
    public static ResultStatus fromValue(String v) {
        for (ResultStatus c: ResultStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

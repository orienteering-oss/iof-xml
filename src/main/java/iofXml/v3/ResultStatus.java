
package iofXml.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ResultStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Finished"/&gt;
 *     &lt;enumeration value="MissingPunch"/&gt;
 *     &lt;enumeration value="Disqualified"/&gt;
 *     &lt;enumeration value="DidNotFinish"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Inactive"/&gt;
 *     &lt;enumeration value="OverTime"/&gt;
 *     &lt;enumeration value="SportingWithdrawal"/&gt;
 *     &lt;enumeration value="NotCompeting"/&gt;
 *     &lt;enumeration value="Moved"/&gt;
 *     &lt;enumeration value="MovedUp"/&gt;
 *     &lt;enumeration value="DidNotStart"/&gt;
 *     &lt;enumeration value="DidNotEnter"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResultStatus")
@XmlEnum
public enum ResultStatus {


    /**
     * 
     *             Finished and validated.
     *           
     * 
     */
    OK("OK"),

    /**
     * 
     *             Finished but not yet validated.
     *           
     * 
     */
    @XmlEnumValue("Finished")
    FINISHED("Finished"),

    /**
     * 
     *             Missing punch.
     *           
     * 
     */
    @XmlEnumValue("MissingPunch")
    MISSING_PUNCH("MissingPunch"),

    /**
     * 
     *             Disqualified (for some other reason than a missing punch).
     *           
     * 
     */
    @XmlEnumValue("Disqualified")
    DISQUALIFIED("Disqualified"),

    /**
     * 
     *             Did not finish (i.e. conciously cancelling the race after having started, in contrast to MissingPunch).
     *           
     * 
     */
    @XmlEnumValue("DidNotFinish")
    DID_NOT_FINISH("DidNotFinish"),

    /**
     * 
     *             Currently on course.
     *           
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     *             Has not yet started.
     *           
     * 
     */
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),

    /**
     * 
     *             Overtime, i.e. did not finish within the maximum time set by the organiser.
     *           
     * 
     */
    @XmlEnumValue("OverTime")
    OVER_TIME("OverTime"),

    /**
     * 
     *             Sporting withdrawal (e.g. helping an injured competitor).
     *           
     * 
     */
    @XmlEnumValue("SportingWithdrawal")
    SPORTING_WITHDRAWAL("SportingWithdrawal"),

    /**
     * 
     *             Not competing (i.e. running outside the competition).
     *           
     * 
     */
    @XmlEnumValue("NotCompeting")
    NOT_COMPETING("NotCompeting"),

    /**
     * 
     *             Moved to another class.
     *           
     * 
     */
    @XmlEnumValue("Moved")
    MOVED("Moved"),

    /**
     * 
     *             Moved to a "better" class, in case of entry restrictions.
     *           
     * 
     */
    @XmlEnumValue("MovedUp")
    MOVED_UP("MovedUp"),

    /**
     * 
     *             Did not start (in this race).
     *           
     * 
     */
    @XmlEnumValue("DidNotStart")
    DID_NOT_START("DidNotStart"),

    /**
     * 
     *             Did not enter (in this race).
     *           
     * 
     */
    @XmlEnumValue("DidNotEnter")
    DID_NOT_ENTER("DidNotEnter"),

    /**
     * 
     *             The competitor has cancelled his/hers entry.
     *           
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    ResultStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultStatus fromValue(String v) {
        for (ResultStatus c: ResultStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package iofXml.v3;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines a course for a certain race, excluding controls.
 * 
 * <p>Java class for SimpleRaceCourse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SimpleRaceCourse">
 *   <complexContent>
 *     <extension base="{http://www.orienteering.org/datastandard/3.0}SimpleCourse">
 *       <attribute name="raceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleRaceCourse")
public class SimpleRaceCourse
    extends SimpleCourse
{

    /**
     * The ordinal number of the race that the information belongs to for a multi-race event, starting at 1.
     * 
     */
    @XmlAttribute(name = "raceNumber")
    protected BigInteger raceNumber;

    /**
     * The ordinal number of the race that the information belongs to for a multi-race event, starting at 1.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRaceNumber() {
        return raceNumber;
    }

    /**
     * Sets the value of the raceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getRaceNumber()
     */
    public void setRaceNumber(BigInteger value) {
        this.raceNumber = value;
    }

}

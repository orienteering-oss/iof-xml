
package iofXml.v3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Defines the the selected answer, the correct answer and the time used on a Trail-O control.
 *       
 * 
 * <p>Java class for ControlAnswer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ControlAnswer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="CorrectAnswer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Time" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="Extensions" type="{http://www.orienteering.org/datastandard/3.0}Extensions" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlAnswer", propOrder = {
    "answer",
    "correctAnswer",
    "time",
    "extensions"
})
public class ControlAnswer {

    @XmlElement(name = "Answer", required = true)
    protected String answer;
    @XmlElement(name = "CorrectAnswer", required = true)
    protected String correctAnswer;
    @XmlElement(name = "Time")
    protected Double time;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer(String value) {
        this.answer = value;
    }

    /**
     * Gets the value of the correctAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    /**
     * Sets the value of the correctAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrectAnswer(String value) {
        this.correctAnswer = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTime(Double value) {
        this.time = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

}


package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element ref="{}Symbol" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}Text"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="column" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="A"/&gt;
 *             &lt;enumeration value="B"/&gt;
 *             &lt;enumeration value="C"/&gt;
 *             &lt;enumeration value="D"/&gt;
 *             &lt;enumeration value="E"/&gt;
 *             &lt;enumeration value="F"/&gt;
 *             &lt;enumeration value="G"/&gt;
 *             &lt;enumeration value="H"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="hasDiagonal" default="N"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="Y"/&gt;
 *             &lt;enumeration value="N"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "symbol",
    "text"
})
@XmlRootElement(name = "Box")
public class Box {

    @XmlElement(name = "Symbol")
    protected List<Symbol> symbol;
    @XmlElement(name = "Text")
    protected Text text;
    @XmlAttribute(name = "column", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String column;
    @XmlAttribute(name = "hasDiagonal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hasDiagonal;

    /**
     * Gets the value of the symbol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symbol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymbol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Symbol }
     * 
     * 
     */
    public List<Symbol> getSymbol() {
        if (symbol == null) {
            symbol = new ArrayList<Symbol>();
        }
        return this.symbol;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link Text }
     *     
     */
    public Text getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link Text }
     *     
     */
    public void setText(Text value) {
        this.text = value;
    }

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumn(String value) {
        this.column = value;
    }

    /**
     * Gets the value of the hasDiagonal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasDiagonal() {
        if (hasDiagonal == null) {
            return "N";
        } else {
            return hasDiagonal;
        }
    }

    /**
     * Sets the value of the hasDiagonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasDiagonal(String value) {
        this.hasDiagonal = value;
    }

}

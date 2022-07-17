
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
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice minOccurs="0"&amp;gt;
 *         &amp;lt;element ref="{}Symbol" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element ref="{}Text"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attribute name="column" use="required"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&amp;gt;
 *             &amp;lt;enumeration value="A"/&amp;gt;
 *             &amp;lt;enumeration value="B"/&amp;gt;
 *             &amp;lt;enumeration value="C"/&amp;gt;
 *             &amp;lt;enumeration value="D"/&amp;gt;
 *             &amp;lt;enumeration value="E"/&amp;gt;
 *             &amp;lt;enumeration value="F"/&amp;gt;
 *             &amp;lt;enumeration value="G"/&amp;gt;
 *             &amp;lt;enumeration value="H"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *       &amp;lt;attribute name="hasDiagonal" default="N"&amp;gt;
 *         &amp;lt;simpleType&amp;gt;
 *           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&amp;gt;
 *             &amp;lt;enumeration value="Y"/&amp;gt;
 *             &amp;lt;enumeration value="N"/&amp;gt;
 *           &amp;lt;/restriction&amp;gt;
 *         &amp;lt;/simpleType&amp;gt;
 *       &amp;lt;/attribute&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the symbol property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSymbol().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
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

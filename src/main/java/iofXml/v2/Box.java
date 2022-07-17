
package iofXml.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice minOccurs="0">
 *         <element ref="{}Symbol" maxOccurs="unbounded"/>
 *         <element ref="{}Text"/>
 *       </choice>
 *       <attribute name="column" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             <enumeration value="A"/>
 *             <enumeration value="B"/>
 *             <enumeration value="C"/>
 *             <enumeration value="D"/>
 *             <enumeration value="E"/>
 *             <enumeration value="F"/>
 *             <enumeration value="G"/>
 *             <enumeration value="H"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="hasDiagonal" default="N">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             <enumeration value="Y"/>
 *             <enumeration value="N"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the symbol property.
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
     * @return
     *     The value of the symbol property.
     */
    public List<Symbol> getSymbol() {
        if (symbol == null) {
            symbol = new ArrayList<>();
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

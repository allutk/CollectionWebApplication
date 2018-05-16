
package ee.ttu.idu0075._155409iapb.ws.collection;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="collectionNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="collectorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="collectorCountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "collectionNo",
    "collectorName",
    "collectorCountry"
})
@XmlRootElement(name = "addCollectionRequest")
public class AddCollectionRequest {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String collectionNo;
    @XmlElement(required = true)
    protected String collectorName;
    @XmlElement(required = true)
    protected String collectorCountry;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the collectionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionNo() {
        return collectionNo;
    }

    /**
     * Sets the value of the collectionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionNo(String value) {
        this.collectionNo = value;
    }

    /**
     * Gets the value of the collectorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectorName() {
        return collectorName;
    }

    /**
     * Sets the value of the collectorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectorName(String value) {
        this.collectorName = value;
    }

    /**
     * Gets the value of the collectorCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectorCountry() {
        return collectorCountry;
    }

    /**
     * Sets the value of the collectorCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectorCountry(String value) {
        this.collectorCountry = value;
    }

}

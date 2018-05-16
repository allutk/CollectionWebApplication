
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="collectorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collectorCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasRelatedCards" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="jah|ei"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "collectorName",
    "collectorCountry",
    "hasRelatedCards"
})
@XmlRootElement(name = "getCollectionListRequest")
public class GetCollectionListRequest {

    @XmlElement(required = true)
    protected String token;
    protected String collectorName;
    protected String collectorCountry;
    protected String hasRelatedCards;

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

    /**
     * Gets the value of the hasRelatedCards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasRelatedCards() {
        return hasRelatedCards;
    }

    /**
     * Sets the value of the hasRelatedCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasRelatedCards(String value) {
        this.hasRelatedCards = value;
    }

}


package ee.ttu.idu0075._155409iapb.ws.collection;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for collectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="collectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="collectionNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="collectorName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="collectorCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="collectionCardList" type="{http://www.ttu.ee/idu0075/155409IAPB/ws/collection}collectionCardListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collectionType", propOrder = {
    "id",
    "collectionNo",
    "collectorName",
    "collectorCountry",
    "amount",
    "collectionCardList"
})
public class CollectionType {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected String collectionNo;
    @XmlElement(required = true)
    protected String collectorName;
    @XmlElement(required = true)
    protected String collectorCountry;
    protected double amount;
    @XmlElement(required = true)
    protected CollectionCardListType collectionCardList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
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

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the collectionCardList property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionCardListType }
     *     
     */
    public CollectionCardListType getCollectionCardList() {
        return collectionCardList;
    }

    /**
     * Sets the value of the collectionCardList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionCardListType }
     *     
     */
    public void setCollectionCardList(CollectionCardListType value) {
        this.collectionCardList = value;
    }

}

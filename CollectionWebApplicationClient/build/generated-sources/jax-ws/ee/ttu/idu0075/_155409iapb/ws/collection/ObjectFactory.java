
package ee.ttu.idu0075._155409iapb.ws.collection;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075._155409iapb.ws.collection package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddCollectionResponse_QNAME = new QName("http://www.ttu.ee/idu0075/155409IAPB/ws/collection", "addCollectionResponse");
    private final static QName _GetCollectionResponse_QNAME = new QName("http://www.ttu.ee/idu0075/155409IAPB/ws/collection", "getCollectionResponse");
    private final static QName _AddCollectionCardResponse_QNAME = new QName("http://www.ttu.ee/idu0075/155409IAPB/ws/collection", "addCollectionCardResponse");
    private final static QName _GetCardResponse_QNAME = new QName("http://www.ttu.ee/idu0075/155409IAPB/ws/collection", "getCardResponse");
    private final static QName _AddCardResponse_QNAME = new QName("http://www.ttu.ee/idu0075/155409IAPB/ws/collection", "addCardResponse");
    private final static QName _GetCollectionCardListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/155409IAPB/ws/collection", "getCollectionCardListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075._155409iapb.ws.collection
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCollectionCardListRequest }
     * 
     */
    public GetCollectionCardListRequest createGetCollectionCardListRequest() {
        return new GetCollectionCardListRequest();
    }

    /**
     * Create an instance of {@link CollectionType }
     * 
     */
    public CollectionType createCollectionType() {
        return new CollectionType();
    }

    /**
     * Create an instance of {@link CollectionCardType }
     * 
     */
    public CollectionCardType createCollectionCardType() {
        return new CollectionCardType();
    }

    /**
     * Create an instance of {@link CardType }
     * 
     */
    public CardType createCardType() {
        return new CardType();
    }

    /**
     * Create an instance of {@link GetCollectionListRequest }
     * 
     */
    public GetCollectionListRequest createGetCollectionListRequest() {
        return new GetCollectionListRequest();
    }

    /**
     * Create an instance of {@link AddCollectionCardRequest }
     * 
     */
    public AddCollectionCardRequest createAddCollectionCardRequest() {
        return new AddCollectionCardRequest();
    }

    /**
     * Create an instance of {@link GetCardListResponse }
     * 
     */
    public GetCardListResponse createGetCardListResponse() {
        return new GetCardListResponse();
    }

    /**
     * Create an instance of {@link GetCardRequest }
     * 
     */
    public GetCardRequest createGetCardRequest() {
        return new GetCardRequest();
    }

    /**
     * Create an instance of {@link GetCollectionListResponse }
     * 
     */
    public GetCollectionListResponse createGetCollectionListResponse() {
        return new GetCollectionListResponse();
    }

    /**
     * Create an instance of {@link GetCollectionRequest }
     * 
     */
    public GetCollectionRequest createGetCollectionRequest() {
        return new GetCollectionRequest();
    }

    /**
     * Create an instance of {@link AddCollectionRequest }
     * 
     */
    public AddCollectionRequest createAddCollectionRequest() {
        return new AddCollectionRequest();
    }

    /**
     * Create an instance of {@link GetCardListRequest }
     * 
     */
    public GetCardListRequest createGetCardListRequest() {
        return new GetCardListRequest();
    }

    /**
     * Create an instance of {@link CollectionCardListType }
     * 
     */
    public CollectionCardListType createCollectionCardListType() {
        return new CollectionCardListType();
    }

    /**
     * Create an instance of {@link AddCardRequest }
     * 
     */
    public AddCardRequest createAddCardRequest() {
        return new AddCardRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", name = "addCollectionResponse")
    public JAXBElement<CollectionType> createAddCollectionResponse(CollectionType value) {
        return new JAXBElement<CollectionType>(_AddCollectionResponse_QNAME, CollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", name = "getCollectionResponse")
    public JAXBElement<CollectionType> createGetCollectionResponse(CollectionType value) {
        return new JAXBElement<CollectionType>(_GetCollectionResponse_QNAME, CollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionCardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", name = "addCollectionCardResponse")
    public JAXBElement<CollectionCardType> createAddCollectionCardResponse(CollectionCardType value) {
        return new JAXBElement<CollectionCardType>(_AddCollectionCardResponse_QNAME, CollectionCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", name = "getCardResponse")
    public JAXBElement<CardType> createGetCardResponse(CardType value) {
        return new JAXBElement<CardType>(_GetCardResponse_QNAME, CardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", name = "addCardResponse")
    public JAXBElement<CardType> createAddCardResponse(CardType value) {
        return new JAXBElement<CardType>(_AddCardResponse_QNAME, CardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionCardListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", name = "getCollectionCardListResponse")
    public JAXBElement<CollectionCardListType> createGetCollectionCardListResponse(CollectionCardListType value) {
        return new JAXBElement<CollectionCardListType>(_GetCollectionCardListResponse_QNAME, CollectionCardListType.class, null, value);
    }

}

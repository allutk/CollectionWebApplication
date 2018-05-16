
package ee.ttu.idu0075._155409iapb.ws.collection;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CollectionPortType", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CollectionPortType {


    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._155409iapb.ws.collection.CardType
     */
    @WebMethod
    @WebResult(name = "getCardResponse", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
    public CardType getCard(
        @WebParam(name = "getCardRequest", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
        GetCardRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._155409iapb.ws.collection.CardType
     */
    @WebMethod
    @WebResult(name = "addCardResponse", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
    public CardType addCard(
        @WebParam(name = "addCardRequest", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
        AddCardRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._155409iapb.ws.collection.GetCardListResponse
     */
    @WebMethod
    @WebResult(name = "getCardListResponse", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
    public GetCardListResponse getCardList(
        @WebParam(name = "getCardListRequest", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
        GetCardListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._155409iapb.ws.collection.CollectionType
     */
    @WebMethod
    @WebResult(name = "getCollectionResponse", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
    public CollectionType getCollection(
        @WebParam(name = "getCollectionRequest", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
        GetCollectionRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._155409iapb.ws.collection.CollectionType
     */
    @WebMethod
    @WebResult(name = "addCollectionResponse", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
    public CollectionType addCollection(
        @WebParam(name = "addCollectionRequest", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
        AddCollectionRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._155409iapb.ws.collection.GetCollectionListResponse
     */
    @WebMethod
    @WebResult(name = "getCollectionListResponse", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
    public GetCollectionListResponse getCollectionList(
        @WebParam(name = "getCollectionListRequest", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
        GetCollectionListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._155409iapb.ws.collection.CollectionCardListType
     */
    @WebMethod
    @WebResult(name = "getCollectionCardListResponse", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
    public CollectionCardListType getCollectionCardList(
        @WebParam(name = "getCollectionCardListRequest", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
        GetCollectionCardListRequest parameter);

    /**
     * 
     * @param parameter
     * @return
     *     returns ee.ttu.idu0075._155409iapb.ws.collection.CollectionCardType
     */
    @WebMethod
    @WebResult(name = "addCollectionCardResponse", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
    public CollectionCardType addCollectionCard(
        @WebParam(name = "addCollectionCardRequest", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", partName = "parameter")
        AddCollectionCardRequest parameter);

}

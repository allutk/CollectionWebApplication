/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.collection;

import ee.ttu.idu0075._155409iapb.ws.collection.AddCollectionCardRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.AddCollectionRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.CollectionCardListType;
import ee.ttu.idu0075._155409iapb.ws.collection.CollectionCardType;
import ee.ttu.idu0075._155409iapb.ws.collection.CollectionType;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCollectionCardListRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCollectionListRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCollectionListResponse;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCollectionRequest;
import java.math.BigInteger;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author allutk
 */
@Path("collections")
public class CollectionsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CollectionsResource
     */
    public CollectionsResource() {
    }

    @GET
    @Path("{id : \\d+}") //support digit only
    @Produces("application/json")
    public CollectionType getCollection(@PathParam("id") String id,
            @QueryParam("token") String token) {
        CollectionWebService ws = new CollectionWebService();
        GetCollectionRequest request = new GetCollectionRequest();
        request.setToken(token);
        request.setCollectionId(BigInteger.valueOf(Integer.parseInt(id)));
        return ws.getCollection(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public CollectionType addCollection(CollectionType content,
            @QueryParam("token") String token) {
        CollectionWebService ws = new CollectionWebService();
        AddCollectionRequest request = new AddCollectionRequest();
        request.setToken(token);
        request.setCollectionNo(content.getCollectionNo());
        request.setCollectorName(content.getCollectorName());
        request.setCollectorCountry(content.getCollectorCountry());
        return ws.addCollection(request); 
    }
    
    @GET
    @Produces("application/json")
    public GetCollectionListResponse getCollectionList(
            @QueryParam("token") String token,
            @QueryParam("name") String collectorName,
            @QueryParam("country") String collectorCountry,
            @QueryParam("cards") String hasRelatedCards) {
        CollectionWebService ws = new CollectionWebService();
        GetCollectionListRequest request = new GetCollectionListRequest();
        request.setToken(token);
        request.setCollectorName(collectorName);
        request.setCollectorCountry(collectorCountry);
        request.setHasRelatedCards(hasRelatedCards);
        return ws.getCollectionList(request);
    }
    
    @GET
    @Path("{id : \\d+}/cards") //support digit only
    @Produces("application/json")
    public CollectionCardListType getCollectionCardList(
            @PathParam("id") String id,
            @QueryParam("token") String token) {
        CollectionWebService ws = new CollectionWebService();
        GetCollectionCardListRequest request = new GetCollectionCardListRequest();
        request.setToken(token);
        request.setCollectionId(BigInteger.valueOf(Integer.parseInt(id)));
        return ws.getCollectionCardList(request);
    }
    
    @POST
    @Path("cards") //support digit only
    @Consumes("application/json")
    @Produces("application/json")
    public CollectionCardType addCollectionCard(AddCollectionCardRequest content, 
                                @QueryParam("token") String token,
                                @QueryParam("requestId") String requestId) {
        CollectionWebService ws = new CollectionWebService();
        AddCollectionCardRequest request = new AddCollectionCardRequest();
        request.setToken(token);
        request.setRequestId(new BigInteger(requestId));
        request.setCollectionId(content.getCollectionId());
        request.setCardId(content.getCardId());
        request.setQuantity(content.getQuantity());
        request.setUnitPrice(content.getUnitPrice());
        return ws.addCollectionCard(request);  
    }
    
}

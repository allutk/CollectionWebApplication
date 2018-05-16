/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.collection;

import ee.ttu.idu0075._155409iapb.ws.collection.AddCardRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.CardType;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCardListRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCardListResponse;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCardRequest;
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
@Path("cards")
public class CardsResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CardsResource
     */
    public CardsResource() {
    }

    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public CardType getCard(@PathParam("id") String id,
            @QueryParam("token") String token) {
        CollectionWebService ws = new CollectionWebService();
        GetCardRequest request = new GetCardRequest();
        request.setToken(token);
        request.setCardId(BigInteger.valueOf(Integer.parseInt(id)));
        return ws.getCard(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public CardType addCard(CardType content, @QueryParam("token") String token) {
        CollectionWebService ws = new CollectionWebService();
        AddCardRequest request = new AddCardRequest();
        request.setToken(token);
        request.setName(content.getName());
        request.setCondition(content.getCondition());
        request.setLang(content.getLang());
        request.setArtist(content.getArtist());
        request.setYear(content.getYear());
        return ws.addCard(request);
    }
    
    @GET
    @Produces("application/json")
    public GetCardListResponse getCardList(@QueryParam("token") String token) {
        CollectionWebService ws = new CollectionWebService();
        GetCardListRequest request = new GetCardListRequest();
        request.setToken(token);
        return ws.getCardList(request);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.collection;

import ee.ttu.idu0075._155409iapb.ws.collection.AddCardRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.AddCollectionCardRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.AddCollectionRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.CardType;
import ee.ttu.idu0075._155409iapb.ws.collection.CollectionCardListType;
import ee.ttu.idu0075._155409iapb.ws.collection.CollectionCardType;
import ee.ttu.idu0075._155409iapb.ws.collection.CollectionType;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCardListRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCardListResponse;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCardRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCollectionCardListRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCollectionListRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCollectionListResponse;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCollectionRequest;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author allutk
 */
@WebService(serviceName = "CollectionService", portName = "CollectionPort", endpointInterface = "ee.ttu.idu0075._155409iapb.ws.collection.CollectionPortType", targetNamespace = "http://www.ttu.ee/idu0075/155409IAPB/ws/collection", wsdlLocation = "WEB-INF/wsdl/CollectionWebService/CollectionService.wsdl")
public class CollectionWebService {

    static int nextCardId = 1;
    static int nextCollectionId = 1;
    static List<CardType> cardList = new ArrayList<>();
    static List<CollectionType> collectionList = new ArrayList<>();
    static List<BigInteger> addCollectionCardRequestIdList = new ArrayList<>();
    
    public CardType getCard(GetCardRequest parameter) {
        CardType ct = null;
        if (parameter.getToken() != null && parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < cardList.size(); i++) {
                if (cardList.get(i).getId().equals(parameter.getCardId())) {
                    ct = cardList.get(i);
                }
            }
        }
        return ct;
    }

    public CardType addCard(AddCardRequest parameter) {
        CardType ct = new CardType();
        if (parameter.getToken() != null && parameter.getToken().equalsIgnoreCase("salajane")
                && isValidConditionAndLang(parameter.getCondition(), parameter.getLang())) {
            boolean isRepeatedRequest = false;
            for (int i = 0; i < cardList.size(); i++) {
                CardType card = cardList.get(i);
                if (card.getName().equals(parameter.getName())
                        && card.getCondition().equals(parameter.getCondition())
                        && card.getLang().equals(parameter.getLang())
                        && card.getArtist().equals(parameter.getArtist())
                        && card.getYear().compareTo(parameter.getYear()) == 0) {
                    isRepeatedRequest = true;
                    ct = card;
                }
            }
            if (!isRepeatedRequest) {
                ct.setName(parameter.getName());
                ct.setCondition(parameter.getCondition());
                ct.setLang(parameter.getLang());
                ct.setArtist(parameter.getArtist());
                ct.setYear(parameter.getYear());
                ct.setId(BigInteger.valueOf(nextCardId++));
                cardList.add(ct);
            }
        }
        return ct;
    }
    
    private boolean isValidConditionAndLang(String condition, String lang) {
        boolean isValidCondition = true;
        boolean isValidLang = true;
        if (!condition.equals("mint") && !condition.equals("near mint")
                && !condition.equals("played") && !condition.equals("heavily played")) {
            isValidCondition = false;
        }
        if (!lang.equals("en") && !lang.equals("fr") && !lang.equals("de")
                && !lang.equals("it") && !lang.equals("ja") && !lang.equals("ko")
                && !lang.equals("pt") && !lang.equals("ru") && !lang.equals("es")
                && !lang.equals("zh")) {
            isValidLang = false;
        }
        return isValidCondition && isValidLang;
    }

    public GetCardListResponse getCardList(GetCardListRequest parameter) {
        GetCardListResponse response = new GetCardListResponse();
        if (parameter.getToken() != null && parameter.getToken().equalsIgnoreCase("salajane")) {
            for (CardType cardType : cardList) {
                response.getCard().add(cardType);
            }
        }
        return response;
    }

    public CollectionType getCollection(GetCollectionRequest parameter) {
        CollectionType ct = null;
        if (parameter.getToken() != null && parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < collectionList.size(); i++) {
                if (collectionList.get(i).getId().equals(parameter.getCollectionId())) {
                    ct = collectionList.get(i);
                }
            }    
        }
        return ct;
    }

    public CollectionType addCollection(AddCollectionRequest parameter) {
        CollectionType ct = new CollectionType();
        if (parameter.getToken() != null && parameter.getToken().equalsIgnoreCase("salajane")) {
            boolean isRepeatedRequest = false;
            for (int i = 0; i < collectionList.size(); i++) {
                CollectionType collection = collectionList.get(i);
                if (collection.getCollectionNo().equals(parameter.getCollectionNo())
                        && collection.getCollectorName().equals(parameter.getCollectorName())
                        && collection.getCollectorCountry().equals(parameter.getCollectorCountry())) {
                    isRepeatedRequest = true;
                    ct = collection;
                }
            }
            if (!isRepeatedRequest) {
                ct.setCollectionNo(parameter.getCollectionNo());
                ct.setCollectorName(parameter.getCollectorName());
                ct.setCollectorCountry(parameter.getCollectorCountry());
                ct.setCollectionCardList(new CollectionCardListType());
                ct.setId(BigInteger.valueOf(nextCollectionId++));
                collectionList.add(ct);
            }
        }
        return ct;
    }
    
    public GetCollectionListResponse getCollectionList(GetCollectionListRequest parameter) {
        GetCollectionListResponse response = new GetCollectionListResponse();
        if (parameter.getToken() != null && parameter.getToken().equalsIgnoreCase("salajane")
                && (parameter.getHasRelatedCards() == null
                || parameter.getHasRelatedCards().equalsIgnoreCase("ei")
                || parameter.getHasRelatedCards().equalsIgnoreCase("jah"))) {
            for (CollectionType collectionType : collectionList) {
                if (((parameter.getHasRelatedCards() == null)
                    || (parameter.getHasRelatedCards().equalsIgnoreCase("ei") && (collectionType.getCollectionCardList() == null || collectionType.getCollectionCardList().getCollectionCard().isEmpty()))
                    || (parameter.getHasRelatedCards().equalsIgnoreCase("jah") && collectionType.getCollectionCardList() != null && !collectionType.getCollectionCardList().getCollectionCard().isEmpty()))) {
                    if ((parameter.getCollectorName() == null) || (parameter.getCollectorName() != null && parameter.getCollectorName().equals(collectionType.getCollectorName()))) {
                        if ((parameter.getCollectorCountry() == null) || (parameter.getCollectorCountry() != null && parameter.getCollectorCountry().equals(collectionType.getCollectorCountry()))) {
                            response.getCollection().add(collectionType);
                        }
                    }
                }
            }
        }
        return response;
    }

    public CollectionCardListType getCollectionCardList(GetCollectionCardListRequest parameter) {
        CollectionCardListType collectionCardList = null;
        if (parameter.getToken() != null && parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < collectionList.size(); i++) {
                if (collectionList.get(i).getId().equals(parameter.getCollectionId())) {
                    collectionCardList = collectionList.get(i).getCollectionCardList();
                }
            }    
        }
        return collectionCardList;
    }

    public CollectionCardType addCollectionCard(AddCollectionCardRequest parameter) {
        CollectionCardType collectionCard = new CollectionCardType();
        if (parameter.getToken() != null && parameter.getToken().equalsIgnoreCase("salajane")) {
            boolean isRepeatedRequest = false;
            if (addCollectionCardRequestIdList.contains(parameter.getRequestId())) {
                isRepeatedRequest = true;
            }
            GetCardRequest cardRequest = new GetCardRequest();
            cardRequest.setToken(parameter.getToken());
            cardRequest.setCardId(parameter.getCardId());
            collectionCard.setCard(getCard(cardRequest));
            collectionCard.setQuantity(parameter.getQuantity());
            collectionCard.setUnitPrice(parameter.getUnitPrice());
        
            for (int i = 0; i < collectionList.size(); i++) {
                if (collectionList.get(i).getId().equals(parameter.getCollectionId())) {
                    List<CollectionCardType> cardList = collectionList.get(i).getCollectionCardList().getCollectionCard();
                    boolean alreadyContainsCard = false;
                    for (CollectionCardType collectionCardType : cardList) {
                        if (collectionCardType.getCard().getId().equals(parameter.getCardId()) && collectionCardType.getUnitPrice() == parameter.getUnitPrice()) {
                            alreadyContainsCard = true;
                            if (!isRepeatedRequest) {
                                collectionCardType.setQuantity(collectionCardType.getQuantity() + parameter.getQuantity());
                            }
                        }
                    }
                    if (!alreadyContainsCard) {
                        collectionList.get(i).getCollectionCardList().getCollectionCard().add(collectionCard);
                    }
                    if (!isRepeatedRequest) {
                        addCollectionCardRequestIdList.add(parameter.getRequestId());
                        collectionList.get(i).setAmount(collectionList.get(i).getAmount() + collectionCard.getQuantity() * collectionCard.getUnitPrice());
                    }
                    return collectionCard;
                }
            } 
        }
        return null;
    }
    
}

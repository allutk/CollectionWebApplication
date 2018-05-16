/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionwebapplicationclient;

import java.math.BigInteger;
import ee.ttu.idu0075._155409iapb.ws.collection.AddCardRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.AddCollectionCardRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.AddCollectionRequest;
import ee.ttu.idu0075._155409iapb.ws.collection.CardType;
import ee.ttu.idu0075._155409iapb.ws.collection.CollectionCardListType;
import ee.ttu.idu0075._155409iapb.ws.collection.CollectionCardType;
import ee.ttu.idu0075._155409iapb.ws.collection.CollectionPortType;
import ee.ttu.idu0075._155409iapb.ws.collection.CollectionService;
import ee.ttu.idu0075._155409iapb.ws.collection.CollectionType;
import ee.ttu.idu0075._155409iapb.ws.collection.GetCollectionCardListRequest;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author allutk
 */
public class CollectionWebApplicationClient {
    
    private static Scanner scanner;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean userHasFinished = false;
        while (!userHasFinished) {
            System.out.println("Available operations:");
            System.out.println("[1] - addCard");
            System.out.println("[2] - addCollection");
            System.out.println("[3] - addCollectionCard");
            System.out.println("[4] - getCollectionCardList");
            scanner = new Scanner(System.in);
            String operation = "";
            while (!operation.equals("1") && !operation.equals("2")
                    && !operation.equals("3") && !operation.equals("4")) {
                System.out.print("Type in the operation number you want to execute: ");
                operation = scanner.nextLine();
            }
            System.out.println("");
            if (operation.equals("1")) {
                executeAddCardOperation();
            } else if (operation.equals("2")) {
                executeAddCollectionOperation();
            } else if (operation.equals("3")) {
                executeAddCollectionCardOperation();
            } else if (operation.equals("4")) {
                executeGetCollectionCardListOperation();
            }
            String answer = "";
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Do you want to continue [yes/no]? ");
                answer = scanner.nextLine();
            }
            if (answer.toLowerCase().equals("no")) {
                userHasFinished = true;
            } else {
                System.out.println();
            }
        }
    }
    
    private static void executeAddCardOperation() {
        CardType result = addCard(makeAddCardRequest());
        System.err.println("\nThe card has been successfully added!");
        System.err.println("Id: " + result.getId() + ", name: " + result.getName()
                + ", condition: " + result.getCondition() + ", lang: " + result.getLang()
                + ", artist: " + result.getArtist() + ", year: " + result.getYear());
    }
    
    private static AddCardRequest makeAddCardRequest() {
        AddCardRequest request = new AddCardRequest();
        request.setToken("salajane");
        System.out.print("Enter card name: ");
        request.setName(scanner.nextLine());
        String condition = "";
        while (!condition.equals("mint") && !condition.equals("near mint")
                && !condition.equals("played") && !condition.equals("heavily played")) {
            System.out.print("Enter card condition (mint, near mint, played, heavily played): ");
            condition = scanner.nextLine().toLowerCase();
        }
        request.setCondition(condition);
        String lang = "";
        while (!lang.equals("en") && !lang.equals("fr") && !lang.equals("de")
                && !lang.equals("it") && !lang.equals("ja") && !lang.equals("ko")
                && !lang.equals("pt") && !lang.equals("ru") && !lang.equals("es")
                && !lang.equals("zh")) {
            System.out.print("Enter card language (en, fr, de, it, ja, ko, pt, ru, es, zh): ");
            lang = scanner.nextLine().toLowerCase();
        }
        request.setLang(lang);
        System.out.print("Enter card artist: ");
        request.setArtist(scanner.nextLine());
        String year = " ";
        while (!year.chars().allMatch(Character::isDigit) || year.length() != 4) {
            System.out.print("Enter card year: ");
            year = scanner.nextLine();
        }
        request.setYear(new BigInteger(year));
        return request;
    }
    
    private static CardType addCard(AddCardRequest parameter) {
        CollectionService service = new CollectionService();
        CollectionPortType port = service.getCollectionPort();
        return port.addCard(parameter);
    }
    
    private static void executeAddCollectionOperation() {
        CollectionType result = addCollection(makeAddCollectionRequest());
        System.err.println("\nThe collection has been successfully added!");
        System.err.println("Id: " + result.getId() + ", collection No: "+ result.getCollectionNo()
                + ", collector name: " + result.getCollectorName()
                + ", collector country: " + result.getCollectorCountry()
                + ", amount: " + result.getAmount()
                + ", card list: " + result.getCollectionCardList().getCollectionCard());
    }
    
    private static AddCollectionRequest makeAddCollectionRequest() {
        AddCollectionRequest request = new AddCollectionRequest();
        request.setToken("salajane");
        System.out.print("Enter collection number (any combination of characters and numbers): ");
        request.setCollectionNo(scanner.nextLine());
        System.out.print("Enter collector name: ");
        request.setCollectorName(scanner.nextLine());
        System.out.print("Enter collector country: ");
        request.setCollectorCountry(scanner.nextLine());
        return request;
    }
    
    private static CollectionType addCollection(AddCollectionRequest parameter) {
        CollectionService service = new CollectionService();
        CollectionPortType port = service.getCollectionPort();
        return port.addCollection(parameter);
    }
    
    private static void executeAddCollectionCardOperation() {
        CollectionCardType result = addCollectionCard(makeAddCollectionCardRequest());
        System.err.println("\nThe collection card has been successfully added! Card info:");
        System.err.println("Id: " + result.getCard().getId()
                + ", name: " + result.getCard().getName()
                + ", condition: " + result.getCard().getCondition()
                + ", lang: " + result.getCard().getLang()
                + ", artist: " + result.getCard().getArtist()
                + ", year: " + result.getCard().getYear()
                + ", quantity: " + result.getQuantity()
                + ", unit price: " + result.getUnitPrice());
    }
    
    private static AddCollectionCardRequest makeAddCollectionCardRequest() {
        AddCollectionCardRequest request = new AddCollectionCardRequest();
        request.setToken("salajane");
        request.setRequestId(new BigInteger(256, new Random()));
        String collectionId = " ";
        while (!collectionId.chars().allMatch(Character::isDigit)) {
            System.out.print("Enter collection id: ");
            collectionId = scanner.nextLine();
        }
        request.setCollectionId(new BigInteger(collectionId));
        String cardId = " ";
        while (!cardId.chars().allMatch(Character::isDigit)) {
            System.out.print("Enter card id: ");
            cardId = scanner.nextLine();
        }
        request.setCardId(new BigInteger(cardId));
        String quantity = " ";
        while (!quantity.chars().allMatch(Character::isDigit)) {
            System.out.print("Enter card quantity: ");
            quantity = scanner.nextLine();
        }
        request.setQuantity(Double.parseDouble(quantity));
        String unitPrice = "";
        boolean isDouble = false;
        while (!isDouble) {
            isDouble = true;
            System.out.print("Enter card unit price: ");
            unitPrice = scanner.nextLine();
            try {
                Double.parseDouble(unitPrice);
            } catch(NumberFormatException e) {
                isDouble = false;
            }
        }
        request.setUnitPrice(Double.parseDouble(unitPrice));
        return request;
    }
    
    private static CollectionCardType addCollectionCard(AddCollectionCardRequest parameter) {
        CollectionService service = new CollectionService();
        CollectionPortType port = service.getCollectionPort();
        return port.addCollectionCard(parameter);
    }
    
    private static void executeGetCollectionCardListOperation() {
        CollectionCardListType result = getCollectionCardList(makeGetCollectionCardListRequest());
        System.err.println("\nCollection card list:");
        List<CollectionCardType> cardList = result.getCollectionCard();
        for (CollectionCardType collectionCardType : cardList) {
            CardType ct = collectionCardType.getCard();
            System.err.println("Id: " + ct.getId() + ", name: " + ct.getName()
                    + ", condition: " + ct.getCondition() + ", lang: " + ct.getLang()
                    + ", artist: " + ct.getArtist() + ", year: " + ct.getYear()
                    + ", quantity: " + collectionCardType.getQuantity()
                    + ", unit price: " + collectionCardType.getUnitPrice());
        }
    }

    private static GetCollectionCardListRequest makeGetCollectionCardListRequest() {
        GetCollectionCardListRequest request = new GetCollectionCardListRequest();
        request.setToken("salajane");
        String collectionId = " ";
        while (!collectionId.chars().allMatch(Character::isDigit)) {
            System.out.print("Enter collection id: ");
            collectionId = scanner.nextLine();
        }
        request.setCollectionId(new BigInteger(collectionId));
        return request;
    }
    
    private static CollectionCardListType getCollectionCardList(GetCollectionCardListRequest parameter) {
        CollectionService service = new CollectionService();
        CollectionPortType port = service.getCollectionPort();
        return port.getCollectionCardList(parameter);
    }
    
}

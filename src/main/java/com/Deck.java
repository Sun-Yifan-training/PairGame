package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final List<Card> cardList;

    public Deck() {
        Card[] cards = Card.values();
        List<Card> cardList = new ArrayList<>(Arrays.asList(cards));
        Collections.shuffle(cardList);
        this.cardList = cardList;

    }

    public List<Card> getValues(){
        return cardList;
    }
}

package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final List<Card> cardList;

    public Deck(int level) {
        Card[] cards = Card.values();
        List<Card> cardList = new ArrayList<>(Arrays.asList(cards));

        if (level==8){
            cardList = cardList.subList(0,8);
        }

        Collections.shuffle(cardList);
        this.cardList = cardList;//randomly make deck

    }

    public List<Card> getValues(){
        return cardList;
    }

    public Card getCard(int index){
        return cardList.get(index);
    }
}

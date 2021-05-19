package com;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private List<String> allCards;
    private Deck deck;
    public Table(Deck deck){
        this.deck = deck;

        List<String> allCards = new ArrayList<>();
        for (int i= 0; i <= 8; i++){
            allCards.add("*");
        }
        this.allCards = allCards;
    }
    public void getInput(int select){

        Card selected = Card.getById(select);
        int index = 0;
        for (Card c : deck.getValues()){
            if (c.name()==selected.name()){
                allCards.set(index,c.getLabel());
            }
            else{
                index +=1;
            }
        }

    }
    public void showTable(){

        System.out.println(allCards.subList(0,4));
        System.out.println(allCards.subList(4,8));
    }

    public void updateTable(){

    }

}

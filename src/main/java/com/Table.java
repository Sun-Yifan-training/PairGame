package com;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private final List<String> allCards;
    private final List<String> tempAllCards;
    private final Deck deck;
    public Table(Deck deck,List<String> allCards){
        this.deck = deck;


        this.allCards = allCards;
        this.tempAllCards = allCards;
    }
    public void getInput(int select){

        Card selected = Card.getById(select);
        updateTable(tempAllCards,selected);

    }
    public void showTable(){

        System.out.println(tempAllCards.subList(0,4));
        System.out.println(tempAllCards.subList(4,8));
    }

    public List<String> getTable(){
        return allCards;

    }

    public void updateTable(List<String> allCards, Card selected){
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

}

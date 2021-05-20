package com;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private final List<String> allCards;
    private final List<String> tempAllCards;
    private final Deck deck;
    public Table(Deck deck,List<String> allCards, List<String> tempCards){
        this.deck = deck;


        this.allCards = allCards;
        this.tempAllCards = tempCards;
    }
    public void getInput(int select){

        Card selected = deck.getCard(select);
        updateTable(tempAllCards,selected);

    }
    public void showTable(){

        System.out.println(tempAllCards.subList(0,4));
        System.out.println(tempAllCards.subList(4,8));
    }

    public void showRealTable(){
        System.out.println(allCards.subList(0,4));
        System.out.println(allCards.subList(4,8));
    }
    public List<String> getTable(){
        return tempAllCards;

    }

    public void updateTable(List<String> Cards, Card selected){
        int index = 0;
        for (Card c : deck.getValues()){
            if (c.name()==selected.name()){
                Cards.set(index,c.getLabel());
            }
            else{
                index +=1;
            }
        }
    }

    public void copyToAllCards(List<String> temp){
        int i = 0;
        for (String element: temp){
            allCards.set(i,element);
            i++;
        }

    }
    public void backwardTempCards(){
        int i = 0;
        for (String element: allCards){

            tempAllCards.set(i,element);
            i++;
        }

    }


}

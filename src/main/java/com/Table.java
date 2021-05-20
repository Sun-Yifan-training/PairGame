package com;

import java.util.ArrayList;
import java.util.List;

public class Table {//tableに置いてるカードの表示

    private final List<String> allCards;
    private final List<String> tempAllCards;
    private final Deck deck;
    public Table(Deck deck,List<String> allCards, List<String> tempCards){
        this.deck = deck;


        this.allCards = allCards;// 本table
        this.tempAllCards = tempCards;//仮table
    }
    public void getInput(int select){

        Card selected = deck.getCard(select);
        updateTable(tempAllCards,selected);//選択したカードを表示

    }
    public void showTable(){//仮tableを表示

        System.out.println("============");
        System.out.println("|| TABLE ||");
        System.out.println("============");
        System.out.println(tempAllCards.subList(0,4));
        System.out.println(tempAllCards.subList(4,8));
    }


    public List<String> getTable(){
        return tempAllCards;

    }

    public void updateTable(List<String> Cards, Card selected){//tableにcardを更新
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

    public void copyToAllCards(List<String> temp){//本tableへ更新
        int i = 0;
        for (String element: temp){
            allCards.set(i,element);
            i++;
        }

    }
    public void backwardTempCards(){//ペアじゃない場合、仮tableを前の状態に戻る
        int i = 0;
        for (String element: allCards){

            tempAllCards.set(i,element);
            i++;
        }

    }

    public String getCard(int input){
        return tempAllCards.get(input);

    }

}

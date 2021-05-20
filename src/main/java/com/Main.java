package com;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        List<String> allCards = new ArrayList<>();
        for (int i= 0; i <= 8; i++){
            allCards.add(String.valueOf(i));
        }
        List<String> tempCards = new ArrayList<>();
        for (int i= 0; i <= 8; i++){
            tempCards.add(String.valueOf(i));
        }//table初期化
        Table table = new Table(deck,allCards,tempCards);
        Play play = new Play(table);

        Game game = new Game(deck,table,play);
        System.out.println("Welcome to Pair Game");
        System.out.println("Try to find all pairs from the cards on the table");
        System.out.println("Input number to choose card");
        game.start();


    }
}

package com;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        List<String> allCards = new ArrayList<>();
        for (int i= 0; i <= 8; i++){
            allCards.add(String.valueOf(i+1));
        }
        Table table = new Table(deck,allCards);
        Play play = new Play(table);
        //int level = 4;
        Game game = new Game(deck,table,play);
        game.start();


    }
}

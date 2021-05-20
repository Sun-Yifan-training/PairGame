package com;

import com.Card;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Game {


    private final Deck deck ;
    private final Table table;
    private final Play play;

    public Game(Deck deck, Table table, Play play){
        this.deck = deck;
        this.table =table;
        this.play = play;

    }

    public void start(){
        boolean check = true;
        int times = 0;
        while (times<4) {


            int[] choice = play.select();
            if (Rules.judge(choice[0], choice[1], deck)) {
                System.out.println("found same pair!");
                List<String> tableNow = table.getTable();
                table.copyToAllCards(tableNow);
                times +=1;
            } else {
                System.out.println("残念　ペアじゃなかった");
                table.backwardTempCards();

                System.out.println("Please try again (after 5 seconds)");
                Rules.pause(5);
                System.out.println("****************");
                System.out.println("****************");
                System.out.println("****************");
            }
        }
        System.out.println("Congratulations! you found all pairs!");
    }
}

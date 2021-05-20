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
        int times = 0;//正解数
        int totalTimes = 0;//全体プレイ回数
        while (times<4) {


            int[] choice = play.select();//選択入力
            totalTimes += 1;
            if (Rules.judgePair(choice[0], choice[1], deck)) {//ペアチェック
                System.out.println("Found a correct pair!");
                List<String> tableNow = table.getTable();
                table.copyToAllCards(tableNow);//仮tableから本tableへ更新
                times +=1;
            } else {
                System.out.println("残念　it's not a pair");
                table.backwardTempCards();//前回のtableに戻る

                System.out.println("Please try again (after 4 seconds)");
                Rules.pause(4);
                System.out.println("****************");
                System.out.println("****************");

            }
        }
        System.out.println("おめでとう! you found all pairs!");
        System.out.println("You take "+ totalTimes + " steps to complete");
    }


}

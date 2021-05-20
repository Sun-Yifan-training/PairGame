package com;

import com.Card;

import java.util.ArrayList;
import java.util.LinkedList;

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
        play.select();

    }
}

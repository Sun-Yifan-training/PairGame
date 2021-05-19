package com;

import com.Card;

import java.util.ArrayList;
import java.util.LinkedList;

public class Game {


    public static void main(String[] args) {
        Deck deck = new Deck();
        Table table = new Table(deck);
        Play play = new Play(deck,table);
        int level = 4;

        play.select();


    }
}

package com;

import java.util.Scanner;

public class Play {

    private Deck deck ;
    private Table table;

    public Play(Deck deck,Table table){
        this.deck = deck;
        this.table = table;
    }

    public void select(){
        //Table table = new Table(deck);
        Scanner scanner = new Scanner(System.in);
        System.out.println("please take your choice :");
        int input = Integer.parseInt(scanner.next());

        table.getInput(input);
        table.showTable();

        System.out.println("please take your second choice :");
        int input2 = Integer.parseInt(scanner.next());
        table.getInput(input2);
        table.showTable();

        if (Rules.judge(input,input2)){

        }


    }
}

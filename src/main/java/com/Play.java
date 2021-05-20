package com;

import java.util.Scanner;

public class Play {


    private final Table table;

    public Play(Table table){

        this.table = table;
    }

    public int[] select(){
        //Table table = new Table(deck);
        table.showTable();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please take your choice :");
        int input = Integer.parseInt(scanner.next());

        table.getInput(input);
        table.showTable();

        System.out.println("please take your second choice :");
        int input2 = Integer.parseInt(scanner.next());
        table.getInput(input2);
        table.showTable();

        int[] choice= new int[]{input,input2};
        return choice;




    }
}

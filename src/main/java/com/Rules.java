package com;

import java.util.Scanner;

public class Rules {


    public static boolean judgePair(int input1, int input2,Deck deck){//同じペアかどうかのチェック


        Card selectedFirst = deck.getCard(input1);
        Card selectedSecond = deck.getCard(input2);

        return  (selectedFirst.getLabel()== selectedSecond.getLabel());

    }

    public static int difficulty(){

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("please select difficulty (easy/hard): ");
            String level = scanner.nextLine();
            if (level.equals("easy")){
                return 8;

            }
            else if(level.equals("hard")){
                return 16;
            }
            else{
                System.out.println("wrong input");
            }
        }

    }



    public static void pause(double seconds)
    {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {}
    }
}

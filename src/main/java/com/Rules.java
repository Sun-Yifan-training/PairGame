package com;

public class Rules {


    public static boolean judgePair(int input1, int input2,Deck deck){


        Card selectedFirst = deck.getCard(input1);
        Card selectedSecond = deck.getCard(input2);

        return  (selectedFirst.getLabel()== selectedSecond.getLabel());

    }



    public static void pause(double seconds)
    {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {}
    }
}

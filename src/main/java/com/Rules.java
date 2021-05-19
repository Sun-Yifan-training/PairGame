package com;

public class Rules {



    public static boolean judge(int input1, int input2){

        Card selectedFirst = Card.getById(input1);
        Card selectedSecond = Card.getById(input2);

        return  (selectedFirst.getLabel()== selectedSecond.getLabel());

    }

}

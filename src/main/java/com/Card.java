package com;

import java.awt.*;

public enum Card {

    A1("A",1),
    A2("A",2),
    B1("B",3),
    B2("B",4),
    C1("C",5),
    C2("C",6),
    D1("D",7),
    D2("D",8);



    private final int value;
    private final String label;

    private Card(String label,int value){
        this.label = label;
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public String getLabel(){
        return this.label;
    }
    public static Card getById(int id){
        for (Card c : Card.values()){
            if (id == c.getValue()){
                return c;
            }


        }
        return null;
    }
}

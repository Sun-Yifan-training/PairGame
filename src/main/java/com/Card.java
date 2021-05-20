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
    D2("D",8),
    E1("E",9),
    E2("E",10),
    F1("F",11),
    F2("F",12),
    G1("G",13),
    G2("G",14),
    H1("H", 15),
    H2("H", 16);



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

package com;

import java.util.Scanner;

public class Play {


    private final Table table;

    public Play(Table table){

        this.table = table;
        //this.deck = deck;

    }

    public int[] select(){//カードを選択
        Scanner scanner = new Scanner(System.in);
        int input1 = 0;
        int input2 = 0;
        while(true) {
            table.showTable();

            System.out.println("please take your first choice :");
            String input = scanner.next();
            if(isNumeric(input)){//入力は数字かのチェック
                if ((Integer.parseInt(input)<0)||(Integer.parseInt(input)>7)){
                    System.out.println("out of bounds, please input number from 0 to 7");
                    continue;
                }
                else{
                    input1 = Integer.parseInt(input);
                }

            }
            else{
                System.out.println("not number, please input number from 0 to 7");
                continue;
            }


            if(table.getCard(input1).equals(String.valueOf(input1))){//選択は解けたカードかのチェック

                table.getInput(input1);
                table.showTable();
                break;
            }
            else{

                System.out.println("card already selected, select again");
            }
        }


        while(true) {
            table.showTable();

            System.out.println("please take your second choice :");
            String input = scanner.next();
            if(isNumeric(input)){//入力は数字かのチェック
                input2 = Integer.parseInt(input);
            }
            else{
                System.out.println("not number, please input number from 0 to 7");
                continue;
            }


            if(table.getCard(input2).equals(String.valueOf(input2))){//選択は解けたカードかのチェック

                table.getInput(input2);
                table.showTable();
                break;
            }
            else{

                System.out.println("card already selected, select again");
            }
        }



        int[] choice= new int[]{input1,input2};
        return choice;



    }


    public  boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}

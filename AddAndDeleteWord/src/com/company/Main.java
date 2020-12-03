package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = "";
        String str = "";

        System.out.println("1 - print new word /n 2 - print all words /n  3 - Add or delete word /n 4 - exit");


        int action = 0;


        while (action!=4){
            System.out.print("Input action: ");
            action =  Integer. parseInt(in.next());
            switch(action){
                case 1: if(str!="") {
                            System.out.println(word.substring(1));
                        }
                        else{
                            System.out.println("No new words");
                        }
                        break;
                case 2: System.out.println(str.substring(1));
                        break;
                case 3: System.out.print("Input: ");
                        word = in.next();
                        str = WorkWithStr(word,str);
                        break;
            }
        }


    }

    public static String WorkWithStr(String word, String text){
            if(word.charAt(0) == '+'){
                return text = String.join(" ", text, word.substring(1));
            }
            else if(word.charAt(0) == '-'){
                return text = text.replace(word.substring(1), "").replaceAll("[\\s]{2,}", " ");
            }
            return text;
    }



}

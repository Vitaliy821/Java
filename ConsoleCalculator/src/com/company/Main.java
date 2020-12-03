package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.print("Input: ");
            String text = in.next();
            System.out.println(calculate(text));



    }


    public static int calculate(String  text){
        Integer [] numbers = strArrayToIntArray(text.split("\\D"));
        String [] symbols = text.split("\\d");

        int i = 0;
        int j = 1;
        int result = numbers[0];
        while(i!=symbols.length){
            switch (symbols[i]){
                case ("+"):
                    result+=numbers[j];
                    j++;
                    break;
                case ("-"):
                    result-=numbers[j];
                    j++;
                    break;
                case ("*"):
                    result*=numbers[j];
                    j++;
                    break;
                case ("/"):
                    result/=numbers[j];
                    j++;
                    break;
            }
            i++;
        }
        return result;
    }

    public static Integer [] strArrayToIntArray(String[] a){
        Integer[] b = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.parseInt(a[i]);
        }

        return b;
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input begin: ");
        int begin = in.nextInt();

        System.out.print("Input end: ");
        int end = in.nextInt();
        System.out.print("Input step: ");
        int step = in.nextInt();

        printArrey(fillArrey(begin,end,step));
    }

    private static int[] fillArrey(int begin, int end, int step){
        int size = (end-begin)/step+1;
        int [] arr= new int[size];
        arr[0] = begin;
        for(int i = 1; i<arr.length; i++){
            arr[i] = (arr[i-1]+step);
        }

        return arr;
    }

    private static void printArrey(int[]arr){

        for(int i=0; i<arr.length;i++){
                System.out.print(arr[i] + "\t");
        }

    }
}

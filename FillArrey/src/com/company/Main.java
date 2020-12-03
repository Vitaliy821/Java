package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input size: ");
        int size = in.nextInt();
        int[]arr = fillArrey(size);

        printArrey(arr);
    }

    private static int[] fillArrey(int size){
        int[] arr = new int[size];
        int i = 0;
        int k = size/2;
        System.out.println(k);
        for(int j = k;j<arr.length; j++){
            arr[j] = i;
            i++;
        }
        i=-1;
        for(int j = k-1; j!=-1; j--){
            arr[j] = i;
            i--;
        }


        return arr;

    }

    private static void printArrey(int[]arr){

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }

    }

}

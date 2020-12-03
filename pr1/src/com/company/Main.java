package com.company;

public class Main {

    public static void main(String[] args) {
        int [][] numbers = new int [10][10];
        for(int i=0; i<10;i++){
            for(int j=0; j<10;j++){
                numbers[i][j] = (int) (Math.random()*(10));

            }
        }

        printArrey(numbers);
        printDiagonal(numbers);
    }

    private static void printArrey(int[][] arr){

        for(int i=0; i<10;i++){
            for(int j=0; j<10;j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        }

    private static void printDiagonal(int[][] arr){
        int i = arr.length-1;
        for(int j=0; j<arr.length; j++) {
            if(arr[i][j]%2==0 && arr[i][j]!=0){
                System.out.print(arr[i][j] + "\t");
                i--;
            }
        }
        System.out.print("\n");

    }
}

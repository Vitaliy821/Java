package com.company;

import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        double [] arr = {5,3,2,8,1,4};
        arr = oddSort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }

        System.out.println(oddSortSecond(arr));
    }

    public static double[] oddSort(double[] arr){
        List<Integer> oddNum = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddNum.add(i);
            }
        }

        double temp = 0;
        for(int i=0; i<oddNum.size()-1;i++){
            for(int j = oddNum.size() - 1; j > i; j--){
                if(arr[oddNum.get(j-1)]>arr[oddNum.get(j)]){
                    temp = arr[oddNum.get(j-1)];
                    arr[oddNum.get(j-1)] = arr[oddNum.get(j)];
                    arr[oddNum.get(j)] = temp;
                }
            }
        }
        return arr;
    }

}

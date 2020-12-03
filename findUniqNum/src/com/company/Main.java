package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        double []arr = {1,1,1,2,1,1};
        System.out.println(oddSortSecond(arr));
    }

    public static double oddSortSecond(double[]array){
        double[] arr = Arrays.stream(array).sorted().toArray();
        return arr[0]==arr[1] ? arr[arr.length-1] : arr[0];
    }
}

package com.company;

import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int length = new Scanner(System.in).nextInt();

        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = new Random().nextInt(9);
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n");
        System.out.println(
                Arrays.stream(arr)
                        .filter(e -> e%2 == 0)
                        .average()
                        .getAsDouble()
        );
    }
}

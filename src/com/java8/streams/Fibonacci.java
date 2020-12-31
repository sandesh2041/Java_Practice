package com.java8.streams;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

    public static int[] fibonacci(int Number){
        int[] temp = new int[Number];
        for (int i = 0; i < Number; i++){
            if( i == 0 || i == 1) {
                 temp[i] = i;
            }
            else {
                 temp[i] = temp[i-1] + temp[i-2];
            }
         }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many fibonacci numbers you want:");
        int fiboNum = sc.nextInt();

        int[] number = fibonacci(fiboNum);
        System.out.println(Arrays.toString(number));
    }
}

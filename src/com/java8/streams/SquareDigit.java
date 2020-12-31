package com.java8.streams;

//You are asked to square every digit of a number and concatenate them.
//For example, if we run 9119 through the function, 811181 will come out, because square of 9 is 81 and 1 is 1.
//Note: The function accepts an integer and returns an integer

import java.util.Scanner;

public class SquareDigit {

     public int squareDigits(int n) {

        String combine = "";
        String numStr = Integer.toString(n);

        for(int i = 0; i< numStr.length(); i++){
            int square = Character.getNumericValue(numStr.charAt(i)) * Character.getNumericValue(numStr.charAt(i));
            combine += square;
            }

        return Integer.parseInt(combine);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Multi Digit Number:");
        int number = sc.nextInt();

        SquareDigit sd = new SquareDigit();
        System.out.println(sd.squareDigits(number));
    }


}

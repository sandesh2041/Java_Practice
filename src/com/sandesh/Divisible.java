package com.sandesh;

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        long number = scanner.nextLong();

        if (number%3 == 0 && number%5 != 0)
            System.out.println("Buzz");
        else if (number%3 != 0 && number%5 == 0)
            System.out.println("Fizz");
        else if (number%3 == 0 && number%5 == 0)
            System.out.println("FizzBuzz");
        else
            System.out.println(number);
    }
}

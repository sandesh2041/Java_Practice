package com.java8.streams;

import java.util.Scanner;

public class SwitchCase {

    static void switchCase(String name){
        switch (name) {
            case "Subash":
                System.out.println("Hello " + name);
                break;

            case "Sandesh":
                System.out.println("Hello " + name );
                break;

            case "Utsav":
                System.out.println("Hello " + name);
                break;

            default:
                System.out.println("I dont care");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter you name:");
        String name = sc.nextLine();
        switchCase(name);
    }

}

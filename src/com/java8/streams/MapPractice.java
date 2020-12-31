package com.java8.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPractice {

    public static Map MapTest(String stg){
        Map str = new HashMap();
        for (char x:stg.toLowerCase().toCharArray()){
            if (str.containsKey(x)) {
                int temp = (int) str.get(x);
                str.put(x, temp + 1);
            }
            else
                str.put(x, 1);
        }
        str.remove(' ');
        return (str);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String sentence = scanner.nextLine();

        Map output = MapTest(sentence);

        System.out.println(output);
    }

}

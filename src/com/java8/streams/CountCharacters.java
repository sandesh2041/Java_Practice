package com.java8.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacters {

    public static Map countCharacters(String input){
        char[] arr = input.toLowerCase().toCharArray();
        Map str = new HashMap();
        for(char s:arr){
            if(str.containsKey(s)){
                int value = (int) str.get(s);
                str.put(s, value + 1 );
            }
            else{
                str.put(s,1);
            }
        }
        str.remove(' ');
        return (str);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Type your sentence:");
        String sentence = sc.nextLine();

        Map result = countCharacters(sentence);;
        System.out.println(result);
    }
}

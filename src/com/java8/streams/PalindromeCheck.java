package com.java8.streams;

import java.util.Scanner;

public class PalindromeCheck {
    public Boolean palindromeCheck(String word){
        char[] w = word.toCharArray();
        int j = w.length-1;
        for (int i = 0; i<= w.length/2; i++){
            if (w[i] != w[j]){
                System.out.println("Not Palindrome");
                return false;
            }
            j--;
        }
        System.out.println("Palindrome");
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to check:");
        String word = sc.nextLine();

        PalindromeCheck pdc = new PalindromeCheck();
        pdc.palindromeCheck(word);
    }
}

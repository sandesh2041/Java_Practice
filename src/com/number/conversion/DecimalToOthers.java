package com.number.conversion;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class DecimalToOthers {
    public String decimalToBinary(int number){
        List<Integer> binary = new ArrayList<Integer>();
        //Getting Remainder and Quotient until not divisible by 2
        while (number > 0){
            binary.add(number % 2);
            number =  number/2;
        }
        //Reversing the list to get correct binary
        List<String> reverseBinary = new ArrayList<>();
        for (int i = binary.size()-1; i >= 0; i--){
            reverseBinary.add(String.valueOf(binary.get(i)));
        }
    //Convert ArrayList to a single String
    //String combinedBinary = reverseBinary.stream().map(Object::toString).collect(Collectors.joining(""));
                            // OR
    String combinedBinary = String.join("", reverseBinary);
    return combinedBinary;
    }

    public String decimalToHex(int number){
        List<String> hex = new ArrayList<>();
        //Getting Remainder and Quotient until not divisible by 16
        while (number > 0){
            //Convert all the number above 9 to alphabet
            switch(number % 16){
                case 15: hex.add("F"); break;
                case 14: hex.add("E"); break;
                case 13: hex.add("D"); break;
                case 12: hex.add("C"); break;
                case 11: hex.add("B"); break;
                case 10: hex.add("A"); break;
                default: hex.add(String.valueOf(number%16)); break;
            }
            number = number/16;
        }
        //Reversing the list to get correct binary
        List<String> reverseHex = new ArrayList<>();
        for (int i = hex.size()-1; i >= 0 ; i--){
            reverseHex.add(hex.get(i));
        }
    //Convert ArrayList to a single integer
    //String combinedHex = reverseHex.stream().map(Object::toString).collect(Collectors.joining(""));
                    // OR
    String combinedHex = String.join("", reverseHex);
    return combinedHex;
    }
}

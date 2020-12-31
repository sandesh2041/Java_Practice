package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintRepeatStringUsingArray {
    public static List<String> printRepeatStringUsingArray(String[] countryName){
        List<String> cName = new ArrayList<String>();
        List<String> repeatName = new ArrayList<String>();

        for (int i = 0; i < countryName.length; i++){
            if(!cName.contains(countryName[i])) {
                cName.add(countryName[i]);
            }
            else {
                repeatName.add(countryName[i]);
            }
        }

    return repeatName.stream().distinct().collect(Collectors.toList());
    }

   /* public static List<String> printRepeatStringUsingArray1(String[] countryName){
        List<String> cName = new ArrayList<String>(); //Nepal India Pakistan Bangladesh Bhutan Afganistan
        List<String> repeatName = new ArrayList<String>(); // Nepal Nepal India Bhutan
        for(String s:countryName){
            if(!cName.contains(s)){
                cName.add(s);
            }
            else {
                repeatName.add(s);
            }
        }
        return repeatName.stream().distinct().collect(Collectors.toList());
    }*/

    public static void main(String[] args) {
        String[] countryName = {"Nepal", "India", "Nepal", "Pakistan", "Bangladesh", "Nepal", "India", "Bhutan", "Afghanistan","Bhutan"};
        List<String> repeatNames = printRepeatStringUsingArray(countryName);
        System.out.println(repeatNames);
    }
}

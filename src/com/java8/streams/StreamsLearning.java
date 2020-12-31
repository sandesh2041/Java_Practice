package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsLearning {
    static List<String> nameList = Arrays.asList("Subash","Sandesh","Utsav", "Jim", "John");

    // Create a list and return the string that starts with specific character

    public List<String> filterName(char prefix){

        return nameList.stream().filter(name->name.charAt(0)==prefix).collect(Collectors.toList());
    }



    public static void main(String[] args) {
        //StreamsLearning streamLearning = new StreamsLearning();
        //System.out.println(streamLearning.filterName('S'));

      // ReturnName rN = new ReturnName();
       //System.out.println(rN.compareString("Utsav"));
       // rN.testingFinal();

    }


}

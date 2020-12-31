package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReturnName {
    static List<String> nameInList = Arrays.asList("Sandesh", "Subash", "Utsav", "Jim", "John", "Harry");

    final String myName = "Subash";

    //Create a list and compare the string and return boolean value for matching
    public static List<Boolean> compareString(String nameInString){
        List<Boolean> temp = new ArrayList();


        /*nameInList.forEach(name -> {
            if (name.equalsIgnoreCase(nameInString)) {
                temp.add(Boolean.TRUE);
            }
            else temp.add(Boolean.FALSE);
        });
        return temp;*/

        /*for(String name:nameInList){
            if (name.equals(nameInString)){
                temp.add(Boolean.TRUE);
            }
             else temp.add(Boolean.FALSE);
        }*/
        return temp;
    }

}

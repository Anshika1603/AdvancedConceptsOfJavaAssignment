package com.knoldus.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UpperCaseConcatenation {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);

        //Taking input of 7 strings from user
        System.out.println("Enter 7 Strings: ");
        List<String> list=new ArrayList<String>();
        int numberOfString=0;

        //Storing string elements into the list using while loop
        while(numberOfString<7) {
            list.add(userInput.nextLine());
            numberOfString++;
        }

        /*Defining stringConcat method of stringConcatenation Interface
        using lambda function */
        StringConcatenation stringConcatenation= () -> {
            //Using streams to concatenate and convert to UpperCase
            List<String> concatenatedList= Collections.singletonList(list.stream().collect(Collectors.joining()).toUpperCase());
            System.out.println(concatenatedList);
        };

        stringConcatenation.stringConcat();
    }
}

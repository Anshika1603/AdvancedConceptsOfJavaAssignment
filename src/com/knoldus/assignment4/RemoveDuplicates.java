package com.knoldus.assignment4;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    static Scanner userInput=new Scanner(System.in);

    public static void main(String[] args) {
        //Taking String input from user
        System.out.println("Enter the String: ");
        String StringInput=userInput.nextLine();

        //adding the String input into list by converting it into array seperated by space
        List<String> list=Arrays.asList(StringInput.split(" "));

        /*Using lambda function to define removeDuplicates method of distinctElement interface*/
        DistinctElement distinctElement=() -> {
            // Using distinct method of stream to remove duplicate elements from list
           List<String> distinctList=list.stream().distinct().sorted().collect(Collectors.toList());
            System.out.println(distinctList);
        };

        distinctElement.removeDuplicates();
    }
}

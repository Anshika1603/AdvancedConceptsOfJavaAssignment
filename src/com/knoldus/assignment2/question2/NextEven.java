package com.knoldus.assignment2.question2;

import java.util.Scanner;

public class NextEven {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);

        //taking user input for float number
        System.out.println("Enter float number: ");
        float floatNumber=userInput.nextFloat();

        /*Using Lambda function to find the next even number
        * on the basis of user input and return the result.*/
        NextEvenNumber nextEvenNumber= (float floatnumber) -> {
            int number= (int) Math.ceil(floatnumber);
            System.out.println("Next Even Number is: ");
            if(number%2==0)
                return number;
            else
                return number+1;
        };

        int nextEven=nextEvenNumber.nextEven(floatNumber);
        System.out.print(nextEven);
    }
}

package com.knoldus.assignment2.question1;

import java.util.Scanner;

import static java.lang.Math.*;

public class Max {

    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        //Taking input from user for first and second number
        System.out.println("Enter First Number: ");
        int firstNumber=userInput.nextInt();
        System.out.println("Enter Second Number: ");
        int secondNumber=userInput.nextInt();

        /* Using Lambda function to provide definition to the maximum function of
           the maxNumber Interface. */

        MaxNumber maxNumber= (int firstnumber,int secondnumber) -> {
            //Finding maximum number using math.max method
            System.out.println("Max Number is: ");
            return max(firstnumber, secondnumber);
        };

        int maximumNumber=maxNumber.maximum(firstNumber,secondNumber);
        System.out.print(maximumNumber);
    }
}

package com.knoldus.assignment1;

import java.util.Scanner;

public class Restaurant {

    static Scanner userInput=new Scanner(System.in);

    public static void main(String[] args) {
        //Taking choice as input from user
        System.out.println("Press 1 to display Dishes");
        System.out.println("Press 2 to search Dish");
        int option=userInput.nextInt();
        //switch case to execute the required method based on user Input of choice
        switch (option)
        {
            case 1: displayDishes();
                    break;
            case 2: searchDishes();
                    break;
            default:
                System.out.println("Wrong Input. Please Try Again!");
                break;
        }
    }

    //Method to Display dishes from the menu List
    private static void displayDishes(){
        for (Dish dish: Menu.menuList) {
            System.out.println(dish);
        }
    }
    //Method to search and display the Dish by comparing the dishId entered by User
    private static void searchDishes() {
        System.out.println("Enter Dish ID you want to search: ");
        int dishId = userInput.nextInt();
        for (Dish dish : Menu.menuList) {
            if (dish.getDishID() == dishId) {
                System.out.println(dish);
                return;
            }
        }
    }
}

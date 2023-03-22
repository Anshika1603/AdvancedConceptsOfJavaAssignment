package com.knoldus.assignment1;

import java.time.LocalTime;

public class Dish {
    int dishID;
    String dishName;
    String localtime;
    //Constructor to set the dish Id, dish Name and creation time
    public Dish(int dishID, String dishName, LocalTime creationTime)
    {
        this.dishID = dishID;
        this.dishName = dishName;
        this.localtime= String.valueOf(creationTime);
    }
    //getter methods to get the values of the dish attributes
    int getDishID(){
        return dishID;
    }

    String getDishName(){
        return dishName;
    }

    String getLocaltime(){
        return localtime;
    }
    //Overriding toString() method to return the Dish attributes as String
    @Override
    public String toString(){
        return "Dish [ DishID = "+getDishID() +", DishName = "+getDishName() +", CreationTime = "+getLocaltime()+" ] ";
    }
}

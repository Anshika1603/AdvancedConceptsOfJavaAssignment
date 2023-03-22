package com.knoldus.assignment1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    Dish dish;
    //Creating a MenuList to store the Dishes
    static List<Dish> menuList=new ArrayList<>();

    //static block to pass the values into the Dish Constructor and add into menuList
    static {
        menuList.add(new Dish(1,"Pasta", LocalTime.now()));
        menuList.add(new Dish(2,"Pizza", LocalTime.now()));
        menuList.add(new Dish(3,"Lasagna", LocalTime.now()));
    }
}

package sample;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String args[]) {
        Drinks drink = new Drinks("pepsi" , "medium");
        Order test = new Order();
        test.addDrink(drink);
        test.printOrder();
    }

}

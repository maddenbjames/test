package sample;

import java.util.*;

public class Order {

    ArrayList<Object> pizzas = new ArrayList<>();
    ArrayList<Object> sides = new ArrayList<>();
    ArrayList<Object> drinks = new ArrayList<>();
    ArrayList<Object> cookies = new ArrayList<>();

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    public void addSide(Sides side) {
        this.sides.add(side);
    }

    public void addDrink(Drinks drink) {
        this.drinks.add(drink);
    }

    public void addCookie(Cookie cookie) {
        this.cookies.add(cookie);
    }

    public ArrayList<Object> getPizzas() {
        return this.pizzas;
    }

    public ArrayList<Object> getSides() {
        return this.sides;
    }

    public ArrayList<Object> getDrinks() {
        return this.drinks;
    }

    public ArrayList<Object> getCookies() {
        return this.cookies;
    }

    public void printOrder() {
        for(int i = 0; i < pizzas.size(); i ++) {
            System.out.println((pizzas.get(i)).toString());
        }
        for(int i = 0; i < sides.size(); i ++) {
            System.out.println((pizzas.get(i)).toString());
        }
        for(int i = 0; i < cookies.size(); i ++) {
            System.out.println((pizzas.get(i)).toString());
        }
        for(int i = 0; i < drinks.size(); i ++) {
            System.out.println((pizzas.get(i)).toString());
        }
    }


}

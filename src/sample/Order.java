package sample;

import java.util.*;

public class Order {

    ArrayList<Pizza> pizzas = new ArrayList<>();
    ArrayList<Sides> sides = new ArrayList<>();
    ArrayList<Drinks> drinks = new ArrayList<>();
    ArrayList<Cookie> cookies = new ArrayList<>();

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

    public ArrayList<Pizza> getPizzas() {
        return this.pizzas;
    }

    public ArrayList<Sides> getSides() {
        return this.sides;
    }

    public ArrayList<Drinks> getDrinks() {
        return this.drinks;
    }

    public ArrayList<Cookie> getCookies() {
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

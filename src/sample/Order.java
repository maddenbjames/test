package sample;

import java.util.*;

public class Order {

    ArrayList<Object> order = new ArrayList<>();

    public void addPizza(Pizza pizza) {
        this.order.add(pizza);
    }

    public void addSide(Sides side) {
        this.order.add(side);
    }

    public void addDrink(Drinks drink) {
        this.order.add(drink);
    }

    public void addCookie(Cookie cookie) {
        this.order.add(cookie);
    }

    public ArrayList<Object> getOrder() {
        return this.order;
    }

    public void printOrder() {
        for(int i = 0; i < order.size(); i ++) {
            System.out.println((order.get(i)).toString());
        }
    }


}

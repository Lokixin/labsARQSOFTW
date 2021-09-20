/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.complexcalculator;

/**
 *
 * @author lokix
 */
public class Pizza {
    String bread, sauce, cheese, topping;
    // A single copy of a variable/method is created and shared. The Class owns
    // the static member.
    public static  int numberOfPizzas = 0;
    
    public Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
        numberOfPizzas += 1;
    }

    public Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        numberOfPizzas += 1;
    }
    
    public static void displayPizzas(){
        System.out.println(numberOfPizzas);
    }

    // toString is used when an object of the class is printed
    @Override
    public String toString() {
        return "Pizza{" + "bread=" + bread + ", sauce=" + sauce + ", cheese=" + cheese + ", topping=" + topping + '}';
    }
    
    
}

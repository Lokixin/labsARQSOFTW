/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.complexcalculator;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lokix
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // User input and prints
        /*Scanner sn = new Scanner(System.in);
        System.out.println("HOLA, escribe tu nombre: ");
        String entrada = sn.nextLine();
        System.out.println("Entrada: " + entrada);
        System.out.println("Escribe tu edad: ");
        int edad = sn.nextInt();*/
        
        int edad = 25;
        
        // If statements
        if(edad >= 18) {
            System.out.println("Eres mayor de edad!");
        }else if(edad  < 5){
            System.out.println("Eres un enano");
        }else {
            System.out.println("Eres menor de edad");
        }
        
        // Switch
        switch(edad){
            case 18: 
                System.out.println("Tienes 18 años");
                break;
            default:
                System.out.println("Tienes " + edad + " años");
        }
        // For loops
        int MAX = 10;
        for (int i = 0; i < MAX - 1; i+=2){
            System.out.println(String.format("El valor de i es: %d", i));
        }
        
        // While Loops
        int count = 0;
        while(count < MAX) {
            System.out.println(count++);
        }
        
        // Do While
        count = 0;
        do {
            System.out.println(count++);
        }while (count < MAX);
        
        // Arrays ["ARR", "AY"]
        String[] cars = {"Camaro", "Corvette", "Tesla"};
        System.out.println(cars[0]);
        cars[1] = "Peugeot";
        
        // Array constructor
        String[] fruits = new String[5];
        fruits[0] = "platano";
        fruits[1] = "melocoton";
        // For each
        for (String car : cars) {
            System.out.println("Car: " + car);
        }
        
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        // 2D Arrays
        String[][] cars2 = new String[3][3];
        cars2[0][0] = "Camaro";
        
        String[][] cars3 = {{"Aventador", "Diablo", "Murcielago"}, {"911", "Cayenne", "Panamera"}, {"Model-X", "Model-A", "Model-S"}};
        System.out.println("\n#######\n");
        for (String[] row : cars3) {
            for (String car : row) {
                System.out.println(car);
            }
            System.out.println("\n#######\n");
        }
        
        // String Methods
        // Some of them are: 
        String name = "Dimas";
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.equals("dimas"));
        System.out.println(name.indexOf("a"));
        System.out.println(name.replace("mas", "++"));
        
        // Array List
        System.out.println("\nArrayList Section\n");
        ArrayList<String> food = new ArrayList<>();
        
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        
        // Set removes the old value stored at the given index
        food.set(2, "sushi");
        
        food.forEach(meal -> System.out.println(meal));
        
        food.remove("sushi");
        food.forEach(meal -> {
            System.out.println("Meal: " + meal);
            System.out.println("Elemento número: " + food.indexOf(meal));
        });
        
        System.out.println("Las element: " + food.get(food.size()-1));
        
        // Methods invoking
        System.out.println("\nMETHODS\n");
        System.out.println(isEven(2));
        saludar("Dimas", 23);
        
        // Overloaded Methods
        System.out.println("\nOVERLOADING METHODS\n");
        
        System.out.println(add("Dimas", "Avila"));
        System.out.println(add(3, 4));
        
        // printf Method
        System.out.printf("\nUsing printf method %d\n", 555);
        System.out.printf("\nFloat decimals %+.2f\n", 555.43959034);
        
        // Constants
        System.out.println("\nCONSTANTS\n");
        final double PI = 3.141596;
        System.out.println(PI);
        
        
        // POO is starting here
        
        // Constructor, attributes and methods
        Human alberto = new Human("Alberto", 23, "48014003P", 75);
        alberto.sayHello();
        
        Human roberto = new Human("Roberto", 32, "48014003P", 75);
        roberto.engordar(10);
        
        // Constructor overload
        Pizza pixa = new Pizza("thick", "tomatoe", "mozzarella", "bacon");
        System.out.println(pixa);
        Pizza piza = new Pizza("thin", "tomatoe", "parmigiano");
        // Use of to string method
        System.out.println(piza);
        
        // STATIC modifier
        Pizza.displayPizzas(); 
        
        // Inheritance
        // Student constructor
        Student alfredo = new Student("Alfredo", 19, "48014003P", 67, "Standford", (float) 9.5, 10);
        // Student method
        alfredo.updateGPA(8);
        // Human method (inherited)
        alfredo.engordar(10);
        
        // Method overriding
        alfredo.sayHello();
        
    }
    
    // Methods
    static void saludar(String name, int age){
        System.out.println(String.format("Hola soy %s y tengo %d años", name, age));
    }
    
    static boolean isEven(int num){
        return (num % 2 == 0);
    }
    
    // Overloaded Methods
    
    static int add(int a, int b){
        System.out.println("Adding integers");
        return a + b;
    }
    
    static String add(String a, String b){
        System.out.println("Adding Strings");
        return a + " " + b;
    }
}

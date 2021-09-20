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
public class Human {
    
    String name;
    String dni;
    int age;
    float weight;
    
    Human(String name, int age, String dni, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dni = dni;
    }
    
    void sayHello(){
        System.out.println("Hello! I am " + this.name + " and I am " + this.age + " years old.");
    }
    
   
    void engordar(float kgs){
        this.weight += kgs;
        System.out.printf("El peso actual de %s es de %.2f kgs\n", this.name, this.weight);
    }
}

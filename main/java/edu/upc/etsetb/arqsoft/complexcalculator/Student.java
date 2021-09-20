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
public class Student extends Human {
    
    String university;
    float gpa;
    int subjectsPassed;
    
    public Student(String name, int age, String dni, float weight, String university, float gpa, int subjectsPassed) {
        super(name, age, dni, weight);
        this.university = university;
        this.gpa = gpa;
        this.subjectsPassed = subjectsPassed;
    }
    
    public void updateGPA(float newScore){
        this.gpa = (this.gpa * this.subjectsPassed + newScore) / (this.subjectsPassed + 1);
        this.subjectsPassed += 1;
        System.out.println("New GPA: " + this.gpa); 
    }
    
    @Override
    public void sayHello(){
        super.sayHello();
        System.out.println("And I study at " + this.university + " university");
    }
    
}

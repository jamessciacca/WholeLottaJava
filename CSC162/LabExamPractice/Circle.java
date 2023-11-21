package LabExamPractice;

import java.lang.Math;

//this will extend the Shpae class
public class Circle extends Shape {
    
    double radius;
    double area;

    //creating a default constuctor
    public Circle(){
        radius = 0.0;
    }

    //creating a constructor 
    public Circle(double radius){
        this.radius = radius;
    }

    //creating a copy constuctor 
    public Circle(Circle another){
        this(another.radius);
    }

    //creating a method to calculate the area 
    //area of a circle = pi(r^2)
    public double area(){
        double area = Math.PI * Math.sqrt(this.radius);
        return area;
    }

    //overriding the toString
    @Override
    public String toString(){
        //super.toString() will allow me to print the toString from the Shape class as well as the toString in the Circle class.
        return super.toString() + "Given a radius of: " + radius + ", The area of the circle is: " + area();
    }


}

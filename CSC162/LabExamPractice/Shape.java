package LabExamPractice;

public class Shape {

    String color;
    boolean filled;

    //creating a no arg constructor
    public Shape(){
        color = "";
        filled = true;
    }

    //creating a constructor 
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }  
    
    //creating setters and getters 
    public String getColor(){
        return color;
    }

    public boolean getFilled(){
        return filled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    //creating a toString to display the color and fill status
    public String toString(){
        return "Color: " + color + ", Filled: " + filled + ". ";
    }
}

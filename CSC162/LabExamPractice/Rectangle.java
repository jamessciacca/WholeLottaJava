package LabExamPractice;

public class Rectangle extends Shape {
    
    double width;
    double length;
    double area;

    //creating a default constructor
    public Rectangle(){
        width = 0.0;
        length = 0.0;
    }

    //creating constructor
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    //method to calculate the area
    public double area(){
        double area = this.width * this.length;
        return area;
    }

    //overriding the toString 
    @Override
    public String toString(){
        //super.toString() will allow me to print the toString from the Shape class as well as the toString in the Rectangle class.
        return super.toString() + "Given a width of: " + width + " and a length of: " + length + " the area of the rectangle is: " + area();
    }

    //creatiing an equals method to see if two rectangles are equal
    public boolean equals(Rectangle other){
        if(this.length == other.length && this.width == other.width){
            return true;
        }
        else{
            return false;
        }
    }




}

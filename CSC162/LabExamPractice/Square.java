package LabExamPractice;

public class Square extends Rectangle{
    
    double side;

    public Square(double side){
        this.side = side;
    }

    //creating a default constructor
    public Square(){
        side = 0.0;
    }

    public double area(){
        double area = Math.pow(this.side, 2);    
        return area;
    }
    
    public String toString(){
        return "Given a side length of: " + side + " the area of the Square is: " + area();
    }


}

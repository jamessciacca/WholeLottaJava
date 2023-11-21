public class Triangle extends GeometricObject{

    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    //creating a default no arg constructor 
    public Triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0; 
    }

    //creating a constructor 
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //creating accessor methods for all sides
    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public void setSide3(double side3){
        this.side3 = side3;
    }

    //creating a method to get the area of a triangle object
    //using Herons formula
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //creating a method to get the perimeter of a triangle
    public double getPerimeter(){
        double p = (side1 + side2 + side3);
        return p;
    }

    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

}
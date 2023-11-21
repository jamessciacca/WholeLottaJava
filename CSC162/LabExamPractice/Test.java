package LabExamPractice;

public class Test {
    public static void main(String []args){

       Circle circle = new Circle(5.0);
       Rectangle rectangle = new Rectangle(5.0, 4.0);
       Rectangle rectangle2 = new Rectangle(5.0, 4.0);
       Square square = new Square(10.0);

       //testing the copy constructor
       Circle circle1 = new Circle(circle);

       //testing the equals method
       boolean equals = rectangle.equals(rectangle2);

       //using getters and setters to set attributes
       circle.setColor("Blue");
       circle.setFilled(true);

       rectangle.setColor("Red");
       rectangle.setFilled(false);

       System.out.println(circle);
       System.out.println(circle1);
       System.out.println(rectangle);
       System.out.println(equals);
       System.out.println(square);


    }
}

public class Rectangle {

        //creating height and width variables 
        double width;
        double height;

        //creating a no arg constructor that makes a rectangle
        Rectangle(){
            width = 1;
            height = 1;
        }

        //constructor for a rectangle with a specific width and height
        Rectangle(double newWidth, double newHeight){
            width = newWidth;
            height = newHeight;
        }

        //creating the area class
        double getArea(){
            //returning the area
            return width * height;
        }

        //creating the perimeter class
        double getPerimeter(){
            return 2 * (width + height);
        }
    
}

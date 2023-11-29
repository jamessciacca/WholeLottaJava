package AbstractClasses;

public class Abstraction {
    public static void main(String[] args) {

        //An abstract class in Java is a class that cannot be instantiated. It is used to provide a common base class for other classes. Abstract classes can contain abstract methods, which are methods that do not have a body. These methods must be implemented by the subclasses.  

        //this doesn't work because you cant instantiate an object from an abstract class
        //Dog dog = new Dog();
        //dog.Bark();

        //now that we created a subclass Beagle, we can use the method from the abstrat class on our Beagle object
        Beagle b = new Beagle();
        b.bark();
        b.poop();
    }
}

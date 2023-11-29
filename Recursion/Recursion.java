package transfer.Recursion;

public class Recursion {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        recursion.sayHi();
    }

    public void sayHi(){
        System.out.println("hi!");

        //the method will call itself!
        // Be careful, this will cause an infinite loop
        // sayHi();
    }
}

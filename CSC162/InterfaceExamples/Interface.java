package InterfaceExamples;

//an interface is written as shown
interface WaterBottle {

    String color = "Blue";

    void fillUp();

}

// if a class implements an interface it must have the attributes of the
// interface
public class Interface implements WaterBottle {
    // an interface is an outline for a class
    public static void main(String[] args) {
        System.out.println(color);
        Interface ex = new Interface();
        ex.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("Filled");
    }
}

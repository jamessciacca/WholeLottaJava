package ExceptionHandling;

public class Throw {
    public static void main(String[] args) {
        try {
            throw new Exception("This is a custom exception message");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

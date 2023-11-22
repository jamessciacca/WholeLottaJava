package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        
        //int[] a = {4, 5, 1};
        //if we call index three we get an error
        //System.out.println(a[3]);

        try{
            int[] a = {4, 5, 1};
            //if we call index three we get an error
            System.out.println(a[3]);
        } catch(Exception e){
            System.out.println("out of bounds!!!");
        }
    }
}

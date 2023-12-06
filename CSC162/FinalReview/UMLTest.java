package FinalReview;

public class UMLTest {
    public static void main(String[] args) {
        
        UMLPractice obj1 = new UMLPractice("Java", 9, 40);

        UMLPractice obj2 = new UMLPractice("Java", 2, 23);

        obj1.setCodedLanguage("Python");

        System.out.println(UMLPractice.getCount());

        System.out.println(obj1.getTimeLimit());

        System.out.println(obj2);
    }
}

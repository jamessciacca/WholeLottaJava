public class PersonTest {
    public static void main(String[] args){

        //creating a person using the default constructor
        Person Baby = new Person();
        

        //creating 3 people using the person constructor
        Person James = new Person("James", 20, "New Jersey");
        Person Ashley = new Person("Ashley", 30, "California");
        Person Chris = new Person("Chris", 53,  "Idaho");

        //testing setter
        James.setName("Jim");
        
        //testing getter 
        System.out.println(Chris.getState());

        //creating a copy of Crhis
        Person Copy = new Person(Chris);
        Copy.setAge(4);

        //testing the equals method
        if(Chris.equals(Copy)){
            System.out.println("Chris = Copy");
        }
        else{
             System.out.println("Chris does not = Copy");
        }

        Baby.setName("NEW");
        Baby.setAge(40);
        Baby.setState("Maine");

        System.out.println(Baby);
        System.out.println(James);
        System.out.println(Ashley);
        System.out.println(Chris);
        System.out.println(Copy);





        


    }
}

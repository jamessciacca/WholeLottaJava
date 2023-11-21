//class practice 
public class Person {
    
    //creating a person with a name, age, and state
    private String name;
    private int age;
    private String state;

    //creating a default constructor 
    public Person(){
        name = "";
        age = 0;
        state = "";
    }

    //creating a constructor, to create an instance of a person
    public Person(String name, int age, String state){
        this.name = name;
        this.age = age;
        this.state = state;
    }

    //Creating Basic Setters and Getters for all variables

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setState(String state){
        this.state = state;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getState(){
        return state;
    }

    //equals method to check if one person is the same as another 
    public boolean equals(Person otherPerson) {
        if (otherPerson == null) {
            return false;
        }
        if (getClass() != otherPerson.getClass()) {
            return false;
        }
        final Person other = (Person) otherPerson;
        if (!name.equals(other.name)) {
            return false;
        }
        if (age != other.age) {
            return false;
        }
        return true;
    }

    //creating a toString constructor to format
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", State: " + state;
    }

    //creating a copy constructor to copy a person object
    public Person(Person other){
        this.name = other.name;
        this.age = other.age;
        this.state = other.state;
    }

}

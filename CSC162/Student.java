//personal practice file
public class Student {
    //intializing a student with a name, major, and GPA
    String name;
    String major;
    double gpa = 0.0;
    String year;

    //setting up a no arg constructor 
    

    //setting up a constuctor to create a student 
    public Student(String name, String major, double gpa, String year){
        this.name = name;
        this.major = major;
        this.gpa = gpa;
        this.year = year;
    }

    //creating a to string method, this converts the student object into a printable string
    public String toString(){
        return "Name: " + name + ", Major: " + major + ", GPA: " + gpa + ", Year: " + year;
    }

    //creating setters for our three variables
    public void setName(String name){
        this.name = name;
    }

    //creating a setter for the major
    public void setMajor(String major){
        this.major = major;
    }

    //creating a setter for the gpa
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    //creating a setter for the year
    public void setYear(String year){
        this.year = year;
    }

    //creating a getter for the gpa
    public double getGpa(){
        return gpa;
    }

    //getter for student name 
    public String getName(){
        return name;
    }

    //

}

public class StudentTest {

    public static void main(String[] args){

        //creating new students 
        Student James = new Student("James", "Computer Science", 4.0, "Freshman");
        Student Julie = new Student("Julie", "Computer Science", 4.0, "Freshman");

        //adding the students to an array
        Student[] students = {James, Julie};
        
        //using our setters from student class to change the name, major, and gpa
       James.setName("Jama");
       James.setMajor("Math");
       James.setGpa(3.45);
       James.setYear("Sophmore");
       Julie.setGpa(3.87);

       //printing student
       System.out.println(James);
       System.out.println(Julie);

       //getting all students gpa using a for loop and using the getName to print their name witht he corresponding gpa
       for(int i = 0; i < students.length; i++){
            System.out.println("Student " + students[i].getName() + "'s GPA: " + students[i].getGpa());
       }
    }
}

package FinalReview2;

public class Student extends Person{
    
    public long sID;

    public Student(String name, char type, long sID){
        super(name, type);
        this.sID = sID;
    }

    @Override
    public String toString() {
        return name + " " + type + " " + sID;
    }
    
}

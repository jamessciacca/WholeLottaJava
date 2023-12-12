package FinalReview2;

public class Faculty extends Person{
    
    public int fID;

    public Faculty(String name, char type, int fID){
        super(name, type);
        this.fID = fID;
    }

    @Override
    public String toString() {
        return name + " " + type + " " + fID;
    }
}

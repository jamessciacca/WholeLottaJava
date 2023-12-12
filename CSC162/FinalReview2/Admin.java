package FinalReview2;

public class Admin extends Person{
    
    public String aID;

    public Admin(String name, char type, String aID){
        super(name, type);
        this.aID = aID;
    }

    @Override
    public String toString() {
        return name + " " + type + " " + aID;
    }
}

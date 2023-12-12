package FinalReview2;

public class Person implements Comparable<Person>{
    protected String name;
    protected char type;

    public Person(){
        name = "";
        type = ' ';
    }

    public Person(String name, char type){
        this.name = name;
        this.type = type;
    }

    @Override
    public int compareTo(Person other){
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Character.compare(this.type, other.type);
        }
    }

    public String toString(){
        return this.name + " " + this.type + " ";
    }
}

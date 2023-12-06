package FinalReview;

public class UMLPractice {
    
    private String codedLanguage;
    private int programmingLevel;
    private int timeLimit;
    private static int count = 0;

    //constructor 
    public UMLPractice(String codedLanguage, int programminglevel, int timeLimit){
        this.codedLanguage = codedLanguage;
        this.programmingLevel = programminglevel;
        this.timeLimit = timeLimit;
        count++;
    }

    //setters
    public void setCodedLanguage(String codedLanguage){
        this.codedLanguage = codedLanguage;
    }

    public void setProgrammingLevel(int programmingLevel){
        this.programmingLevel = programmingLevel;
    }

    public void setTimeLimit(int timeLimit){
        this.timeLimit = timeLimit;
    }

    public String getCodedLanguage(){
        return this.codedLanguage;
    }

    public int getProgrammigLevel(){
        return this.programmingLevel;
    }

    public int getTimeLimit(){
        return this.timeLimit;
    }

    public static int getCount(){
        return count;
    }

    public String toString(){
        return codedLanguage + ", " + programmingLevel + ", " + timeLimit;
    }
}

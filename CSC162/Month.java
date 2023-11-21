public class Month {

    int monthNumber;
    String monthName;
    public static int count = 0;

    //a no arg constructor
    public Month(){
        monthNumber = 1;
    }

    public void MonthNum(int monthNumber){
        
        this.monthNumber = monthNumber;

        count++;

        if(monthNumber < 1 || monthNumber > 12){
            monthNumber = 1;
        }
    }

    public void MonthName(String monthName){

        if(monthName == "January"){
            monthNumber = 1;
        }
        else if(monthName == "February"){
            monthNumber = 2;
        }
        else if(monthName == "March"){
            monthNumber = 3;
        }
        else if(monthName == "April"){
            monthNumber = 4;
        }
        else if(monthName == "May"){
            monthNumber = 5;
        }
        else if(monthName == "June"){
            monthNumber = 6;
        }
        else if(monthName == "July"){
            monthNumber = 7;
        }
        else if(monthName == "August"){
            monthNumber = 8;
        }
        else if(monthName == "September"){
            monthNumber = 9;
        }
        else if(monthName == "October"){
            monthNumber = 10;
        }
        else if(monthName == "November"){
            monthNumber = 11;
        }
        else if(monthName == "December"){
            monthNumber = 12;
        }
    }

    public Month(Month other){
        this.monthNumber = 1;
    }

    public void setMonthNumber(int monthNumber){
        this.monthNumber = monthNumber;

        if(monthNumber < 1 || monthNumber > 12){
            monthNumber = 1;
        }
    }
    
    public int  getMonthNumber(){
        return monthNumber;
    }

    public String getMonthName(){
        String[] monthNames = {"January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"};
        if(monthNumber < 1 || monthNumber > 12){
            monthNumber = 1;
        }
        return monthNames[monthNumber - 1];
    }

    @Override
public String toString() {
    return getMonthName();
}

public boolean equals(Month otherMonth) {
    if (otherMonth == null) {
        return false;
    }
    return this.monthNumber == otherMonth.monthNumber;
}

public boolean greaterThan(Month otherMonth){
    if(otherMonth.monthNumber > this.monthNumber){
        return true;
    }
    else{
        return false;
    }
}

public boolean lesstThan(Month otherMonth){
    if(otherMonth.monthNumber < this.monthNumber){
        return true;
    }
    else{
        return false;
    }
}

public static int getCount() {
    return count;
}


}



public class Clock {

    //intializing variables, this ensures that a new Clock object will have a time of 00:00::00
    int hours = 0;
    int minutes = 0;
    int seconds = 0;

    //-----------------------------------------------------------------------------------------------
    //intializing the variables to a time entered by the user
    //we will not ask the user for the values in this class, but in the ClockTest file!
    //creating a constructor that takes in arguments 
    public Clock(int hours, int minutes, int seconds){
        //using the this keyword to assign the varibales to the users entered amounts
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    //------------------------------------------------------------------------------------------------

    //creating a setter that will change existing objects time!
    public void setTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    //-----------------------------------------------------------------------------------------------
    //methods that will simply increment the hour, minute, or second by 1
    public void addSecond(){
        seconds++;
        //checking if seconds is = 60 and making it 0 if thats true
        if(seconds == 60){
            seconds = 0;
        }
    }

    public void addMinute(){
        minutes++;
        //checking if minutes is = 60 and making it 0 if thats true
        if(minutes == 60){
            minutes = 0;
        }
    }

    public void addHour(){
        hours++;
        //checking if hours is = 12 and making it 1 if thats true
        if(hours > 12 || hours > 24){
            hours = 1;
        }
    }

    //method that will return the time
    public String getTime() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public String setTime() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    //creating a copy constructor, this literally just copies the values of an existing object
    public Clock(Clock other) {
        this.hours = other.hours;
        this.minutes = other.minutes;
        this.seconds = other.seconds;
    }

//creating an equals method to compare two times
    public boolean equals(Clock other){
        if (this.hours == other.hours && this.minutes == other.minutes && this.seconds == other.seconds) {
            return true;
        } else {
            return false;
        }
    }

    //creating a toString method 
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

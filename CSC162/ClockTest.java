public class ClockTest {

    public static void main(String[] args){

        //creating a new Clock Object
        Clock clock1 = new Clock(0, 0, 0);
        Clock clock2 = new Clock(8, 15, 59);
        Clock clock3 = new Clock(11, 59, 59);
        //creating a copy of an object using our copy constructor
        Clock clock4 = new Clock(clock1);

        //setting a string variable = to our clock object so we can get our formated time returned
        String time1 = clock1.getTime();
        String time2 = clock2.getTime();
        String time3 = clock3.getTime();
        String time4 = clock4.getTime();


        //Printing times!
        System.out.println("Current time: " + time1);
        System.out.println("Current time: " + time2);
        System.out.println("Current time: " + time3);
        System.out.println("Current time (copy constructor): " + time4);
        
        //setting the first clock = to 12:30:00
        clock1.setTime(12, 30, 00);
        String newTime = clock1.setTime();
        System.out.println("New time (Clock1): " + newTime);

        //incremeting the hours, minutes, and seconds of clock 1
        clock1.addHour();
        clock1.addMinute();
        clock1.addSecond();

        String incrementClock1 = clock1.getTime();
        System.out.println("Incremented time: " + incrementClock1);

        //incremeting the hours, minutes, and seconds of clock 2
        clock2.addHour();
        clock2.addMinute();
        clock2.addSecond();

        String incrementClock2 = clock2.getTime();
        System.out.println("Incremented time: " + incrementClock2);

        //using the equals method to compare clock1 and 4
        if (clock1.equals(clock4)) {
            System.out.println("The two clocks are equal.");
        } else {
            System.out.println("The two clocks are not equal");
        }

        //printing clocks 1 and 4 using the toString method!
        System.out.println(clock1.toString());
        System.out.println(clock4.toString());




    }
}


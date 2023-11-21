public class MonthTest {
    public static void main(String []args){

        //creating month objectsw
        Month month1 = new Month();
        Month month2 = new Month();

        month1.MonthNum(1);

        month2.MonthName("February");
        
        System.out.println(month1);
        System.out.println(month2);
        System.out.println(month2.monthNumber);

        //using the copy constructor 
        Month month3 = new Month(month1);


        month3.setMonthNumber(8);

        System.out.println(month3);

        if(month3.equals(month2)){
            System.out.println("Equal!!!");
        }
        else{
            System.out.println("Not Equal!!!");
        }

        if (month1.greaterThan(month2)) {
            System.out.println("month1 is greater than 2.");
        } else {
            System.out.println("month1 is not greater than 2.");
        }


    }
}

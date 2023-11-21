import java.util.Random;

public class QuizThree {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        double[][] array = new double[12][6];

        //intializing the array using the random numbers that were assigned
        for (int i = 0; i < 12; i++) {
            array[i][0] = i;
            array[i][1] = rand.nextDouble() * 13 + 101;
            array[i][2] = rand.nextDouble() * 13 + 62;
            array[i][3] = rand.nextDouble() * 9 + 235;
            array[i][4] = rand.nextDouble() * 8 + 89;
        }

        //calculating the data for each column
        for (int i = 0; i < 12; i++) {
            double avg = (array[i][1] + array[i][2] + array[i][3] + array[i][4]) / 4;
            array[i][5] = avg;
        }

        //finally printing the array
        System.out.println("Month\t\tLowes\t\tAmazon\t\tWalmart\t\tTarget\t\tAverage");
        for (int i = 0; i < 12; i++) {
            System.out.print(months[(int) array[i][0]] + "\t\t");
        for (int j = 1; j < 6; j++) {
            System.out.printf("%.2f\t\t", array[i][j]);
    }
    System.out.println();
}
    }
}
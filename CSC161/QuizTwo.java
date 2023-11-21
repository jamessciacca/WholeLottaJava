//pseudo code fo the program
//first I need to generate the random test scores
//then I need to generate the random student IDs
//I need to print the report
//next I need to avberage the scores 
//i have to find the corresponding letter grade
//then i need to find the status of the students
//average out the total and put the letter grade and class status
//finally i need to print the final report

public class QuizTwo {
    public static void main(String[] args) {
        //generating random test scores
        int[] testOne = generateRandomScores(5);
        int[] testTwo = generateRandomScores(5);
        int[] testThree = generateRandomScores(5);
        //generating random student IDs
        int[] studentIDs = generateRandomStudentIDs(5);
        //printing out grade report
        printGradeReport(studentIDs, testOne, testTwo, testThree);
    }
    
    //method to print out grade report
    public static void printGradeReport(int[] studentIDs, int[] testOne, int[] testTwo, int[] testThree) {
        System.out.println("Class Report");
        System.out.println("Student Number    Test One    Test Two    Test Three    Average    Grade    Status");
        System.out.println("=============    =======    =======    =========    =======    =====    ======");
        
        int classTotal = 0;
        
        for (int i = 0; i < studentIDs.length; i++) {
            //calculating the average score
            double average = (testOne[i] + testTwo[i] + testThree[i]) / 3.0;
            //finding the letter grade
            String letterGrade = getLetterGrade(average);
            //determining the student status
            String status = getStatus(letterGrade);
            //printing out the grade report
            System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%.2f\t\t%s\t\t%s\n", 
                                studentIDs[i],
                                testOne[i],
                                testTwo[i],
                                testThree[i],
                                average,
                                letterGrade,
                                status);
            //adding the average to the class total
            classTotal += average;
        }
        
        //calculating the class average
        double classAverage = (double) classTotal / studentIDs.length;
        //calculating the letter grade
        String letterGrade = getLetterGrade(classAverage);
        //calculating the student status
        String status = getStatus(letterGrade);
        //printing out the grade report
        System.out.printf("Class Average\t\t%.2f\t\t%s\t\t%s\n", 
                            classAverage,
                            letterGrade,
                            status);   
    }
    
    //method to find the letter grade
    public static String getLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    //method to determine the student status
    public static String getStatus(String letterGrade) {
        if (letterGrade.equals("A")) {
            return "Excellent";
        } else if (letterGrade.equals("B")) {
            return "Good";
        } else if (letterGrade.equals("C")) {
            return "Satisfactory";
        } else if (letterGrade.equals("D")) {
            return "Poor";
        } else {
            return "Fail";
        }
    }
    
    //i used array class because I couldnt think of a soulution without using it
    //method to generate random test scores
    public static int[] generateRandomScores(int numScores) {
        //generating random scores between 0-100
        int[] scores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            scores[i] = (int) (Math.random() * 100);
        }
        return scores;
    }
    
    //method to generate random 5-digit student IDs
    public static int[] generateRandomStudentIDs(int numIDs) {
        //generating random 5-digit student IDs
        int[] ids = new int[numIDs];
        for (int i = 0; i < numIDs; i++) {
            ids[i] = (int) (Math.random() * 100000);
        }
        return ids;
    }
}

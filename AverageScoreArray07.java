
import java.util.Scanner;

public class AverageScoreArray07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        int[] studentScores = new int[n];
        int total = 0;
        int passed = 0;
        double average;

        for (int i = 0; i < studentScores.length; i++) {
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            studentScores[i] = input.nextInt();

            total += studentScores[i];

            if (studentScores[i] > 70) {
                passed++;
            }
        }

        average = (double) total / studentScores.length;

        int highest = studentScores[0];
        int lowest = studentScores[0];

        for (int i = 1; i < studentScores.length; i++) {
            if (studentScores[i] > highest) {
                highest = studentScores[i];
            }

            if (studentScores[i] < lowest) {
                lowest = studentScores[i];
            }
        }

        String category;

        if (average >= 85) {
            category = "EXCELLENT";
        } else if (average >= 70) {
            category = "GOOD";
        } else {
            category = "NEEDS IMPROVEMENT";
        }

        System.out.println("\nTotal Score: " + total);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Students Passed: " + passed);
        System.out.println("Class Grade Category: " + category);

        input.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Experiment2Question3 {
    public static void main(String[] args) {
        int[] finalScores = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < finalScores.length; i++) {
            System.out.print("Enter score for student #" + (i + 1) + ": ");
            finalScores[i] = input.nextInt();
        }

        int studentNumber = 1;

        for (int score : finalScores) {
            String status = (score > 70) ? "PASS" : "FAIL";

            System.out.println("Student #" + studentNumber
                    + " score: " + score + " - " + status);

            studentNumber++;
        }
    }
}
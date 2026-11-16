import java.util.Arrays;
import java.util.Scanner;

public class Experiment2Question2 {
    public static void main(String[] args) {
        int[] finalScores = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < finalScores.length; i++) {
            System.out.print("Enter score for student #" + (i + 1) + ": ");
            finalScores[i] = input.nextInt();
        }

        for (int i = 0; i < finalScores.length; i++) {
            if (finalScores[i] > 70) {
                System.out.println("Student #" + (i + 1)
                        + " score: " + finalScores[i] + " - PASS");
            }
        }
    }
}

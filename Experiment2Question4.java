
import java.util.Scanner;

public class Experiment2Question4 {
    public static void main(String[] args) {
        int[] finalScores = new int[10];
        Scanner input = new Scanner(System.in);

        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < finalScores.length; i++) {
            System.out.print("Enter score for student #" + (i + 1) + ": ");
            finalScores[i] = input.nextInt();
        }

        for (int i = 0; i < finalScores.length; i++) {
            if (finalScores[i] > 70) {
                System.out.println("Student #" + (i + 1)
                        + " score: " + finalScores[i] + " - PASS");
                passCount++;
            } else {
                System.out.println("Student #" + (i + 1)
                        + " score: " + finalScores[i] + " - FAIL");
                failCount++;
            }
        }

        System.out.println("\nTotal students passed: " + passCount);
        System.out.println("Total students failed: " + failCount);
    }
}

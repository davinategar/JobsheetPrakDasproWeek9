
import java.util.Scanner;

public class ScoreSearch07PartA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of scores: ");
        int n = input.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score #" + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        System.out.print("Enter the score to search for: ");
        int key = input.nextInt();

        boolean found = false;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == key) {
                System.out.println("Score " + key +
                    " was found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The value " + key +
                " was not found in the scores array.");
        }

        input.close();
    }
}

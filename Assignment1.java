import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("input the score to-" + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }

        int total = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 0; i < n; i++) {
            total += scores[i];
            if (scores[i] > highest) highest = scores[i];
            if (scores[i] < lowest) lowest = scores[i];
        }

        double average = (double) total / n;

        System.out.println("\naverage : " + average);
        System.out.println("highest : " + highest);
        System.out.println("lowest  : " + lowest);

        System.out.println("\nScore Data:");
        for (int i = 0; i < n; i++) {
            String status = (scores[i] >= 60) ? "PASS" : "FAIL";
            System.out.println("student " + (i + 1) + ": " + scores[i] + " -> " + status);
        }
    }
}
package decision_structures;

import java.util.Scanner;

/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */
public class TestResults {
    public static void main(String[] args) {
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        char grade;
        if (score < 60) {
           grade = 'F';
        } else if (score < 70) {
           grade = 'D';
        } else if (score < 80) {
           grade = 'C';
        } else if (score < 90) {
           grade = 'B';
        } else {
           grade = 'A';
        }

       System.out.println("Your grade is " + grade + ".");
    }
}

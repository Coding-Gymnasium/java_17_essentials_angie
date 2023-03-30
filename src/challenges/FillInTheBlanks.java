package challenges;

import java.util.Scanner;

public class FillInTheBlanks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get season
        String season;
        System.out.println("What season do you drink most water?");
        season = scanner.next();

        // Get adjective
        String adjective;
        System.out.println("Use and adjective to describe the season");
        adjective = scanner.next();

        // Get number
        int number;
        System.out.println("How many cups of coffee do you drink in this season?");
        number = scanner.nextInt();

        scanner.close();

        // Display results
        System.out.println("On a(n) " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
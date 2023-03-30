package challenges;

import java.util.Scanner;

public class fill_in_the_blank {
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
        System.out.println("How mamy cups of water do you drink in this season?");
        number = scanner.nextInt();

        // Display results
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
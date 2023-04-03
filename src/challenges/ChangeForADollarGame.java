package challenges;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pennies;
        int nickels;
        int dimes;
        int quarters;

        // Explain rules
        System.out.println("Welcome to 'Change for a Dollar'!" + "\n" + "Your goal is to enter enough change to make exactly $1.00");

        // Ask for pennies
        System.out.println("Enter your number of pennies:");
        pennies = scanner.nextInt();


        // Ask for nickels
        System.out.println("Enter your number of nickels:");
        nickels = 5 * scanner.nextInt();

        // Ask for dimes
        System.out.println("Enter your number of dimes:");
        dimes = 10 * scanner.nextInt();

        // Ask for quarters
        System.out.println("Enter your number of quarters:");
        quarters = 25 * scanner.nextInt();

        scanner.close();

        // Calculate and announce result
        int sum = pennies + nickels + dimes + quarters;
        String message;
        if (sum > 100) {
            message = "You were over by " + (sum - 100) + " cents";
        } else if (sum < 100) {
            message = "You were short by " + (100 - sum) + " cents";
        } else {
            message = "You Won!!! 🎉";
        }
        System.out.println(message);
    }

}

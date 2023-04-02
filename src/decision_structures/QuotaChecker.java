package decision_structures;

import java.util.Scanner;

public class QuotaChecker {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota) {
            System.out.println("Congrats! You've met your quota.");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("Darn! You didn't meet your quota. You were " + salesShort + " sales short");
        }
    }
}

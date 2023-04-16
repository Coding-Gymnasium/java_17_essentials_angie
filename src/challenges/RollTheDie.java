package challenges;

import java.util.Random;
import java.util.Scanner;

public class RollTheDie {
    public static void main(String[] args) {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for (int i = 0; i <maxRolls ; i++) {
            int die = random.nextInt(6) + 1;
           currentSpace = currentSpace + die;

           System.out.print(String.format("Roll #%d: you rolled a %d.", i, die));

           if (currentSpace == lastSpace){
               System.out.print("You are on space " + currentSpace + ". Congrats you wing!");
               break;
           } else if (currentSpace > lastSpace) {
                System.out.print("You landed past " + lastSpace + ". You lost");
                break;
           } else if (i == maxRolls && currentSpace < lastSpace) {
              System.out.print("You are on space " + currentSpace + ".");
              System.out.print("You didn't make it to" + lastSpace + ". You lost");
           } else {
               int spacesToGo = lastSpace - currentSpace;
               System.out.print("You are now on space " + currentSpace + " and have " + spacesToGo + " more to go");
           }
           System.out.println();
        }
    }
}

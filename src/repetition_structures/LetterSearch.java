package repetition_structures;

import java.util.Scanner;

/*
 * BREAK STATEMENT
 * Search a String to determine if it contains the letter 'A'.
 */
public class LetterSearch {

    public static void main(String[] args){

        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter A
        for (int i = 0; i < text.length() ; i++) {
            char curentLetter = text.charAt(i);
            if (curentLetter == 'A' || curentLetter == 'a'){
                letterFound = true;
                break;
            }
        }



        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}
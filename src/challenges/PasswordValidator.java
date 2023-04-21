package challenges;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter username:");
        String username = scanner.next();
        System.out.println("Enter current password");
        String currentPassword = scanner.next();
        System.out.println("""
                Enter new password.
                Requirements:
                * must be at least 8 characters long,
                * must contain an uppercase letter,
                * must contain a special character,
                * must not contain username in it,
                * must be different from previous passwords
                """);
        String password = scanner.next();

        validatePassword(password, currentPassword, username);
//        validatePassword(password, "ABC_1234", "johndoe");

    }

    public static boolean checkLength(String password) {
        return password.length() >= 8;
    }

    public static boolean checkForUppercase(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                count++;
                break;
            }
        }
        return count > 0;
    }

    public static boolean checkForSpecialCharacter(String password) {
        Pattern regex = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        return regex.matcher(password).find();
    }

    public static boolean checkPasswordUnique(String currentPassword, String password) {
        return !currentPassword.equals(password);
    }

    public static boolean checkDoesNotIncludeUsername(String username, String password) {
        String usrLowerCase = username.toLowerCase();
        String psswrdLowerCase = password.toLowerCase();
        return !psswrdLowerCase.contains(usrLowerCase);
    }

    public static Password validatePassword(String password, String currentPassword, String username) {
        if (
                checkLength(password) &&
                        checkForUppercase(password) &&
                        checkForSpecialCharacter(password) &&
                        checkPasswordUnique(currentPassword, password) &&
                        checkDoesNotIncludeUsername(username, password)
        ) {
            System.out.println("🎉 Password Created");
            return new Password(password);

        } else {
            System.out.println("🚨 could not create password");
        }

        return null;
    }
}

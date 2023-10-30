package com.ExceptionHandling;
import java.util.Scanner;

public class UsernameValidator2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            String result = checkUsername(username);
            System.out.println(result);
        }

        scanner.close();
    }

    public static String checkUsername(String username) {
        // Check length
        if (username.length() >= 5 && username.length() <= 10) {
            // Check for at least one letter
            if (containsLetter(username)) {
                // Check for at least one digit
                if (containsDigit(username)) {
                    // Check for at least one of @#*=
                    if (containsSpecialChar(username)) {
                        // Check for no spaces
                        if (!containsSpace(username)) {
                            return "PASS";
                        }
                    }
                }
            }
        }
        return "FAIL";
    }

    private static boolean containsLetter(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSpecialChar(String str) {
        for (char c : str.toCharArray()) {
            if (c == '@' || c == '#' || c == '*' || c == '=') {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSpace(String str) {
        return str.contains(" ");
    }
}

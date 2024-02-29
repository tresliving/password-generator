import java.util.*;

public class PasswordGenerator {

    // Method to generate a random password
    public static String newPassword(int length, boolean useLetters, boolean useNumbers, boolean useSpecial) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%&*";
        
        StringBuilder password = new StringBuilder(); // Corrected line
        Random random = new Random();
        
        // Characters pool based on user choice
        String charPool = "";
        if (useLetters) {
            charPool += letters;
        }
        if (useNumbers) {
            charPool += numbers;
        }
        if (useSpecial) {
            charPool += specialChars;
        }
        
        // Generate random password
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }
        
        return password.toString();
    }

    public static void main(String[] args) {
        // Example usage
        int length = 12; // Desired password length
        boolean useLetters = true;
        boolean useNumbers = true;
        boolean useSpecial = true;

        String password = newPassword(length, useLetters, useNumbers, useSpecial);
        System.out.println("New Password: " + password); // Updated line
    }
}

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CredentialService extends ITSupport{
    CredentialService(String fname, String lname, String dept) {
        super(fname, lname, dept);
    }
    public static String generatePassword() {
        String UPPER_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LOWER_CHARS = "abcdefghijklmnopqrstuvwxyz";
        String NUMBERS = "0123456789";
        String SPECIAL_CHARS = "!@#$%^&*()-_+=<>?";
        SecureRandom random = new SecureRandom();
        String combinedChars = UPPER_CHARS + LOWER_CHARS + NUMBERS + SPECIAL_CHARS;
        List<Character> passwordChars = new ArrayList<>();

        // Ensure at least one character of each type is included

        passwordChars.add(UPPER_CHARS.charAt(random.nextInt(UPPER_CHARS.length())));
        passwordChars.add(LOWER_CHARS.charAt(random.nextInt(LOWER_CHARS.length())));
        passwordChars.add(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        passwordChars.add(SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length())));

        // Fill the remaining spots with random characters
        for (int i = passwordChars.size(); i <6; i++) {
            passwordChars.add(combinedChars.charAt(random.nextInt(combinedChars.length())));
        }

        // Shuffle the characters for unpredictability
        Collections.shuffle(passwordChars, random);

        // Build the final password string
        StringBuilder password = new StringBuilder(6);
        for (char ch : passwordChars) {
            password.append(ch);
        }

        return password.toString();
    }
    public void generateCredentials() {
        String email = getFirstName() + getLastName() + "@" + getDept() + ".ford.com";
        String password = generatePassword(); // Using the generatePassword method from ITSupport
        System.out.println("Generated credentials for " + getFirstName() + " " + getLastName() + ":");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
    public static void main(String[] args) {
        CredentialService credentialService = new CredentialService("John", "Doe", "tech");
        credentialService.generateCredentials();
    }
}
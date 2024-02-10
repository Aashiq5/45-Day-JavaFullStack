import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

class ITSupport {
    private String firstName;
    private String lastName;
    private String dept;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    ITSupport(String fname, String lname, String dept) {
        firstName = fname;
        lastName = lname;
        this.dept = dept;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ITSupport> staffList = new ArrayList<>();

        System.out.println("Enter IT support staff details. Type 'exit' to finish.");
        String fname,lname;

        while (true) {
            System.out.print("Enter first name: ");
            fname = sc.nextLine();
            if ("exit".equalsIgnoreCase(fname)) {
                break;
            }

            System.out.print("Enter last name: ");
            lname = sc.nextLine();
            int dept;
            do {
                System.out.print("Enter department:\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal\n");
                dept = sc.nextInt();
            } while (dept > 4);
            String deptname;
            deptname = switch (dept){
                case 1 -> "tech";

                case 2 -> "admin";

                case 3 -> "hr";

                case 4 -> "legal";
                default -> "";
            };

            ITSupport staffMember = new ITSupport(fname, lname, deptname);
            staffList.add(staffMember);

            System.out.println("New IT support staff added: " + staffMember);
        }

        sc.close();

        // Optionally, print out all staff members added to the list
        System.out.println("\nList of IT support staff:");
        for (ITSupport staff : staffList) {
            System.out.println(staff);
        }
    }
}

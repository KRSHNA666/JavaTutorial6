import java.util.Scanner;

public class LicenseRegistration {

    // Method to check eligibility
    public static void checkEligibility(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Applicant is underage. Minimum age required is 18.");
        }
        System.out.println("Eligible for driving license registration.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Delegate to eligibility method
            checkEligibility(age);

            System.out.println("Registration process started...");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for visiting the License Registration System.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String validUsername = "admin";
        String validPassword = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("✅ Login successful! Welcome " + username);
        } else {
            System.out.println("❌ Invalid username or password.");
        }

        scanner.close();
    }
}

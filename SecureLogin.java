import java.util.Scanner;
import java.security.MessageDigest;

public class SecureLogin {

    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String storedUsername = "admin";
        String storedPasswordHash = hashPassword("12345");

        int attempts = 3;

        while(attempts > 0) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            String inputHash = hashPassword(password);

            if(username.equals(storedUsername) && inputHash.equals(storedPasswordHash)) {
                System.out.println("Login Successful");
                break;
            } else {
                attempts--;
                System.out.println("Invalid Credentials. Attempts left: " + attempts);
            }
        }

        if(attempts == 0) {
            System.out.println("Account Locked.");
        }

        sc.close();
    }
}
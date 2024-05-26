
import java.util.Base64;
import java.util.Random;
import java.util.Scanner;

public class password_generator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String pass = generatePassword(scanner);
            byte[] encrypt = Base64.getEncoder().encode(pass.getBytes());
            System.out.print("Do you want to encrypt the password (y/n) : ");
            String s = scanner.next();
            if (s.equalsIgnoreCase("y")) {
                System.out.println("Encrypted password : " + new String(encrypt));
            }

            System.out.print("Do you want to generate another password (y/n)? ");
            String run = scanner.next();
            if (!run.equalsIgnoreCase("y")) {
                break;
            }
        }
        scanner.close();
    }

    public static String generatePassword(Scanner scanner) {
        System.out.print("Enter the password length: ");
        int length = scanner.nextInt();

        StringBuilder list = new StringBuilder();

        System.out.println(
                "Choose a combination of random characters to generate a password of the specified length from the options below:");
        System.out.println("1. Letters");
        System.out.println("2. Digits");
        System.out.println("3. Special characters");
        System.out.println("4. Exit");

        while (true) {
            System.out.print("Pick a number from the options above: ");
            int pick = scanner.nextInt();
            if (pick == 1) {
                list.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
            } else if (pick == 2) {
                list.append("0123456789");
            } else if (pick == 3) {
                list.append("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~");
            } else if (pick == 4) {
                break;
            } else {
                System.out.println("Enter a valid number");
            }
        }

        String password = generateRandomPassword(list.toString(), length);
        System.out.println("The Strong password is: " + password);
        return password;
    }

    public static String generateRandomPassword(String list, int length) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(list.length());
            password.append(list.charAt(index));
        }
        return password.toString();
    }
}

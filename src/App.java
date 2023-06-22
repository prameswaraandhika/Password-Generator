import java.util.Random;
import java.util.Scanner;

public class App {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doGenerated;

        do {
            System.out.print("Input password length: ");
            int inputLength = sc.nextInt();
            sc.nextLine(); // Consume the newline character its mean 'enter'

            String password = generatePassword(inputLength);
            System.out.println("Generated Password: " + password);

            System.out.print("Generate again? [y/n]: ");
            doGenerated = sc.nextLine();
        } while (doGenerated.equalsIgnoreCase("y"));

        sc.close();
    }

    private static String generatePassword(int length) {
        StringBuilder passwordBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            passwordBuilder.append(randomChar);
        }

        return passwordBuilder.toString();
    }
}

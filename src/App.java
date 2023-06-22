import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String doGenerated;
        do {
            System.out.print("Input length? ");
            byte inputLength = sc.nextByte();
            generatePassword(inputLength);
            sc.nextLine();
            System.out.print("Do generate again?[y/n]");
            doGenerated = sc.nextLine();
        } while (doGenerated.equalsIgnoreCase("y"));
    }

    private static void generatePassword(byte inputLength) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?";
        StringBuilder pass = new StringBuilder();
        for (int i = 0; i < inputLength; i++) {
            int index = new Random().nextInt(chars.length());
            pass.append(chars.charAt(index));
        }
        System.out.printf("Password: %s \n", pass);
    }
}

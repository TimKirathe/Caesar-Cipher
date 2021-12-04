import models.Cipher;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cipher newCipher = new Cipher();

        System.out.println("Welcome to Caesar Cipher.");
        System.out.println("Please enter the text you would like to be ciphered.");

        String userText = input.nextLine();

        String cipheredText = newCipher.encrypt(userText);
        System.out.print("Your ciphered text: ");
        System.out.println(cipheredText);

        System.out.println("Type 'decipher' in order to revert your text back to the original...");
        String decipher = input.nextLine();

        if (decipher.equals("decipher")) {
            String decipheredText = newCipher.decrypt(cipheredText);
            System.out.print("Your deciphered text: ");
            System.out.println(decipheredText);
        }
        else {
            System.out.print("Wrong text try again!");
        }
    }
}
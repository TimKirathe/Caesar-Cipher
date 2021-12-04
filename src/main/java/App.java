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


        String decipheredText = newCipher.decrypt(cipheredText);
        System.out.print("Your deciphered text: ");
        System.out.println(decipheredText);

    }
}
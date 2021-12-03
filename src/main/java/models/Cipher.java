package models;

public class Cipher {
    int shift = 15;

    public String encrypt() {
        String cipherText = "";
        String userText = "I love going to the gym!";
        int length = userText.length();
        for(int i = 0; i<length; i++) {
            char ch = userText.charAt(i);

        }
        return cipherText;
    }
}

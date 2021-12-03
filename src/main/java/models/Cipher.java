package models;

public class Cipher {
    int shift = 15;
    String userText = "I love going to the gym!";

    public String encrypt(String userText) {
        String cipherText = "";
        int length = userText.length();
        for(int i = 0; i<length; i++) {
            char ch = userText.charAt(i);
            if(Character.isLetter(ch)) {

            }
            else {

            }
        }
        return cipherText;
    }
}

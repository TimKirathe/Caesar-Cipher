package models;

public class Cipher {
    int shift = 15;
    String userText = "I love going to the gym!";
    String cipherText = "";

    public String encrypt(String userText) {
        int length = userText.length();
        for(int i = 0; i<length; i++) {
            char ch = userText.charAt(i);
            if(Character.isLetter(ch)) {
                if(Character.isLowerCase(ch)) {
                    char newCh = (char) ('a' + (ch - 'a' + shift) % 26);
//                    cipherText += newCh;
                }
                else if (Character.isUpperCase(ch)) {
                    char newCh = (char) ('A' + (ch - 'A' + shift) % 26);
//                    cipherText += newCh;
                }
            }
            else {
                cipherText += ch;
            }
        }
        return cipherText;
    }

    public String decrypt() {
        return null;
    }
}

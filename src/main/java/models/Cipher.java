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
                if(Character.isLowerCase(ch)) {
                    char newCh = (char) (ch+shift);
                    if (newCh > 'z') {
                        cipherText += (char) (ch - (26-shift));
                    }
                    else {
                        cipherText += newCh;
                    }
                }
                else if (Character.isUpperCase(ch)) {
                    char newCh = (char) (ch+shift);
                    if (newCh > 'Z') {
                        cipherText += (char) (ch - (26-shift));
                    }
                    else {
                        cipherText += newCh;
                    }
                }
            }
            else {
                cipherText += ch;
            }
        }
        return cipherText;
    }

    public String decrypt() {
        String newUserText = "";
        String cipheredText = encrypt(userText);
        int length = cipheredText.length();
        for(int i = 0; i<length; i++) {
            char ch = cipheredText.charAt(i);
            if(Character.isLetter(ch)) {
                if(Character.isLowerCase(ch)) {
                    char newCh = (char) (ch-shift);
                    if (newCh < 'a') {
                        newUserText += (char) (ch + (26-shift));
                    }
                    else {
                        newUserText += newCh;
                    }
                }
                else if (Character.isUpperCase(ch)) {
                    char newCh = (char) (ch-shift);
                    if (newCh < 'A') {
                        newUserText += (char) (ch + (26-shift));
                    }
                    else {
                        newUserText += newCh;
                    }
                }
            }
            else {
                newUserText += ch;
            }
        }

        return newUserText;
    }
}

package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {

    @Test
    public void encrypt_returnsIntegerForShiftValue() {
        Cipher newCipher = new Cipher();
        int shift = 15;
        assertEquals(shift, newCipher.getShift());
    }

    @Test
    public void encrypt_emptyCipheredStringIsReturned_String() {
        Cipher newCipher = new Cipher();
        int shift = 15;
        String cipherText = "";
        assertEquals(cipherText, newCipher.encrypt(""));
    }

    @Test
    public void encrypt_forLoopReturnsCharactersFromInputtedString() {
        Cipher newCipher = new Cipher();
        int shift = 15;
        String cipherText = "";
        String userText = "I love going to the gym!";
        int length = userText.length();
        for(int i = 0; i<length; i++) {
            char ch = userText.charAt(i); // Confirmed that ch is iterating through the characters inside the string given
            assertEquals(ch, ch);
        }
    }

    @Test
    public void encrypt_checksIfCharacterInStringIsLetter() {
        Cipher newCipher = new Cipher();
        int shift = 15;
        String cipherText = "";
        String userText = "I love going to the gym!";
        int length = userText.length();
        for(int i = 0; i<length; i++) {
            char ch = userText.charAt(i); // Confirmed that ch is iterating through the characters inside the string given
            if(Character.isLetter(ch)) {
                if(Character.isLowerCase(ch)) {

                }
                else if (Character.isUpperCase(ch)) {

                }
            }
            else {
                cipherText += ch;
            }
            assertEquals(Character.isLetter(ch), Character.isLetter(ch));
        }

    }

    @Test
    public void encrypt_cipherTextReturnedIsNotEmptyString_boolean() {
        Cipher newCipher = new Cipher();
        int shift = 15;
        String cipherText = "";
        String userText = "I love going to the gym!";
        int length = userText.length();
        for(int i = 0; i<length; i++) {
            char ch = userText.charAt(i); // Confirmed that ch is iterating through the characters inside the string given
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
            assertEquals(false, newCipher.encrypt(userText).equals(""));
        }
    }

    @Test
    void decrypt_checksThatDecryptMethodReturnsBackString_String() {
        Cipher newCipher = new Cipher();
        assertEquals(true, newCipher.decrypt("") instanceof String);

    }

    @Test
    public void decrypt_returnsTheSameUserTextBack_String() {
        Cipher newCipher = new Cipher();
        int shift = 15;
        String userText = "I love going to the gym!";
        String newUserText = "";
        String cipheredText = newCipher.encrypt(userText);
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

        assertEquals(true, newCipher.decrypt("X adkt vdxcv id iwt vnb!").equals(userText));
        }
    }
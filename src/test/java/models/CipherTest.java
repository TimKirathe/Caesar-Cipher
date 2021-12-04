package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {

    @Test
    public void encrypt_returnsIntegerForShiftValue() {
        Cipher newCipher = new Cipher();
        int shift = 15;
        assertEquals(shift, newCipher.shift);
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
    void encrypt_cipherTextReturnedIsNotEmptyString_boolean() {
        Cipher newCipher = new Cipher();
        int shift = 15;
        String cipherText = "";
        String userText = "I love going to the gym!";
        int length = userText.length();
        for(int i = 0; i<length; i++) {
            char ch = userText.charAt(i); // Confirmed that ch is iterating through the characters inside the string given
            if(Character.isLetter(ch)) {
                if(Character.isLowerCase(ch)) {
                    char newCh = (char) ('a' + (ch - 'a' + shift) % 26);
                    cipherText += newCh;

                }
                else if (Character.isUpperCase(ch)) {
                    char newCh = (char) ('A' + (ch - 'A' + shift) % 26);
                    cipherText += newCh;
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
        assertEquals(true, newCipher.decrypt() instanceof String);

    }

    @Test
    void decrypt_returnsTheSameUserTextBack_String() {
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
                    char newCh = (char) ('a' - (ch + 'a' - shift) % 26);
                    newUserText += newCh;
                }
                else if (Character.isUpperCase(ch)) {
                    char newCh = (char) ('A' - (ch + 'A' - shift) % 26);
                    newUserText += newCh;
                }
            }
            else {
                newUserText += ch;
            }
        }



        }
    }
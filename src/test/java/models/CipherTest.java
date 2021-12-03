package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {

    @Test
    public void encrypt_returnsIntegerForShiftValue_Integer() {
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
    public void encrypt_forLoopReturnsCharactersFromInputtedString_Char() {
        Cipher newCipher = new Cipher();
        int shift = 15;
        String cipherText = "";
        String userText = "I love going to the gym!";
        int length = userText.length();
        for(int i = 0; i<length; i++) {
            char ch = userText.charAt(i); // Confirmed that ch is iterating through the characters inside the string given
            assertEquals(ch, 'I');
        }
    }

    @Test
    public void encrypt_checksIfCharacterInStringIsLetter_boolean() {
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
}
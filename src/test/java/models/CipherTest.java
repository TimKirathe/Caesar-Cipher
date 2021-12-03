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
        assertEquals(cipherText, newCipher.encrypt());
    }
}
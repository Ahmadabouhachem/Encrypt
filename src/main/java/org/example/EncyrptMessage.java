package org.example;

public class EncyrptMessage {
    public static void main(String[] args) {
        System.out.println(encryptedMessage("defghij", 9));
    }

    public static String encryptedMessage(String numberStr, int k) {
        char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        char[] alphabetEncrypt = numberStr.toUpperCase().toCharArray();
        String encryptedWord = "";
        for (int i = 0; i < alphabetEncrypt.length; i++) {

            for (int j = 0; j < alphabets.length; j++) {
                if (alphabetEncrypt[i] == alphabets[j]) {
                    if (j - k < 0) {
                        encryptedWord += alphabets[alphabets.length + j - k];
                    } else {
                        encryptedWord += alphabets[j - k];
                    }
                }
            }

        }
        return encryptedWord;
    }
}
//this is message to test a git course from terminal with git command on linux

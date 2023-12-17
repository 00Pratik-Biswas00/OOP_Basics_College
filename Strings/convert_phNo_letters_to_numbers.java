package Strings;

import java.util.Scanner;

class PhoneNumberConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String phoneNumber1 = sc.nextLine();
        String convertedPhoneNumber1 = textToNum(phoneNumber1);
        System.out.println("Converted Phone Number: " + convertedPhoneNumber1);
    }

    public static String textToNum(String phoneNumber) {
        StringBuilder convertedNumber = new StringBuilder();
        for (char c : phoneNumber.toCharArray()) {
            if (Character.isLetter(c)) {
                convertedNumber.append(convertLetterToDigit(c));
            } else {
                convertedNumber.append(c);
            }
        }
        return convertedNumber.toString();
    }

    public static char convertLetterToDigit(char letter) {
        letter = Character.toLowerCase(letter);
        if (letter >= 'a' && letter <= 'c') {
            return '2';
        } else if (letter >= 'd' && letter <= 'f') {
            return '3';
        } else if (letter >= 'g' && letter <= 'i') {
            return '4';
        } else if (letter >= 'j' && letter <= 'l') {
            return '5';
        } else if (letter >= 'm' && letter <= 'o') {
            return '6';
        } else if (letter >= 'p' && letter <= 's') {
            return '7';
        } else if (letter >= 't' && letter <= 'v') {
            return '8';
        } else if (letter >= 'w' && letter <= 'z') {
            return '9';
        } else {
            return letter; // Keep non-letter characters as they are
        }
    }
}

/*
 * O/P =
 * Enter first string: (325)444-TEST
 * Converted Phone Number: (325)444-8378
 */
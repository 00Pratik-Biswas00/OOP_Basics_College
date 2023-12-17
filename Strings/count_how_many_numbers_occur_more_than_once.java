package Strings;

import java.util.Scanner;

class AlphanumericDuplicateCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String input1 = sc.nextLine();
        int count1 = duplicateCount(input1);
        System.out.println("Result for input: " + count1);
    }

    public static int duplicateCount(String input) {
        int count = 0;
        int[] charCount = new int[128]; // Assuming ASCII characters
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Check if the character is alphanumeric
            if (Character.isLetterOrDigit(c)) {
                // Check if the character has occurred before
                if (charCount[c] == 1) {
                    count++;
                }
                // Increment the count of the character
                charCount[c]++;
            }
        }
        return count;
    }
}

/*
 * O/P =
 * Enter first string: aabbccddee
 * Result for input1: 5
 */
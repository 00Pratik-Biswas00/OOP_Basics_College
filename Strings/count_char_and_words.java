package Strings;

import java.util.Scanner;

public class count_char_and_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        // Counting characters
        int charCount = input.length();
        // Counting words
        String[] words = input.split("\\s+"); // Split the input by spaces
        int wordCount = words.length;
        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        scanner.close();
    }
}

// O/P =
// Enter a string: This is a sample string.
// Character count: 23
// Word count: 5

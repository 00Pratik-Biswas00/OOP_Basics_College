package Exceptions;

public class user_defined_exception {
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative.");
            }
            System.out.println("Age is: " + age);
        } catch (NegativeAgeException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
    }
}

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

/*
 * O/P =
 * Custom exception caught: Age cannot be negative
 */
package Exceptions;

public class use_throw {
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

/*
 * O/P =
 * Exception caught: Age cannot be negative.
 * 
 */
package Exceptions;

public class try_catch {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        }
    }

}

/*
 * O/P =
 * ArithmeticException caught: Division by zero is not allowed.
 */

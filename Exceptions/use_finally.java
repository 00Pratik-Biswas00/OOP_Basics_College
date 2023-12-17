package Exceptions;

public class use_finally {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            // Code in the finally block always executes
            System.out.println("Finally block executed.");
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}

/*
 * O/P =
 * ArithmeticException caught: Division by zero is not allowed.
 * Finally block executed.
 */
package Exceptions;

public class use_thrown_keyword {
    public static void main(String[] args) {
        try {
            divideNumbers(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in the main method: " + e.getMessage());
        }
    }

    // Method declaration with "throws" keyword
    public static void divideNumbers(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        int result = dividend / divisor;
        System.out.println("Result of division: " + result);
    }
}

/*
 * O/P =
 * ArithmeticException caught in the main method: Division by zero is not
 * allowed.
 * 
 */
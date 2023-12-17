package Exceptions;

class ExceptionToStringExample {
    public static void main(String[] args) {
        try {
            // Attempt to divide by zero, which will throw an ArithmeticException
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            // Print the exception information using toString()
            System.out.println("Exception information:");
            System.out.println(e.toString());
        }
    }
}

/*
 * O/P =
 * Exception information:
 * java.lang.ArithmeticException: / by zero
 */

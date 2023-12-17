package Exceptions;

public class nested_try_catch {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = new int[3];
            numbers[5] = 10; // This will throw an ArrayIndexOutOfBoundsException
            try {
                // Inner try block
                int result = 5 / 0; // This will throw an ArithmeticException
            } catch (ArithmeticException innerException) {
                System.out.println("Inner catch: ArithmeticException caught.");
            }
        } catch (ArrayIndexOutOfBoundsException outerException) {
            System.out.println("Outer catch: ArrayIndexOutOfBoundsException caught.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

/*
 * O/P =
 * Outer catch: ArrayIndexOutOfBoundsException caught.
 * Finally block executed.
 */
package Exceptions;

class ExceptionDemo {
    public static void main(String[] args) {
        // Demonstrating ArithmeticException
        try {
            int result = 5 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
        // Demonstrating NumberFormatException
        try {
            String str = "abc"; // This will throw a NumberFormatException when trying to parse as an integer
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
        // Demonstrating StringIndexOutOfBoundsException
        try {
            String text = "Hello";
            char character = text.charAt(10); // This will throw a StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
        // Demonstrating ArrayIndexOutOfBoundsException
        try {
            int[] numbers = { 1, 2, 3 };
            int value = numbers[5]; // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}

/*
 * O/P =
 * ArithmeticException caught: / by zeroNumberFormatException caught: For input
 * string: "abc"
 * StringIndexOutOfBoundsException caught: String index out of range: 10
 * ArrayIndexOutOfBoundsException caught: Index 5 out of bounds for length 3
 * 
 */
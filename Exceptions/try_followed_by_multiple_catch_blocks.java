package Exceptions;

class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[5];
            numbers[7] = 10; // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

/*
 * O/P =
 * ArrayIndexOutOfBoundsException caught: Index 7 out of bounds for length 5
 * Finally block executed.
 * 
 */
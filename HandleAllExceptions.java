public class HandleAllExceptions {

    public static void main(String[] args) {
        try {
            // Code that may throw any exception
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will cause ArrayIndexOutOfBoundsException

            int result = 10 / 0; // This will cause ArithmeticException

            String str = null;
            System.out.println(str.length()); // This will cause NullPointerException

        } catch (Exception e) {
            // Catch block to handle all exceptions
            System.out.println("An exception occurred: " + e);
            e.printStackTrace(); // Print the stack trace for debugging
        } finally {
            // Code that always executes, regardless of whether an exception occurred
            System.out.println("Finally block executed.");
        }
    }
}
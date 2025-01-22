class Divider {
    public void divideNumbers(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Finished processing division for " + numerator + " / " + denominator + ".");
        }
    }
}

public class TryCatchExampleMain {
    public static void main(String[] args) {
        Divider divider = new Divider();

        // Test with a valid denominator
        divider.divideNumbers(10, 2);

        // Test with a zero denominator
        divider.divideNumbers(10, 0);
    }
}


/*Explanation:
1.Divider Class:

    Contains a method divideNumbers that handles the division logic with a try-catch block.
    This class can be reused for dividing any numbers.
2.TryCatchExampleMain Class:

    The main class creates an instance of the Divider class and calls the divideNumbers method with different inputs. */
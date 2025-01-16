//Abstraction example
//Create a program to simulate a Payment System using abstraction. Define an abstract class Payment with an abstract method processPayment().
//Implement two payment methods: CreditCardPayment and PayPalPayment, each with their own processPayment() implementation.
abstract class Payment
{
    public abstract void processPayment();
}  

class CreditCardPayment extends Payment
{
    String cardNumber;
    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing payment using Credit Card: " + cardNumber);
    }
}
class PayPalPayment extends Payment {
    String email;

    // Constructor
    PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing payment using PayPal account: " + email);
    }
}
public class Bank{
    public static void main(String a[])
    {
        // Credit card payment
        Payment creditCard = new CreditCardPayment("1234-5678-9012-3456");
        creditCard.processPayment();

        // PayPal payment
        Payment payPal = new PayPalPayment("Dipak@.com");
        payPal.processPayment();
    }
}



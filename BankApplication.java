import java.util.Scanner;

class BankAccount {
  // This class represents a bank account with a balance and account number

  private double balance;
  private String accountNumber;

  public BankAccount(String accountNumber, double initialBalance) {
    // Constructor to initialize the account number and balance
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }

  public void withdraw(double amount) throws InsufficientBalanceException {
    // Method to withdraw money from the account
    if (amount > balance) {
      // Throws an InsufficientBalanceException if the withdrawal amount exceeds the balance
      throw new InsufficientBalanceException(
          "Withdrawal amount " + amount + " exceeds current balance of " + balance);
    }
    balance -= amount;
  }

  public double getBalance() {
    // Returns the current balance of the account
    return balance;
  }
}

class InsufficientBalanceException extends Exception {
  // Custom exception class for insufficient balance scenarios
  public InsufficientBalanceException(String message) {
    super(message);
  }
}

public class BankApplication {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Create a bank account object with initial balance
    BankAccount account = new BankAccount("123456", 1000.0);

    System.out.println("Current Balance: $" + account.getBalance());
    System.out.print("Enter withdrawal amount: $");

    try {
      // Read withdrawal amount from user input
      double withdrawalAmount = scanner.nextDouble();
      account.withdraw(withdrawalAmount);
      System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
    } catch (InsufficientBalanceException e) {
      // Handle InsufficientBalanceException if withdrawal fails
      System.out.println("Error: " + e.getMessage());
    } catch (Exception e) {
      // Handle any other exceptions (e.g., invalid user input)
      System.out.println("Invalid input. Please enter a valid number.");
    } finally {
      // Close the scanner resource to avoid memory leaks
      scanner.close();
    }
  }
}
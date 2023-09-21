// Create an abstract class "BankAccount" to represent bank accounts
abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract method to perform a transaction
    public abstract void performTransaction(double amount);

    // Getter methods for account number and balance
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Display account information
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Create concrete classes for different types of accounts
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void performTransaction(double amount) {
        if (amount > 0) {
            double interest = getBalance() * (interestRate / 100);
            getBalance() += amount + interest;
        } else {
            System.out.println("Cannot perform a negative transaction on a savings account.");
        }
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void performTransaction(double amount) {
        if (getBalance() + amount >= -overdraftLimit) {
            getBalance() += amount;
        } else {
            System.out.println("Transaction denied. Overdraft limit exceeded.");
        }
    }
}

// Create a class to demonstrate banking operations
class Bank {
    public void processTransaction(BankAccount account, double amount) {
        System.out.println("Processing transaction on account: " + account.getAccountNumber());
        account.performTransaction(amount);
        account.displayInfo();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different bank accounts
        BankAccount savingsAccount = new SavingsAccount("SA12345", 1000.0, 2.5);
        BankAccount checkingAccount = new CheckingAccount("CA67890", 500.0, 200.0);

        // Create a Bank object
        Bank bank = new Bank();

        // Demonstrate banking operations
        bank.processTransaction(savingsAccount, 200.0);
        bank.processTransaction(checkingAccount, -700.0);
    }
}















// Create an abstract class "Shape" to represent shapes
abstract class Shape {
    // Abstract method to calculate the area of the shape
    public abstract double calculateArea();
}

// Create concrete classes for different types of shapes
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Create a class to calculate and display areas of shapes
class ShapeCalculator {
    public void displayArea(Shape shape) {
        System.out.println("Calculating area of a " + shape.getClass().getSimpleName() + ":");
        double area = shape.calculateArea();
        System.out.println("Area: " + area);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different shapes
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 4.0);

        // Create a ShapeCalculator object
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        // Calculate and display areas of shapes
        shapeCalculator.displayArea(circle);
        shapeCalculator.displayArea(rectangle);
        shapeCalculator.displayArea(triangle);
    }
}



// Create an abstract class "MediaItem" to represent media items
// abstract class MediaItem {
//     private String title;
//     private int year;

//     public MediaItem(String title, int year) {
//         this.title = title;
//         this.year = year;
//     }

    // Abstract method to display media information
    public abstract void display();

    // Getter methods for title and year
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}

// Create concrete classes for different types of media items
class Book extends MediaItem {
    private String author;

    public Book(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    @Override
    public void display() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Year: " + getYear());
    }
}

class Movie extends MediaItem {
    private String director;

    public Movie(String title, int year, String director) {
        super(title, year);
        this.director = director;
    }

    @Override
    public void display() {
        System.out.println("Movie Title: " + getTitle());
        System.out.println("Director: " + director);
        System.out.println("Year: " + getYear());
    }
}

// Create a class to simulate a library
class Library {
    public void displayMediaInfo(MediaItem mediaItem) {
        System.out.println("Displaying information for: " + mediaItem.getTitle());
        mediaItem.display();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different media items
        MediaItem book = new Book("The Catcher in the Rye", 1951, "J.D. Salinger");
        MediaItem movie = new Movie("The Shawshank Redemption", 1994, "Frank Darabont");

        // Create a Library object
        Library library = new Library();

        // Display media information in the library
        library.displayMediaInfo(book);
        library.displayMediaInfo(movie);
    }
}




// Create an abstract class "Vehicle" to represent vehicles
abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract methods for vehicle operations
    public abstract void start();

    public abstract void stop();

    // Getter method for brand
    public String getBrand() {
        return brand;
    }
}

// Create concrete classes for different types of vehicles
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Starting the " + getBrand() + " car.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the " + getBrand() + " car.");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Starting the " + getBrand() + " motorcycle.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the " + getBrand() + " motorcycle.");
    }
}

// Create a class to demonstrate vehicle operations
class Garage {
    public void operateVehicle(Vehicle vehicle) {
        System.out.println("Operating the " + vehicle.getBrand() + ":");
        vehicle.start();
        vehicle.stop();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Vehicle car = new Car("Toyota");
        Vehicle motorcycle = new Motorcycle("Harley-Davidson");

        // Create a Garage object
        Garage garage = new Garage();

        // Operate vehicles in the garage
        garage.operateVehicle(car);
        garage.operateVehicle(motorcycle);
    }
}



// Create an abstract class "Vehicle" to represent vehicles
abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract methods for vehicle operations
    public abstract void start();

    public abstract void stop();

    // Getter method for brand
    public String getBrand() {
        return brand;
    }
}

// Create concrete classes for different types of vehicles
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Starting the " + getBrand() + " car.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the " + getBrand() + " car.");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Starting the " + getBrand() + " motorcycle.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the " + getBrand() + " motorcycle.");
    }
}

// Create a class to demonstrate vehicle operations
class Garage {
    public void operateVehicle(Vehicle vehicle) {
        System.out.println("Operating the " + vehicle.getBrand() + ":");
        vehicle.start();
        vehicle.stop();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Vehicle car = new Car("Toyota");
        Vehicle motorcycle = new Motorcycle("Harley-Davidson");

        // Create a Garage object
        Garage garage = new Garage();

        // Operate vehicles in the garage
        garage.operateVehicle(car);
        garage.operateVehicle(motorcycle);
    }
}




// Create an abstract class "Animal" to represent animals
abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method for the animal's sound
    public abstract String makeSound();

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Display animal information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

// Create concrete classes for different types of animals
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Roar!";
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Trumpet!";
    }
}

class Penguin extends Animal {
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Honk!";
    }
}

// Create a class to simulate the zoo
class Zoo {
    public void welcomeAnimal(Animal animal) {
        System.out.println("Welcome to the zoo, " + animal.getName() + "!");
        System.out.println(animal.makeSound());
        animal.displayInfo();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different animals
        Animal lion = new Lion("Simba", 5);
        Animal elephant = new Elephant("Dumbo", 10);
        Animal penguin = new Penguin("Pingu", 3);

        // Create a Zoo object
        Zoo zoo = new Zoo();

        // Welcome animals to the zoo
        zoo.welcomeAnimal(lion);
        zoo.welcomeAnimal(elephant);
        zoo.welcomeAnimal(penguin);
    }
}





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

// Create concrete classes for different account types
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void performTransaction(double amount) {
        if (amount > 0) {
            getBalance() += amount;
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
            getBalance() += amount;s
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
        BankAccount savingsAccount = new SavingsAccount("SA12345", 1000.0);
        BankAccount checkingAccount = new CheckingAccount("CA67890", 500.0, 200.0);

        // Create a Bank object
        Bank bank = new Bank();

        // Demonstrate banking operations
        bank.processTransaction(savingsAccount, 200.0);
        bank.processTransaction(checkingAccount, -700.0);
    }
}




// Create an abstract class "Employee" to represent employees
abstract class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Abstract method to calculate the salary of an employee
    public abstract double calculateSalary();

    // Getter methods for name and employeeId
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    // Display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Create concrete classes that extend "Employee" and provide specific salary calculations
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, int employeeId, double hourlyRate, double hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, int employeeId, double annualSalary) {
        super(name, employeeId);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateSalary() {
        return annualSalary / 12; // Monthly salary for a salaried employee
    }
}

// Create a class to demonstrate dynamic method dispatch
class Payroll {
    public void printEmployeeInfo(Employee employee) {
        System.out.println("Employee Information:");
        employee.displayInfo();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different types of employees
        Employee hourlyEmployee = new HourlyEmployee("John Doe", 101, 15.0, 160);
        Employee salariedEmployee = new SalariedEmployee("Alice Smith", 102, 60000.0);

        // Create a Payroll object
        Payroll payroll = new Payroll();

        // Demonstrate dynamic method dispatch
        payroll.printEmployeeInfo(hourlyEmployee);
        payroll.printEmployeeInfo(salariedEmployee);
    }
}


// Define an interface "Playable" for objects that can be played
interface Playable {
    void play();
}

// Create an abstract class "Instrument" that implements "Playable"
abstract class Instrument implements Playable {
    private String name;

    public Instrument(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("Playing the " + name);
    }
}

// Create concrete classes that extend "Instrument"
class Piano extends Instrument {
    public Piano() {
        super("Piano");
    }
}

class Guitar extends Instrument {
    public Guitar() {
        super("Guitar");
    }
}

// Create another interface "Tuneable" for objects that can be tuned
interface Tuneable {
    void tune();
}

// Create a class "TuningFork" that implements "Playable" and "Tuneable"
class TuningFork implements Playable, Tuneable {
    private String note;

    public TuningFork(String note) {
        this.note = note;
    }

    @Override
    public void play() {
        System.out.println("Striking the tuning fork with note " + note);
    }

    @Override
    public void tune() {
        System.out.println("Tuning with note " + note);
    }
}

// Create a class to demonstrate polymorphism in a musical band
class Band {
    private Playable[] instruments;

    public Band(Playable[] instruments) {
        this.instruments = instruments;
    }

    public void playConcert() {
        System.out.println("The band is playing a concert:");
        for (Playable instrument : instruments) {
            instrument.play();
            if (instrument instanceof Tuneable) {
                ((Tuneable) instrument).tune(); // Explicit casting to Tuneable
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of musical instruments
        Instrument piano = new Piano();
        Instrument guitar = new Guitar();
        Playable tuningFork = new TuningFork("A440");

        // Create a band with instruments
        Playable[] bandInstruments = { piano, guitar, tuningFork };
        Band band = new Band(bandInstruments);

        // Perform a concert using polymorphism
        band.playConcert();
    }
}















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








// Define an interface "Drawable" for objects that can be drawn
interface Drawable {
    void draw();
}

// Create an abstract class "Shape" that implements "Drawable"
// abstract class Shape implements Drawable {
//     private String color;

//     public Shape(String color) {
//         this.color = color;
    }

    public abstract double area(); // Abstract method to calculate the area of the shape

    // Getter and setter methods for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " shape.");
    }
}

// Create concrete classes that extend "Shape" and implement the "area" method
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

// Create a class to demonstrate method overloading
class ShapeInfo {
    public void displayInfo(Shape shape) {
        shape.draw();
        System.out.println("Color: " + shape.getColor());
        System.out.println("Area: " + shape.area());
    }

    // Overload the method to handle Drawable objects
    public void displayInfo(Drawable drawable) {
        System.out.println("Displaying a drawable object.");
        drawable.draw();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Create a ShapeInfo object
        ShapeInfo shapeInfo = new ShapeInfo();

        // Demonstrate method overloading
        shapeInfo.displayInfo(circle); // Calls displayInfo(Shape shape)
        shapeInfo.displayInfo(rectangle); // Calls displayInfo(Shape shape)

        // Demonstrate interface usage
        shapeInfo.displayInfo(new Drawable() {
            @Override
            public void draw() {
                System.out.println("Custom drawable object.");
            }
        });
    }
}

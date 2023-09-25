





// Create an abstract class "Vehicle" to represent vehicles
abstract class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Abstract method to display vehicle information
    public abstract void display();

    // Getter methods for brand and model
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}

// Create concrete classes for different types of vehicles
class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String brand, String model, int seatingCapacity) {
        super(brand, model);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void display() {
        System.out.println("Car: " + getBrand() + " " + getModel());
        System.out.println("Seating Capacity: " + seatingCapacity + " persons");
    }
}

class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String brand, String model, String type) {
        super(brand, model);
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("Motorcycle: " + getBrand() + " " + getModel());
        System.out.println("Type: " + type);
    }
}

// Create a class to simulate a vehicle rental system
class VehicleRental {
    public void rentVehicle(Vehicle vehicle, int days) {
        System.out.println("Renting Vehicle: " + vehicle.getBrand() + " " + vehicle.getModel());
        vehicle.display();
        System.out.println("Rental Duration: " + days + " days");
        System.out.println("Total Rental Cost: $" + calculateRentalCost(vehicle, days));
        System.out.println();
    }

    private double calculateRentalCost(Vehicle vehicle, int days) {
        // Calculate rental cost based on the type of vehicle and number of days
        double baseCost;
        if (vehicle instanceof Car) {
            baseCost = 50.0; // Daily rate for cars
        } else if (vehicle instanceof Motorcycle) {
            baseCost = 30.0; // Daily rate for motorcycles
        } else {
            baseCost = 0.0;
        }
        return baseCost * days;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Vehicle car = new Car("Toyota", "Camry", 5);
        Vehicle motorcycle = new Motorcycle("Honda", "CBR500R", "Sport");

        // Create a VehicleRental object
        VehicleRental rental = new VehicleRental();

        // Rent vehicles for a specific number of days
        rental.rentVehicle(car, 3);
        rental.rentVehicle(motorcycle, 2);
    }
}




// Create an abstract class "Animal" to represent animals
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract methods to represent animal behaviors
    public abstract void speak();

    public abstract void move();

    // Getter method for name
    public String getName() {
        return name;
    }
}

// Create concrete classes for different types of animals
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says Woof!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " runs on four legs.");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " chirps!");
    }

    @Override
    public void move() {
        System.out.println(getName() + " flies through the sky.");
    }
}

// Create a class to simulate a zoo
class Zoo {
    public void interactWithAnimal(Animal animal) {
        System.out.println("Interacting with " + animal.getName() + ":");
        animal.speak();
        animal.move();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different animals
        Animal dog = new Dog("Buddy");
        Animal bird = new Bird("Robin");

        // Create a Zoo object
        Zoo zoo = new Zoo();

        // Interact with animals in the zoo
        zoo.interactWithAnimal(dog);
        zoo.interactWithAnimal(bird);
    }
}







import java.util.ArrayList;
import java.util.List;

// Create an abstract class "MediaItem" to represent media items
abstract class MediaItem {
    private String title;
    private String artist;

    public MediaItem(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // Abstract method to play the media item
    public abstract void play();

    // Getter methods for title and artist
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}

// Create concrete classes for different types of media items
// class Song extends MediaItem {
//     private int duration; // Duration in seconds

//     public Song(String title, String artist, int duration) {
//         super(title, artist);
//         this.duration = duration;
//     }

//     @Override
//     public void play() {
//         System.out.println("Playing Song: " + getTitle());
//         System.out.println("Artist: " + getArtist());
//         System.out.println("Duration: " + duration + " seconds");
//     }
// }

class Playlist extends MediaItem {
    private List<MediaItem> items;

    public Playlist(String title, String artist) {
        super(title, artist);
        items = new ArrayList<>();
    }

    public void addMediaItem(MediaItem item) {
        items.add(item);
    }

    @Override
    public void play() {
        System.out.println("Playing Playlist: " + getTitle());
        System.out.println("Artist: " + getArtist());

        for (MediaItem item : items) {
            item.play();
        }
    }
}

// Create a class to simulate a music library
class MusicLibrary {
    public void playMediaItem(MediaItem item) {
        System.out.println("Now playing: " + item.getTitle());
        item.play();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different media items
        MediaItem song1 = new Song("Bohemian Rhapsody", "Queen", 360);
        MediaItem song2 = new Song("Imagine", "John Lennon", 240);

        Playlist playlist = new Playlist("My Playlist", "Various Artists");
        playlist.addMediaItem(song1);
        playlist.addMediaItem(song2);

        // Create a MusicLibrary object
        MusicLibrary musicLibrary = new MusicLibrary();

        // Play media items
        musicLibrary.playMediaItem(song1);
        musicLibrary.playMediaItem(playlist);
    }
}



// Create an abstract class "Dish" to represent dishes
abstract class Dish {
    private String name;
    private double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Abstract method to display dish information
    public abstract void display();

    // Getter methods for name and price
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Create concrete classes for different types of dishes
class Appetizer extends Dish {
    public Appetizer(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("Appetizer: " + getName());
        System.out.println("Price: $" + getPrice());
    }
}

class MainCourse extends Dish {
    private String type;

    public MainCourse(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public void display() {
        System.out.println("Main Course: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Type: " + type);
    }
}

// Create a class to simulate a restaurant ordering system
class Restaurant {
    public void orderDish(Dish dish) {
        System.out.println("Ordering: " + dish.getName());
        dish.display();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different dishes
        Dish appetizer = new Appetizer("Caesar Salad", 7.99);
        Dish mainCourse = new MainCourse("Spaghetti Bolognese", 12.99, "Pasta");
        Dish dessert = new Appetizer("Chocolate Cake", 5.99);

        // Create a Restaurant object
        Restaurant restaurant = new Restaurant();

        // Place orders at the restaurant
        restaurant.orderDish(appetizer);
        restaurant.orderDish(mainCourse);
        restaurant.orderDish(dessert);
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

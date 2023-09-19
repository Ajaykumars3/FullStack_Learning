
// Create an abstract class "AudioTrack" to represent audio tracks
abstract class AudioTrack {
    private String title;
    private String artist;

    public AudioTrack(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // Abstract method to play the audio track
    public abstract void play();

    // Getter methods for title and artist
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}

// Create concrete classes for different types of audio tracks
class Song extends AudioTrack {
    private int duration; // Duration in seconds

    public Song(String title, String artist, int duration) {
        super(title, artist);
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing Song: " + getTitle());
        System.out.println("Artist: " + getArtist());
        System.out.println("Duration: " + duration + " seconds");
    }
}

class Podcast extends AudioTrack {
    private String host;

    public Podcast(String title, String artist, String host) {
        super(title, artist);
        this.host = host;
    }

    @Override
    public void play() {
        System.out.println("Playing Podcast: " + getTitle());
        System.out.println("Artist: " + getArtist());
        System.out.println("Host: " + host);
    }
}

// Create a class to simulate a music player
class MusicPlayer {
    public void playTrack(AudioTrack track) {
        System.out.println("Now playing: " + track.getTitle());
        track.play();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different audio tracks
        AudioTrack song = new Song("Bohemian Rhapsody", "Queen", 360);
        AudioTrack podcast = new Podcast("Java Tech Talk", "Tech Podcasts Inc.", "John Doe");

        // Create a MusicPlayer object
        MusicPlayer musicPlayer = new MusicPlayer();

        // Play audio tracks
        musicPlayer.playTrack(song);
        musicPlayer.playTrack(podcast);
    }
}





// Create an abstract class "Product" to represent products
abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Abstract method to display product information
    public abstract void display();

    // Getter methods for name and price
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Create concrete classes for different types of products
class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void display() {
        System.out.println("Electronics Product Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Brand: " + brand);
    }
}

class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void display() {
        System.out.println("Clothing Product Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Size: " + size);
    }
}

// Create a class to simulate an online shopping system
class OnlineStore {
    public void addToCart(Product product) {
        System.out.println("Adding to cart: " + product.getName());
        product.display();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different products
        Product electronicsProduct = new Electronics("Laptop", 999.99, "Dell");
        Product clothingProduct = new Clothing("T-shirt", 19.99, "Large");

        // Create an OnlineStore object
        OnlineStore onlineStore = new OnlineStore();

        // Add products to the shopping cart
        onlineStore.addToCart(electronicsProduct);
        onlineStore.addToCart(clothingProduct);
    }
}







// Create an abstract class "Student" to represent students
abstract class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to display student information
    public abstract void display();

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Create concrete classes for different types of students
class ElementaryStudent extends Student {
    private String grade;

    public ElementaryStudent(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void display() {
        System.out.println("Elementary Student Name: " + getName());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Grade: " + grade);
    }
}

class HighSchoolStudent extends Student {
    private String gradeLevel;

    public HighSchoolStudent(String name, int age, String gradeLevel) {
        super(name, age);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void display() {
        System.out.println("High School Student Name: " + getName());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Grade Level: " + gradeLevel);
    }
}

// Create a class to simulate a school enrollment system
class School {
    public void enrollStudent(Student student) {
        System.out.println("Enrolling student: " + student.getName());
        student.display();
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of different students
        Student elementaryStudent = new ElementaryStudent("Alice", 8, "3rd");
        Student highSchoolStudent = new HighSchoolStudent("Bob", 16, "11th");

        // Create a School object
        School school = new School();

        // Enroll students in the school
        school.enrollStudent(elementaryStudent);
        school.enrollStudent(highSchoolStudent);
    }
}



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



















// Define an interface "Drawable" for objects that can be drawn
interface Drawable {
    void draw();
}

// Create an abstract class "Shape" that implements "Drawable"
abstract class Shape implements Drawable {
    private String color;

    public Shape(String color) {
        this.color = color;
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

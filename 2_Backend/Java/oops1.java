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

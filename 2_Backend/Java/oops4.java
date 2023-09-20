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



// Define an interface named "Shape" to represent geometric shapes
interface Shape {
    double area(); // Abstract method to calculate the area of the shape
    void display(); // Abstract method to display information about the shape
}

// Create a concrete class "Circle" that implements the "Shape" interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle - Radius: " + radius);
    }
}

// Create another concrete class "Rectangle" that implements the "Shape" interface
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void display() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
    }
}

// Create an abstract class "ShapeContainer" to demonstrate dynamic method dispatch
abstract class ShapeContainer {
    protected Shape shape;

    public ShapeContainer(Shape shape) {
        this.shape = shape;
    }

    // Abstract method to display information about the shape
    public abstract void display();
}

// Create a subclass "ShapeInfo" that extends "ShapeContainer"
class ShapeInfo extends ShapeContainer {
    public ShapeInfo(Shape shape) {
        super(shape);
    }

    // Implement the display method to show information about the shape
    @Override
    public void display() {
        shape.display();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Demonstrate polymorphism with an array of Shape objects
        Shape[] shapes = { circle, rectangle };

        System.out.println("Calculating Areas and Displaying Shapes:");
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
            shape.display();
            System.out.println();
        }

        // Demonstrate dynamic method dispatch using ShapeContainer
        System.out.println("Dynamic Method Dispatch:");
        ShapeContainer circleContainer = new ShapeInfo(circle);
        ShapeContainer rectangleContainer = new ShapeInfo(rectangle);

        circleContainer.display();
        rectangleContainer.display();
    }
}



// Define a class called "Person" to represent individuals
class Person {
    // Instance variables
    private String name;
    private int age;

    // Constructor to initialize a Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for the name
    public String getName() {
        return name;
    }

    // Setter method for the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the age
    public int getAge() {
        return age;
    }

    // Setter method for the age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Define a subclass "Student" that inherits from "Person"
class Student extends Person {
    private String studentId;

    // Constructor to initialize a Student object
    public Student(String name, int age, String studentId) {
        super(name, age); // Call the constructor of the parent class
        this.studentId = studentId;
    }

    // Getter method for the student ID
    public String getStudentId() {
        return studentId;
    }

    // Setter method for the student ID
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Method to display information about the student
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the parent class
        System.out.println("Student ID: " + studentId);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", 30);

        // Display information about the person
        System.out.println("Person:");
        person.displayInfo();

        // Create a Student object
        Student student = new Student("Alice Smith", 20, "12345");

        // Display information about the student
        System.out.println("\nStudent:");
        student.displayInfo();
    }
}






// public class GFG {
      
//     static String Employee_name;
//     static float Employee_salary;
  
//     static void set(String n, float p) {
//         Employee_name  = n;
//         Employee_salary  = p;
//     }
  
//     static void get() {
//         System.out.println("Employee name is: " +Employee_name );
//         System.out.println("Employee CTC is: " + Employee_salary);
//     }
  
//     public static void main(String args[]) {
//         GFG.set("Rathod Avinash", 10000.0f);
//         GFG.get();
//     }
// }







// public class GFG {
	
// 	static String Employee_name;
// 	static float Employee_salary;

// 	static void set(String n, float p) {
// 		Employee_name = n;
// 		Employee_salary = p;
// 	}

// 	static void get() {
// 		System.out.println("Employee name is: " +Employee_name );
// 		System.out.println("Employee CTC is: " + Employee_salary);
// 	}

// 	public static void main(String args[]) {
// 		GFG.set("Rathod Avinash", 10000.0f);
// 		GFG.get();
// 	}
// }

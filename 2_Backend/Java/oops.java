


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

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

package Assignments;

class student {
    String name;
    int rollNumber;
    double marks;

    student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------------");
    }
}

public class oopsQ1 {
    public static void main(String[] args) {
        student student1 = new student("Alice", 100, 87.5);
        student student2 = new student("Bob", 999, 91.0);

        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("Student 2 Details:");
        student2.displayDetails();
    }
}


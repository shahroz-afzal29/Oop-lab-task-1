
class Student {

    int id;
    String name;

    static int totalStudents = 0;
    static String registeredIDs = ",";

    // Constructor 1
    Student(int id) {
        this.id = id;
        this.name = "Unknown";
        registerStudent();
    }

    // Constructor 2 (Overloaded)
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        registerStudent();
    }

    // Check and register student
    void registerStudent() {

        if (registeredIDs.contains("," + id + ",")) {
            System.out.println("Student already exists. Skipped!");
        }
        else {
            registeredIDs += id + ",";
            totalStudents++;

            System.out.println("Student added: " + name);
        }
    }

    void display() {
        System.out.println("Total Students: " + totalStudents);
    }
}

public class StudentIncrement {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Ali");
        Student s2 = new Student(102, "Ahmed");
        Student s3 = new Student(101, "Ali");

        System.out.println();

        s1.display();
    }
}

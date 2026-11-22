class Person {

    String name;
    int age;

    static String universityName = "NUML University";

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Person Information");
    }

    static void showUniversityInfo() {
        System.out.println("University: " + universityName);
    }
}

class Teacher extends Person {

    String subject;
    double salary;

    Teacher() {
        super();
        subject = "Unknown";
        salary = 0;
    }

    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void displayInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

class Student extends Person {

    int rollNo;
    double marks;

    Student() {
        super();
        rollNo = 0;
        marks = 0;
    }

    Student(String name, int age, int rollNo, double marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class UniversitySystem {

    public static void main(String[] args) {

        Person.showUniversityInfo();

        Teacher t1 = new Teacher("Ahmed", 35, "Java", 60000);
        Student s1 = new Student("Ali", 20, 101, 85.5);

        System.out.println("\nTeacher Details");
        t1.displayInfo();

        System.out.println("\nStudent Details");
        s1.displayInfo();
    }
}

// Parent class
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class
class Student extends Person {
    String course;
    int rollNo;

    Student(String name, int age, String course, int rollNo) {
        super(name, age);
        this.course = course;
        this.rollNo = rollNo;
    }

    void displayStudentInfo() {
        super.displayInfo();
        System.out.println("Course: " + course);
        System.out.println("Roll No: " + rollNo);
    }
}

// Main class
public class StudentInfoDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Sunil", 22, "BCA", 101);
        s1.displayStudentInfo();
    }
}

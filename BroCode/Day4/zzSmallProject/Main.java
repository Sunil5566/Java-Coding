//  Step-by-Step Plan (No Code, Just Plan)
// 🔹 Step 1: Plan Your Classes
// You’ll create 3 core parts:

// Person → abstract class (base)

// Payable → interface (rule for paying fees)

// Student → subclass that extends Person and implements Payable

// 🔹 Step 2: Create the Person class
// Abstract class

// Fields: name, age

// Constructor to set them 

// Abstract method: display()

// 🔹 Step 3: Create the Payable interface
// Method: void payFees(double amount);

// This will be implemented by Student.

// 🔹 Step 4: Create the Student class
// Extends Person, Implements Payable

// Fields: id, grade, feesPaid

// Static variable: studentCount

// Use random or auto-generated ID

// Constructor: Overloaded to support full and partial info

// Implement display() and payFees()

// Override toString()

// 🔹 Step 5: Create Main Program (with menu)
// Use:

// Scanner or JOptionPane (your choice)

// Array or ArrayList to store students

// Menu with switch:

// markdown
// Copy
// Edit
// 1. Add New Student
// 2. Display All Students
// 3. Pay Fees
// 4. Show Total Students
// 5. Exit
// Use loops to repeat until exit.

// 🔹 Step 6: Implement Object Passing
// Create a method like:

// java
// Copy
// Edit
// void printStudentInfo(Student s) { ... }
// Call this from main — pass object.

// 🔹 Step 7 (Optional): Use 2D Array
// If you want, create a simple 2D array for marks:

// Store 3 subjects per student

// Calculate average in a method



import java.util.Random;

abstract class Person{
     String name;
     int age;

     Person(String n, int a){
        name = n;
        age = a;
     }

     abstract void display();


}

interface Payable{
       
       void payFees(double amount);
}

class Student extends Person implements Payable{
   int id;
   double grade;
   double feesPaid;
   static int studentCount = 0;

   Student(String name, int age, double grade){
    super(name, age);
    this.id = new Random().nextInt(1000)+1;
    this.grade = grade;
    this.feesPaid = 0;
    studentCount++;

   }
    public void payFees(double amount){
       feesPaid += amount;
       System.out.println("Paid Rs " + amount + " successfully.");


    }
    public void display(){
        System.out.println("----- Student Info -----");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Fees Paid: Rs " + feesPaid);

    }

     public String toString(){
        return "Student[ID=" + id + ", Name=" + name + ", Age=" + age + ", Grade=" + grade + ", FeesPaid=Rs " + feesPaid + "]";
     }

 

}



public class Main {
 public static void main(String[] args) {
      // Create student object
        Student s1 = new Student("Sunil", 22, 3.9);

        // Display student info
        s1.display();

        // Pay some fees
        s1.payFees(1500);

        // Show updated info using toString
        System.out.println(s1);

        // Show total student count
        System.out.println("Total Students: " + Student.studentCount); }   
}

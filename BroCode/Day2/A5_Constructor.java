
class Student{
    String name;
    int age;

    //COnstructor
    Student(String n, int a){
       name = n;
       age = a;
        
    }
    void display(){
        System.out.println("Name of student: " + name + ", Age of Student: " + age + ".");
    }
}

public class A5_Constructor {
    public static void main(String[] args) {
        Student std = new Student("Sunil", 22);
        std.display();
    }
}
class Student{
    String name;
    int age;
//constructor 1
     Student(){
        name = "Not know";
        age = 0;
     }

//Constructor 2
    Student(String n, int a){
        name = n;
        age = a;
    }     

//Constructor 3
    Student(String n){
        name = n;
    }
    
    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }


}


public class A6_OverLoadedConstructor {
      public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student("Sunil");
        Student std3 = new Student("Sunil", 22);
        std1.display();
        std2.display();
        std3.display();
      }    
}

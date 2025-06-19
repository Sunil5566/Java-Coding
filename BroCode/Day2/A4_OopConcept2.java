
//Encapculaton
class Student{
    private String name;

    public void setName(String name){
         this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class A4_OopConcept2 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("Sunil");
        System.out.println("Student name is " + stu.getName());
        
    }
}

class Animal{
    public void sound(){
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal{
   @Override
   public void sound(){
    System.out.println("Dog barks!");
   }
}

public class A3_MethodOverRiding {
    
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Animal();
        a.sound();
        b.sound();

    }
}

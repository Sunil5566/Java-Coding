

abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Animal eat foods.");
    }
}

 class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
 } 

public class Aabstract {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat();
        dog.sound(); 

    }
}

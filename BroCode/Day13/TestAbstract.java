abstract class Animal {
    abstract void sound();  // abstract method
    
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // Output: Dog barks.
        d.eat();    // Output: Animal eats food.
    }
}

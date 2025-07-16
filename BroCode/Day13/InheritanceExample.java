// Parent class (Super class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (Subclass)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to run the program
public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();

        // Calling method from parent class
        d.eat();

        // Calling method from child class
        d.bark();
    }
}


class Vehicle{
    void sound(){
        System.out.println("Vehicle produce sound");
    }
}

class Car extends Vehicle{
    @Override
    void sound(){
        System.out.println("Horn po po pop");
    }
}

class Bicycle extends Vehicle{
    @Override
    void sound(){
        System.out.println("Sound like tin tin ting");
    }
}


public class A1_Polymorphism {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bicycle();
        v1.sound();
        v2.sound();


    }
}

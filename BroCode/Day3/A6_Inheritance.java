class Vehicle{
    void sound(){
        System.out.println("Vehicle produces different types of sound.");
    }
}

class Car extends Vehicle{
    void CarHorn(){
        System.out.println("It make sounds like poop poop");
    }

}

class BMW extends Car{
    void BMWSound(){
        System.out.println("Sounds like ghuuu ghuuu");
    }
}

public class A6_Inheritance {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.BMWSound();
        bmw.CarHorn();
        bmw.sound();
    }
}

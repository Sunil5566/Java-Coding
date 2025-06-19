
 class Car{
    String make = "chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "red";
    double price = 50000.00;

    void drive(){
        System.out.println("You drive the car");
    }

   void brake(){
    System.out.println("You step down in a break");
   }
}
public class A4_OopConcept {
    public static void main(String[] args) {
       Car myCar = new Car();
       System.out.println(myCar.model);    
       myCar.drive();
    }
}

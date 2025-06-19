class Car{
    String name = "Ford";
    String model = "222";
    String color = "Red";
    int year = 2020;

    public String toString(){
        String myString = name + "\n" + color + "\n" + model + "\n" + year;
        return myString;
        //return name + "\n" + color + "\n" + model + "\n" + year;   ................this is one line code
    }
}
public class A2_toStringMethod {
    public static void main(String[] args) {
     Car car = new Car();
     System.out.println(car.toString());
    }
}

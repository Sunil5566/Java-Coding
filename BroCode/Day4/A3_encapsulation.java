
class Car{
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year){
          this.setMake(make);
          this.setModel(model);
          this.setYear(year);
    }
     
    Car(Car x){
       this.copy(x);
    }

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void copy(Car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }


}

public class A3_encapsulation {
    public static void main(String[] args) {
        Car car1 = new Car("Maryti", "Model2020", 20);
        // car1.setYear(20222);
        // car2.copy(car1);
        Car car2 = new Car(car1);
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}

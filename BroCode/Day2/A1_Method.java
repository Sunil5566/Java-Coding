
public class A1_Method {
    // static void hello(String name){
    //     System.out.println("Hello " + name);
    // }
    // public static void main(String[] args) {
    //     String name = "Rashmi";
    //     hello(name);
    // }
           
    //...............................................

    // public static int addNum(int x, int y){
    //     return x + y;
    // }

    // public static void main(String[] args) {
    //     int result = addNum(4, 5);
    //     System.out.println("Adding: " + result);
    // }


    //................................................

    //Method to check whether number is even or odd
     
    public static Boolean isEven(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(6));
        System.out.println(isEven(7));
    }


}

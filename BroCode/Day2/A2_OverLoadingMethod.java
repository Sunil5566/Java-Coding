
public class A2_OverLoadingMethod {

    public static int addNum(int x, int y){
        return x + y;
    }

    public static int addNum(int x, int y, int z){
        return x + y + z;
    }

    public static double addNum(double x, double y){
        return x + y;
    }



    public static void main(String[] args) {
        System.out.println(addNum(3, 5));
        System.out.println(addNum(3.5, 2.5));
        System.out.println(addNum(2, 1, 2));
    }
}
  //...................................This is method overloading.................................................
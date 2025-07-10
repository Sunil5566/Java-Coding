class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class polymorphism{
    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        System.out.println(obj.add(5, 3));           // 8
        System.out.println(obj.add(5.2, 3.1));       // 8.3
        System.out.println(obj.add(1, 2, 3));        // 6
    }
}

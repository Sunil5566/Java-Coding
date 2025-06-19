import java.util.Random;
public class A6_RandomValue {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(20)+1;
        boolean z = random.nextBoolean();
        System.out.println(x);
        System.out.println(z);
    }
}

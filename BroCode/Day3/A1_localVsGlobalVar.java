import java.util.Random;
class DiceRoller{
    Random random;
    int number = 0;

    DiceRoller(){
        random = new Random();
        roll();
    }
    void roll(){
            number = random.nextInt(6)+1;
            System.out.println(number);
    }


}

public class A1_localVsGlobalVar {
    public static void main(String[] args) {
        DiceRoller dc = new DiceRoller();
    }
}

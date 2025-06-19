import java.util.ArrayList;
public class A12_WrapperInList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);

        for(int i=0; i<number.size(); i++){
            System.out.println(number.get(i));
        }
    }
}

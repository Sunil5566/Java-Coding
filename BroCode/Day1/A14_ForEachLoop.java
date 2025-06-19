import java.util.ArrayList;
public class A14_ForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();
        animal.add("Cow");
        animal.add("Buffalo");
        animal.add("Cat");
        for(String anm: animal){
            System.out.println(anm);
        }


    }
}

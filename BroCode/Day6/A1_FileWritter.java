import java.io.FileWriter;
import java.io.IOException;

public class A1_FileWritter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Sunil_bhattarai.txt.txt");
            writer.write("Hello how ae you\n hey i am sunil");
            writer.append("\n A a a ");
            writer.close();
        } 
        catch (IOException e) {
         e.printStackTrace();  
        }
    }
}

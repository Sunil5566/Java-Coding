
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class A3_FileReader {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("Sunil_bhattarai.txt.txt");
            int data = reader.read();
            while(data != -1){
                System.out.println((char)data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

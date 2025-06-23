
import java.io.File;
public class A1_FileClass {
    public static void main(String[] args) {
        
        File file = new File("Sunil_bhattarai.txt.txt");
        if(file.exists()){
            System.out.println("File exists: ");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete();    ............this will delete the file from the computer.........  
             
        }
        else{
            System.out.println("FIle doesnnot exists: ");
        }
    }
}

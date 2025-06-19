import java.util.Scanner;
public class A8_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = " ";
        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = sc.nextLine(); 
            
        }
        System.out.println("Hello " + name);
    }
}

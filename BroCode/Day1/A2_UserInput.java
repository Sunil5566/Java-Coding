import java.util.Scanner;
public class A2_UserInput {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("What is your name");
     String name = scanner.nextLine();   
     System.out.println("Hello " + name);
     
     System.out.println("Enter NUmber");
     int number = scanner.nextInt();
     System.out.println("Number is "+ number);

    }
}

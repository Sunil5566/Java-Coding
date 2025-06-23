import java.util.InputMismatchException;
import java.util.Scanner;
public class A2_ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
         
        System.out.println("Enter a whole number: ");
        int x = scanner.nextInt();

        System.out.println("Enter another number to divide whole number: ");
        int y = scanner.nextInt();

        int z = x/y;
        System.out.println("Result" + z);
        } catch(ArithmeticException e){
            System.out.println("You cant divide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Input number ");
        }
        catch(Exception e){
            System.out.println("Something wrong");
        }
        finally{
           scanner.close();   
        }
    }

}

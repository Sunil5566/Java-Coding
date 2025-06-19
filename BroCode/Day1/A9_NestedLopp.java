import java.util.Scanner;
public class A9_NestedLopp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers of row: ");
        int rows = sc.nextInt();

        System.out.println("Enter numbers of column: ");
        int columns = sc.nextInt();

        System.out.println("Enter symbol to print");
        String symbol = sc.next();

        for(int i=1; i<=rows; i++ ){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);
            }
        }


    }
}

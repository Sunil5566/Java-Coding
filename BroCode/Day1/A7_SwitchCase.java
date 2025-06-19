import java.util.Scanner;
public class A7_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one day and msg will display");
        String day = sc.nextLine();
        switch(day){
            case "Sunday": System.out.println("Not a holiday");
            break;
            case "Monday": System.out.println("Not a holiday");
            break;
            case "Tuesday": System.out.println("Not a holiday");
            break;
            case "Wednsday": System.out.println("Not a holiday");
            break;
            case "Thursday": System.out.println("Not a holiday");
            break;
            case "Friday": System.out.println("Not a holiday");
            break;
            case "Saturday": System.out.println("Its a holiday");
            break;
            default: System.out.println("Invalid Input");
        }

    }
}

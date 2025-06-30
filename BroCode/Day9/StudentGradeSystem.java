import java.util.Scanner;
public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Total number of Students: ");
        int totalStd = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0; i<totalStd; i++){

        System.out.print("Enter name of Student: ");
        String nameOfStudent = scanner.nextLine();

        System.out.print("Roll Number: ");
        int rollNUmber = scanner.nextInt();

        System.out.println("Marks in english: ");
        int mark1 = scanner.nextInt();

        System.out.println("Marks in math: ");
        int mark2 = scanner.nextInt();

        System.out.println("Marks in science: ");
        int mark3 = scanner.nextInt();

        System.out.println();
        
        int TotalMark = mark1 + mark2 + mark3;
        System.out.println("Total Mark of " + nameOfStudent + " is " + TotalMark);
        System.out.println();
        double average = TotalMark / 3.0;
        System.out.println("Average mark is " + average + ".");
        System.out.println();

        if(mark1>=40 && mark2>=40 && mark3>=40 ){
            System.out.println("Result: Pass");
        } else{
            System.out.println("Result: Fail");
        }

        System.out.println("..........................");
        scanner.nextLine();
        
        
    }
    
           

    






    }
}

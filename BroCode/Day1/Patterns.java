package BroCode.Day1;
public class Patterns {

    public static void main(String[] args) {

        // Printing Patterns:
        /*
          *****
          *****
          *****
          *****
         */

        // for(int i=0; i<4; i++){
        // for(int j=0; j<5; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Printing Patterns:
        /*
         *****
         * *
         * *
         *****
         */

        // for(int i=0; i<4; i++){
        // for(int j=0; j<5; j++){
        // if(i==0 || j==0 || i==3 || j==4){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }

        // }
        // System.out.println();
        // }

        /*
        *
        **
        ***
        ****
        */

        // for(int i=1; i<5; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Printing Pattern
        /*
             *
            **
           ***
          ****
         */
        int n=4;

         for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
         }

    }

}
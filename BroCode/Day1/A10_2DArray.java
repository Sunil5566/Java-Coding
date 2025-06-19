public class A10_2DArray {
    public static void main(String[] args) {
        String [][] cars = {
                              {"car","bike","van"},
                              {"what","who","whom"},
                              {"fan", "freeze", "ssss"}
                           };
       
        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}

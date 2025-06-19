
import javax.swing.JOptionPane;



public class A5_HypotenuesOfTriangle {
    public static void main(String[] args) {
        //Using simple way to calculate:................

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter side x :");
        // double x = sc.nextDouble();
        // System.out.println("Enter side y: ");
        // double y = sc.nextDouble();
        // double z = Math.sqrt((x * x) + (y * y));
        // System.out.println("Hypotenious of traingle is: " + z);
        // scanner.close();

        //Now using dialog box ie GUIProgram.............
        double x = Double.parseDouble(JOptionPane.showInputDialog("Enter side for x"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Enter side for y"));
        double z = Math.sqrt((x*x) + (y*y));
        JOptionPane.showMessageDialog(null, "Hypotinous of trinagle is" + z);
        
    }
}

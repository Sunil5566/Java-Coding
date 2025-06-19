
import javax.swing.JOptionPane;

public class A3_GUIProgram {
    public static void main(String[] args) {
       String name = JOptionPane.showInputDialog("Enter Your Name");
       JOptionPane.showMessageDialog(null,"Hello " + name); 

       int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
       JOptionPane.showMessageDialog(null, "Age is "+  age);
       

       double number = Double.parseDouble(JOptionPane.showInputDialog("Enter your number"));
       JOptionPane.showMessageDialog(null, "number " + number);

       String GfName = JOptionPane.showInputDialog("Enter Gf name");
       JOptionPane.showMessageDialog(null, "Gf name is " + GfName );

       int studentClass = Integer.parseInt(JOptionPane.showInputDialog("In which class do you read"));
       JOptionPane.showMessageDialog(null, "class " + studentClass);

        //   int studentClass = Integer.parseInt(JOptionPane.showInputDialog("In which class do you read"));
        // JOptionPane.showMessageDialog(null, "Class is " + studentClass);
       


    }
}

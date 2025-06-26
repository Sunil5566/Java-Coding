import javax.swing.JOptionPane;

public class A1_JOptionPane {
    public static void main(String[] args) {
        JOptionPane pane1 = new JOptionPane();
       String name=  JOptionPane.showInputDialog("Whats your name");
       pane1.showMessageDialog(null, "hello  " + name );




    }
}

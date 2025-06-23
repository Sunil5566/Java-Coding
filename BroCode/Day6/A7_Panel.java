import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class A7_Panel {

    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("This is blue color box.");
        

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setBounds(0, 0, 250, 250);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(panel);
        frame.add(label);
        panel.add(label);

        
    }
}

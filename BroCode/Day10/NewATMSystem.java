import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class NewATMSystem {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.CYAN);
        frame.setVisible(true);
        frame.setSize(600,400);
        frame.setLayout(null);

        JButton button1 = new JButton();
        button1.setBounds(200,100,180,50);
        button1.setText("Login");

        JButton button2 = new JButton();
        button2.setBounds(400,100,180,50);
        button2.setText("Register");

        frame.add(button1);
        frame.add(button2);

    

    }
}

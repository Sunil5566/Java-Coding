import javax.swing.*;
import java.awt.event.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Input your PIN Num!");
        label1.setBounds(100, 50, 200, 30);

        JPasswordField pin = new JPasswordField();
        pin.setBounds(100, 100, 200, 30);

        JButton button1 = new JButton("Click Me");
        button1.setBounds(150, 150, 100, 40);

        frame.add(label1);
        frame.add(pin);
        frame.add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredPin = new String(pin.getPassword());

                if (enteredPin.equals("12345")) {
                    JOptionPane.showMessageDialog(frame, "PIN correct! Access granted.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Incorrect PIN! Try again.");
                }
            }
        });

        frame.setVisible(true);
    }
}

import java.awt.event.*;
import javax.swing.*;

public class main {
    static int balance = 5000; 

    public static void main(String[] args) {
        // LOGIN FRAME
        JFrame frame = new JFrame("ATM Login");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Input your PIN Num!");
        label1.setBounds(100, 50, 200, 30);

        JPasswordField pin = new JPasswordField();
        pin.setBounds(100, 100, 200, 30);

        JButton button1 = new JButton("Login");
        button1.setBounds(150, 150, 100, 40);

        frame.add(label1);
        frame.add(pin);
        frame.add(button1);

        // BUTTON ACTION: Check PIN
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredPin = new String(pin.getPassword());

                if (enteredPin.equals("12345")) {
                    JOptionPane.showMessageDialog(frame, "PIN correct! Access granted.");
                    frame.dispose(); // Close login window
                    openATMWindow(); // Open ATM main window
                } else {
                    JOptionPane.showMessageDialog(frame, "Incorrect PIN! Try again.");
                }
            }
        });

        frame.setVisible(true);
    }

   
    public static void openATMWindow() {
        JFrame atmFrame = new JFrame("ATM System");
        atmFrame.setSize(400, 400);
        atmFrame.setLayout(null);
        atmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // You can add ATM features like buttons here
        JLabel welcomeLabel = new JLabel("Welcome to ATM!");
        welcomeLabel.setBounds(120, 30, 200, 30);

        atmFrame.add(welcomeLabel);

        atmFrame.setVisible(true);
    }
}

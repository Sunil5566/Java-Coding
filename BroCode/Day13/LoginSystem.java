import javax.swing.*;
import java.awt.event.*;

public class LoginSystem {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login System");

        // Labels
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);

        // Text fields
        JTextField userText = new JTextField();
        userText.setBounds(150, 50, 150, 30);
        JPasswordField passText = new JPasswordField();
        passText.setBounds(150, 100, 150, 30);

        // Login button
        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(150, 150, 100, 30);

        // Message Label
        JLabel msgLabel = new JLabel();
        msgLabel.setBounds(50, 200, 300, 30);

        // Add action on button click
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());

                // Example: correct credentials
                if (username.equals("admin") && password.equals("1234")) {
                    msgLabel.setText("Login Successful!");
                } else {
                    msgLabel.setText("Invalid username or password.");
                }
            }
        });

        // Add components to frame
        frame.add(userLabel);
        frame.add(passLabel);
        frame.add(userText);
        frame.add(passText);
        frame.add(loginBtn);
        frame.add(msgLabel);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

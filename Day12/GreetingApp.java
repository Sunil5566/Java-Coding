
import java.awt.event.*;
import javax.swing.*;

public class GreetingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Greeting App");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Enter your name:");
        label.setBounds(50, 50, 150, 30);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(180, 50, 150, 30);
        frame.add(textField);

        JButton button = new JButton("Greet Me");
        button.setBounds(130, 100, 100, 30);
        frame.add(button);

        JLabel greetingLabel = new JLabel("");
        greetingLabel.setBounds(100, 150, 250, 30);
        frame.add(greetingLabel);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                greetingLabel.setText("Hello, " + name + "!");
            }
        });

        frame.setVisible(true);
    }
}

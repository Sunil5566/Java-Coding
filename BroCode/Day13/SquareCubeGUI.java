import javax.swing.*;
import java.awt.event.*;

public class SquareCubeGUI {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Square and Cube Calculator");
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label for input
        JLabel label = new JLabel("Enter a number:");
        label.setBounds(30, 30, 100, 25);
        frame.add(label);

        // Text field for input
        JTextField inputField = new JTextField();
        inputField.setBounds(140, 30, 150, 25);
        frame.add(inputField);

        // Button to calculate
        JButton button = new JButton("Calculate");
        button.setBounds(100, 70, 120, 30);
        frame.add(button);

        // Labels to show result
        JLabel squareLabel = new JLabel("Square: ");
        squareLabel.setBounds(30, 120, 200, 25);
        frame.add(squareLabel);

        JLabel cubeLabel = new JLabel("Cube: ");
        cubeLabel.setBounds(30, 150, 200, 25);
        frame.add(cubeLabel);

        // Action when button is clicked
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(inputField.getText());
                    int square = num * num;
                    int cube = num * num * num;

                    squareLabel.setText("Square: " + square);
                    cubeLabel.setText("Cube: " + cube);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number!");
                }
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}

import javax.swing.*;

public class MySwingApp {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("My First Swing App");

        // Create a button
        JButton button = new JButton("Click Me!");

        // Set button position and size (x, y, width, height)
        button.setBounds(100, 100, 120, 40);

        // Add button to frame
        frame.add(button);

        // Set frame size (width, height)
        frame.setSize(300, 300);

        // Set layout to null (absolute positioning)
        frame.setLayout(null);

        // Close the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}

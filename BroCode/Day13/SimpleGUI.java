import javax.swing.*;  
import java.awt.event.*;  

public class SimpleGUI {  
    public static void main(String[] args) {  
        // Create a new frame
        JFrame frame = new JFrame("My First GUI Program");  
        frame.setSize(300, 200);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setLayout(null);  

        // Create a label
        JLabel label = new JLabel("Hello, World!");  
        label.setBounds(100, 30, 150, 30);  
        frame.add(label);  

        // Create a button
        JButton button = new JButton("Click Me");  
        button.setBounds(90, 80, 120, 30);  
        frame.add(button);  

        // Add action to button
        button.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                label.setText("You clicked the button!");  
            }  
        });  

        // Make frame visible
        frame.setVisible(true);  
    }  
}

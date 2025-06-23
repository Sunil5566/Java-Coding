import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.Border;

public class A6_JFrame2 {
    public static void main(String[] args) {
        ImageIcon originalIcon = new ImageIcon("MyPhoto.jpg");
        Border border =BorderFactory.createLineBorder(Color.red, 3);

        // Resize the image to 150x150 pixels
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        // Create label with resized image
        JLabel label = new JLabel();
        label.setText("Hello I am Sunil");
        label.setIcon(resizedIcon);
        label.setHorizontalTextPosition(JLabel.CENTER); // text position
        label.setVerticalTextPosition(JLabel.BOTTOM);   // text under image
        label.setIconTextGap(10); // gap between image and text
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBounds(50, 50, 200, 200);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 250, 250);

        // Create frame and add label
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null); // using absolute positioning
        
        // Set full frame background color to black
        frame.getContentPane().setBackground(Color.BLACK);

        frame.add(label);
        frame.setVisible(true);
    }
}

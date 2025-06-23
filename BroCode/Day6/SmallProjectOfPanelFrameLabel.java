import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SmallProjectOfPanelFrameLabel {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("MyPhoto.jpg");
        Image imgg = img.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);

        // Create JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);

        // Image label
        JLabel imglabel = new JLabel(new ImageIcon(imgg));
        imglabel.setBounds(25, 20, 150, 150); // Positioned inside panel

        // "My Photo" text label
        JLabel headLabel = new JLabel("My Photo");
        headLabel.setBounds(60, 170, 100, 30); // Positioned inside panel

        // Name label (outside panel)
        JLabel nameLabel = new JLabel("Name : Sunil Bhattarai");
        nameLabel.setBounds(50, 270, 200, 30); // Below the panel

        // Panel to hold image and title
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(50, 30, 200, 220); // Increased height to fit image + text
        panel.setBackground(Color.CYAN);
        panel.add(imglabel);
        panel.add(headLabel);

        // Add to frame
        frame.add(panel);
        frame.add(nameLabel);

        // Show frame
        frame.setVisible(true);
    }
}

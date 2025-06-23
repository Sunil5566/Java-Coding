import java.awt.Color;
import javax.swing.JFrame;


class MyFrame extends JFrame{
   
    MyFrame(){
    
        this.setTitle("JFrame title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true);

        this.getContentPane().setBackground(new Color(1223, 332, 555));
    }
}

public class A5_JFrame {
    public static void main(String[] args) {
        // JFrame frame = new JFrame();
        // frame.setTitle("JFrame title");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        // frame.setResizable(false);
        // frame.setSize(420,420);
        // frame.setVisible(true);

        // frame.getContentPane().setBackground(Color.green);

        MyFrame myFrame = new MyFrame();
    }
}

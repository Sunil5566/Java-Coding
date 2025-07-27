//Program to make simple mini chatting app using swing components
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Main {
    public static void main(String[] args) {
        //JFrame
        JFrame frame1 = new JFrame();
        frame1.setSize(400, 500);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JTextArea chatting = new JTextArea();
        chatting.setEditable(false);

        JScrollPane chatMessage = new JScrollPane(chatting);
        frame1.setLayout(new BorderLayout());
        frame1.add(chatMessage, BorderLayout.CENTER);

        JTextField field1 = new JTextField();
        field1.setLayout(new BorderLayout());
        frame1.add(field1);

        JButton button1 = new JButton();
        button1.setSize(90, 90);
        frame1.add(button1);


        


         frame1.setVisible(true);



        

          
    }

}


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class MyFrame extends JFrame implements ActionListener {

        MyFrame()  {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("Iam not a robort");
        checkBox.setFocusable(false);
        
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class Myframe extends JFrame implements ActionListener {
     JComboBox comboBox;
    Myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        String[] animals = {"Dog", "Cat", "bird"};
   comboBox = new JComboBox(animals);
   comboBox.addActionListener(this);


        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == comboBox){
          System.out.println(comboBox.getSelectedItem()); 
       }
    }
    
}

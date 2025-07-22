import java.awt.*;
import java.awt.event.*;

public class SquareCubeCalculator extends Frame implements ActionListener {
    TextField input, output;
    Button squareBtn, cubeBtn;

    SquareCubeCalculator() {
        setTitle("Square and Cube Calculator");
        setSize(300, 200);
        setLayout(null);

        Label l1 = new Label("Enter Number:");
        l1.setBounds(30, 50, 100, 20);
        add(l1);

        input = new TextField();
        input.setBounds(140, 50, 100, 20);
        add(input);

        squareBtn = new Button("Square");
        squareBtn.setBounds(30, 90, 80, 30);
        squareBtn.addActionListener(this);
        add(squareBtn);

        cubeBtn = new Button("Cube");
        cubeBtn.setBounds(130, 90, 80, 30);
        cubeBtn.addActionListener(this);
        add(cubeBtn);

        output = new TextField();
        output.setBounds(30, 130, 210, 20);
        output.setEditable(false);
        add(output);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(input.getText());
            if (e.getSource() == squareBtn) {
                output.setText("Square: " + (num * num));
            } else if (e.getSource() == cubeBtn) {
                output.setText("Cube: " + (num * num * num));
            }
        } catch (NumberFormatException ex) {
            output.setText("Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        new SquareCubeCalculator();
    }
}

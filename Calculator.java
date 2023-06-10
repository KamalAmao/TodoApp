import java.awt.*;
import java.swing.*;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Calculator extends JFrame{
    private JTextField display;

    private double operand1;
    private double operand2;
    private String operator;
    private boolean newNumber;

    public Calculator(){
        initComponents();
    }
    private void initComponents(){
        setTitle("Calculator");

        display = new JTextField();
        display.setPreferredSize(new Dimension(200,40));
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.Right);
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        
        Jpannel buttonPanel = new JPanel(new GridLayout(4,4,5,5));
        String[][] buttonLabel = {
            {"7  "}
        }
    }
}

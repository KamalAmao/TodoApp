import javax.swing.*;

import javafx.event.ActionEvent;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionListener;

public class CalculatorAppDemo extends JFrame{
    private JPanel holder, row1, row2, row3, row4, row5; 
    private JButton bAdd, bDivide, bSubtract, bEquals, bMultiply, bDelete, bDot, bClear;
    private JButton bNumbers [];
    private JButton bFunction [];
    private JTextField textField;

    // private double num1, num2, result;
    // private char operator;

    public CalculatorAppDemo(){
        holder = new JPanel();
        holder.setLayout(new BoxLayout(holder, BoxLayout.PAGE_AXIS));
        row1 =new JPanel();
        row2 = new JPanel();
        row3 = new JPanel();
        row4 = new JPanel();
        row5 = new JPanel();

        textField = new JTextField(16);
        textField.setEditable(false);
        bAdd = new JButton("+");
        bDivide = new JButton("/");
        bDot = new JButton(".");
        bSubtract = new JButton("-");
        bDelete = new JButton("Del");
        bClear = new JButton("C");
        bMultiply = new JButton("*");

        // bFunction = new JButton[8];
        // bFunction[0] = bAdd;
        // bFunction[1] = bSubtract;
        // bFunction[2] = bMultiply;
        // bFunction[3] = bDivide;
        // bFunction[4] = bDot;
        // bFunction[5] = bEquals;
        // bFunction[6] = bDelete;
        // bFunction[7] = bClear;
        
        // for(int i = 0; i < 8; i++ ){
        //     bFunction[i].addActionListener(this);
        // }

        bNumbers = new JButton[10];
        for(int i = 0; i < bNumbers.length; i++){
            bNumbers[i] = new JButton(String.valueOf(i));
            //bNumbers[i].addActionListener();
        }

        row1.add(Box.createHorizontalGlue());
        row1.add(bClear);
        row1.add(bDelete);
        row2.add(bNumbers[7]);
        row2.add(bNumbers[8]);
        row2.add(bNumbers[9]);
        row2.add(bMultiply);
        row3.add(bNumbers[4]);
        row3.add(bNumbers[5]);
        row3.add(bNumbers[6]);
        row3.add(bAdd);
        row4.add(bNumbers[1]);
        row4.add(bNumbers[2]);
        row4.add(bNumbers[3]);
        row4.add(bSubtract);
        row5.add(bDot);
        row5.add(bNumbers[0]);
        row5.add(bEquals);
        row5.add(bDivide);

        //holder.setLayout(new BoxLayout(holder, BoxLayout.PAGE_AXIS));
        holder.add(textField);
        holder.add(Box.createRigidArea(new Dimension(0, 5)));
        holder.add(row1);
        holder.add(row2);
        holder.add(row3);
        holder.add(row4);
        holder.add(row5);

        add(holder);
    }
    public static void main(String[]args){
        CalculatorAppDemo calculatorApp  = new CalculatorAppDemo();
        calculatorApp.setVisible(true);
        calculatorApp.setTitle("CalculatorApp");
        calculatorApp.setSize(250, 300);
        calculatorApp.setLocationRelativeTo(null);
        calculatorApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

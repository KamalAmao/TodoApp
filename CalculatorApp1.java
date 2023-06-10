import javax.swing.*;

import javafx.event.ActionEvent;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculatorApp1 extends JFrame{
    private JPanel holder, row1, row2, row3, row4, row5;
    private JButton bAdd, bMultiply, bSubtract, bDivide, bClear, bDelete, bEquals, bDot;
    private JButton [] bNumbers;
    private JButton [] bFunction;
    private JTextField textField;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
    //private String previous, current, operator;

    public CalculatorApp1(){
        initComponents();
    }
    private void initComponents(){
        setTitle("CalculatorApp");
       
        textField = new JTextField(16);
        textField.setEditable(false);
        textField.setPreferredSize(new Dimension(200, 400));
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);

        bNumbers = new JButton[10];
        //bNumbers[10] = bDot;
        for (int i = 0; i < bNumbers.length - 1; i++) {
            bNumbers[i] = new JButton(String.valueOf(i));
            //bNumbers[count].setFont(new Font("Monospaced", Font.BOLD, 22));
            bNumbers[i].addActionListener(new ActionListener() {
                //@Override
                public void actionPerformed(ActionEvent e){
                    for(int i = 0; i < 11; i++){
                        if(e.getSource() == bNumbers[i]){
                            textField.setText(textField.getText().concat((String.valueOf(i))));
                        }
                    }
                    if(e.getSource() == bDot){
                        textField.setText(textField.getText().concat((".")));
                    }
                    if(e.getSource() == bAdd){
                        num1 = Double.parseDouble(textField.getText());
                        operator = '+';
                        textField.setText("");
                    }
                    if(e.getSource() == bSubtract){
                        num1 = Double.parseDouble(textField.getText());
                        operator = '-';
                        textField.setText("");
                    }
                    if(e.getSource() == bMultiply){
                        num1 = Double.parseDouble(textField.getText());
                        operator = '*';
                        textField.setText("");
                    }
                    if(e.getSource() == bDivide){
                        num1 = Double.parseDouble(textField.getText());
                        operator = '/';
                        textField.setText("");
                    }
                    if(e.getSource() == bEquals){
                        num2 = Double.parseDouble(textField.getText());
            
                        switch(operator){
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            result = num1 / num2;
                            break;
                        }
                        textField.setText(String.valueOf(result));
                        num1 = result;
                    }
                    if(e.getSource() == bClear){
                        textField.setText("");
            
                }
            }
         });
                
        }

        holder = new JPanel();
        holder.setLayout(new BoxLayout(holder, BoxLayout.PAGE_AXIS));
        row1 = new JPanel();
        row2 = new JPanel();
        row3 = new JPanel();
        row4 = new JPanel();
        row5 = new JPanel();

        
        // textField.setEditable(false);
        bSubtract = new JButton("-");
        bAdd = new JButton("+");
        bDivide = new JButton("/");
        bMultiply = new JButton("*");
        bDot = new JButton(".");
        bEquals = new JButton("=");
        bClear = new JButton("C");
        bDelete = new JButton("Del");

        bFunction = new JButton[8];
        bFunction[0] = bAdd;
        bFunction[1] = bSubtract;
        bFunction[2] = bMultiply;
        bFunction[3] = bDivide;
        bFunction[4] = bDot;
        bFunction[5] = bEquals;
        bFunction[6] = bDelete;
        bFunction[7] = bClear;
        
        // for(int i = 0; i < 8; i++ ){
        //     bFunction[i].addActionListener(this);
        // }

        // bNumbers = new JButton[10];
        // //bNumbers[10] = bDot;
        // for (int i = 0; i < bNumbers.length - 1; i++) {
        //     bNumbers[i] = new JButton(String.valueOf(i));
        //     //bNumbers[count].setFont(new Font("Monospaced", Font.BOLD, 22));
        //     bNumbers[i].addActionListener(this);
        // }
    
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
        setSize(250, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        }
    
    public static void main(String[]args){
        new CalculatorApp1().setVisible(true);
       
        
    }
}

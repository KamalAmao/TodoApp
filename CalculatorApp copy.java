import javax.swing.*;

import javafx.event.ActionEvent;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionListener;
public class CalculatorApp extends JFrame implements ActionListener{
    private JPanel holder, row1, row2, row3, row4, row5;
    private JButton bAdd, bMultiply, bSubtract, bDivide, bClear, bDelete, bEquals, bDot;
    private JButton bNumbers [];
    private JButton bFunction [];
    private JTextField textField;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;
    //private String previous, current, operator;

    public CalculatorApp(){
        holder = new JPanel();
        row1 = new JPanel();
        row2 = new JPanel();
        row3 = new JPanel();
        row4 = new JPanel();
        row5 = new JPanel();

        textField = new JTextField(16);
        textField.setEditable(false);
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
        
        for(int i = 0; i < 8; i++ ){
            bFunction[i].addActionListener(this);
        }

        bNumbers = new JButton[11];
        bNumbers[10] = bDot;
        for (int i = 0; i < bNumbers.length - 1; i++) {
            bNumbers[i] = new JButton(String.valueOf(i));
            //bNumbers[count].setFont(new Font("Monospaced", Font.BOLD, 22));
            bNumbers[i].addActionListener(this);
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

        holder.setLayout(new BoxLayout(holder, BoxLayout.PAGE_AXIS));
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
        CalculatorApp calculatorApp = new CalculatorApp();
        calculatorApp.setVisible(true);
        calculatorApp.setTitle("CalculatorApp");
        calculatorApp.setSize(250, 300);
        calculatorApp.setLocationRelativeTo(null);
        calculatorApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){ 
        for(int i = 0; i < 11; i++){
            if(e.getSource() == bNumbers[i]){
                textField.setText(textField.getText().add(String.valueOf(i)));
            }
        }
        if(e.getSource() == bDot){
            textField.setText(textField.getText().add("."));
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
        if(e.getSource == bEquals){
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
        // if(e.getSource() == bDelete){
        //     for(int i =0; i < textField.getText() - 1; i++){
        //         textField.setText(textField.getText() +)
        //     }
        //     textField.setText("");
        // }
            
            // JButton selectedBut = (JButton) e.getSource();
            // for (JButton button : bNumbers) {
            //     if (selectedBut == button) {
            //         appendToOutput(button.getText());
            //         updateOutput();
            //     }
            // }         
        }
        
        // JButton selectedBut = (JButton) e.getSource()
            
        //     if (selectedBut == bMultiply) {
        //         selectOperator(bMultiply.getText());
        //     } else if (selectedBut == bAdd) {
        //         selectOperator(bAdd.getText());
        //     } else if (selectedBut == bSubtract) {
        //         selectOperator(bSubtract.getText());
        //     } else if (selectedBut == bDivide) {
        //         selectOperator(bDivide.getText());
        //     }
        //     updateOutput();
        // }
        
        }  
    

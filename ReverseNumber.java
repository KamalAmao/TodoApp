import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ReverseNumber extends JFrame implements ActionListener {
    private JPanel holder;

    private JLabel lNumber;
    private JTextField tNumField;

    private JButton bRvrsNum;

    public ReverseNumber(){
        holder = new JPanel();
        holder.setLayout(new GridLayout(2, 2));

        lNumber = new JLabel("Number");
        tNumField = new JTextField(10);

        bRvrsNum = new JButton("Click here to reverse number");
        bRvrsNum.addActionListener(this);

        holder.add(lNumber);
        holder.add(tNumField);
        holder.add(bRvrsNum);

        
        
        add(holder);

    }
    // public int reverseNumber(int number){
    //     boolean isNegative = false;
    //     if(number < 0){
    //         isNegative = true;
    //         number *= -1;
    //     }
        
    //     long reversed = 0;
    //     while (number > 0){
    //         reversed = (reversed * 10) + (number % 10);
    //         number/=10;
    //     }

    //     return isNegative ? (int) (-1 * reversed) : (int) reversed;
    // }
    public static void main(String[] args) {
        ReverseNumber myReverseNumber = new ReverseNumber();
        myReverseNumber.setVisible(true);
        myReverseNumber.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myReverseNumber.setLocationRelativeTo(null);
        myReverseNumber.setTitle("Reverse Number App");
        myReverseNumber.setSize(400, 200);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bRvrsNum){
            try{
                if(tNumField.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Kindly input a number");
                }else {
                    int number = Integer.parseInt(tNumField.getText());
                    boolean isNegative = false;
                    if(number < 0){
                    isNegative = true;
                    number *= -1;
                    }
            
                    long reversed = 0;
                    while (number > 0){
                    reversed = (reversed * 10) + (number % 10);
                    number/=10;
                    }
    
                    int result = isNegative ? (int) (-1 * reversed) : (int) reversed;
                    JOptionPane.showMessageDialog(this,"reverse is " +result);
                }
                tNumField.setText("");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "kindly input numbers" +ex);
            }
            }
            
    }
}


        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Please provide the number");
        // int number = scanner.nextInt(); //-123 -> -321
        // int result = reverseNumber.reverseNumber(number);
        // System.out.println("The reverse number is " +result);

     /*boolean isNegative = false;
        if(number < 0){
            isNegative = true;
            number *= -1;
        }
        
        long reversed = 0;
        while (number > 0){
            reversed = (reversed * 10) + (number % 10);
            number/=10;
        }

        result = isNegative ? (int) (-1 * reversed) : (int) reversed;
        System.out.println(result);*/



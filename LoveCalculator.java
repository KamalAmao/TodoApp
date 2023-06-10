import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class LoveCalculator extends JFrame implements ActionListener{
    private JPanel holder;
    private JPanel labPanel, button;
    

    private JLabel lYname, lPname;
    private JTextField tYname, tPname;

    private JButton bCalLove;
    //private JButton bExit;

    public LoveCalculator(){
        holder = new JPanel();
        holder.setLayout(new GridLayout (2, 1));

        labPanel = new JPanel();
        labPanel.setLayout(new GridLayout(2, 2));

        button = new JPanel();
        button.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        

        lYname = new JLabel("Your Name");
        tYname = new JTextField(10);
        lPname = new JLabel("Partners name");
        tPname = new JTextField(10);

        bCalLove = new JButton("Calculate Love %");
        bCalLove.addActionListener(this);
        // bCalLove.setSize(100, 30);
        // bCalLove.setLocation(100, 100);
        // holder.add(bCalLove);
        // holder.setVisible(true);
        // bCalLove.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // bCalLove.setLayout(null);
        // bCalLove.setVisible(true);
        // bCalLove.setSize(100, 100);
        // bCalLove.add(bCalLove);
        //bExit = new JButton("Exit");
       // bExit.addActionListener(this);

        labPanel.add(lYname);
        labPanel.add(tYname);
        labPanel.add(lPname);
        labPanel.add(tPname);

        button.add(bCalLove);
        //holder.add(bExit);   
        holder.add(labPanel);
        holder.add(button);

        add(holder);

    }
    public static void main(String[]args){
        LoveCalculator loveCalculator = new LoveCalculator();
        loveCalculator.setVisible(true);
        loveCalculator.setSize(500, 250);
        loveCalculator.setTitle("Love Calculator App");
        loveCalculator.setLocationRelativeTo(null);
        loveCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bCalLove){
            //try{
                if(tYname.getText().equals("") || (tPname.getText().equals(""))){
                    JOptionPane.showMessageDialog(this, "Kindly input both your name and your partner's name");
                }else{
                    Random random = new Random();
                    int randomNumber = random.nextInt(100);
                    //System.out.println(randomNumber);
    
                    if((randomNumber>=70)&&(randomNumber<=100)){
                        JOptionPane.showMessageDialog(this, "Congratulations " +tYname.getText()+ " your love with " +tPname.getText()+ " is " +randomNumber+"%. You are compatible" );
                    }else if((randomNumber >= 50)&&(randomNumber <=69)){
                        JOptionPane.showMessageDialog(this, "Hmm " +tYname.getText()+ " your love with " +tPname.getText()+ " is " +randomNumber+"%. Fix things between eachother or else you are not compatible");
                    }else{
                        JOptionPane.showMessageDialog(this, "Hey " +tYname.getText()+ " you and your " +tPname.getText()+ " are not compatible because you have " +randomNumber+"%" );
                        
                        // tYname.setText("");
                        // tPname.setText("");
                    }
                        tYname.setText("");
                        tPname.setText("");

                        
            }
           
        // }catch(Exception ex){
        //     JOptionPane.showMessageDialog(this,"Kindly check your inputs " + ex);
        // }
    // } if(e.getSource() == bExit){
    //     System.exit(0);
    // }
    

    //     Scanner x = new Scanner(System.in);
    //     System.out.println("Hey my name is kamal, I'M smart enough to determine how much your patner loves you if you can follow my instruction");
    //     System.out.println("Kindly supply your name");
    //     System.out.println("Kindly supply the name of your patner");
    //     String yourName = x.next();
    //     String patnerName = x.next();
    //     //System.out.println("Kindly supply ")
    //     Random random = new Random();
    //     int randomNumber = random.nextInt(100);
    //     System.out.println(randomNumber);

    //     if((randomNumber>=90)&&(randomNumber<=100)){
    //         System.out.println(yourName + patnerName + " Your love is strong");
    //     }
    }   
    }
}

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.color.*;
public class CgpaApp extends JFrame implements ActionListener {
    private JPanel holder;
    private JPanel labPanel, button;
    private JPanel Gpanel;
    private JPanel cBoxpanel;

    private JLabel lCourse1, lCourse2, lCourse3, lCourse4, lCourse5, lCourse6, lCourse7, lCourse8, lCourse9;
    private JTextField tScore1, tScore2, tScore3, tScore4, tScore5, tScore6, tScore7, tScore8, tScore9;
    private JLabel lUnit1, lUnit2, lUnit3, lUnit4, lUnit5, lUnit6, lUnit7, lUnit8, lUnit9;
    private JTextField  tUnit1, tUnit2, tUnit3, tUnit4, tUnit5, tUnit6, tUnit7, tUnit8, tUnit9;
    private JLabel lGrade1, lGrade2, lGrade3, lGrade4, lGrade5, lGrade6, lGrade7, lGrade8, lGrade9;
    private JTextField tGrade1, tGrade2, tGrade3, tGrade4, tGrade5, tGrade6, tGrade7, tGrade8, tGrade9;
    //private JLabel lGresult;
    private JTextField tGresult;
    private JComboBox cCombobox;

    private JButton bCal, bExit;

    public CgpaApp(){
        holder = new JPanel();
        holder.setLayout(new GridLayout(4, 1));

        cBoxpanel = new JPanel();
        cBoxpanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        labPanel = new JPanel();
        labPanel.setLayout(new GridLayout(9, 4));

        button = new JPanel();
        button.setLayout(new FlowLayout(FlowLayout.CENTER));

        Gpanel = new JPanel();
        Gpanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        lCourse1 = new JLabel("CSE201");
        tScore1 = new JTextField(10);

        
        lCourse2 = new JLabel("CSE202");
        tScore2 = new JTextField(10);

        lCourse3 = new JLabel("CSE203");
        tScore3 = new JTextField(10);

        lCourse4 = new JLabel("CSE204");
        tScore4 = new JTextField(10);

        lCourse5 = new JLabel("CSE205");
        tScore5 = new JTextField(10);

        lCourse6 = new JLabel("CSE206");
        tScore6 = new JTextField(10);

        lCourse7 = new JLabel("CSE207");
        tScore7 = new JTextField(10);

        lCourse8 = new JLabel("CSE208");
        tScore8 = new JTextField(10);

        lCourse9 = new JLabel("CSE209");
        tScore9 = new JTextField(10);


        lUnit1 = new JLabel("Unit");
        tUnit1 = new JTextField(10);
        tUnit1.setText("5");
        tUnit1.setEditable(false);

        lUnit2 = new JLabel("Unit");
        tUnit2 = new JTextField(10);
        tUnit2.setText("4");
        tUnit2.setEditable(false);

        lUnit3 = new JLabel("Unit");
        tUnit3 = new JTextField(10);
        tUnit3.setText("3");
        tUnit3.setEditable(false);

        lUnit4 = new JLabel("Unit");
        tUnit4 = new JTextField(10);
        tUnit4.setText("3");
        tUnit4.setEditable(false);

        lUnit5 = new JLabel("Unit");
        tUnit5 = new JTextField(10);
        tUnit5.setText("4");
        tUnit5.setEditable(false);

        lUnit6 = new JLabel("Unit");
        tUnit6 = new JTextField(10);
        tUnit6.setText("3");
        tUnit6.setEditable(false);

        lUnit7 = new JLabel("Unit");
        tUnit7 = new JTextField(10);
        tUnit7.setText("3");
        tUnit7.setEditable(false);

        lUnit8 = new JLabel("Unit");
        tUnit8 = new JTextField(10);
        tUnit8.setText("3");
        tUnit8.setEditable(false);

        lUnit9 = new JLabel("Unit");
        tUnit9 = new JTextField(10);
        tUnit9.setText("4");
        tUnit9.setEditable(false);

        lGrade1 = new JLabel("Grade");
        tGrade1 = new JTextField(10);
        tGrade1.setEditable(false);

        lGrade2 = new JLabel("Grade");
        tGrade2 = new JTextField(10);
        tGrade2.setEditable(false);

        lGrade3 = new JLabel("Grade");
        tGrade3 = new JTextField(10);
        tGrade3.setEditable(false);

        lGrade4 = new JLabel("Grade");
        tGrade4 = new JTextField(10);
        tGrade4.setEditable(false);

        lGrade5 = new JLabel("Grade");
        tGrade5 = new JTextField(10);
        tGrade5.setEditable(false);

        lGrade6 = new JLabel("Grade");
        tGrade6 = new JTextField(10);
        tGrade6.setEditable(false);

        lGrade7 = new JLabel("Grade");
        tGrade7 = new JTextField(10);
        tGrade7.setEditable(false);

        lGrade8 = new JLabel("Grade");
        tGrade8 = new JTextField(10);
        tGrade8.setEditable(false);

        lGrade9 = new JLabel("Grade");
        tGrade9 = new JTextField(10);
        tGrade9.setEditable(false);

        //lGresult = new JLabel();
        tGresult = new JTextField(10);
        tGresult.setEditable(false);

       
        String [] semesters = {"First semester", "Second semester"};
        cCombobox = new JComboBox(semesters);
        cCombobox.setSelectedIndex(0);
        cCombobox.addActionListener(this);

        bCal = new JButton("Calculculate your GPA");
        bCal.addActionListener(this);
        bExit = new JButton("Exit");
        bExit.addActionListener(this);

        cBoxpanel.add(cCombobox);
        // labPanel.add(cComboBox);
        labPanel.add(lCourse1);
        labPanel.add(tScore1);
        labPanel.add(lUnit1);
        labPanel.add(tUnit1);
        labPanel.add(lGrade1);
        labPanel.add(tGrade1);
        labPanel.add(lCourse2);
        labPanel.add(tScore2);
        labPanel.add(lUnit2);
        labPanel.add(tUnit2);
        labPanel.add(lGrade2);
        labPanel.add(tGrade2);
        labPanel.add(lCourse3);
        labPanel.add(tScore3);
        labPanel.add(lUnit3);
        labPanel.add(tUnit3);
        labPanel.add(lGrade3);
        labPanel.add(tGrade3);
        labPanel.add(lCourse4);
        labPanel.add(tScore4);
        labPanel.add(lUnit4);
        labPanel.add(tUnit4);
        labPanel.add(lGrade4);
        labPanel.add(tGrade4);
        labPanel.add(lCourse5);
        labPanel.add(tScore5);
        labPanel.add(lUnit5);
        labPanel.add(tUnit5);
        labPanel.add(lGrade5);
        labPanel.add(tGrade5);
        labPanel.add(lCourse6);
        labPanel.add(tScore6);
        labPanel.add(lUnit6);
        labPanel.add(tUnit6);
        labPanel.add(lGrade6);
        labPanel.add(tGrade6);
        labPanel.add(lCourse7);
        labPanel.add(tScore7);
        labPanel.add(lUnit7);
        labPanel.add(tUnit7);
        labPanel.add(lGrade7);
        labPanel.add(tGrade7);
        labPanel.add(lCourse8);
        labPanel.add(tScore8);
        labPanel.add(lUnit8);
        labPanel.add(tUnit8);
        labPanel.add(lGrade8);
        labPanel.add(tGrade8);
        labPanel.add(lCourse9);
        labPanel.add(tScore9);
        labPanel.add(lUnit9);
        labPanel.add(tUnit9);
        labPanel.add(lGrade9);
        labPanel.add(tGrade9);
        
        //lGpanel.add(lGresult);
        Gpanel.add(tGresult);

        button.add(bCal);
        button.add(bExit);

        holder.add(cBoxpanel);
        holder.add(labPanel);
        holder.add(Gpanel);
        holder.add(button);
        add(holder);
    }
    public static void main(String[]args){
        CgpaApp cgpaApp = new CgpaApp();
        cgpaApp.setVisible(true);
        cgpaApp.setTitle("CGPA CALCULATOR APP");
        cgpaApp.setLocationRelativeTo(null);
        cgpaApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cgpaApp.setSize(900, 500);
        
        
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == cCombobox){
            cCombobox.getSelectedItem();
        }
        // for(int i = 0; i < tScore.getText().length; i++){

        // }
                int totalSumOfUnit = 0;
                int totalSumOfPoint = 0;
        if(e.getSource() == bCal){
            //try{
                if(tScore1.getText().equals("") || tScore2.getText().equals("") || tScore3.getText().equals("") || tUnit1.getText().equals("") || tUnit2.getText().equals("") || tUnit3.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "Kindly input all the require details");
                }else{
                    int score = Integer.parseInt(tScore1.getText()); Integer.parseInt(tScore2.getText()); Integer.parseInt(tScore3.getText());
                    // int score1 = Integer.parseInt(tScore1.getText()); 
                    // int score2 = Integer.parseInt(tScore2.getText()); 
                    // int score3 = Integer.parseInt(tScore3.getText());
                    int unit = Integer.parseInt(tUnit1.getText()); Integer.parseInt(tUnit2.getText()); Integer.parseInt(tUnit3.getText());
                    // int unit1 = Integer.parseInt(tUnit1.getText()); 
                    // int unit2 = Integer.parseInt(tUnit2.getText()); 
                    // int unit3 = Integer.parseInt(tUnit3.getText());
                    
            for(int semester = 1; semester <= 2; semester++){
                //System.out.println("This is semester" + semester);
                for(int course = 1; course <= 3; course++){
                    // System.out.println("Kindly provide your score and unit in course" + course);
                    // int score = input.nextInt();
                    // int unit = input.nextInt();
                    // totalSumOfUnit = totalSumOfUnit + unit;

                    if((score>=70) && (score <= 100)){
                        tGrade1.setText("A");
                        totalSumOfPoint+= unit * 5;
                    }else if((score>=60) && (score<=69)){
                        tGrade1.setText("B");
                        totalSumOfPoint+= unit * 4;
                    }else if((score>=50) && (score<=59)){
                        tGrade1.setText("C");
                        totalSumOfPoint+= unit * 3;
                    }else if((score>=45) && (score<=49)){
                        tGrade1.setText("D");
                        totalSumOfPoint+= unit * 2;
                    }else{
                        tGrade1.setText("F");
                        totalSumOfPoint+= unit * 0;
                    }
                }
            }
            double cgpa = totalSumOfPoint/totalSumOfUnit;
            System.out.println("your cgpa is" +cgpa);
                    
                //     if((score1>=70) && (score1 <= 100)){
                //         tGrade1.setText("A");
                //         totalSumOfPoint+= unit1 * 5;
                //     }else if((score1>=60) && (score1<=69)){
                //         tGrade1.setText("B");
                //         totalSumOfPoint+= unit1 * 4;
                //     }else if((score1>=50) && (score1<=59)){
                //         tGrade1.setText("C");
                //         totalSumOfPoint+= unit1 * 3;
                //     }else if((score1>=45) && (score1<=49)){
                //         tGrade1.setText("D");
                //         totalSumOfPoint+= unit1 * 2;
                //     }else{
                //         tGrade1.setText("F");
                //         totalSumOfPoint+= unit1 * 0;
                //     }
                //     if((score2>=70) && (score2 <= 100)){
                //         tGrade2.setText("A");
                //         totalSumOfPoint+= unit2 * 5;
                //     }else if((score2>=60) && (score2<=69)){
                //         tGrade2.setText("B");
                //         totalSumOfPoint+= unit2 * 4;
                //     }else if((score2>=50) && (score2<=59)){
                //         tGrade2.setText("C");
                //         totalSumOfPoint+= unit2 * 3;
                //     }else if((score2>=45) && (score2<=49)){
                //         tGrade2.setText("D");
                //         totalSumOfPoint+= unit2 * 2;
                //     }else{
                //         tGrade2.setText("F");
                //         totalSumOfPoint+= unit2 * 0;
                //     }
                //     if((score3>=70) && (score3 <= 100)){
                //         tGrade3.setText("A");
                //         totalSumOfPoint+= unit3 * 5;
                //     }else if((score3>=60) && (score3<=69)){
                //         tGrade3.setText("B");
                //         totalSumOfPoint+= unit3 * 4;
                //     }else if((score3>=50) && (score3<=59)){
                //         tGrade3.setText("C");
                //         totalSumOfPoint+= unit3 * 3;
                //     }else if((score3>=45) && (score3<=49)){
                //         tGrade3.setText("D");
                //         totalSumOfPoint+= unit3 * 2;
                //     }else{
                //         tGrade3.setText("F");
                //         totalSumOfPoint+= unit3 * 0;
                //     }
    
                //     totalSumOfUnit = totalSumOfUnit + unit1 + unit2 + unit3;
                // }
                //     double gpa = totalSumOfPoint/totalSumOfUnit;
                //     tGresult.setText("Your GPA is " +gpa +"%");
            // }catch(Exception ex){
            //     JOptionPane.showMessageDialog(this,"kindly check your input " +ex);
            // }
        }   
        if(e.getSource() == bExit){
            System.exit(0);
        }
    }

    
}
}


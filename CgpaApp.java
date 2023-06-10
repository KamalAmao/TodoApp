
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.color.*;
import java.util.List;
import java.util.ArrayList;

public class CgpaApp extends JFrame implements ActionListener, KeyListener, ItemListener {
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
    String [] semesters = {"Semester", "First semester", "Second semester"};
    private JComboBox<String> sems;

    private JButton bCal, bExit;

    //List<CgpaInfo> cgpa = new ArrayList<>();

    public CgpaApp(){
        holder = new JPanel();
        holder.setLayout(new GridLayout(4, 1));

        cBoxpanel = new JPanel();
        cBoxpanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        labPanel = new JPanel();
        labPanel.setLayout(new GridLayout(9, 4, 40, 0));
        
        
        sems = new JComboBox(semesters);
        //sems.setSelectedIndex(0);
        sems.addItemListener(this);


        button = new JPanel();
        button.setLayout(new FlowLayout(FlowLayout.CENTER));

        Gpanel = new JPanel();
        Gpanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        lCourse1 = new JLabel("CSE201");
        tScore1 = new JTextField("Enter score", 5);
        tScore1.addKeyListener(this);
        lUnit1 = new JLabel("Unit");
        tUnit1 = new JTextField("5", 5);
        tUnit1.setEditable(false);
        lGrade1 = new JLabel("Grade");
        tGrade1 = new JTextField(5);
        tGrade1.setEditable(false);

        lCourse2 = new JLabel("CSE202");
        tScore2 = new JTextField("Enter score",5);
        tScore2.addKeyListener(this);
        lUnit2 = new JLabel("Unit");
        tUnit2 = new JTextField("4", 5);
        tUnit2.setEditable(false);
        lGrade2 = new JLabel("Grade");
        tGrade2 = new JTextField(5);
        tGrade2.setEditable(false);

        lCourse3 = new JLabel("CSE203");
        tScore3 = new JTextField("Enter score", 5);
        tScore3.addKeyListener(this);
        lUnit3 = new JLabel("Unit");
        tUnit3 = new JTextField("3", 5);
        tUnit3.setEditable(false);
        lGrade3 = new JLabel("Grade");
        tGrade3 = new JTextField(5);
        tGrade3.setEditable(false);

        lCourse4 = new JLabel("CSE204");
        tScore4 = new JTextField("Enter score", 5);
        tScore4.addKeyListener(this);
        lUnit4 = new JLabel("Unit");
        tUnit4 = new JTextField("4", 5);
        tUnit4.setEditable(false);
        lGrade4 = new JLabel("Grade");
        tGrade4 = new JTextField(5);
        tGrade4.setEditable(false);

        lCourse5 = new JLabel("CSE205");
        tScore5 = new JTextField("Enter score", 5);
        tScore5.addKeyListener(this);
        lUnit5 = new JLabel("Unit");
        tUnit5 = new JTextField("4",5);
        tUnit5.setEditable(false);
        lGrade5 = new JLabel("Grade");
        tGrade5 = new JTextField(5);
        tGrade5.setEditable(false);

        lCourse6 = new JLabel("CSE206");
        tScore6 = new JTextField("Enter score", 5);
        tScore6.addKeyListener(this);
        lUnit6 = new JLabel("Unit");
        tUnit6 = new JTextField("3", 5);
        tUnit6.setEditable(false);
        lGrade6 = new JLabel("Grade");
        tGrade6 = new JTextField(5);
        tGrade6.setEditable(false);

        lCourse7 = new JLabel("CSE207");
        tScore7 = new JTextField("Enter score", 5);
        tScore7.addKeyListener(this);
        lUnit7 = new JLabel("Unit");
        tUnit7 = new JTextField("3", 5);
        tUnit7.setEditable(false);
        lGrade7 = new JLabel("Grade");
        tGrade7 = new JTextField(5);
        tGrade7.setEditable(false);

        lCourse8 = new JLabel("CSE208");
        tScore8 = new JTextField("Enter score", 5);
        tScore8.addKeyListener(this);
        lUnit8 = new JLabel("Unit");
        tUnit8 = new JTextField("5", 5);
        tUnit8.setEditable(false);
        lGrade8 = new JLabel("Grade");
        tGrade8 = new JTextField(5);
        tGrade8.setEditable(false);

        lCourse9 = new JLabel("CSE209");
        tScore9 = new JTextField("Enter score", 5);
        tScore9.addKeyListener(this);
        lUnit9 = new JLabel("Unit");
        tUnit9 = new JTextField("4", 5);
        tUnit9.setEditable(false);
        lGrade9 = new JLabel("Grade");
        tGrade9 = new JTextField(10);
        tGrade9.setEditable(false);



        

        

        //lGresult = new JLabel();
        tGresult = new JTextField(5);
        tGresult.setEditable(false);

       
    
        bCal = new JButton("Calculculate your GPA");
        bCal.addActionListener(this);
        bExit = new JButton("Exit");
        bExit.addActionListener(this);

        cBoxpanel.add(sems);
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
        // if(e.getSource() == cCombobox){
        //     cCombobox.getAction();
        //     tScore1.setText("");
        //     tScore2.setText("");
        //     tScore3.setText("");
        //     tScore4.setText("");
        //     tScore5.setText("");
        //     tScore6.setText("");
        //     tScore7.setText("");
        //     tScore8.setText("");
        //     tScore9.setText("");
        //     tGrade1.setText("");
        //     tGrade2.setText("");
        //     tGrade3.setText("");
        //     tGrade4.setText("");
        //     tGrade5.setText("");
        //     tGrade6.setText("");
        //     tGrade7.setText("");
        //     tGrade8.setText("");
        //     tGrade9.setText("");
        //     tGresult.setText("");

        //     tUnit1.setText("4");
        //     tUnit1.setEditable(false);
        //     tUnit2.setText("5");
        //     tUnit2.setEditable(false);
        //     tUnit3.setText("3");
        //     tUnit3.setEditable(false);
        //     tUnit4.setText("4");
        //     tUnit4.setEditable(false);
        //     tUnit5.setText("3");
        //     tUnit5.setEditable(false);
        //     tUnit6.setText("5");
        //     tUnit6.setEditable(false);
        //     tUnit7.setText("4");
        //     tUnit7.setEditable(false);
        //     tUnit8.setText("3");
        //     tUnit8.setEditable(false);
        //     tUnit9.setText("4");
        //     tUnit9.setEditable(false);
            
            
        // }else{

        // }
        // // for(int i = 0; i < tScore.getText().length; i++){

        // // }
                int totalSumOfUnit = 0;
                int totalSumOfPoint = 0;
        if(e.getSource() == bCal){
            try{
                if(tScore1.getText().equals("") || tScore2.getText().equals("") || tScore3.getText().equals("") || tScore4.getText().equals("") || tScore5.getText().equals("") || tScore6.getText().equals("") || tScore7.getText().equals("") || tScore8.getText().equals("") || tScore9.getText().equals("")){ // || tUnit1.getText().equals("") || tUnit2.getText().equals("") || tUnit3.getText().equals("")
                    JOptionPane.showMessageDialog(this, "Kindly input all the require details");
                }else{
                    
                    int score1 = Integer.parseInt(tScore1.getText()); 
                    int score2 = Integer.parseInt(tScore2.getText()); 
                    int score3 = Integer.parseInt(tScore3.getText());
                    int score4 = Integer.parseInt(tScore4.getText()); 
                    int score5 = Integer.parseInt(tScore5.getText()); 
                    int score6 = Integer.parseInt(tScore6.getText());
                    int score7 = Integer.parseInt(tScore7.getText()); 
                    int score8 = Integer.parseInt(tScore8.getText()); 
                    int score9 = Integer.parseInt(tScore9.getText());
    
                    int unit1 = Integer.parseInt(tUnit1.getText()); 
                    int unit2 = Integer.parseInt(tUnit2.getText()); 
                    int unit3 = Integer.parseInt(tUnit3.getText());
                    int unit4 = Integer.parseInt(tUnit4.getText()); 
                    int unit5 = Integer.parseInt(tUnit5.getText()); 
                    int unit6 = Integer.parseInt(tUnit6.getText());
                    int unit7 = Integer.parseInt(tUnit7.getText()); 
                    int unit8 = Integer.parseInt(tUnit8.getText()); 
                    int unit9 = Integer.parseInt(tUnit9.getText());
                    
                    if((score1>=70) && (score1 <= 100)){
                        tGrade1.setText("A");
                        totalSumOfPoint+= unit1 * 5;
                    }else if((score1>=60) && (score1<=69)){
                        tGrade1.setText("B");
                        totalSumOfPoint+= unit1 * 4;
                    }else if((score1>=50) && (score1<=59)){
                        tGrade1.setText("C");
                        totalSumOfPoint+= unit1 * 3;
                    }else if((score1>=45) && (score1<=49)){
                        tGrade1.setText("D");
                        totalSumOfPoint+= unit1 * 2;
                    }else{
                        tGrade1.setText("F");
                        totalSumOfPoint+= unit1 * 0;
                    }
                    if((score2>=70) && (score2 <= 100)){
                        tGrade2.setText("A");
                        totalSumOfPoint+= unit2 * 5;
                    }else if((score2>=60) && (score2<=69)){
                        tGrade2.setText("B");
                        totalSumOfPoint+= unit2 * 4;
                    }else if((score2>=50) && (score2<=59)){
                        tGrade2.setText("C");
                        totalSumOfPoint+= unit2 * 3;
                    }else if((score2>=45) && (score2<=49)){
                        tGrade2.setText("D");
                        totalSumOfPoint+= unit2 * 2;
                    }else{
                        tGrade2.setText("F");
                        totalSumOfPoint+= unit2 * 0;
                    }
                    if((score3>=70) && (score3 <= 100)){
                        tGrade3.setText("A");
                        totalSumOfPoint+= unit3 * 5;
                    }else if((score3>=60) && (score3<=69)){
                        tGrade3.setText("B");
                        totalSumOfPoint+= unit3 * 4;
                    }else if((score3>=50) && (score3<=59)){
                        tGrade3.setText("C");
                        totalSumOfPoint+= unit3 * 3;
                    }else if((score3>=45) && (score3<=49)){
                        tGrade3.setText("D");
                        totalSumOfPoint+= unit3 * 2;
                    }else{
                        tGrade3.setText("F");
                        totalSumOfPoint+= unit3 * 0;
                    }
                    if((score4 >=70) && (score4 <= 100)){
                        tGrade4.setText("A");
                        totalSumOfPoint+= unit4 * 5;
                    }else if((score4>=60) && (score4<=69)){
                        tGrade4.setText("B");
                        totalSumOfPoint+= unit4 * 4;
                    }else if((score4>=50) && (score4<=59)){
                        tGrade4.setText("C");
                        totalSumOfPoint+= unit4 * 3;
                    }else if((score4>=45) && (score4<=49)){
                        tGrade4.setText("D");
                        totalSumOfPoint+= unit4 * 2;
                    }else{
                        tGrade4.setText("F");
                        totalSumOfPoint+= unit4 * 0;
                    }
                    if((score5>=70) && (score5 <= 100)){
                        tGrade5.setText("A");
                        totalSumOfPoint+= unit5 * 5;
                    }else if((score5>=60) && (score5<=69)){
                        tGrade5.setText("B");
                        totalSumOfPoint+= unit5 * 4;
                    }else if((score5>=50) && (score5<=59)){
                        tGrade5.setText("C");
                        totalSumOfPoint+= unit5 * 3;
                    }else if((score5>=45) && (score5<=49)){
                        tGrade5.setText("D");
                        totalSumOfPoint+= unit5 * 2;
                    }else{
                        tGrade5.setText("F");
                        totalSumOfPoint+= unit5 * 0;
                    }
                    if((score6>=70) && (score6 <= 100)){
                        tGrade6.setText("A");
                        totalSumOfPoint+= unit6 * 5;
                    }else if((score6>=60) && (score6<=69)){
                        tGrade6.setText("B");
                        totalSumOfPoint+= unit6 * 4;
                    }else if((score6>=50) && (score6<=59)){
                        tGrade6.setText("C");
                        totalSumOfPoint+= unit6 * 3;
                    }else if((score6>=45) && (score6<=49)){
                        tGrade6.setText("D");
                        totalSumOfPoint+= unit6 * 2;
                    }else{
                        tGrade6.setText("F");
                        totalSumOfPoint+= unit6 * 0;
                    }
                    if((score7>=70) && (score7 <= 100)){
                        tGrade7.setText("A");
                        totalSumOfPoint+= unit7 * 5;
                    }else if((score7>=60) && (score7<=69)){
                        tGrade7.setText("B");
                        totalSumOfPoint+= unit7 * 4;
                    }else if((score7>=50) && (score7<=59)){
                        tGrade7.setText("C");
                        totalSumOfPoint+= unit7 * 3;
                    }else if((score7>=45) && (score7<=49)){
                        tGrade7.setText("D");
                        totalSumOfPoint+= unit7 * 2;
                    }else{
                        tGrade7.setText("F");
                        totalSumOfPoint+= unit7 * 0;
                    }
                    if((score8>=70) && (score8 <= 100)){
                        tGrade8.setText("A");
                        totalSumOfPoint+= unit8 * 5;
                    }else if((score8>=60) && (score8<=69)){
                        tGrade8.setText("B");
                        totalSumOfPoint+= unit8 * 4;
                    }else if((score8>=50) && (score3<=59)){
                        tGrade8.setText("C");
                        totalSumOfPoint+= unit8 * 3;
                    }else if((score8>=45) && (score8<=49)){
                        tGrade8.setText("D");
                        totalSumOfPoint+= unit8 * 2;
                    }else{
                        tGrade8.setText("F");
                        totalSumOfPoint+= unit8 * 0;
                    }
                    if((score9>=70) && (score9 <= 100)){
                        tGrade9.setText("A");
                        totalSumOfPoint+= unit9 * 5;
                    }else if((score9>=60) && (score9<=69)){
                        tGrade9.setText("B");
                        totalSumOfPoint+= unit9 * 4;
                    }else if((score9>=50) && (score9<=59)){
                        tGrade9.setText("C");
                        totalSumOfPoint+= unit9 * 3;
                    }else if((score9>=45) && (score9<=49)){
                        tGrade9.setText("D");
                        totalSumOfPoint+= unit9 * 2;
                    }else{
                        tGrade9.setText("F");
                        totalSumOfPoint+= unit9 * 0;
                    }
    
                    totalSumOfUnit = totalSumOfUnit + unit1 + unit2 + unit3 + unit4 + unit5 + unit6 + unit7 + unit8 + unit9;
                }
                    double gpa = totalSumOfPoint/totalSumOfUnit;
                    tGresult.setText("Your GPA is " +gpa +"%");
                    //cgpa.add(new CgpaInfo(Integer.parseInt(tScore1.getText()), Integer.parseInt(tUnit1.getText()), tGrade1.getText()));
                    //  Integer.parseInt(tScore2.getText()), Integer.parseInt(tUnit2.getText()), tGrade2.getText(), Integer.parseInt(tScore3.getText()), Integer.parseInt(tUnit3.getText()), tGrade3.getText(), Integer.parseInt(tScore4.getText()),Integer.parseInt(tUnit4.getText()), tGrade4.getText(), Integer.parseInt(tScore5.getText()), Integer.parseInt(tUnit5.getText()), tGrade5.getText(), Integer.parseInt(tScore6.getText()), Integer.parseInt(tUnit6.getText()), tGrade6.getText(), Integer.parseInt(tScore7.getText()), Integer.parseInt(tUnit7.getText()), tGrade7.getText(), Integer.parseInt(tScore8.getText()), Integer.parseInt(tUnit8.getText()), tGrade8.getText(), Integer.parseInt(tScore9.getText()), Integer.parseInt(tUnit9.getText())), tGrade9.getText()
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this,"kindly check your input " +ex);
            }
        }   
        if(e.getSource() == bExit){
            System.exit(0);
        }
    }
}

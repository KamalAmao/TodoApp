
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.color.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class CgpaApp1 extends JFrame implements KeyListener, ItemListener, ActionListener {
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
    private JLabel lGresult;
    private JTextField tGresult;
    String [] semesters = {"Semester", "First semester", "Second semester"};
    private JComboBox<String> sems;

    private JButton bCal, bExit;

    private Map<String, List<CgpaInfo>> gpaMap = new HashMap<>();
    //private List<CgpaInfo> cgpaInfo = new ArrayList<>();

    public CgpaApp1(){
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



        

        

        lGresult = new JLabel();
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
        CgpaApp1 cgpaApp = new CgpaApp1();
        cgpaApp.setVisible(true);
        cgpaApp.setTitle("CGPA CALCULATOR APP");
        cgpaApp.setLocationRelativeTo(null);
        cgpaApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cgpaApp.setSize(900, 500);
        
        
    }
    // public void actionPerformed(ActionEvent ev){
    //     if(ev.getSource() == bCal){
            
    // }
    @Override
    public void itemStateChanged(ItemEvent e) {


        int x = sems.getSelectedIndex();
        switch (x){
            case 0:
                JOptionPane.showMessageDialog(this,"Sorry, an item has to be selected");
                break;
            case 1:
                // int score1 = Integer.parseInt(tScore1.getText());
                // int unit1 = Integer.parseInt(tUnit1.getText());

                 //gpaMap.put("firstSemester", cgpaInfo.add(new CgpaInfo(Double.parseDouble(tScore1.getText()), Integer.parseInt(tUnit1.getText()), tGrade1.getText())));
                 gpaMap.put("firstSemester", new int [] {Integer.parseInt(tScore1.getText()), Integer.parseInt(tUnit1.getText()), tGrade1.getText()});
                 
                 gpaMap.put("firstSemester", new ArrayList<CgpaInfo>());
                 


                //  for(Map.Entry<String, List<CgpaInfo>> entry : gpaMap.entrySet());
                //  String key = entry.getKey();
                //  List<CgpaInfo> values = entry.getValue();


                break;
            case 2:
            // gpaMap.put("SecondSemester", new ArrayList<CgpaInfo>());
                 
            //      for(Map.Entry<String, List<CgpaInfo>> entry : gpaMap.entrySet());
            //      String keyValue = entry.getKey();
            //      List<CgpaInfo> pairValue = entry.getValue();
                 

            break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int score1 = Integer.parseInt(tScore1.getText());
        
        if((score1>=70) && (score1 <= 100)){
            tGrade1.setText("A");
        }else if((score1 >= 60) && (score1 <= 69)){
            tGrade1.setText("B");
        }else if((score1 >= 50) && (score1 <= 59)){
            tGrade1.setText("C");
        }else if((score1 >= 45) && (score1 <= 49)){
            tGrade1.setText("D");
        }else{
            tGrade1.setText("F");
        }
    }
    
}


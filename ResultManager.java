

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.util.Map;

public class ResultManager extends JFrame implements ItemListener, KeyListener{
    private String[]semesters = {"Select", "First Semester", "Second Semester"};
    private JLabel cos1, cos2;
    private JTextField defaultUnit, studentScore, eqGrade, defaultUnit2, studentScore2, eqGrade2;
    private JComboBox<String> sems;


    JPanel holder, container;
    //private Map<String, List<CgpaInfo>> gpaMap = new HashMap<>();

    /*
      First Semester : [
                         {
                            score
                         }
                       ]
     */

    public ResultManager(){

        holder = new JPanel();
        container = new JPanel();

        sems = new JComboBox<>(semesters);
        sems.addItemListener(this);

        cos1 = new JLabel("CSE201");
        defaultUnit = new JTextField("5", 5);
        defaultUnit.setEditable(false);
        studentScore = new JTextField("Enter Score",5);
        studentScore.addKeyListener(this);
        eqGrade = new JTextField(5);
        eqGrade.setEditable(false);

        cos2 = new JLabel("CSE202");
        defaultUnit2 = new JTextField("4", 5);
        defaultUnit2.setEditable(false);
        studentScore2 = new JTextField("Enter Score",5);
        eqGrade2 = new JTextField(5);
        eqGrade2.setEditable(false);

        holder.setLayout(new GridLayout(2, 5));
        container.setLayout(new GridLayout(2, 1));

        holder.add(cos1);
        holder.add(defaultUnit);
        holder.add(studentScore);
        holder.add(eqGrade);
        holder.add(cos2);
        holder.add(defaultUnit2);
        holder.add(studentScore2);
        holder.add(eqGrade2);

        container.add(sems);
        container.add(holder);

        add(container);

    }

    public static void main(String[] args) {
        ResultManager rm = new ResultManager();
        rm.setVisible(true);
        rm.setSize(550, 200);
        rm.setLocationRelativeTo(null);
        rm.setTitle("ResultManager");
        rm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        int x = sems.getSelectedIndex();
        switch (x){
            case 0:
                JOptionPane.showMessageDialog(this,"Sorry, an item has to be selected");
                break;
            case 1:
                 //gpaMap.put("firstSemester", )
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
        int score1 = Integer.parseInt(studentScore.getText());

        if((score1>=70) && (score1 <= 100)){
            eqGrade.setText("A");
        }
    }
}

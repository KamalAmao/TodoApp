
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CustomCGPA extends JFrame {

    private final String[] semesters = {"First Semester", "Second Semester"};
    private final String[] grades = {"A", "B", "C", "D", "E", "F"};
    private final String[]units = {"3","4","5","2","5"};
    private final int numberOfCourses = 5;

    private JComboBox<String> semesterComboBox;
    private JTable coursesTable;
    private DefaultTableModel tableModel;
    private JTextField cgpaTextField;

    public CustomCGPA() {
        initComponents();
    }

    private void initComponents() {
        setTitle("CGPA Calculator");

        // Semester combo box
        semesterComboBox = new JComboBox<>(semesters);

        // Courses table
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Course");
        tableModel.addColumn("Score");
        tableModel.addColumn("Unit");
        tableModel.addColumn("Grade");
        for (int i = 0; i < numberOfCourses; i++) {
            tableModel.addRow(new Object[]{String.format("Course %d", i + 1), "", units[i], ""});
        }
        coursesTable = new JTable(tableModel);

        // CGPA text field
        cgpaTextField = new JTextField(5);
        cgpaTextField.setEditable(false);

        // Calculate button
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateCGPA();
            }
        });

        // Control panel
        JPanel controlPanel = new JPanel(new FlowLayout());
        controlPanel.add(new JLabel("Semester:"));
        controlPanel.add(semesterComboBox);
        controlPanel.add(calculateButton);
        controlPanel.add(new JLabel("CGPA:"));
        controlPanel.add(cgpaTextField);

        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(new JScrollPane(coursesTable), BorderLayout.CENTER);
        mainPanel.add(controlPanel, BorderLayout.SOUTH);

        // Add main panel to frame
        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void calculateCGPA() {
        int semester = semesterComboBox.getSelectedIndex();
        double totalPoints = 0;
        double totalUnits = 0;
        for (int i = 0; i < numberOfCourses; i++) {
            String scoreString = (String) tableModel.getValueAt(i, 1);
            String unitString = (String) tableModel.getValueAt(i, 2);
            String gradeString = (String) tableModel.getValueAt(i, 3);
            if (scoreString.isEmpty() || unitString.isEmpty() || gradeString.isEmpty()) {
                continue;
            }
            double score = Double.parseDouble(scoreString);
            double unit = Double.parseDouble(unitString);
            char grade = gradeToGradePoint(Double.parseDouble(gradeString));
            totalPoints += score;
            totalUnits += unit;
        }
        if (totalUnits == 0) {
            cgpaTextField.setText("");
        } else {
            double cgpa = totalPoints / totalUnits;
            cgpaTextField.setText(String.format("%.2f", cgpa));
        }
    }

    private char gradeToGradePoint(double score) {
        if(score >= 70 && score <=100){
            return 'A';
        }
        return 'F';
    }

    public static void main(String[] args) {
        new CustomCGPA().setVisible(true);
    }
}



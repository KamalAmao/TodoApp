
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator1 extends JFrame {

    private JTextField display;

    private double operand1;
    private double operand2;
    private String operator;
    private boolean newNumber;

    public Calculator1() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Calculator");

        // Display
        display = new JTextField();
        display.setPreferredSize(new Dimension(200, 40));
        display.setEditable(false);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.PLAIN, 20));

        // Buttons
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[][] buttonLabels = {
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"0", ".", "=", "+"}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JButton button = new JButton(buttonLabels[i][j]);
                button.setPreferredSize(new Dimension(50, 50));
                button.setFont(new Font("Arial", Font.PLAIN, 20));
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String label = button.getText();
                        if (label.matches("[0-9]")) {
                            if (newNumber) {
                                display.setText(label);
                                newNumber = false;
                            } else {
                                display.setText(display.getText() + label);
                            }
                        } else if (label.equals(".")) {
                            if (newNumber) {
                                display.setText("0.");
                                newNumber = false;
                            } else if (!display.getText().contains(".")) {
                                display.setText(display.getText() + ".");
                            }
                        } else if (label.equals("=")) {
                            if (!operator.isEmpty()) {
                                operand2 = Double.parseDouble(display.getText());
                                double result = performOperation();
                                display.setText(String.format("%.2f", result));
                                operator = "";
                                newNumber = true;
                            }
                        } else {
                            if (!operator.isEmpty()) {
                                operand2 = Double.parseDouble(display.getText());
                                operand1 = performOperation();
                                operator = label;
                                newNumber = true;
                            } else {
                                operand1 = Double.parseDouble(display.getText());
                                operator = label;
                                newNumber = true;
                            }
                        }
                    }
                });
                buttonPanel.add(button);
            }
        }

        // Clear button
        JButton clearButton = new JButton("C");
        clearButton.setPreferredSize(new Dimension(50, 50));
        clearButton.setFont(new Font("Arial", Font.PLAIN, 20));
        clearButton.setForeground(Color.RED);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                operand1 = 0;
                operand2 = 0;
                operator = "";
                newNumber = false;
            }
        });

        // Control panel
        JPanel controlPanel = new JPanel(new FlowLayout());
        controlPanel.add(display);
        controlPanel.add(clearButton);

        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(controlPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Set up the frame
        getContentPane().add(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    private double performOperation() {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                return 0.0;
        }
    }

    public static void main(String[] args) {
        new Calculator1().setVisible(true);
    }
}



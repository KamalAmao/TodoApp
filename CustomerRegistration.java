

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerRegistration extends JFrame implements ActionListener {
    JScrollPane scrollPane;
    JPanel formHolder, holder;

    JLabel lFname, lEmail, lBal;
    JTextField tFname, tEmail, tInitBal;
    JButton bSubmit, bCancel;

    String[]columnName = {"Fullname", "Email", "Balance"};
    DefaultTableModel defaultTableModel;
    JTable table;

    public CustomerRegistration(){
        holder = new JPanel();
        holder.setLayout(new GridLayout(1, 2));

        formHolder = new JPanel();
        formHolder.setLayout(new GridLayout(4, 2));

        defaultTableModel = new DefaultTableModel(columnName, 0);
        table = new JTable(defaultTableModel);
        scrollPane = new JScrollPane(table);

        lFname = new JLabel("Fullname");
        tFname = new JTextField(10);

        lEmail = new JLabel("Email");
        tEmail = new JTextField(10);

        lBal = new JLabel("Balance");
        tInitBal = new JTextField(10);

        bSubmit = new JButton("Submit");
        bSubmit.addActionListener(this);
        bCancel = new JButton("Cancel");
        bCancel.addActionListener(this);

        formHolder.add(lFname);
        formHolder.add(tFname);
        formHolder.add(lEmail);
        formHolder.add(tEmail);
        formHolder.add(lBal);
        formHolder.add(tInitBal);
        formHolder.add(bSubmit);
        formHolder.add(bCancel);

        holder.add(formHolder);
        holder.add(scrollPane);

        add(holder);

    }

    public static void main(String[] args) {
        CustomerRegistration customerRegistration = new CustomerRegistration();
        customerRegistration.setVisible(true);
        customerRegistration.setSize(550, 200);
        customerRegistration.setLocationRelativeTo(null);
        customerRegistration.setTitle("Registration");
        customerRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bSubmit){
            Object [] row = {tFname.getText(), tEmail.getText(), tInitBal.getText()};
            defaultTableModel.addRow(row);
        }
    }
}

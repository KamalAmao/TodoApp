import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.ArrayList;

public class StoreAppDemo extends JFrame implements ActionListener {
    private JScrollPane scrollPane;
    private JPanel formHolder, holder;

    String [] columnName = {"Stock Name", "Stock Price", "Quantity", "StoreID"};
    DefaultTableModel defaultTableModel;
    JTable table;

    private JLabel lSname, lSprice, lQty;
    private JTextField tSname, tSprice, tQty;
    private JButton bSubmit, bLogout;
    private static Long DEFAULT_STORE_ID = 2000000000L;

    List<StoreInfo> storeList = new ArrayList<>();
    
    public StoreAppDemo(){
        holder = new JPanel();
        holder.setLayout(new GridLayout(1, 2));

        formHolder = new JPanel();
        formHolder.setLayout(new GridLayout(4, 2));

        defaultTableModel = new DefaultTableModel(columnName, 0);
        table = new JTable(defaultTableModel);
        scrollPane = new JScrollPane(table);

        lSname = new JLabel("Stock Name");
        tSname = new JTextField(10);
        lSprice = new JLabel("Stock Price");
        tSprice = new JTextField(10);
        lQty = new JLabel("Quantity");
        tQty = new JTextField(10);

        bSubmit = new JButton("Submit");
        bSubmit.addActionListener(this);
        bLogout = new JButton("Logout");
        bLogout.addActionListener(this);

        formHolder.add(lSname);
        formHolder.add(tSname);
        formHolder.add(lSprice);
        formHolder.add(tSprice);
        formHolder.add(lQty);
        formHolder.add(tQty);
        formHolder.add(bSubmit);
        formHolder.add(bLogout);

        holder.add(formHolder);
        holder.add(scrollPane);

        add(holder);


        

    }
    public static void main(String[]args){
        StoreAppDemo myStore = new StoreAppDemo();
        myStore.setVisible(true);
        myStore.setSize(500, 400);
        myStore.setLocationRelativeTo(null);
        myStore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myStore.setTitle("Store App");
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bSubmit){
            try{
                if(tSname.getText().equals("") || tSprice.getText().equals("") || tQty.getText().equals("")){
                    JOptionPane.showMessageDialog(this, "You are required to fill in the form");
                }else{
                    if(storeList.contains(new StoreInfo(tSname.getText(), Double.parseDouble(tSprice.getText()), Integer.parseInt(tQty.getText())))){
                        JOptionPane.showMessageDialog(this, "Sorry, we already have this item in our inventory");
                    }else{
                        Object [] row = {tSname.getText(), tSprice.getText(), tQty.getText(), DEFAULT_STORE_ID++};
                        defaultTableModel.addRow(row);
                        storeList.add(new StoreInfo(tSname.getText(), Double.parseDouble(tSprice.getText()), Integer.parseInt(tQty.getText()))); // HashSet
                        tSname.setText("");
                        tSprice.setText("");
                        tQty.setText("");
                    }
            }
            
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this,"kindly check your input " +ex);
            }
        }
        if(e.getSource() == bLogout){
            System.exit(0);
        }
    }
}

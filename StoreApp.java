
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;

public class StoreApp extends JFrame implements ActionListener{
    private JPanel formHolder, holder;
    private JScrollPane scrollPane;

    private JLabel lSname, lSprice, lQty;
    private JTextField tSname, tSprice, tQty;
    private JButton bSubmit, bLogout;

    String [] columnName = {"Stock Name", "Stock Price", "Quantity"};
    DefaultTableModel defaultTableModel;
    JTable table;
    
    List<Store> storeList = new ArrayList<>();

    public StoreApp(){
        holder = new JPanel();
        holder.setLayout(new GridLayout(2, 2));

        formHolder = new JPanel();
        formHolder.setLayout(new GridLayout(4, 2));

        defaultTableModel = new DefaultTableModel(columnName, 0);
        table = new JTable(defaultTableModel);
        scrollPane = new JScrollPane(table);

        lSname = new JLabel("Stock Name");
        tSname = new JTextField(10);

        lSprice = new JLabel("Stock Price");
        tSprice = new JTextField(10);

        lQty = new  JLabel("Quantity");
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
        StoreApp myStore = new StoreApp();
        myStore.setVisible(true);
        myStore.setSize(550, 200);
        myStore.setTitle("My Store");
        myStore.setLocationRelativeTo(null);
        myStore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public void actionPerformed(ActionEvent e ){
        if(e.getSource() == bSubmit){
            //List<Store> storeList = new ArrayList<>();
            
            if(tSname.getText().equals("") || tSprice.getText().equals("") || tQty.getText().equals("")){
                JOptionPane.showMessageDialog(this,"You are required to fill in the form");
            }else {
                if(storeList.contains(new Store(tSname.getText(), Double.parseDouble(tSprice.getText()), Integer.parseInt(tQty.getText())))){
                    JOptionPane.showMessageDialog(this,"Sorry, this item is already in our inventory");
                }else{
                    Object [] row = {tSname.getText(), tSprice.getText(), tQty.getText()};
                    defaultTableModel.addRow(row);
                    storeList.add(new Store (tSname.getText(),Double.parseDouble(tSprice.getText()), Integer.parseInt(tQty.getText())));
                    tSname.setText("");
                    tSprice.setText("");
                    tQty.setText("");
                }
                
            }      
        }

        if(e.getSource() == bLogout){
            System.exit(0);
        }
    
        
    }
    
}

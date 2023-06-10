import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AuthenticationScreenDemo extends JFrame implements ActionListener{
    private JPanel holder;
    private JLabel lUser;
    private JLabel lPwd;
    private JTextField tUser;
    private JPasswordField tPass;
    private JButton bLogin;
    private JButton bCancel;

    public AuthenticationScreenDemo(){
        GridLayout gridLayout = new GridLayout(4, 2);

        holder = new JPanel();
        holder.setLayout(gridLayout);

        lUser = new JLabel("Username");
        tUser = new JTextField(10);
        lPwd = new JLabel("Password");
        tPass = new JPasswordField(10);
       
        bLogin = new JButton("Login");
        bLogin.addActionListener(this);
        
        bCancel = new JButton("Cancle");
        bCancel.addActionListener(this);

        holder.add(lUser);
        holder.add(lPwd);
        holder.add(tUser);
        holder.add(tPass);
        holder.add(bLogin);
        holder.add(bCancel);

        add(holder);
    }
    public static void main(String[]args){
        AuthenticationScreenDemo authenticationScreen = new AuthenticationScreenDemo();
        authenticationScreen.setVisible(true);
        authenticationScreen.setSize(250, 150);
        authenticationScreen.setLocationRelativeTo(null);
        authenticationScreen.setTitle("Authentication");
        authenticationScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // @override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bLogin){
            String username = tUser.getText();
            String password = tPass.getText();
            // if(username.equals("") || password.equals("")){
            //     JOptionPane.showMessageDialog(this, "kindly input username and password");
            // }
            if("Kamal@gmail.com".equalsIgnoreCase(username) && "12345".equalsIgnoreCase(password)){
                JOptionPane.showMessageDialog(this,"Welcome..");
                setVisible(false); // if true remain after welcome if false close after welcome
                
            }else{
                JOptionPane.showMessageDialog(this,"Invalid username or password");
                tUser.setText("");
                tPass.setText("");
            }
        }
        if(e.getSource() == bCancel){
            System.exit(0);
        }
    }
}

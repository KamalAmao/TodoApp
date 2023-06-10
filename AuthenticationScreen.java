
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AuthenticationScreen extends JFrame implements ActionListener {
    private JPanel holder;
    private JLabel lUser;
    private JLabel lPwd;
    private JTextField tUser;
    private JPasswordField tPass;
    private JButton bLogin;
    private JButton bCancel;

    public AuthenticationScreen(){
        GridLayout gridLayout = new GridLayout(4, 2);

        holder = new JPanel();
        holder.setLayout(gridLayout);

        lUser = new JLabel("Username");
        tUser = new JTextField(10);
        lPwd = new JLabel("Password");
        tPass = new JPasswordField(10);

        bLogin = new JButton("Login");
        bLogin.addActionListener(this); //register a listener

        bCancel = new JButton("Cancel");
        bCancel.addActionListener(this);

        holder.add(lUser);
        holder.add(tUser);
        holder.add(lPwd);
        holder.add(tPass);
        holder.add(bLogin);
        holder.add(bCancel);

        add(holder);
    }

    public static void main(String[] args) {
        AuthenticationScreen authenticationScreen = new AuthenticationScreen();
        authenticationScreen.setVisible(true);
        authenticationScreen.setSize(250, 150);
        authenticationScreen.setLocationRelativeTo(null);
        authenticationScreen.setTitle("Authentication");
        authenticationScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Event Handler
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bLogin){

            String username = tUser.getText();
            String password = tPass.getText();

            if("kamal@gmail.com".equalsIgnoreCase(username) && "12345".equalsIgnoreCase(password)){
                JOptionPane.showMessageDialog(this, "Welcome...");
                setVisible(false); //  if true remain after welcome if false close after welcome

                CustomerRegistration customerRegistration = new CustomerRegistration();
                customerRegistration.setVisible(true);
                customerRegistration.setSize(550, 200);
                customerRegistration.setLocationRelativeTo(null);
                customerRegistration.setTitle("Registration");

            }else{
                JOptionPane.showMessageDialog(this, "Invalid username or password...");
                tUser.setText("");
                tPass.setText("");
            }
        }
        if(e.getSource() == bCancel){
            System.exit(0);
        }
    }
}

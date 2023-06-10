import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class ChatApp extends JFrame {
    private JTabbedPane pane;
    private JPanel status, chat, settings;

    public ChatApp(){
        initComponents();
    }
    private void initComponents(){
        status = new JPanel();
        chat = new JPanel();
        settings = new JPanel();

        pane = new JTabbedPane();
        pane.setTabPlacement(SwingConstants.BOTTOM);
        pane.addTab("Chat", chat);
        pane.addTab("Status", status);
        pane.addTab("settings", settings);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 250);
        setTitle("ChatApp");

        add(pane);
        pack();
    }
    public static void main(String[]args){
        new ChatApp().setVisible(true);
    }
}


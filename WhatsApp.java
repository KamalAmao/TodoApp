
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WhatsApp extends JFrame {

    JTabbedPane pane;
    JButton b1;
    JLabel l2, l3;
    JPanel status, chat, settings;
    JRadioButton male, female;
    ButtonGroup buttonGroup;
    JCheckBox checkBox;
    JProgressBar bar;

    public WhatsApp(){
        setTitle("WhatsApp");
        initsComponent();
    }
    private void initsComponent(){
        status = new JPanel();
        chat = new JPanel();
        settings = new JPanel();

        b1 = new JButton("Background...");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bar.setValue(50);
            }
        });
        bar = new JProgressBar();
        bar.setMinimum(0);
        bar.setMaximum(100);
        bar.setStringPainted(true);
        bar.setBackground(Color.RED);



        l2 = new JLabel("Gender");
        buttonGroup = new ButtonGroup();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        buttonGroup.add(male); buttonGroup.add(female);

        l3 = new JLabel("Settings");
        checkBox = new JCheckBox("Would you like to receive emails");

        chat.add(b1); chat.add(bar);
        status.add(l2); status.add(male); status.add(female);
        settings.add(l3); settings.add(checkBox);

        pane = new JTabbedPane();
        pane.setTabPlacement(SwingConstants.BOTTOM);
        pane.addTab( "Chat", new ImageIcon("/Users/jboss/IdeaProjects/KamalClass/src/com/kamal/classes/ui/images/chat.png"), chat);
        pane.addTab("Status", status);
        pane.addTab("Settings", settings);

        setLocationRelativeTo(null);
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        add(pane);
        pack();
    }

    public static void main(String[] args) {
        new WhatsApp().setVisible(true);
    }

}

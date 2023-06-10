

import javax.swing.*;
import java.awt.*;

public class Notepad extends JFrame {
    JPanel holder;

    JMenuBar bar; //Governor
    JMenu file, edit; // chaiman
    JMenuItem nFile, coEdit; //chairman

    JTextArea content;

    public Notepad(){
        holder = new JPanel();
        holder.setLayout(new FlowLayout(FlowLayout.LEFT));
        bar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        nFile = new JMenuItem("New");
        coEdit = new JMenuItem("Copy");

        file.add(nFile);
        edit.add(coEdit);
        bar.add(file);
        bar.add(edit);

        content = new JTextArea(10, 100);
        content.setWrapStyleWord(true);
        content.setLineWrap(true);
        holder.add(content);

        add(holder);
        setJMenuBar(bar);
    }

    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.setVisible(true);
        notepad.setLocationRelativeTo(null);
        notepad.setTitle("My Editor");
        notepad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeDemo1 {
    public static void main(String[]args){
        DefaultMutableTreeNode father = new DefaultMutableTreeNode("root");
        DefaultMutableTreeNode galeeb = new DefaultMutableTreeNode("galeeb");
        DefaultMutableTreeNode ajoke = new DefaultMutableTreeNode("ajoke");
        DefaultMutableTreeNode kamal = new DefaultMutableTreeNode("kamal");

        galeeb.add(ajoke);
        father.add(galeeb);
        father.add(kamal);

        JTree tree = new JTree(father);

        JPanel panel = new JPanel();
        panel.add(tree);

        JFrame frame = new JFrame();
        frame.getContentPane().add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

    }
}



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeDemo {
    public static void main(String[] args) {
        // DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        // DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        // DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        // DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("Node 3");
        // DefaultMutableTreeNode node4 = new DefaultMutableTreeNode("Node 4");

        DefaultMutableTreeNode father = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode ola = new DefaultMutableTreeNode("Ola");
        DefaultMutableTreeNode galeeb = new DefaultMutableTreeNode("Galeeb");
        DefaultMutableTreeNode adeola = new DefaultMutableTreeNode("Adeola");

        galeeb.add(adeola);
        father.add(galeeb);
        father.add(ola);


        JTree tree = new JTree(father);

        JPanel panel = new JPanel();
        panel.add(tree);

        JFrame frame = new JFrame();
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


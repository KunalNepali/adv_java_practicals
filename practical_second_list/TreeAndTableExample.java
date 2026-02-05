import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeAndTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTree and JTable Example");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // JTree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode branch1 = new DefaultMutableTreeNode("Branch 1");
        DefaultMutableTreeNode branch2 = new DefaultMutableTreeNode("Branch 2");
        DefaultMutableTreeNode leaf1 = new DefaultMutableTreeNode("Leaf 1");
        DefaultMutableTreeNode leaf2 = new DefaultMutableTreeNode("Leaf 2");
        branch1.add(leaf1);
        branch2.add(leaf2);
        root.add(branch1);
        root.add(branch2);
        JTree tree = new JTree(root);

        // JTable
        String[] columnNames = {"ID", "Name", "Age"};
        Object[][] data = {
            {1, "Alice", 25},
            {2, "Bob", 30},
            {3, "Catherine", 28}
        };
        JTable table = new JTable(data, columnNames);
        JScrollPane tableScrollPane = new JScrollPane(table);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(new JScrollPane(tree));
        panel.add(tableScrollPane);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class JComboBoxJListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox and JList Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        String[] items = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

        JLabel comboLabel = new JLabel("Select fruit:");
        JComboBox<String> comboBox = new JComboBox<>(items);

        JLabel listLabel = new JLabel("Fruits:");
        JList<String> list = new JList<>(items);

        JButton selectButton = new JButton("Show Selection");
        selectButton.addActionListener((ActionEvent e) -> {
            String selectedCombo = (String) comboBox.getSelectedItem();
            String selectedList = list.getSelectedValue();
            JOptionPane.showMessageDialog(frame, "Combo Selection: " + selectedCombo + "\nList Selection: " + selectedList);
        });

        frame.add(comboLabel);
        frame.add(comboBox);
        frame.add(listLabel);
        frame.add(new JScrollPane(list));
        frame.add(selectButton);

        frame.setVisible(true);
    }
}
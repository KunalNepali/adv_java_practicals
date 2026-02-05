import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class SwingFormExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Form Example");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);

        JLabel commentLabel = new JLabel("Comment:");
        JTextArea commentArea = new JTextArea(5, 20);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener((ActionEvent e) -> {
            String name = nameField.getText();
            String password = new String(passwordField.getPassword());
            String comment = commentArea.getText();
            JOptionPane.showMessageDialog(frame, "Name: " + name + "\nPassword: " + password + "\nComment: " + comment);
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(commentLabel);
        frame.add(new JScrollPane(commentArea));
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
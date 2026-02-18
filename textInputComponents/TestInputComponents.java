package textInputComponents;

import java.awt.*;
import javax.swing.*;

public class TestInputComponents extends JFrame {

    JLabel lbl1;
    JTextField txt1;
    JPasswordField txt2;
    JTextArea area;

    public TestInputComponents() {

        super("Input Components Frame");

        setSize(300, 300);
        setLayout(new BorderLayout());

        lbl1 = new JLabel();
        Icon ic = new ImageIcon("img.png");
        lbl1.setIcon(ic);
        add(lbl1, BorderLayout.NORTH);

        txt1 = new JTextField(20);
        add(txt1, BorderLayout.WEST);

        area = new JTextArea(5, 20);
        add(area, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestInputComponents();
    }
}

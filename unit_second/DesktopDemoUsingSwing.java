//package unit_second;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DesktopDemoUsingSwing {

    JFrame frame;
    JLabel namelbl, passwordlbl;
    JTextField nametxt, passwordtxt;
    JButton loginbtn, closebtn;

    public DesktopDemoUsingSwing() {

        frame = new JFrame("Demo Title");
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());

        // Components
        namelbl = new JLabel("Username");
        nametxt = new JTextField(20);

        passwordlbl = new JLabel("Password");
        passwordtxt = new JTextField(20);

        loginbtn = new JButton("Login");
        loginbtn.setBackground(Color.GREEN);

        closebtn = new JButton("Close");
        closebtn.setBackground(Color.RED);
        closebtn.addActionListener(e -> System.exit(0));

        // Add components
        frame.add(namelbl);
        frame.add(nametxt);
        frame.add(passwordlbl);
        frame.add(passwordtxt);
        frame.add(loginbtn);
        frame.add(closebtn);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new DesktopDemoUsingSwing();
    }
}

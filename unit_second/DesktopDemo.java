package unit_second;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class DesktopDemo {

    Frame frame;
    Label namelbl, passwordlbl;
    TextField nametxt, passwordtxt;
    Button loginbtn, closebtn;

    public DesktopDemo() {

        frame = new Frame();
        frame.setTitle("Demo Title");
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());

        // Components
        namelbl = new Label("Username");
        nametxt = new TextField(20);

        passwordlbl = new Label("Password");
        passwordtxt = new TextField(20);
        passwordtxt.setEchoChar('*');

        loginbtn = new Button("Login");
        loginbtn.setBackground(Color.green);

        closebtn = new Button("Close");
        closebtn.setBackground(Color.red);
        closebtn.addActionListener(e -> System.exit(0));

        // Add components
        frame.add(namelbl);
        frame.add(nametxt);
        frame.add(passwordlbl);
        frame.add(passwordtxt);
        frame.add(loginbtn);
        frame.add(closebtn);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new DesktopDemo();
    }
}

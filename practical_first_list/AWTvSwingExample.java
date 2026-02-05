import java.awt.*;
import javax.swing.*;

public class AWTvSwingExample {
    public static void main(String[] args) {
        // AWT Example
        Frame awtFrame = new Frame("AWT Example");
        Button awtButton = new Button("AWT Button");
        awtFrame.add(awtButton);
        awtFrame.setSize(300, 200);
        awtFrame.setLayout(new FlowLayout());
        awtFrame.setVisible(true);

        // Swing Example
        JFrame swingFrame = new JFrame("Swing Example");
        JButton swingButton = new JButton("Swing Button");
        swingFrame.add(swingButton);
        swingFrame.setSize(300, 200);
        swingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        swingFrame.setLayout(new FlowLayout());
        swingFrame.setVisible(true);
    }
}
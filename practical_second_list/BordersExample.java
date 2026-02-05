import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BordersExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Borders Example");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));

        // Different borders
        JButton lineBorderButton = new JButton("Line Border");
        lineBorderButton.setBorder(new LineBorder(Color.BLUE, 3));

        JButton matteBorderButton = new JButton("Matte Border");
        matteBorderButton.setBorder(new MatteBorder(5, 5, 5, 5, Color.RED));

        JButton etchedBorderButton = new JButton("Etched Border");
        etchedBorderButton.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        JButton raisedBevelButton = new JButton("Raised Bevel Border");
        raisedBevelButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        JButton loweredBevelButton = new JButton("Lowered Bevel Border");
        loweredBevelButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        JButton emptyBorderButton = new JButton("Empty Border");
        emptyBorderButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Add buttons to Frame
        frame.add(lineBorderButton);
        frame.add(matteBorderButton);
        frame.add(etchedBorderButton);
        frame.add(raisedBevelButton);
        frame.add(loweredBevelButton);
        frame.add(emptyBorderButton);

        frame.setVisible(true);
    }
}
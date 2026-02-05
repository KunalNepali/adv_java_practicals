import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;

public class FocusListenerExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("FocusListener Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField textField1 = new JTextField("Enter text 1", 15);
        JTextField textField2 = new JTextField("Enter text 2", 15);
        JLabel label = new JLabel("Focus events will be shown here");

        FocusListener focusListener = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                JTextField tf = (JTextField) e.getSource();
                label.setText("Focus Gained on: " + tf.getText());
            }

            @Override
            public void focusLost(FocusEvent e) {
                JTextField tf = (JTextField) e.getSource();
                label.setText("Focus Lost on: " + tf.getText());
            }
        };

        textField1.addFocusListener(focusListener);
        textField2.addFocusListener(focusListener);

        frame.add(textField1);
        frame.add(textField2);
        frame.add(label);

        frame.setVisible(true);
    }
}

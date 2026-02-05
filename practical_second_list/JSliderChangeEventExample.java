import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderChangeEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JSlider ChangeEvent Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider slider = new JSlider(0, 100, 50);
        JLabel label = new JLabel("Value: 50");

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                label.setText("Value: " + value);
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(slider);
        frame.add(label);

        frame.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JProgressBar with Event Handling");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(50, 100, 300, 30);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        frame.add(progressBar);

        JButton startButton = new JButton("Start");
        startButton.setBounds(150, 150, 100, 30);
        frame.add(startButton);

        Timer timer = new Timer(100, null);
        timer.addActionListener(new ActionListener() {
            private int counter = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (counter <= 100) {
                    progressBar.setValue(counter);
                    counter++;
                } else {
                    timer.stop();
                }
            }
        });

        startButton.addActionListener(e -> timer.start());
        
        frame.setVisible(true);
    }
}
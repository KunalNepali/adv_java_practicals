package choiceComponents;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderDemonstation extends JFrame {
	JSlider slider;
	JTextField valuetxt;

	public JSliderDemonstation() {
		setTitle("Slider Frame");
		ChangeListener listener = new ChangeListener() {
	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider sl = (JSlider)e.getSource();
		valuetxt.setText(String.valueOf(sl.getValue()));
	}	
	};
	slider = new JSlider();
	slider.addChangedListener(listener);
//	valuetxt = new JTextField(20);
//	slider = new JSlider();
	add(slider, BorderLayout.NORTH);
	add(valuetxt, BorderLayout.SOUTH);
	setSize(300, 100);
	setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

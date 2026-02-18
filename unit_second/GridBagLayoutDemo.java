package unit_second;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutDemo extends JFrame {
	JButton btn1, btn2, btn3, btn4, btn5;
	GridBagConstraints gbc;
	
	public GridBagLayoutDemo() {
		setTitle("Grid Bag Layout");
		setLayout(new GridBagLayout());
		setSize(400, 300);
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5 );
		gbc.gridx = 0;
		gbc.gridy = 0;
		btn1 = new JButton("Button 1");
		add(btn1, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		btn3 = new JButton("Button 2");
		add(btn2, gbc);
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		btn3 = new JButton("Button 3");
		add(btn3, gbc); // btn1 is added to jframe on the basis of gbc
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		btn3 = new JButton("Button 4");
		add(btn4, gbc); // btn1 is added to jframe on the basis of gbc
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		gbc.gridwidth = 3;
		gbc.fill = GridBagConstraints.HORIZONTAL;// it fills columns specified by property gbc
		btn5 = new JButton("Button 5 is Very Good");
		add(btn5, gbc);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GridBagLayoutDemo();
	}
}

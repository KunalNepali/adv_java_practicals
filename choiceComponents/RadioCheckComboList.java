package choiceComponents;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;

public class RadioCheckComboList extends JFrame{
	JLabel genderlbl, courselbl, collegelbl, countrylbl;
	JRadioButton male, female, ns, rns;
	JCheckBox csit, bca, bbm;
	JComboBox<String> colleges;
	JList<String> countries;
	ButtonGroup group;

	public RadioCheckComboList() {
		// object
        genderlbl = new JLabel("Gender;");
		courselbl = new JLabel("Courses:");
		collegelbl = new JLabel("Select College:");
		countrylbl = new JLabel("Selece Countries:");
		//radiobutton
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		ns = new JRadioButton("Not Specified");
		rns = new JRadioButton("Rather Not Say");
		group = new ButtonGroup();
		group.add(male);
		group.add(female);
		group.add(ns);
		group.add(rns);
		//checkboxes
		csit = new JCheckBox("BSCCSIT");
		bca = new JCheckBox("BCA");
		bbm = new JCheckBox("BBM");
		String[] collname = {"Vedas", "Ambition", "New Summit", "Everest"};
		String[] countname = {"Nepal", "Pakistan", "Australia", "Scotland"};
		colleges = new JComboBox<String>(collname);
		countries = new JList<String>(countname);
		//JFrame Configuration
		setTitle("Choice Frame");
		setSize(500, 300);
		setLayout(new GridLayout(4, 3, 8, 8));
		//Addition of components to JFrame
		//gennder
		add(genderlbl);
		add(male);
		add(female);
		add(ns);
		add(rns);
		//course
		add(courselbl);
		add(csit);
		add(bca);
		add(bbm);
		//college
		add(collegelbl) ;
		add(colleges);
		add(countrylbl);
		add(countries);
		setVisible(true);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
          new RadioCheckComboList();
	}
}

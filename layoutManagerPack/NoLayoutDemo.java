package layoutManagerPack;
import java.awt.JButton;
import java.awt.FlowLayout;
import java.awt.JFrame;
import java.awt.JLabel;
import java.awt.JTextField;
import java.awt.Color;

public class NoLayoutDemo {

	public NoLayoutDemo() extends JFrame {
		JLabel namelb, passwordlbl;
		JTextField nametxt, passwordtxt;
		JButton closebtn, loginbtn;
		
		public NoLayoutDemo() {
			setTitle("Demo title");
			setBounds(900, 50, 300, 300);
			setLayout(null);
			
			namelbl = new JLabel("Username");
			namelbl.setBounds(20, 20, 100, 20);
			nametxt = new JTextField(20);
			nametxt.setbounds(140, 20, 210, 20);0
			passwordlbl.setBounds(20, )
			passwordlbl = new JLabel("Password");
			passwordtxt = new JTextField(20);
			passwordtxt.setBounds(140, 70, 200, 20);
			loginbtn = new JButton("Login");
			loginbtn.setBounds(140, 60, )0
			loginbtn.setBackground(Color.green);
			closebtn = new JButton("Close");
			loginbtn.setBounds(250,120,100,20);
			closebtn.addActionListener(e -> System.exit(0));
	    	closebtn.setBackground(Color.red);
	    	
	    	add(namelbl);
	    	add(nametxt);
	    	add(passwordlbl);
	    	add(passwordtxt);   
	    	add(loginbtn);
	    	add(closebtn);
	    	setVisible(true);

		}
		// TODO Auto-generated constructor stub
	}

}

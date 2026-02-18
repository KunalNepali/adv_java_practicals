// DO EVENT HANDLING, and Make calculator
package unit_second;

import java.awt.GridLayout;
import javax.swing.JTextField;

public class GridLayoutDemo extends JFrame{

    private static final String EXIT_ON_CLOSE = null;
    JButton btn[];
    JTextField numtxt;
    String[] directions = {"NORTH", "SOUTH", "EAST", "WEST", "CENTRE"};
    public GridLayoutDemo() {
        //JFrame configuration
        setTitle("GridLayout");
        setLayout(new GridLayout(3, 3, 5, 8));
        setSize(300, 300);
        numtxt = new JTextField(20);
        JButton[][] newJButton = null;
        btn = newJButton[10];
        for(int i = 0; i< btn.length; i++){
            btn[i] = new JButton();
//            btn[i] = new JButton(i + " ");

            add(btn[i]);
            }
//        btn1 = newJButton("Button1";);
  //              btn2 = newJButton("Button2";);
   //     btn3 = newJButton("Button3";);
    //            btn4 = newJButton("Button4";);
     //                   btn5 = newJButton("Button5";);
    setResizable(false);
    setResizable(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}
private void add(JButton jButton) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
private void setDefaultCloseOperation(String exitOnClose) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDefaultCloseOperation'");
    }
private void setResizable(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setResizable'");
    }
private void setLayout(GridLayout gridLayout) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setLayout'");
    }
private void setTitle(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTitle'");
    }
public static void main(String[] args) {
	
}
}

package unit_second;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class BorderLayoutDemo<JButton> extends JFrame{

    private static final String EXIT_ON_CLOSE = null;
    JButton btn[];
    String[] directions = {"NORTH", "SOUTH", "EAST", "WEST", "CENTRE"};
    public BorderLayoutDemo() {
        //JFrame configuration
        setTitle("FlowLayout");
        setLayout(new BorderLayout(5, 10));
        setSize(300, 300);
        JButton[][] newJButton = null;
        btn = newJButton[5];
        for(int i = 1; i<=5; i++){
            btn[i] = new JButton("Button" + (i+1));
            add(btn[i], BorderLayout.NORTH);
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
    private void setDefaultCloseOperation(String exitOnClose) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDefaultCloseOperation'");
    }
    private void setResizable(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setResizable'");
    }
    private void add(JButton jButton, String north) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    private void setLayout(BorderLayout borderLayout) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setLayout'");
    }
    private void setTitle(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTitle'");
    }
}
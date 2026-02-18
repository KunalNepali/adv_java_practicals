package unit_second;

import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemoo<JButton> extends JFrame{

    JButton btn[];
//    JButton btn1, btn2, btn3, btn4, btn5;
    
    public FlowLayoutDemoo() {
        //JFrame configuration
        setTitle("FlowLayout");
        setLayout((LayoutManager) new FlowLayout());
        setSize(300, 300);
        btn = newJButton[5];
        for(int i = 1; i<=5; i++){
            btn[i] = new JButton("Button" + i);
            add(btn[i]);
            }
//        btn1 = newJButton("Button1";);
  //              btn2 = newJButton("Button2";);
   //     btn3 = newJButton("Button3";);
    //            btn4 = newJButton("Button4";);
     //                   btn5 = newJButton("Button5";);
    
    setVisible(true);
}
    public static void main(String[] args) {
        
    }

}
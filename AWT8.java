import java.awt.*;
import java.awt.event.*;

public class AWT8 extends Frame {
    Button b1,b2;
    AWT8(){
        setSize(600,300);
        setVisible(true);
        setLayout(new FlowLayout());
        b1=new Button("Click Me");
        b1.addActionListener(new MyActionListener());
        add(b1);
        // b2=new Button();
    }
    public static void main(String[] args) {
        AWT8 a=new AWT8();
    }
}
class MyActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("Button Clicked !!");
    }
}

import java.awt.*;
import java.awt.event.*;
public class AWT27 extends Frame {
    Panel p1,p2,p3,p4;
    AWT27(){
        setTitle("Panel");
        setVisible(true);
        setSize(400,300);
        setLocation(200,200);
        setLayout(new BorderLayout());


        p1=new Panel(new FlowLayout());
        p2=new Panel();
        p3=new Panel();
        p4=new Panel();

        p2.setPreferredSize(new Dimension(200,300));
        p1.add(new Button("OK"));
        p1.add(new Button("BACK"));
        p1.add(new Button("NEXT"));
        
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.red);
        p3.setBackground(Color.green);
        p4.setBackground(Color.PINK);
        
        add(p1,BorderLayout.EAST);
        add(p2,BorderLayout.WEST);
        add(p3,BorderLayout.NORTH);
        add(p4,BorderLayout.SOUTH);


    }

    public static void main(String[] args) {
        AWT27 a=new AWT27();
    }
}

import java.awt.*;
import java.awt.event.*;
public class AWT11 extends Frame implements ActionListener {
    private Button b;
    TextField t1,t2,t3;
    public static void main(String[] args) {
        Frame f=new Frame();
        AWT11 a=new AWT11();
    }
    public AWT11(){
        setTitle("Assignment 2");
        setVisible(true);
        setSize(400,200);
        setLocation(100,100);
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        t1=new TextField(10);
        // t1.setBackground(Color.gray);
        t2=new TextField(10);
        // t2.setBackground(Color.gray);
        t3=new TextField(10);
        // t3.setBackground(Color.gray);
        add(t1);
        add(t2);
        add(t3);
        b=new Button("Add");
        b.addActionListener(this);
        add(b);
    }
    public void actionPerformed(ActionEvent e){
    
       String a=t1.getText();
       String b=t2.getText();
       String c=a+b;
       System.out.println(c);
       t3.setText(c);
    }
}

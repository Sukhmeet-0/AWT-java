import java.awt.*;
import java.awt.event.*;

public class AWT9 extends Frame implements ActionListener{
    Button b1,c;
    AWT9(){
        setSize(600,300);
        setVisible(true);
        setLayout(new FlowLayout());
        setBackground(Color.lightGray);
        b1=new Button("Click Me");
        b1.setBackground(Color.white);
        // b1.addActionListener(new MyActionListener());
        b1.addActionListener(this);
        c=new Button("Save ");
        c.setBackground(Color.white);
        c.addActionListener(this);
        add(b1);
        add(c);
    
    }
    public static void main(String[] args) {
        AWT9 a=new AWT9();
    }
    public void actionPerformed(ActionEvent e){
        // System.out.println("Button Clicked in new Class !!");
        // System.out.println(e.getSource());
        Object source =e.getSource();
        if(source== b1){
            System.out.println("Button clicked !!");
        }
        else if(source==c){
            System.out.println("Content saved!!");
        }
        else{
            System.out.println("Error!!");
        }
    }
}



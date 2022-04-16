import java.awt.*;
import java.awt.event.*;
public class AWT10 extends Frame implements ActionListener{
    private TextField text1;
    private TextField text2;
    private Button swap;
    public static void main(String[] args) {
        Frame f=new Frame();
        AWT10 a=new AWT10();
    }
    public AWT10(){
        setTitle("Assignment 1");
        setVisible(true);
        setSize(400,300);
        setLocation(100,100);
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        text1=new TextField(10);
        text2=new TextField(10);
        swap=new Button("Swap");
        swap.addActionListener(this);
        add(text1);
        add(text2);
        add(swap);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Swapped values");

        String t1=text1.getText();
        String t2=text2.getText();
        System.out.println(t1+" ++++ "+t2);
    
        text2.setText(t1);
        text1.setText(t2);
        
    }
}

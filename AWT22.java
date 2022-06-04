import java.awt.*;
import java.awt.event.*;
public class  AWT22 {
    public AWT22(){

    }

    public static void main(String[] args) {
        new MyFramee();
    }
}
class MyFramee extends Frame{
    Choice ch;
    MyFramee(){
        setVisible(true);
        setSize(500,500);
        setLocation(100,200);

        ch=new Choice();
        ch.add("Maths");
        ch.add("English");
        ch.add("Physics");
        ch.add("Chemistry");
        ch.add("Biology");
        Button b=new Button("Show");
        setLayout(new GridLayout(2,1));
        add(ch);
        add(b);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("selected item is : "+ch.getSelectedItem());
                System.out.println("Selected index is : "+ch.getSelectedIndex());
                // ch.remove(ch.getSelectedItem());
            }
        });

        ch.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                System.out.println("Changed item to "+e.getItem());
                System.out.println("changed index to "+ch.getSelectedIndex());
            }
        });

    }
}
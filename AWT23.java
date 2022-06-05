import java.awt.*;
import java.awt.event.*;
public class AWT23 extends Frame{

    AWT23(){
        setVisible(true);
        setLocation(500,300);
        setSize(400,500);
        setLayout(new FlowLayout());

        List list=new List(2,true);
        list.add("java");
        list.add("Python");
        list.add("Cpp");
        list.add("HTML");
        Button b=new Button("Show");
        add(list);
        add(b);

        list.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Action on list");
            }
        });

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String[] s=list.getSelectedItems();
                for(String z:s){
                    System.out.println(z);
                }
            }
        });
    }
    public static void main(String[] args) {
        AWT23 a=new AWT23();
    }
}
import java.awt.*;
import java.awt.event.*;
public class AWT24 extends Frame {
    AWT24(){
        setVisible(true);
        setLocation(500,300);
        setSize(600,300);
        setLayout(new FlowLayout());

        TextArea text=new TextArea("Hello world...",10,20,TextArea.SCROLLBARS_NONE);
        Button b=new Button("OK");
        add(text);
        add(b);


        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("OK");
                text.append("  Hello world.......");
                // text.setEditable(false);
                text.setEditable(false);

            }
        });
    }
    public static void main(String[] args) {
        AWT24 a=new AWT24();
    }
}

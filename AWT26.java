import java.awt.*;
import java.awt.event.*;
public class AWT26 extends Frame{
    AWT26(){
        setVisible(true);
        setSize(400,300);
        setLocation(400,300);
        setLayout(new FlowLayout());

        Button openDialogue=new Button("Open Dialogue Box");
        add(openDialogue);

        openDialogue.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ev){
                Dialog d=new Dialog(AWT26.this,"Preferences");
                d.setVisible(true);
                d.setSize(400,600);
                setLocation(300,200);
            }
        });
    }
    public static void main(String[] args) {
        AWT26 a=new AWT26();
    }
}

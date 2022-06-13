import java.awt.*;
import java.awt.event.*;
public class AWT28 extends Frame{
    Panel p1;
    ScrollPane p;
    AWT28(){
        setTitle("Panel");
        setSize(350,600);
        setVisible(true);
        setLayout(new BorderLayout());
        
        // p1=new Panel();
        p1=new Panel();
        p1.setPreferredSize(new Dimension(200,600));
        
        // p=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        // p=new ScrollPane(ScrollPane.SCROLLBARS_NEVER);
        // p=new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
        p=new ScrollPane();
        p.add(p1);
        
        p1.add(new Button("OK"));
        p1.add(new Button("Back"));
        p1.add(new Button("Next"));
        p1.add(new TextField("Subject",20));
        p1.add(new TextField("Subject",20));
        p1.add(new TextField("Subject",20));
        p1.add(new TextField("Subject",20));
        p1.add(new TextField("Subject",20));
        p1.add(new TextField("Subject",20));
        p1.add(new TextField("Subject",20));
        p1.add(new TextField("Subject",20));
        p1.add(new TextField("Subject",20));
        p1.add(new TextField("Subject",20));
        p1.add(new TextField("Subject",20));
        p1.setBackground(Color.BLUE);
        
        add(p);

    }

    public static void main(String[] args) {
        AWT28 a=new AWT28();
    }
}

import java.awt.*;
public class AWT15 extends Frame {

    public AWT15(){
        setVisible(true);
        setLocation(200,300);
        setSize(500,300);

        setLayout(new GridLayout(3,2,10,15));
        add(new Button("Hello"));
        add(new Button("HI"));
        add(new Button("Bye"));
        add(new Button("Bye"));
        add(new Button("Bye"));
        add(new Button("Bye"));
    
    }
    public static void main(String[] args) {
        Frame f=new Frame();
        AWT15 a=new AWT15();
    }
}

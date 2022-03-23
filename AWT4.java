import java.awt.*;
public class AWT4 {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setVisible(true);
        f.setSize(600, 400);
        TextField tf=new TextField("This is sample Hi I am Sukhmeet Singh");
        TextField tf1=new TextField("Welcome to AWT");
        f.add(tf);
        f.add(tf1);

    }
}

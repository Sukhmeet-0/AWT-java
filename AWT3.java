import java.awt.*;
public class AWT3{
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setTitle("My App");
        f.setSize(500,300);
        f.setVisible(true);
        // f.setLocation(500, 250);
        // f.setBounds(100,200,700,500);//combination of setsize and setlocation
        
        f.setBackground(Color.BLACK);
        // f.resize(900,500);
        System.out.println(f.isVisible());
    }
}